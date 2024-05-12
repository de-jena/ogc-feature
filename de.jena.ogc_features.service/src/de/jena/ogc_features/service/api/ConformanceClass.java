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

/**
 * Specifies supported "OGC API Features" conformance classes.
 * 
 * @author Michal H. Siemaszko
 */
public enum ConformanceClass {

	// OGC API - Features - Part 1: Core
	Core("http://www.opengis.net/spec/ogcapi-features-1/1.0/conf/core"),
	OpenAPI30("http://www.opengis.net/spec/ogcapi-features-1/1.0/conf/oas30"),
	GeoJSON("http://www.opengis.net/spec/ogcapi-features-1/1.0/conf/geojson");

	public final String uri;

	private ConformanceClass(String uri) {
		this.uri = uri;
	}
}
