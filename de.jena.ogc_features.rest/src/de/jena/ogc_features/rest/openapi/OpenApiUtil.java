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
package de.jena.ogc_features.rest.openapi;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.swagger.v3.core.util.Yaml;
import io.swagger.v3.oas.integration.SwaggerConfiguration;
import io.swagger.v3.oas.models.OpenAPI;

/**
 * OpenAPI utility methods.
 * 
 * @author Michal H. Siemaszko
 */
public enum OpenApiUtil {
	INSTANCE;

	private static final String OPENAPI_META_YAML = "/openapi-meta.yaml";

	public SwaggerConfiguration configureSwagger() throws JsonMappingException, JsonProcessingException, IOException {
		OpenAPI openApiMeta = readOpenAPIMeta();

		return configureSwagger(openApiMeta);
	}

	public OpenAPI readOpenAPIMeta() throws JsonMappingException, JsonProcessingException, IOException {
		return deserializeOpenAPIMeta(readOpenAPIMetaAsString());
	}

	private SwaggerConfiguration configureSwagger(OpenAPI openApiMeta) {
		Objects.requireNonNull(openApiMeta, "OpenAPI meta-data is required!");

		return new SwaggerConfiguration().openAPI(openApiMeta).prettyPrint(true).sortOutput(true);
	}

	private OpenAPI deserializeOpenAPIMeta(String openAPIMetaAsString)
			throws JsonMappingException, JsonProcessingException {
		Objects.requireNonNull(openAPIMetaAsString, "OpenAPI meta-data is required!");

		return Yaml.mapper().readValue(openAPIMetaAsString, OpenAPI.class);
	}

	private String readOpenAPIMetaAsString() throws IOException {
		try (InputStream is = getClass().getResourceAsStream(OPENAPI_META_YAML)) {
			return new String(is.readAllBytes(), StandardCharsets.UTF_8);
		}
	}
}
