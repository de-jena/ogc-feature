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

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

import net.opengis.ogcapi.features.conf.geojson.Feature;
import net.opengis.ogcapi.features.core.BoundingBox;

/**
 * Search service for {@link net.opengis.ogcapi.features.conf.geojson.Feature}
 * EObjects.
 * 
 * @author Michal H. Siemaszko
 */
@ProviderType
public interface FeatureSearchService {

	List<Feature> searchFeaturesByBoundingBox(String collectionId, BoundingBox bbox);
}
