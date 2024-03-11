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
package de.jena.ogc_features.service.tests;

import static de.jena.ogc_features.service.tests.helper.CollectionsServiceTestHelper.createBoundingBox;
import static de.jena.ogc_features.service.tests.helper.CollectionsServiceTestHelper.createCollection;
import static de.jena.ogc_features.service.tests.helper.CollectionsServiceTestHelper.createFeature;
import static de.jena.ogc_features.service.tests.helper.CollectionsServiceTestHelper.createFeatureCollection;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import java.util.UUID;

import org.gecko.emf.repository.EMFRepository;
import org.gecko.mongo.osgi.MongoDatabaseProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.annotation.Testable;
import org.osgi.framework.ServiceReference;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import com.mongodb.client.MongoDatabase;

import de.jena.ogc_features.service.api.CollectionsService;
import de.jena.ogc_features.service.api.FeatureIndexService;
import de.jena.ogc_features.service.tests.helper.CollectionsServiceTestHelper.Position;
import net.opengis.ogcapi.features.conf.geojson.Feature;
import net.opengis.ogcapi.features.conf.geojson.FeatureCollection;
import net.opengis.ogcapi.features.conf.geojson.GeoJSONPackage;
import net.opengis.ogcapi.features.conf.geojson.GeometryType;
import net.opengis.ogcapi.features.core.BoundingBox;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper;
import net.opengis.ogcapi.features.core.corePackage;

/**
 * Tests implementation of
 * {@link de.jena.ogc_features.service.api.CollectionsService}
 * 
 * @author Michal H. Siemaszko
 */
