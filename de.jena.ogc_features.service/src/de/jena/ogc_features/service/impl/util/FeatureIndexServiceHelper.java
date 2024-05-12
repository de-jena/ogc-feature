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
package de.jena.ogc_features.service.impl.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.LatLonShape;
import org.apache.lucene.document.LatLonShapeDocValuesField;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.document.StringField;
import org.apache.lucene.index.Term;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.search.document.EObjectContextObjectBuilder;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.IndexActionType;
import org.gecko.search.document.context.ObjectContextObject;

import net.opengis.ogcapi.features.conf.geojson.Feature;
import net.opengis.ogcapi.features.conf.geojson.GeoJSONPackage;
import net.opengis.ogcapi.features.conf.geojson.Geometry;
import net.opengis.ogcapi.features.conf.geojson.LineString;
import net.opengis.ogcapi.features.conf.geojson.MultiLineString;
import net.opengis.ogcapi.features.conf.geojson.MultiPoint;
import net.opengis.ogcapi.features.conf.geojson.MultiPolygon;
import net.opengis.ogcapi.features.conf.geojson.Point;
import net.opengis.ogcapi.features.conf.geojson.Polygon;

/**
 * Helper for {@link de.jena.ogc_features.service.impl.FeatureIndexServiceImpl}
 * 
 * @author Michal H. Siemaszko
 */
public class FeatureIndexServiceHelper {
	// FIXME: make 'org.gecko.search.util.DocumentUtil.ECLASS_URI' public, so this
	// does not have to be re-defined
	public static final String FIELD__ECLASS_URI = "_eClassUri";
	public static final String FIELD__ID = "id";

	public static final String FEATURE_ID = "feature_id";
	public static final String GEOMETRY_TYPE = "geometry_type";
	public static final String GEOMETRY_COORDINATES = "geometry_coordinates";

	public static EObjectDocumentIndexObjectContext mapFeatureNew(Feature feature) {
		return mapFeature(feature, IndexActionType.ADD);
	}

	public static EObjectDocumentIndexObjectContext mapFeatureUpdate(Feature feature) {
		return mapFeature(feature, IndexActionType.MODIFY);
	}

	/**
	 * Maps a given {@link Feature} to {@link ObjectContextObject} with a given
	 * {@link IndexActionType}
	 * 
	 * @param feature     the feature to index
	 * @param indexAction the index action (ADD, UPDATE, REMOVE)
	 * @return the {@link ObjectContextObject}
	 */
	public static EObjectDocumentIndexObjectContext mapFeature(Feature feature, IndexActionType indexAction) {
		Objects.requireNonNull(feature.getId(), "Feature Id is required!");

		Document doc = new Document();

		doc.add(new StringField(FIELD__ECLASS_URI, constructEClassUri(), Store.YES));
		doc.add(new StringField(FIELD__ID, feature.getId(), Store.YES));

		doc.add(new StringField(FEATURE_ID, feature.getId(), Store.YES));

		mapFeatureGeometry(feature.getGeometry(), doc);

		EObjectContextObjectBuilder builder = (EObjectContextObjectBuilder) EObjectContextObjectBuilder.create()
				.withDocuments(Collections.singletonList(doc)).withSourceObject(feature)
				.withIndexActionType(indexAction);

		if (IndexActionType.MODIFY.equals(indexAction) || IndexActionType.REMOVE.equals(indexAction)) {
			builder.withIdentifyingTerm(new Term("id", feature.getId()));
		}

		return builder.build();
	}

	private static void mapFeatureGeometry(Geometry geometry, Document doc) {
		doc.add(new StringField(GEOMETRY_TYPE, geometry.getType().getName(), Store.YES));

		switch (geometry.getType()) {
		case POINT:
			mapFeaturePointGeometry((Point) geometry, doc);
			break;
		case LINE_STRING:
			mapFeatureLineStringGeometry((LineString) geometry, doc);
			break;
		case POLYGON:
			mapFeaturePolygonGeometry((Polygon) geometry, doc);
			break;
		case MULTI_POINT:
			mapFeatureMultiPointGeometry((MultiPoint) geometry, doc);
			break;
		case MULTI_LINE_STRING:
			mapFeatureMultiLineStringGeometry((MultiLineString) geometry, doc);
			break;
		case MULTI_POLYGON:
			mapFeatureMultiPolygonGeometry((MultiPolygon) geometry, doc);
			break;
		default:
			throw new IllegalArgumentException("Unsupported geometry type!");
		}
	}

	/*
	 {
	   "type": "Point",
	   "coordinates": [100.0, 0.0]
	 }
	 */
	private static void mapFeaturePointGeometry(Point pointGeometry, Document doc) {
		mapFeaturePointGeometry(pointGeometry.getCoordinates().get(1), pointGeometry.getCoordinates().get(0), doc);
	}

	/*
	 {
	   "type": "LineString",
	   "coordinates": [
	     [100.0, 0.0],
	     [101.0, 1.0]
	   ]
	 }
	 */
	private static void mapFeatureLineStringGeometry(LineString lineStringGeometry, Document doc) {
		List<Double[]> coordinates = lineStringGeometry.getCoordinates();

		double[] longitudes = coordinates.stream().mapToDouble(c -> c[0]).toArray();

		double[] latitudes = coordinates.stream().mapToDouble(c -> c[1]).toArray();

		mapFeatureLineStringGeometry(latitudes, longitudes, doc);
	}

