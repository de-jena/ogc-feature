/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.ogc_features.rest.openapi;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.jaxrs2.ReaderListener;
import io.swagger.v3.oas.integration.api.OpenApiReader;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.ComposedSchema;
import io.swagger.v3.oas.models.media.Discriminator;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;

/**
 * Utilizing Swagger's extension mechanisms, several of the issues encountered -
 * related to lack of configuration options, missing features, as well as usage
 * of generated EMF model which prevents utilization of Swagger Annotations -
 * are thus solved.
 * 
 * @author Michal H. Siemaszko
 */
public class OpenApiPostProcessor implements ReaderListener {
	
	// @formatter:off
	private static final List<String> OBSOLETE_SCHEMAS = List.of(
			"EListOGCAPIFeaturesCollection",
			"EListFeature",
			"EListLinkType",
			"EListString",
			"EMapStringString");
	// @formatter:on

	private static final String GEOJSON_GEOMETRY_SCHEMA_NAME = "Geometry";

	// @formatter:off
    private static final Discriminator GEOJSON_GEOMETRY_SCHEMA_DISCRIMINATOR = new Discriminator()
			.propertyName("type")
			.mapping("Point", "#/components/schemas/Point")
			.mapping("MultiPoint", "#/components/schemas/MultiPoint")
			.mapping("LineString", "#/components/schemas/LineString")
			.mapping("MultiLineString", "#/components/schemas/MultiLineString")
			.mapping("Polygon", "#/components/schemas/Polygon")
			.mapping("MultiPolygon", "#/components/schemas/MultiPolygon");
    // @formatter:on		

	// @formatter:off
	private static final Map<String, Class<?>> GEOJSON_ADDITIONAL_SCHEMA_CLASSES = Map.of(
			"Point", net.opengis.ogcapi.features.conf.geojson.Point.class,
			"MultiPoint", net.opengis.ogcapi.features.conf.geojson.MultiPoint.class,
			"LineString", net.opengis.ogcapi.features.conf.geojson.LineString.class,
			"MultiLineString", net.opengis.ogcapi.features.conf.geojson.MultiLineString.class,
			"Polygon", net.opengis.ogcapi.features.conf.geojson.Polygon.class,
			"MultiPolygon", net.opengis.ogcapi.features.conf.geojson.MultiPolygon.class);
	// @formatter:on

	/* 
	 * (non-Javadoc)
	 * @see io.swagger.v3.jaxrs2.ReaderListener#beforeScan(io.swagger.v3.oas.integration.api.OpenApiReader, io.swagger.v3.oas.models.OpenAPI)
	 */
	@Override
	public void beforeScan(OpenApiReader reader, OpenAPI openAPI) {
		// NOP
	}

	/* 
	 * (non-Javadoc)
	 * @see io.swagger.v3.jaxrs2.ReaderListener#afterScan(io.swagger.v3.oas.integration.api.OpenApiReader, io.swagger.v3.oas.models.OpenAPI)
	 */
	@Override
	public void afterScan(OpenApiReader reader, OpenAPI openAPI) {
		removeObsoleteSchemas(openAPI);

		includeAdditionalGeoJSONSchemas(openAPI);

		enhanceGeoJSONSchemas(openAPI);

		sortSchemas(openAPI); // even though "sortOutput" configuration option is set to true, schemas are not
								// sorted automatically..
	}

	@SuppressWarnings("rawtypes")
	private void includeAdditionalGeoJSONSchemas(OpenAPI openAPI) {
		GEOJSON_ADDITIONAL_SCHEMA_CLASSES.forEach((schemaName, schemaClass) -> {
			Map<String, Schema> readSchemaMap = ModelConverters.getInstance().read(schemaClass);
			if (readSchemaMap.containsKey(schemaName)) {
				openAPI.schema(schemaName, readSchemaMap.get(schemaName));
			}
		});
	}

	private void enhanceGeoJSONSchemas(OpenAPI openAPI) {
		addGeoJSONGeometrySchemaDiscriminator(openAPI);

		convertGeoJSONSchemasToComposedSchemas(openAPI);
	}

	private void addGeoJSONGeometrySchemaDiscriminator(OpenAPI openAPI) {
		openAPI.getComponents().getSchemas().computeIfPresent(GEOJSON_GEOMETRY_SCHEMA_NAME,
				(k, v) -> v.discriminator(GEOJSON_GEOMETRY_SCHEMA_DISCRIMINATOR));
	}

