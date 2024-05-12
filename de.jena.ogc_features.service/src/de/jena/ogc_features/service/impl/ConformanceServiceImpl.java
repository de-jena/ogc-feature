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

import de.jena.ogc_features.service.api.ConformanceClass;
import de.jena.ogc_features.service.api.ConformanceService;
import de.jena.ogc_features.service.impl.util.LinksUtil;
import net.opengis.ogcapi.features.core.ConformanceDeclaration;
import net.opengis.ogcapi.features.core.coreFactory;

/**
 * Implementation of {@link de.jena.ogc_features.service.api.ConformanceService}
 * 
 * @author Michal H. Siemaszko
 */
@Component(name = "ConformanceService", scope = ServiceScope.PROTOTYPE)
public class ConformanceServiceImpl implements ConformanceService {

	/* 
	 * (non-Javadoc)
	 * @see de.jena.ogc_features.service.api.ConformanceService#getConformanceDeclaration(java.lang.String, java.lang.String)
	 */
	@Override
	public ConformanceDeclaration getConformanceDeclaration(String baseUrl, String mediaType) {
		Objects.requireNonNull(baseUrl, "Base URL is required!");
		Objects.requireNonNull(mediaType, "Media type is required!");

		ConformanceDeclaration conformanceDeclaration = coreFactory.eINSTANCE.createConformanceDeclaration();

		for (ConformanceClass c : ConformanceClass.values()) {
			conformanceDeclaration.getConformsTo().add(c.uri);
		}

		LinkType selfLink = LinksUtil.INSTANCE.createSelfLink(String.format("%s/conformance", baseUrl), mediaType);
		conformanceDeclaration.getLinks().add(selfLink);

		return conformanceDeclaration;
	}
}
