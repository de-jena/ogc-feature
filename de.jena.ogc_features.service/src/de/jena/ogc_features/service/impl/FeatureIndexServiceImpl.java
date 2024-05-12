/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.ogc_features.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.gecko.emf.mongo.Options;
import org.gecko.emf.osgi.ResourceSetFactory;
import org.gecko.emf.osgi.UriMapProvider;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.IndexActionType;
import org.gecko.search.document.LuceneIndexService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.util.promise.PromiseFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.jena.ogc_features.service.api.FeatureIndexService;
import de.jena.ogc_features.service.impl.util.FeatureIndexServiceHelper;
import net.opengis.ogcapi.features.conf.geojson.Feature;
import net.opengis.ogcapi.features.conf.geojson.FeatureCollection;
import net.opengis.ogcapi.features.conf.geojson.GeoJSONPackage;

/**
 * Implementation of {@link de.jena.ogc_features.service.api.FeatureIndexService}
 * 
 * @author Michal H. Siemaszko
 */
@Component(name = "FeatureIndexService", service = FeatureIndexService.class, scope = ServiceScope.SINGLETON, immediate = true, reference = {
		@Reference(name = "mongoCondition", service = UriMapProvider.class, target = "(uri.map.src=mongodb://OGCAPIFeatures/)", cardinality = ReferenceCardinality.MANDATORY),
		@Reference(name = "modelCondition", service = ResourceSetFactory.class, target = "(emf.name=geojson)", cardinality = ReferenceCardinality.MANDATORY) })
public class FeatureIndexServiceImpl implements FeatureIndexService {
	private static final Logger LOG = LoggerFactory.getLogger(FeatureIndexServiceImpl.class);

	@Reference(target = "(repo_id=OGCAPIFeatures.OGCAPIFeatures)", cardinality = ReferenceCardinality.MANDATORY)
	private ComponentServiceObjects<EMFRepository> repositoryServiceObjects;

	@Reference(target = "(id=OGCAPIFeatures)")
	private LuceneIndexService<EObjectDocumentIndexObjectContext> ogcAPIFeaturesIndex;

	private PromiseFactory factory = new PromiseFactory(Executors.newFixedThreadPool(4));

	private AtomicInteger counter = new AtomicInteger(0);

	@Activate
	public void activate() {
		indexFeatures();
	}

	private void indexFeatures() {
		factory.submit(() -> {
			CountDownLatch latch = new CountDownLatch(1);
			latch.await(100, TimeUnit.MILLISECONDS);
			initializeIndex();
			return true;
		}).onSuccess(t -> LOG.info("Finished indexing Feature objects!")).onFailure(t -> t.printStackTrace());
	}

	public void initializeIndex() {
		LOG.info("Starting indexing Feature objects...");

		EMFRepository repository = repositoryServiceObjects.getService();
		QueryRepository queryRepo = (QueryRepository) repository.getAdapter(QueryRepository.class);
		IQuery query = queryRepo.createQueryBuilder().allQuery().build();

		resetIndex();

		List<FeatureCollection> featureCollections = queryRepo
				.getEObjectsByQuery(GeoJSONPackage.Literals.FEATURE_COLLECTION, query, getLoadOptions());
		if (featureCollections == null || featureCollections.isEmpty()) {
			return;
		}

		counter = new AtomicInteger(0);

		// @formatter:off
		featureCollections.forEach(fc -> {
			fc.getFeatures().forEach(f -> {
				indexFeature(f, IndexActionType.ADD);
				counter.incrementAndGet();
				
			});
		});
		// @formatter:on

		repositoryServiceObjects.ungetService(repository);

		LOG.info("Finished indexing " + counter.get() + " Feature object(s)!");
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ogc_features.service.api.FeatureIndexService#indexFeature(net.opengis.ogcapi.features.conf.geojson.Feature, boolean)
	 */
	@Override
	public void indexFeature(Feature feature, boolean isFirstSave) {
		if (isFirstSave) {
			indexFeature(feature, IndexActionType.ADD);
		} else {
			indexFeature(feature, IndexActionType.MODIFY);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ogc_features.service.api.FeatureIndexService#deleteFeature(net.opengis.ogcapi.features.conf.geojson.Feature)
	 */
	@Override
	public void deleteFeature(Feature feature) {
		indexFeature(feature, IndexActionType.REMOVE);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ogc_features.service.api.FeatureIndexService#resetIndex()
	 */
	@Override
	public void resetIndex() {
		try {
			ogcAPIFeaturesIndex.getIndexWriter().deleteAll();
			ogcAPIFeaturesIndex.commit();
		} catch (IOException e) {
			LOG.error("Could not delete Features index " + e);
		}
	}

	private void indexFeature(Feature feature, IndexActionType actionType) {
		EObjectDocumentIndexObjectContext context = FeatureIndexServiceHelper.mapFeature(feature, actionType);
		ogcAPIFeaturesIndex.handleContextSync(context);
	}

	public static Map<Object, Object> getLoadOptions() {
		Map<Object, Object> loadOptions = new HashMap<>();
//		loadOptions.put(Options.OPTION_BATCH_SIZE, Integer.valueOf(600));
//		loadOptions.put(MongoPushStreamConstants.OPTION_QUERY_PUSHSTREAM, Boolean.TRUE);
		loadOptions.put(Options.OPTION_READ_DETACHED, true);
		return loadOptions;
	}
}
