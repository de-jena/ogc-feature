/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 *     Stefan Bishof - API and implementation
 *     Tim Ward - implementation
 */
package de.jena.ogc_features.rest;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.jena.ogc_features.rest.openapi.OpenApiUtil;
import io.swagger.v3.core.util.Json;
import io.swagger.v3.jaxrs2.integration.JaxrsOpenApiContextBuilder;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.integration.SwaggerConfiguration;
import io.swagger.v3.oas.integration.api.OpenAPIConfiguration;
import io.swagger.v3.oas.integration.api.OpenApiContext;
import io.swagger.v3.oas.integration.api.OpenApiScanner;
import io.swagger.v3.oas.models.OpenAPI;
import jakarta.servlet.ServletConfig;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * OpenAPI REST API endpoint.
 * 
 * Part of "OGC API Features Part 1: Core" implementation.
 * 
 * @author Michal H. Siemaszko
 */
@JakartarsResource
@JakartarsName("API Resource")
@Component(service = OpenAPIResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/api")
public class OpenAPIResource {

	@Context
	private Application app;

	@Context
	private ServletConfig config;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Operation(hidden = true)
	public Response getAPIDefinition() throws Exception {

		SwaggerConfiguration openApiConfig = OpenApiUtil.INSTANCE.configureSwagger();

		String ctxId = app.getClass().getCanonicalName().concat("#")
				.concat(String.valueOf(System.identityHashCode(app)));

		OpenApiContext ctx = new JaxrsOpenApiContextBuilder<>().servletConfig(config).application(app)
				.openApiConfiguration(openApiConfig).ctxId(ctxId).buildContext(true);

		ctx.setOpenApiScanner(new OpenApiScanner() {

			@Override
			public void setConfiguration(OpenAPIConfiguration openApiConfiguration) {
				// NOP
			}

			@Override
			public Set<Class<?>> classes() {
				Set<Class<?>> classes = new HashSet<>(app.getClasses());

				classes.add(de.jena.ogc_features.rest.openapi.OpenApiPostProcessor.class);

				return Collections.unmodifiableSet(classes);
			}

			@Override
			public Map<String, Object> resources() {
				// NOP
				return null;
			}
		});

		OpenAPI oas = ctx.read();

		if (oas == null) {
			return Response.status(404).build();
		}

		boolean pretty = Optional.ofNullable(ctx.getOpenApiConfiguration()).map(OpenAPIConfiguration::isPrettyPrint)
				.orElse(Boolean.FALSE);

		return Response.status(Response.Status.OK)
				.entity(pretty ? Json.pretty(oas) : Json.mapper().writeValueAsString(oas))
				.type(MediaType.APPLICATION_JSON_TYPE).build();
	}
}
