/*
 */
package net.opengis.ogcapi.features.core;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.TemporalExtent#getInterval <em>Interval</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.TemporalExtent#getTrs <em>Trs</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogcapi.features.core.corePackage#getTemporalExtent()
 * @model
 * @generated
 */
@ProviderType
public interface TemporalExtent extends EObject {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(Double[][])
	 * @see net.opengis.ogcapi.features.core.corePackage#getTemporalExtent_Interval()
	 * @model dataType="net.opengis.ogcapi.features.core.Array2D" required="true"
	 * @generated
	 */
	Double[][] getInterval();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.TemporalExtent#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(Double[][] value);

	/**
	 * Returns the value of the '<em><b>Trs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trs</em>' attribute.
	 * @see #setTrs(String)
	 * @see net.opengis.ogcapi.features.core.corePackage#getTemporalExtent_Trs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getTrs();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.TemporalExtent#getTrs <em>Trs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trs</em>' attribute.
	 * @see #getTrs()
	 * @generated
	 */
	void setTrs(String value);

} // TemporalExtent
