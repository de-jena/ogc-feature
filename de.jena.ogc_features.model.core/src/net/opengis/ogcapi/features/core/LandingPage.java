/*
 */
package net.opengis.ogcapi.features.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.LandingPage#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.LandingPage#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.LandingPage#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogcapi.features.core.corePackage#getLandingPage()
 * @model
 * @generated
 */
@ProviderType
public interface LandingPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.ogcapi.features.core.corePackage#getLandingPage_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.LandingPage#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.opengis.ogcapi.features.core.corePackage#getLandingPage_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.LandingPage#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005.atom.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see net.opengis.ogcapi.features.core.corePackage#getLandingPage_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkType> getLinks();

} // LandingPage