	/*
	 {
	   "type": "Polygon",
	   "coordinates": [
	     [[100.0, 0.0],
	     [101.0, 0.0],
	     [101.0, 1.0],
	     [100.0, 1.0],
	     [100.0, 0.0]]
	   ]
	 }
	 */
	private static void mapFeaturePolygonGeometry(Polygon polygonGeometry, Document doc) {
		Double[][] coordinates = polygonGeometry.getCoordinates().get(0);

		double[] longitudes = Arrays.stream(coordinates).mapToDouble(c -> c[0]).toArray();

		double[] latitudes = Arrays.stream(coordinates).mapToDouble(c -> c[1]).toArray();

		mapFeaturePolygonGeometry(latitudes, longitudes, doc);
	}

	/*
	 {
	   "type": "MultiPoint",
	   "coordinates": [
	     [100.0, 0.0],
	     [101.0, 1.0]
	   ]
	 }
	 */
	private static void mapFeatureMultiPointGeometry(MultiPoint multiPointGeometry, Document doc) {
		for (Double[] coordinates : multiPointGeometry.getCoordinates()) {
			mapFeaturePointGeometry(coordinates[1], coordinates[0], doc);
		}
	}

	/*
	 {
	   "type": "MultiLineString",
	   "coordinates": [
	     [
	       [100.0, 0.0],
	       [101.0, 1.0]
	     ],
	     [
	       [102.0, 2.0],
	       [103.0, 3.0]
	     ]
	   ]
	 }
	 */
	private static void mapFeatureMultiLineStringGeometry(MultiLineString multiLineStringGeometry, Document doc) {
		for (Double[][] coordinates : multiLineStringGeometry.getCoordinates()) {

			double[] longitudes = Arrays.stream(coordinates).mapToDouble(c -> c[0]).toArray();

			double[] latitudes = Arrays.stream(coordinates).mapToDouble(c -> c[1]).toArray();

			mapFeatureLineStringGeometry(latitudes, longitudes, doc);
		}
	}

	/*
	 {
	   "type": "MultiPolygon",
	   "coordinates": [
	     [
	       [
	         [102.0, 2.0],
	         [103.0, 2.0],
	         [103.0, 3.0],
	         [102.0, 3.0],
	         [102.0, 2.0]
	       ]
	     ],
	     [
	       [
	         [100.0, 0.0],
	         [101.0, 0.0],
	         [101.0, 1.0],
	         [100.0, 1.0],
	         [100.0, 0.0]
	       ],
	     ]
	   ]
	 }
	 */
	private static void mapFeatureMultiPolygonGeometry(MultiPolygon multiPolygonGeometry, Document doc) {
		for (Double[][][] coordinates : multiPolygonGeometry.getCoordinates()) {

			double[] longitudes = Arrays.stream(coordinates[0]).mapToDouble(c -> c[0]).toArray();

			double[] latitudes = Arrays.stream(coordinates[0]).mapToDouble(c -> c[1]).toArray();

			mapFeaturePolygonGeometry(latitudes, longitudes, doc);
		}
	}

	private static void mapFeaturePointGeometry(double latitude, double longitude, Document doc) {
		Field[] indexableFields = LatLonShape.createIndexableFields(GEOMETRY_COORDINATES, latitude, longitude);
		addFieldsToDocument(GEOMETRY_COORDINATES, indexableFields, doc, true);

		LatLonShapeDocValuesField docValuesField = LatLonShape.createDocValueField(GEOMETRY_COORDINATES,
				indexableFields);
		doc.add(docValuesField);
	}

	private static void mapFeatureLineStringGeometry(double[] latitudes, double[] longitudes, Document doc) {
		org.apache.lucene.geo.Line line = new org.apache.lucene.geo.Line(latitudes, longitudes);

		Field[] indexableFields = LatLonShape.createIndexableFields(GEOMETRY_COORDINATES, line);
		addFieldsToDocument(GEOMETRY_COORDINATES, indexableFields, doc, true);

		LatLonShapeDocValuesField docValuesField = LatLonShape.createDocValueField(GEOMETRY_COORDINATES,
				indexableFields);
		doc.add(docValuesField);
	}

	private static void mapFeaturePolygonGeometry(double[] latitudes, double[] longitudes, Document doc) {
		org.apache.lucene.geo.Polygon polygon = new org.apache.lucene.geo.Polygon(latitudes, longitudes);

		Field[] indexableFields = LatLonShape.createIndexableFields(GEOMETRY_COORDINATES, polygon);
		addFieldsToDocument(GEOMETRY_COORDINATES, indexableFields, doc, true);

		LatLonShapeDocValuesField docValuesField = LatLonShape.createDocValueField(GEOMETRY_COORDINATES,
				indexableFields);
		doc.add(docValuesField);
	}

	private static void addFieldsToDocument(String fieldName, Field[] indexableFields, Document doc, boolean store) {
		for (Field field : indexableFields) {
			doc.add(field);
			if (store) {
				doc.add(new StoredField(fieldName, field.binaryValue()));
			}
		}
	}

	private static String constructEClassUri() {
		return EcoreUtil.getURI(GeoJSONPackage.Literals.FEATURE).toString();
	}
}
