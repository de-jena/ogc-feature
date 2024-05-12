/*
 */
package net.opengis.ogcapi.features.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OGCAPI Features Collections Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper#getCollections <em>Collections</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollectionsWrapper()
 * @model
 * @generated
 */
@ProviderType
public interface OGCAPIFeaturesCollectionsWrapper extends EObject {
	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference list.
	 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollectionsWrapper_Collections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OGCAPIFeaturesCollection> getCollections();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005.atom.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollectionsWrapper_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkType> getLinks();

} // OGCAPIFeaturesCollectionsWrapper
