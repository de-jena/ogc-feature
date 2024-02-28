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
package de.jena.ogc_features.service.impl;

import java.util.Objects;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.w3._2005.atom.LinkType;

import de.jena.ogc_features.service.api.LandingPageService;
import de.jena.ogc_features.service.impl.util.LinksUtil;
import net.opengis.ogcapi.features.core.LandingPage;
import net.opengis.ogcapi.features.core.coreFactory;

/**
 * Implementation of {@link de.jena.ogc_features.service.api.LandingPageService}
 * 
 * @author Michal H. Siemaszko
 */
@Component(name = "LandingPageService", scope = ServiceScope.PROTOTYPE)
public class LandingPageServiceImpl implements LandingPageService {

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ogc_features.service.api.LandingPageService#getLandingPage(java.lang.String, java.lang.String)
	 */
	@Override
	public LandingPage getLandingPage(String baseUrl, String mediaType) {
		Objects.requireNonNull(baseUrl, "Base URL is required!");
		Objects.requireNonNull(mediaType, "Media type is required!");

		LandingPage landingPage = coreFactory.eINSTANCE.createLandingPage();

		landingPage.setTitle("OGC API Features service");

		landingPage.setDescription("OGC API Features service based on Gecko OSGi stack");

		LinkType selfLink = LinksUtil.INSTANCE.createSelfLink(String.format("%s/", baseUrl), mediaType);
		landingPage.getLinks().add(selfLink);

		LinkType conformanceLink = LinksUtil.INSTANCE.createLink(String.format("%s/conformance", baseUrl),
				"conformance", "OGC API Features conformance classes implemented by this service", mediaType);
		landingPage.getLinks().add(conformanceLink);

		LinkType apiLink = LinksUtil.INSTANCE.createLink(String.format("%s/api", baseUrl), "service-desc",
				"API definition", mediaType);
		landingPage.getLinks().add(apiLink);

		LinkType collectionsLink = LinksUtil.INSTANCE.createLink(String.format("%s/collections", baseUrl), "data",
				"Information about feature collections", mediaType);
		landingPage.getLinks().add(collectionsLink);

		return landingPage;
	}
}
