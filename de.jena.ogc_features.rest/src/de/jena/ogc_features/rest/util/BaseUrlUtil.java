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
package de.jena.ogc_features.rest.util;

import java.io.IOException;
import java.util.Objects;

import org.osgi.service.jakartars.runtime.dto.RuntimeDTO;

import de.jena.ogc_features.rest.openapi.OpenApiUtil;
import io.swagger.v3.oas.models.OpenAPI;

/**
 * URL related utility methods.
 * 
 * @author Michal H. Siemaszko
 */
public enum BaseUrlUtil {
	INSTANCE;

	public String getBaseUrl(RuntimeDTO runtimeDTO) {
		Objects.requireNonNull(runtimeDTO, "Runtime DTO is required!");

		String baseUrl = null;

		Object osgiJakartarsEndpoint = runtimeDTO.serviceDTO.properties.get("osgi.jakartars.endpoint");
		if (osgiJakartarsEndpoint != null && osgiJakartarsEndpoint instanceof String[]
				&& ((String[]) osgiJakartarsEndpoint).length > 0) {
			baseUrl = ((String[]) osgiJakartarsEndpoint)[0];
		} else {
			try {
				OpenAPI openAPI = OpenApiUtil.INSTANCE.readOpenAPIMeta();
				if (openAPI != null && openAPI.getServers() != null && !openAPI.getServers().isEmpty()) {
					baseUrl = openAPI.getServers().get(0).getUrl();
				}
			} catch (IOException e) {
			}
		}

		if (baseUrl != null && baseUrl.endsWith("/")) {
			baseUrl = baseUrl.substring(0, baseUrl.lastIndexOf("/"));
		}

		return baseUrl;
	}
}
