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
package de.jena.ogc_features.service.tests.helper;

import java.util.Objects;

import net.opengis.ogcapi.features.conf.geojson.Feature;
import net.opengis.ogcapi.features.conf.geojson.FeatureCollection;
import net.opengis.ogcapi.features.conf.geojson.FeatureType;
import net.opengis.ogcapi.features.conf.geojson.GeoJSONFactory;
import net.opengis.ogcapi.features.conf.geojson.Geometry;
import net.opengis.ogcapi.features.conf.geojson.GeometryType;
import net.opengis.ogcapi.features.conf.geojson.LineString;
import net.opengis.ogcapi.features.conf.geojson.Point;
import net.opengis.ogcapi.features.conf.geojson.Polygon;
import net.opengis.ogcapi.features.core.BoundingBox;
import net.opengis.ogcapi.features.core.Extent;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection;
import net.opengis.ogcapi.features.core.SpatialExtent;
import net.opengis.ogcapi.features.core.coreFactory;

/**
 * Helper for {@link de.jena.ogc_features.service.tests.CollectionsServiceTest}
 * 
 * @author Michal H. Siemaszko
 */
public class CollectionsServiceTestHelper {

	public static OGCAPIFeaturesCollection createCollection(String baseUrl, String collectionId, String title,
			String description, String crs, String storageCrs) {
		OGCAPIFeaturesCollection collection = coreFactory.eINSTANCE.createOGCAPIFeaturesCollection();

		collection.setId(collectionId);

		collection.setItemType("feature");

		collection.setTitle(title);

		collection.setDescription(description);

		Extent extent = createExtent(crs);
		collection.setExtent(extent);

		collection.getCrs().add(crs);

		collection.setStorageCrs(storageCrs);

		return collection;
	}

	private static Extent createExtent(String crs) {
		Extent extent = coreFactory.eINSTANCE.createExtent();

		SpatialExtent spatialExtent = coreFactory.eINSTANCE.createSpatialExtent();

		spatialExtent.setBbox(new Double[][] { new Double[] { -180.0, -90.0, 180.0, 90.0 } });

		spatialExtent.setCrs(crs);

		extent.setSpatial(spatialExtent);

		return extent;
	}

	public static FeatureCollection createFeatureCollection(String featureCollectionId) {
		FeatureCollection featureCollection = GeoJSONFactory.eINSTANCE.createFeatureCollection();
		featureCollection.setId(featureCollectionId);

		return featureCollection;
	}

	public static Feature createFeature(String featureId, String description, GeometryType type, Position... position) {
		Feature feature = GeoJSONFactory.eINSTANCE.createFeature();

		feature.setId(featureId);

		feature.setType(FeatureType.FEATURE);

		Geometry geometry = createGeometry(type, position);
		feature.setGeometry(geometry);

		feature.getProperties().put("description", description);

		return feature;
	}

	public static BoundingBox createBoundingBox(double xMin, double yMin, double xMax, double yMax) {
		BoundingBox bbox = coreFactory.eINSTANCE.createBoundingBox();

		bbox.getLowerCorner().add(xMin);
		bbox.getLowerCorner().add(yMin);

		bbox.getUpperCorner().add(xMax);
		bbox.getUpperCorner().add(yMax);

		return bbox;
	}

	private static Geometry createGeometry(GeometryType type, Position... position) {
		Objects.requireNonNull(position, "Position is required");

		switch (type) {
		case POINT:
			return createPointGeometry(position);
		case LINE_STRING:
			return createLineStringGeometry(position);
		case POLYGON:
			return createPolygonGeometry(position);
		default:
			throw new IllegalArgumentException("Geometry type '" + type + "' is not supported!");
		}
	}

	private static Point createPointGeometry(Position... position) {
		Point pointGeometry = GeoJSONFactory.eINSTANCE.createPoint();

		pointGeometry.setType(GeometryType.POINT);

		pointGeometry.getCoordinates().add(position[0].longitude);
		pointGeometry.getCoordinates().add(position[0].latitude);

		return pointGeometry;
	}

	private static LineString createLineStringGeometry(Position... position) {
		LineString lineString = GeoJSONFactory.eINSTANCE.createLineString();

		lineString.setType(GeometryType.LINE_STRING);

		for (int i = 0; i < position.length; i++) {
			Double[] coordinates = new Double[] { position[0].longitude, position[0].latitude };

			lineString.getCoordinates().add(coordinates);
		}

		return lineString;
	}

	private static Polygon createPolygonGeometry(Position... position) {
		Polygon polygonGeometry = GeoJSONFactory.eINSTANCE.createPolygon();

		polygonGeometry.setType(GeometryType.POLYGON);

		Double[][] coordinates = new Double[position.length][2];

		for (int i = 0; i < position.length; i++) {
			coordinates[i][0] = position[i].longitude;
			coordinates[i][1] = position[i].latitude;
		}

		polygonGeometry.getCoordinates().add(coordinates);

		return polygonGeometry;
	}

	public static class Position {
		double longitude;
		double latitude;

		private Position(double longitude, double latitude) {
			this.longitude = longitude;
			this.latitude = latitude;
		}

		public static Position at(double longitude, double latitude) {
			return new Position(longitude, latitude);
		}
	}
}
