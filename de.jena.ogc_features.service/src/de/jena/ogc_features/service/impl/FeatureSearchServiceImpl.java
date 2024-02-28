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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.LatLonShape;
import org.apache.lucene.document.ShapeField;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;
import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.document.LuceneIndexService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.jena.ogc_features.service.api.FeatureSearchService;
import de.jena.ogc_features.service.impl.util.FeatureIndexServiceHelper;
import net.opengis.ogcapi.features.conf.geojson.Feature;
import net.opengis.ogcapi.features.conf.geojson.FeatureCollection;
import net.opengis.ogcapi.features.conf.geojson.GeoJSONPackage;
import net.opengis.ogcapi.features.core.BoundingBox;

/**
 * Implementation of {@link de.jena.ogc_features.service.api.FeatureSearchService}
 * 
 * @author Michal H. Siemaszko
 */
@Component(name = "FeatureSearchService", immediate = true, scope = ServiceScope.SINGLETON)
public class FeatureSearchServiceImpl implements FeatureSearchService {
	private static final Logger LOG = LoggerFactory.getLogger(FeatureIndexServiceImpl.class);

	@Reference(target = "(id=OGCAPIFeatures)")
	private LuceneIndexService<EObjectDocumentIndexObjectContext> ogcAPIFeaturesIndex;

	@Reference(target = "(repo_id=OGCAPIFeatures.OGCAPIFeatures)", cardinality = ReferenceCardinality.MANDATORY)
	private ComponentServiceObjects<EMFRepository> repositoryServiceObjects;

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ogc_features.service.api.FeatureSearchService#searchFeaturesByBoundingBox(java.lang.String, net.opengis.ogcapi.features.core.BoundingBox)
	 */
	@Override
	public List<Feature> searchFeaturesByBoundingBox(String collectionId, BoundingBox bbox) {
		Objects.requireNonNull(collectionId, "Collection Id is required!");
		Objects.requireNonNull(bbox, "Bounding Box is required!");

		// @formatter:off
		Query query = LatLonShape.newBoxQuery(
				FeatureIndexServiceHelper.GEOMETRY_COORDINATES,
				ShapeField.QueryRelation.INTERSECTS,
				bbox.getLowerCorner().get(1), // minLatitude
				bbox.getUpperCorner().get(1), // maxLatitude
				bbox.getLowerCorner().get(0), // minLongitude
				bbox.getUpperCorner().get(0) // maxLongitude
			);
		// @formatter:on

		IndexSearcher searcher = ogcAPIFeaturesIndex.aquireSearcher();
		EMFRepository repository = repositoryServiceObjects.getService();

		try {
			TopDocs topDocs = searcher.search(query, Integer.MAX_VALUE);

			if (topDocs.scoreDocs.length == 0) {
				return Collections.emptyList();
			}

			IndexReader indexReader = searcher.getIndexReader();

			FeatureCollection featureCollection = repository.getEObject(GeoJSONPackage.Literals.FEATURE_COLLECTION,
					collectionId);

			return Arrays.asList(topDocs.scoreDocs).stream().map(sd -> sd.doc).map(id -> {
				Document doc;
				try {
					doc = indexReader.storedFields().document(id);
					return doc;
				} catch (IOException e) {
					LOG.error("Exception while searching features by bounding box!", e);
					return null;
				}

			}).filter(doc -> doc != null).map(doc -> {
				return (Feature) toEObject(doc, featureCollection, repository);
			}).collect(Collectors.toList());

		} catch (Exception e) {
			LOG.error("Exception while searching features by bounding box!", e);
			return Collections.emptyList();

		} finally {
			ogcAPIFeaturesIndex.releaseSearcher(searcher);
			repositoryServiceObjects.ungetService(repository);
		}
	}

	private EObject toEObject(Document doc, FeatureCollection featureCollection, EMFRepository repository) {
		if (featureCollection == null) {
			return null;
		}

		String featureId = doc.get(FeatureIndexServiceHelper.FIELD__ID);
		if (featureId == null) {
			return null;
		}

		Feature feature = featureCollection.getFeatures().stream().filter(f -> featureId.equals(f.getId())).findFirst()
				.orElse(null);

		repository.detach(featureCollection);

		return feature;
	}
}