@Testable
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CollectionsServiceTest {
	private static final String BASE_URL = "http://localhost:8088/ogc-api-features/rest";

	private static final String MEDIA_TYPE = "application/json";

	private static final String COLLECTION_ID = "addresses";
	private static final String TITLE = "Simple Addresses";
	private static final String DESCRIPTION = "Addresses of Finlands Buildings";
	private static final String CRS = "http://www.opengis.net/def/crs/OGC/1.3/CRS84";
	private static final String STORAGE_CRS = "http://www.opengis.net/def/crs/EPSG/0/3067";

	private static final String FEATURECOLLECTION_ID = COLLECTION_ID;

	private static final String POINT_1_FEATURE_ID = UUID.randomUUID().toString();
	private static final String POINT_1_FEATURE_DESCRIPTION = "Point contained by smaller Polygon";

	private static final String POINT_2_FEATURE_ID = UUID.randomUUID().toString();
	private static final String POINT_2_FEATURE_DESCRIPTION = "Point not contained by any Polygon";

	private static final String LINESTRING_1_FEATURE_ID = UUID.randomUUID().toString();
	private static final String LINESTRING_1_FEATURE_DESCRIPTION = "LineString contained by smaller Polygon";

	private static final String LINESTRING_2_FEATURE_ID = UUID.randomUUID().toString();
	private static final String LINESTRING_2_FEATURE_DESCRIPTION = "LineString not contained by any Polygon";

	private static final String POLYGON_1_FEATURE_ID = UUID.randomUUID().toString();
	private static final String POLYGON_1_FEATURE_DESCRIPTION = "Polygon inside bigger Polygon";

	private static final String POLYGON_2_FEATURE_ID = UUID.randomUUID().toString();
	private static final String POLYGON_2_FEATURE_DESCRIPTION = "Bigger Polygon containing other features: Point, LineString and smaller Polygon";

	private static final String POLYGON_3_FEATURE_ID = UUID.randomUUID().toString();
	private static final String POLYGON_3_FEATURE_DESCRIPTION = "Polygon not containing any features";

	@Order(value = -1)
	@Test
	public void testServices(
			@InjectService(cardinality = 1, timeout = 5000, filter = "(component.name=CollectionsService)") ServiceAware<CollectionsService> collectionsServiceAware) {

		assertThat(collectionsServiceAware.getServices()).hasSize(1);
		ServiceReference<CollectionsService> collectionsServiceReference = collectionsServiceAware
				.getServiceReference();
		assertThat(collectionsServiceReference).isNotNull();
	}

	@Test
	public void testGetCollections(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<CollectionsService> collectionsServiceAware)
			throws InterruptedException {

		assertThat(collectionsServiceAware.getServices()).hasSize(1);
		CollectionsService collectionsService = collectionsServiceAware.getService();
		assertThat(collectionsService).isNotNull();

		OGCAPIFeaturesCollectionsWrapper collections = collectionsService.getCollections(BASE_URL, MEDIA_TYPE);
		assertThat(collections).isNotNull();
		assertThat(collections.getCollections()).size().isEqualTo(1);
		assertThat(collections.getLinks()).size().isEqualTo(1);

		OGCAPIFeaturesCollection collection = collections.getCollections().get(0);
		assertEquals(COLLECTION_ID, collection.getId());
	}

	@Test
	public void testGetCollection(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<CollectionsService> collectionsServiceAware)
			throws InterruptedException {

		assertThat(collectionsServiceAware.getServices()).hasSize(1);
		CollectionsService collectionsService = collectionsServiceAware.getService();
		assertThat(collectionsService).isNotNull();

		OGCAPIFeaturesCollection collection = collectionsService.getCollection(COLLECTION_ID, BASE_URL, MEDIA_TYPE);
		assertThat(collection).isNotNull();
		assertEquals(COLLECTION_ID, collection.getId());

		assertThat(collection.getExtent()).isNotNull();
		assertThat(collection.getExtent().getSpatial()).isNotNull();
		assertThat(collection.getExtent().getSpatial().getBbox()).isNotNull();
		assertTrue(collection.getExtent().getSpatial().getBbox().getClass().isArray());
		assertEquals(1, collection.getExtent().getSpatial().getBbox().length);
		assertEquals(4, collection.getExtent().getSpatial().getBbox()[0].length);
		assertEquals(-180.0, collection.getExtent().getSpatial().getBbox()[0][0], 0.001);
		assertEquals(-90.0, collection.getExtent().getSpatial().getBbox()[0][1], 0.001);
		assertEquals(180.0, collection.getExtent().getSpatial().getBbox()[0][2], 0.001);
		assertEquals(90.0, collection.getExtent().getSpatial().getBbox()[0][3], 0.001);
	}

	@Test
	public void testGetItems(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<CollectionsService> collectionsServiceAware)
			throws InterruptedException {

		assertThat(collectionsServiceAware.getServices()).hasSize(1);
		CollectionsService collectionsService = collectionsServiceAware.getService();
		assertThat(collectionsService).isNotNull();

		FeatureCollection featureCollection = collectionsService.getItems(COLLECTION_ID, Optional.empty(), BASE_URL,
				MEDIA_TYPE);
		assertThat(featureCollection).isNotNull();
		assertEquals(FEATURECOLLECTION_ID, featureCollection.getId());
		assertThat(featureCollection.getFeatures()).size().isEqualTo(7);

		Feature point1Feature = featureCollection.getFeatures().get(0);
		assertEquals(POINT_1_FEATURE_ID, point1Feature.getId());
		assertThat(point1Feature.getGeometry()).isNotNull();
		assertEquals(GeometryType.POINT, point1Feature.getGeometry().getType());

		Feature point2Feature = featureCollection.getFeatures().get(1);
		assertEquals(POINT_2_FEATURE_ID, point2Feature.getId());
		assertThat(point2Feature.getGeometry()).isNotNull();
		assertEquals(GeometryType.POINT, point2Feature.getGeometry().getType());

		Feature lineString1Feature = featureCollection.getFeatures().get(2);
		assertEquals(LINESTRING_1_FEATURE_ID, lineString1Feature.getId());
		assertThat(lineString1Feature.getGeometry()).isNotNull();
		assertEquals(GeometryType.LINE_STRING, lineString1Feature.getGeometry().getType());

		Feature lineString2Feature = featureCollection.getFeatures().get(3);
		assertEquals(LINESTRING_2_FEATURE_ID, lineString2Feature.getId());
		assertThat(lineString2Feature.getGeometry()).isNotNull();
		assertEquals(GeometryType.LINE_STRING, lineString2Feature.getGeometry().getType());

		Feature polygon1Feature = featureCollection.getFeatures().get(4);
		assertEquals(POLYGON_1_FEATURE_ID, polygon1Feature.getId());
		assertThat(polygon1Feature.getGeometry()).isNotNull();
		assertEquals(GeometryType.POLYGON, polygon1Feature.getGeometry().getType());

		Feature polygon2Feature = featureCollection.getFeatures().get(5);
		assertEquals(POLYGON_2_FEATURE_ID, polygon2Feature.getId());
		assertThat(polygon2Feature.getGeometry()).isNotNull();
		assertEquals(GeometryType.POLYGON, polygon2Feature.getGeometry().getType());

		Feature polygon3Feature = featureCollection.getFeatures().get(6);
		assertEquals(POLYGON_3_FEATURE_ID, polygon3Feature.getId());
		assertThat(polygon3Feature.getGeometry()).isNotNull();
		assertEquals(GeometryType.POLYGON, polygon3Feature.getGeometry().getType());
	}

	@Test
	public void testGetItemsBBox(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<CollectionsService> collectionsServiceAware)
			throws InterruptedException {

		assertThat(collectionsServiceAware.getServices()).hasSize(1);
		CollectionsService collectionsService = collectionsServiceAware.getService();
		assertThat(collectionsService).isNotNull();

		BoundingBox bBox = createBoundingBox(23.44520990129783, 62.90926279828699, 22.995181481178577,
				63.03308720293944);

		FeatureCollection featureCollection = collectionsService.getItems(COLLECTION_ID, Optional.of(bBox), BASE_URL,
				MEDIA_TYPE);
		assertThat(featureCollection).isNotNull();
		assertThat(featureCollection.getFeatures()).size().isEqualTo(3);

		boolean hasPointGeometryTypeFeature = false, hasLineStringGeometryTypeFeature = false,
				hasPolygonGeometryTypeFeature = false;

		for (Feature feature : featureCollection.getFeatures()) {
			if (GeometryType.POINT == feature.getGeometry().getType()) {
				hasPointGeometryTypeFeature = true;
			} else if (GeometryType.LINE_STRING == feature.getGeometry().getType()) {
				hasLineStringGeometryTypeFeature = true;
			} else if (GeometryType.POLYGON == feature.getGeometry().getType()) {
				hasPolygonGeometryTypeFeature = true;
			}
		}

		assertTrue(hasPointGeometryTypeFeature);
		assertTrue(hasLineStringGeometryTypeFeature);
		assertTrue(hasPolygonGeometryTypeFeature);
	}

	@Test
	public void testGetItemsEmptyBBox(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<CollectionsService> collectionsServiceAware)
			throws InterruptedException {

		assertThat(collectionsServiceAware.getServices()).hasSize(1);
		CollectionsService collectionsService = collectionsServiceAware.getService();
		assertThat(collectionsService).isNotNull();

		BoundingBox emptyBBox = createBoundingBox(23.328572789287676, 62.86071349864713, 23.20756946749117,
				62.89630242864419);

		FeatureCollection featureCollection = collectionsService.getItems(COLLECTION_ID, Optional.of(emptyBBox),
				BASE_URL, MEDIA_TYPE);
		assertThat(featureCollection).isNotNull();
		assertThat(featureCollection.getFeatures()).size().isEqualTo(0);
	}

	@Test
	public void testGetItem(
			@InjectService(cardinality = 1, timeout = 5000) ServiceAware<CollectionsService> collectionsServiceAware)
			throws InterruptedException {

		assertThat(collectionsServiceAware.getServices()).hasSize(1);
		CollectionsService collectionsService = collectionsServiceAware.getService();
		assertThat(collectionsService).isNotNull();

		Feature pointFeature = collectionsService.getItem(COLLECTION_ID, POINT_1_FEATURE_ID, BASE_URL, MEDIA_TYPE);
		assertThat(pointFeature).isNotNull();
		assertEquals(POINT_1_FEATURE_ID, pointFeature.getId());
		assertThat(pointFeature.getGeometry()).isNotNull();
		assertEquals(GeometryType.POINT, pointFeature.getGeometry().getType());
	}

	// TODO: getQueryables(String collectionId)

	// TODO: getSchema(String collectionId)

	@BeforeEach
	public void setup(
			@InjectService(cardinality = 1, timeout = 5000, filter = "(repo_id=OGCAPIFeatures.OGCAPIFeatures)") ServiceAware<EMFRepository> emfRepositoryAware,
			@InjectService(cardinality = 1, timeout = 5000, filter = "(component.name=FeatureIndexService)") ServiceAware<FeatureIndexService> featureIndexServiceAware) {

		assertThat(emfRepositoryAware.getServices()).hasSize(1);
		EMFRepository emfRepository = emfRepositoryAware.getService();
		assertThat(emfRepository).isNotNull();

		assertThat(featureIndexServiceAware.getServices()).hasSize(1);
		FeatureIndexService featureIndexService = featureIndexServiceAware.getService();
		assertThat(featureIndexService).isNotNull();

		// Create OGC Features API 'Collection'
		OGCAPIFeaturesCollection ogcAPIFeaturesCollection = createCollection(BASE_URL, // baseUrl
				COLLECTION_ID, // collectionId
				TITLE, // title
				DESCRIPTION, // description
				CRS, // crs
				STORAGE_CRS); // storageCrs
		emfRepository.save(ogcAPIFeaturesCollection);

		// Create GeoJSON 'Feature Collection'
		FeatureCollection featureCollection = createFeatureCollection(FEATURECOLLECTION_ID);

		Feature point1Feature = createFeature(POINT_1_FEATURE_ID, POINT_1_FEATURE_DESCRIPTION, GeometryType.POINT,
				Position.at(23.2125784, 62.9749241));
		featureCollection.getFeatures().add(point1Feature);

		Feature point2Feature = createFeature(POINT_2_FEATURE_ID, POINT_2_FEATURE_DESCRIPTION, GeometryType.POINT,
				Position.at(23.871053072018327, 62.946980893846444));
		featureCollection.getFeatures().add(point2Feature);

		// @formatter:off
		Feature lineString1Feature = createFeature(LINESTRING_1_FEATURE_ID, LINESTRING_1_FEATURE_DESCRIPTION, GeometryType.LINE_STRING,
				Position.at(23.21368772877409, 62.97437358425378), 
				Position.at(23.218966316115228, 62.97932623037073));
		featureCollection.getFeatures().add(lineString1Feature);
		// @formatter:on

		// @formatter:off
		Feature lineString2Feature = createFeature(LINESTRING_2_FEATURE_ID, LINESTRING_2_FEATURE_DESCRIPTION, GeometryType.LINE_STRING,
				Position.at(23.86323089380153, 62.939397103945055), 
				Position.at(23.87018317956813, 62.94660042309141));
		featureCollection.getFeatures().add(lineString2Feature);
		// @formatter:on

		// @formatter:off
		Feature polygon1Feature = createFeature(POLYGON_1_FEATURE_ID, POLYGON_1_FEATURE_DESCRIPTION,
				GeometryType.POLYGON, 
				Position.at(23.16130534185237, 62.990806268622094),
				Position.at(23.16130534185237, 62.959854501793416), 
				Position.at(23.269417549688114, 62.959854501793416),
				Position.at(23.269417549688114, 62.990806268622094),
				Position.at(23.16130534185237, 62.990806268622094));
		featureCollection.getFeatures().add(polygon1Feature);
		// @formatter:on

		// @formatter:off
		Feature polygon2Feature = createFeature(POLYGON_2_FEATURE_ID, POLYGON_2_FEATURE_DESCRIPTION,
				GeometryType.POLYGON, 
				Position.at(22.995181481178577, 63.03308720293944),
				Position.at(22.995181481178577, 62.90926279828699), 
				Position.at(23.44520990129783, 62.90926279828699),
				Position.at(23.44520990129783, 63.03308720293944), 
				Position.at(22.995181481178577, 63.03308720293944));
		featureCollection.getFeatures().add(polygon2Feature);
		// @formatter:on

		// @formatter:off
		Feature polygon3Feature = createFeature(POLYGON_3_FEATURE_ID, POLYGON_3_FEATURE_DESCRIPTION,
				GeometryType.POLYGON, 
				Position.at(24.20726902095967, 62.743882539189826),
				Position.at(24.20726902095967, 62.049944286632126), 
				Position.at(26.935566317930466, 62.049944286632126),
				Position.at(26.935566317930466, 62.743882539189826),
				Position.at(24.20726902095967, 62.743882539189826));
		featureCollection.getFeatures().add(polygon3Feature);
		// @formatter:off

		emfRepository.save(featureCollection);

		featureIndexService.indexFeature(point1Feature, true);
		featureIndexService.indexFeature(point2Feature, true);

		featureIndexService.indexFeature(lineString1Feature, true);
		featureIndexService.indexFeature(lineString2Feature, true);

		featureIndexService.indexFeature(polygon1Feature, true);
		featureIndexService.indexFeature(polygon2Feature, true);
		featureIndexService.indexFeature(polygon3Feature, true);
	}
	
	@AfterEach
	public void clean(
			@InjectService(cardinality = 1, timeout = 5000, filter = "(database=OGCAPIFeatures)") ServiceAware<MongoDatabaseProvider> dbProviderAware, 
			@InjectService(cardinality = 1, timeout = 5000, filter = "(component.name=FeatureIndexService)") ServiceAware<FeatureIndexService> featureIndexServiceAware) {

		assertThat(featureIndexServiceAware.getServices()).hasSize(1);
		FeatureIndexService featureIndexService = featureIndexServiceAware.getService();
		assertThat(featureIndexService).isNotNull();

		featureIndexService.resetIndex();

		assertThat(dbProviderAware.getServices()).hasSize(1);
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();

		MongoDatabase database = dbProvider.getDatabase();
		try {
			database.getCollection(corePackage.Literals.OGCAPI_FEATURES_COLLECTION.getName()).drop();
			database.getCollection(GeoJSONPackage.Literals.FEATURE_COLLECTION.getName()).drop();
		} catch (IllegalArgumentException e) {
			System.out.println("Collection does not exist. Nothing to remove.");
		}
	}

	@AfterAll
	public static void brutalClean(
			@InjectService(cardinality = 1, timeout = 5000, filter = "(database=OGCAPIFeatures)") ServiceAware<MongoDatabaseProvider> dbProviderAware) {
		assertThat(dbProviderAware.getServices()).hasSize(1);
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();

		MongoDatabase database = dbProvider.getDatabase();
		database.drop();
	}
}
