/*
 */
package net.opengis.ogcapi.features.core;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.Extent#getSpatial <em>Spatial</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.Extent#getTemporal <em>Temporal</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogcapi.features.core.corePackage#getExtent()
 * @model
 * @generated
 */
@ProviderType
public interface Extent extends EObject {
	/**
	 * Returns the value of the '<em><b>Spatial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial</em>' containment reference.
	 * @see #setSpatial(SpatialExtent)
	 * @see net.opengis.ogcapi.features.core.corePackage#getExtent_Spatial()
	 * @model containment="true"
	 * @generated
	 */
	SpatialExtent getSpatial();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.Extent#getSpatial <em>Spatial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial</em>' containment reference.
	 * @see #getSpatial()
	 * @generated
	 */
	void setSpatial(SpatialExtent value);

	/**
	 * Returns the value of the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal</em>' containment reference.
	 * @see #setTemporal(TemporalExtent)
	 * @see net.opengis.ogcapi.features.core.corePackage#getExtent_Temporal()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExtent getTemporal();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.Extent#getTemporal <em>Temporal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal</em>' containment reference.
	 * @see #getTemporal()
	 * @generated
	 */
	void setTemporal(TemporalExtent value);

} // Extent
