/*
 */
package net.opengis.ogcapi.features.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.ConformanceDeclaration#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.ConformanceDeclaration#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogcapi.features.core.corePackage#getConformanceDeclaration()
 * @model
 * @generated
 */
@ProviderType
public interface ConformanceDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' attribute list.
	 * @see net.opengis.ogcapi.features.core.corePackage#getConformanceDeclaration_ConformsTo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getConformsTo();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005.atom.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see net.opengis.ogcapi.features.core.corePackage#getConformanceDeclaration_Links()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LinkType> getLinks();

} // ConformanceDeclaration