	private void convertGeoJSONSchemasToComposedSchemas(OpenAPI openAPI) {
		Schema<?> geometrySchema = openAPI.getComponents().getSchemas().get(GEOJSON_GEOMETRY_SCHEMA_NAME);

		GEOJSON_ADDITIONAL_SCHEMA_CLASSES.keySet().forEach((schemaName) -> {
			if (!schemaName.equals(GEOJSON_GEOMETRY_SCHEMA_NAME)) {
				openAPI.getComponents().getSchemas().computeIfPresent(schemaName,
						(k, v) -> convertGeoJSONSchemaToComposedSchema(geometrySchema, v));
			}
		});
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Schema<?> convertGeoJSONSchemaToComposedSchema(Schema<?> supertypeSchema, Schema<?> subtypeSchema) {
		Schema composedSchema = null;
		if (!(subtypeSchema instanceof ComposedSchema)) {
			// @formatter:off
			composedSchema = new ComposedSchema()
	                .title(subtypeSchema.getTitle())
	                .name(subtypeSchema.getName())
	                .deprecated(subtypeSchema.getDeprecated())
	                .additionalProperties(subtypeSchema.getAdditionalProperties())
	                .description(subtypeSchema.getDescription())
	                .discriminator(subtypeSchema.getDiscriminator())
	                .exclusiveMaximum(subtypeSchema.getExclusiveMaximum())
	                .exclusiveMinimum(subtypeSchema.getExclusiveMinimum())
	                .externalDocs(subtypeSchema.getExternalDocs())
	                .format(subtypeSchema.getFormat())
	                .maximum(subtypeSchema.getMaximum())
	                .maxItems(subtypeSchema.getMaxItems())
	                .maxLength(subtypeSchema.getMaxLength())
	                .maxProperties(subtypeSchema.getMaxProperties())
	                .minimum(subtypeSchema.getMinimum())
	                .minItems(subtypeSchema.getMinItems())
	                .minLength(subtypeSchema.getMinLength())
	                .minProperties(subtypeSchema.getMinProperties())
	                .multipleOf(subtypeSchema.getMultipleOf())
	                .not(subtypeSchema.getNot())
	                .nullable(subtypeSchema.getNullable())
	                .pattern(subtypeSchema.getPattern())
	                .properties(subtypeSchema.getProperties())
	                .readOnly(subtypeSchema.getReadOnly())
	                .required(subtypeSchema.getRequired())
	                .type(subtypeSchema.getType())
	                .uniqueItems(subtypeSchema.getUniqueItems())
	                .writeOnly(subtypeSchema.getWriteOnly())
	                .xml(subtypeSchema.getXml())
	                .extensions(subtypeSchema.getExtensions());
			// @formatter:on

			if (subtypeSchema.getExample() != null || subtypeSchema.getExampleSetFlag()) {
				composedSchema.example(subtypeSchema.getExample());
			}

			composedSchema.setEnum(subtypeSchema.getEnum());
		} else {
			composedSchema = (ComposedSchema) subtypeSchema;
		}

		Schema<?> refSchema = new Schema<>().$ref(Components.COMPONENTS_SCHEMAS_REF + supertypeSchema.getName());

		if (composedSchema.getAllOf() == null || !composedSchema.getAllOf().contains(refSchema)) {
			composedSchema.addAllOfItem(refSchema);
		}

		removeParentProperties(composedSchema, supertypeSchema);

		if (composedSchema.getAllOf() != null && !composedSchema.getAllOf().isEmpty()) {
			if (composedSchema.getProperties() != null && !composedSchema.getProperties().isEmpty()) {
				ObjectSchema propSchema = new ObjectSchema();
				propSchema.properties(composedSchema.getProperties());
				composedSchema.setProperties(null);
				composedSchema.addAllOfItem(propSchema);
			}
		}

		return composedSchema;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void removeParentProperties(Schema child, Schema parent) {
		final Map<String, Schema> baseProps = parent.getProperties();
		final Map<String, Schema> subtypeProps = child.getProperties();
		if (baseProps != null && subtypeProps != null) {
			for (Map.Entry<String, Schema> entry : baseProps.entrySet()) {
				if (entry.getValue().equals(subtypeProps.get(entry.getKey()))) {
					subtypeProps.remove(entry.getKey());
				}
			}
		}
		if (subtypeProps == null || subtypeProps.isEmpty()) {
			child.setProperties(null);
		}
	}

	private void removeObsoleteSchemas(OpenAPI openAPI) {
		for (String obsoleteSchema : OBSOLETE_SCHEMAS) {
			openAPI.getComponents().getSchemas().remove(obsoleteSchema);
		}
	}

	private void sortSchemas(OpenAPI oas) {
		oas.getComponents().setSchemas(new LinkedHashMap<>(new TreeMap<>(oas.getComponents().getSchemas())));
	}
}