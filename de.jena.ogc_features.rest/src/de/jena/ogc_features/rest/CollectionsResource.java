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
import de.jena.ogc_features.service.api.CollectionsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import net.opengis.ogcapi.features.conf.geojson.Feature;
import net.opengis.ogcapi.features.conf.geojson.FeatureCollection;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper;

/**
 * Collections REST API endpoint.
 * 
 * Part of "OGC API Features Part 1: Core" implementation.
 * 
 * @author Michal H. Siemaszko
 */
@JakartarsResource
@JakartarsName("Collections Resource")
@Component(service = CollectionsResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/collections")
public class CollectionsResource {

	@Reference
	private JakartarsServiceRuntime jakartarsServiceRuntime;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private CollectionsService collectionsService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@EMFJSONConfig(serializeDefaultValues = true)
	@Operation(responses = { @ApiResponse(responseCode = "200", content = {
			@Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = OGCAPIFeaturesCollectionsWrapper.class)) }) }, tags = {
					"Data" })
	public Response getCollections() {

		String baseUrl = BaseUrlUtil.INSTANCE.getBaseUrl(jakartarsServiceRuntime.getRuntimeDTO());

		OGCAPIFeaturesCollectionsWrapper collectionsType = collectionsService.getCollections(baseUrl,
				MediaType.APPLICATION_JSON);

		if (collectionsType == null) {
			return Response.noContent().build();
		}

		return Response.ok(collectionsType).build();
	}

	@GET
	@Path("{collectionId}")
	@Produces({ MediaType.APPLICATION_JSON })
	@EMFJSONConfig(serializeDefaultValues = true)
	@Operation(responses = { @ApiResponse(responseCode = "200", content = {
			@Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = OGCAPIFeaturesCollection.class)) }) }, tags = {
					"Data" })
	public Response getCollection(
			@NotBlank(message = "Please provide collection Id") @PathParam(value = "collectionId") @Parameter(name = "collectionId", required = true) String collectionId) {

		String baseUrl = BaseUrlUtil.INSTANCE.getBaseUrl(jakartarsServiceRuntime.getRuntimeDTO());

		OGCAPIFeaturesCollection collectionType = collectionsService.getCollection(collectionId, baseUrl,
				MediaType.APPLICATION_JSON);

		if (collectionType == null) {
			return Response.noContent().build();
		}

		return Response.ok(collectionType).build();
	}

	@GET
	@Path("{collectionId}/items")
	@Produces({ MediaType.APPLICATION_JSON })
	@EMFJSONConfig(serializeDefaultValues = true)
	@Operation(responses = { @ApiResponse(responseCode = "200", content = {
			@Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = FeatureCollection.class)) }) }, tags = {
					"Data" })
	public Response getItems(
			@NotBlank(message = "Please provide collection Id") @PathParam(value = "collectionId") @Parameter(name = "collectionId", required = true) String collectionId,
			@QueryParam("bbox") @Parameter(name = "bbox", required = false) String bbox,
			@QueryParam("limit") @Parameter(name = "limit", required = false) Long limit,
			@QueryParam("offset") @Parameter(name = "offset", required = false) Long offset) {

		String baseUrl = BaseUrlUtil.INSTANCE.getBaseUrl(jakartarsServiceRuntime.getRuntimeDTO());

		FeatureCollection featureCollection = collectionsService.getItems(collectionId, bbox,
				(limit != null) ? limit.longValue() : CollectionsService.ITEMS_LIMIT_DEFAULT,
				(offset != null) ? offset.longValue() : CollectionsService.ITEMS_OFFSET_DEFAULT, baseUrl,
				MediaType.APPLICATION_JSON);

		if (featureCollection == null) {
			return Response.noContent().build();
		}

		return Response.ok(featureCollection).build();
	}

	@GET
	@Path("{collectionId}/items/{featureId}")
	@Produces({ MediaType.APPLICATION_JSON })
	@EMFJSONConfig(serializeDefaultValues = true)
	@Operation(responses = { @ApiResponse(responseCode = "200", content = {
			@Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = FeatureCollection.class)) }) }, tags = {
					"Data" })
	public Response getItem(
			@NotBlank(message = "Please provide collection Id") @PathParam(value = "collectionId") @Parameter(name = "collectionId", required = true) String collectionId,
			@NotBlank(message = "Please provide feature Id") @PathParam(value = "featureId") @Parameter(name = "featureId", required = true) String featureId) {

		String baseUrl = BaseUrlUtil.INSTANCE.getBaseUrl(jakartarsServiceRuntime.getRuntimeDTO());

		Feature feature = collectionsService.getItem(collectionId, featureId, baseUrl, MediaType.APPLICATION_JSON);

		if (feature == null) {
			return Response.noContent().build();
		}

		return Response.ok(feature).build();
	}

	// 'GET /collections/{collectionId}/queryables'
	// getQueryables

	// 'GET /collections/{collectionId}/schema'
	// getSchema
}
