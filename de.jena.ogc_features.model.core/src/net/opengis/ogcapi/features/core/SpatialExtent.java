/*
 */
package net.opengis.ogcapi.features.core;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spatial Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.SpatialExtent#getBbox <em>Bbox</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.SpatialExtent#getCrs <em>Crs</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogcapi.features.core.corePackage#getSpatialExtent()
 * @model
 * @generated
 */
@ProviderType
public interface SpatialExtent extends EObject {
	/**
	 * Returns the value of the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bbox</em>' attribute.
	 * @see #setBbox(Double[][])
	 * @see net.opengis.ogcapi.features.core.corePackage#getSpatialExtent_Bbox()
	 * @model dataType="net.opengis.ogcapi.features.core.Array2D" required="true"
	 * @generated
	 */
	Double[][] getBbox();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.SpatialExtent#getBbox <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bbox</em>' attribute.
	 * @see #getBbox()
	 * @generated
	 */
	void setBbox(Double[][] value);

	/**
	 * Returns the value of the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crs</em>' attribute.
	 * @see #setCrs(String)
	 * @see net.opengis.ogcapi.features.core.corePackage#getSpatialExtent_Crs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getCrs();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.SpatialExtent#getCrs <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crs</em>' attribute.
	 * @see #getCrs()
	 * @generated
	 */
	void setCrs(String value);

} // SpatialExtent
