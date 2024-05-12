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

import org.gecko.emf.rest.annotations.json.EMFJSONConfig;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.runtime.JakartarsServiceRuntime;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.jena.ogc_features.rest.util.BaseUrlUtil;
import de.jena.ogc_features.service.api.ConformanceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import net.opengis.ogcapi.features.core.ConformanceDeclaration;

/**
 * Conformance REST API endpoint.
 * 
 * Part of "OGC API Features Part 1: Core" implementation.
 * 
 * @author Michal H. Siemaszko
 */
@JakartarsResource
@JakartarsName("Conformance Resource")
@Component(service = ConformanceResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/conformance")
public class ConformanceResource {

	@Reference
	private JakartarsServiceRuntime jakartarsServiceRuntime;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ConformanceService conformanceService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@EMFJSONConfig(serializeDefaultValues = true)
	@Operation(responses = { @ApiResponse(responseCode = "200", content = {
			@Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = ConformanceDeclaration.class)) }) }, tags = {
					"Capabilities" })
	public Response getConformanceDeclaration() {

		String baseUrl = BaseUrlUtil.INSTANCE.getBaseUrl(jakartarsServiceRuntime.getRuntimeDTO());

		ConformanceDeclaration conformsToType = conformanceService.getConformanceDeclaration(baseUrl,
				MediaType.APPLICATION_JSON);

		if (conformsToType == null) {
			return Response.noContent().build();
		}

		return Response.ok(conformsToType).build();
	}
}
