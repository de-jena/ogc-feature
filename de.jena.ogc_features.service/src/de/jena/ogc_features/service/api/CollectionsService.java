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
package de.jena.ogc_features.service.api;

import java.util.Optional;

import org.osgi.annotation.versioning.ProviderType;

import net.opengis.ogcapi.features.conf.geojson.Feature;
import net.opengis.ogcapi.features.conf.geojson.FeatureCollection;
import net.opengis.ogcapi.features.core.BoundingBox;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper;

/**
 * Collections service.
 * 
 * @author Michal H. Siemaszko
 */
@ProviderType
public interface CollectionsService {

	static final long ITEMS_LIMIT_DEFAULT = 10;
	
	static final long ITEMS_OFFSET_DEFAULT = 0;

	/**
	 * Lists collections of data that can be queried.
	 * 
	 * @return
	 */
	OGCAPIFeaturesCollectionsWrapper getCollections(String baseUrl, String mediaType);

	/**
	 * Retrieves specific collection of data.
	 * 
	 * @param collectionId
	 * @param baseUrl
	 * @param mediaType
	 * @return
	 */
	OGCAPIFeaturesCollection getCollection(String collectionId, String baseUrl, String mediaType);

	/**
	 * Retrieves all data in a specific collection, optionally within a given
	 * bounding box.
	 * 
	 * Data is returned in pageable chunks.
	 * 
	 * @param collectionId
	 * @param bboxOptional
	 * @param baseUrl
	 * @param mediaType
	 * @return
	 */
	FeatureCollection getItems(String collectionId, Optional<BoundingBox> bboxOptional, String baseUrl,
			String mediaType);

	FeatureCollection getItems(String collectionId, Optional<BoundingBox> bboxOptional, long limit, long offset,
			String baseUrl, String mediaType);

	/**
	 * Retrieves all data in a specific collection, within a given bounding box.
	 * 
	 * Bounding box must be provided as string in the format: "xMin,yMin,xMax,yMax".
	 * Any other format will result in Bounding box being ignored.
	 * 
	 * @param collectionId
	 * @param bbox
	 * @param baseUrl
	 * @param mediaType
	 * @return
	 */
	FeatureCollection getItems(String collectionId, String bbox, String baseUrl, String mediaType);

	FeatureCollection getItems(String collectionId, String bbox, long limit, long offset, String baseUrl,
			String mediaType);

	/**
	 * Retrieves specific 'feature' from a given collection.
	 * 
	 * @param collectionId
	 * @param featureId
	 * @param baseUrl
	 * @param mediaType
	 * @return
	 */
	Feature getItem(String collectionId, String featureId, String baseUrl, String mediaType);

	// TODO: getQueryables(String collectionId)

	// TODO: getSchema(String collectionId)
}
