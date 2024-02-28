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
package de.jena.ogc_features.service.impl.util;

import org.w3._2005.atom.AtomFactory;
import org.w3._2005.atom.LinkType;

/**
 * Link related utility methods.
 * 
 * @author Michal H. Siemaszko
 */
public enum LinksUtil {
	INSTANCE;

	public LinkType createSelfLink(String href, String mediaType) {
		return createLink(href, "self", "This document", mediaType);
	}

	public LinkType createNextLink(String href, String mediaType) {
		return createLink(href, "next", "Next page", mediaType);
	}

	public LinkType createLink(String href, String rel, String title, String mediaType) {
		LinkType linkType = AtomFactory.eINSTANCE.createLinkType();
		linkType.setHref(href);
		linkType.setRel(rel);
		linkType.setType(mediaType);
		linkType.setTitle(title);

		return linkType;
	}
}
