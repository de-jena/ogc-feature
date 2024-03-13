/*
 */
package net.opengis.ogcapi.features.core.impl;

import java.math.BigInteger;

import net.opengis.ogcapi.features.core.BoundingBox;
import net.opengis.ogcapi.features.core.corePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounding Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.BoundingBoxImpl#getLowerCorner <em>Lower Corner</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.BoundingBoxImpl#getUpperCorner <em>Upper Corner</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.BoundingBoxImpl#getCrs <em>Crs</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.BoundingBoxImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundingBoxImpl extends MinimalEObjectImpl.Container implements BoundingBox {
	/**
	 * The default value of the '{@link #getLowerCorner() <em>Lower Corner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerCorner()
	 * @generated
	 * @ordered
	 */
	protected static final Double[] LOWER_CORNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerCorner() <em>Lower Corner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerCorner()
	 * @generated
	 * @ordered
	 */
	protected Double[] lowerCorner = LOWER_CORNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperCorner() <em>Upper Corner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperCorner()
	 * @generated
	 * @ordered
	 */
	protected static final Double[] UPPER_CORNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperCorner() <em>Upper Corner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperCorner()
	 * @generated
	 * @ordered
	 */
	protected Double[] upperCorner = UPPER_CORNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrs() <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrs()
	 * @generated
	 * @ordered
	 */
	protected static final String CRS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrs() <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrs()
	 * @generated
	 * @ordered
	 */
	protected String crs = CRS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DIMENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dimensions = DIMENSIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundingBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return corePackage.Literals.BOUNDING_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double[] getLowerCorner() {
		return lowerCorner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerCorner(Double[] newLowerCorner) {
		Double[] oldLowerCorner = lowerCorner;
		lowerCorner = newLowerCorner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.BOUNDING_BOX__LOWER_CORNER, oldLowerCorner, lowerCorner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double[] getUpperCorner() {
		return upperCorner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperCorner(Double[] newUpperCorner) {
		Double[] oldUpperCorner = upperCorner;
		upperCorner = newUpperCorner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.BOUNDING_BOX__UPPER_CORNER, oldUpperCorner, upperCorner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCrs() {
		return crs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrs(String newCrs) {
		String oldCrs = crs;
		crs = newCrs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.BOUNDING_BOX__CRS, oldCrs, crs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDimensions(BigInteger newDimensions) {
		BigInteger oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.BOUNDING_BOX__DIMENSIONS, oldDimensions, dimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case corePackage.BOUNDING_BOX__LOWER_CORNER:
				return getLowerCorner();
			case corePackage.BOUNDING_BOX__UPPER_CORNER:
				return getUpperCorner();
			case corePackage.BOUNDING_BOX__CRS:
				return getCrs();
			case corePackage.BOUNDING_BOX__DIMENSIONS:
				return getDimensions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case corePackage.BOUNDING_BOX__LOWER_CORNER:
				setLowerCorner((Double[])newValue);
				return;
			case corePackage.BOUNDING_BOX__UPPER_CORNER:
				setUpperCorner((Double[])newValue);
				return;
			case corePackage.BOUNDING_BOX__CRS:
				setCrs((String)newValue);
				return;
			case corePackage.BOUNDING_BOX__DIMENSIONS:
				setDimensions((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case corePackage.BOUNDING_BOX__LOWER_CORNER:
				setLowerCorner(LOWER_CORNER_EDEFAULT);
				return;
			case corePackage.BOUNDING_BOX__UPPER_CORNER:
				setUpperCorner(UPPER_CORNER_EDEFAULT);
				return;
			case corePackage.BOUNDING_BOX__CRS:
				setCrs(CRS_EDEFAULT);
				return;
			case corePackage.BOUNDING_BOX__DIMENSIONS:
				setDimensions(DIMENSIONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case corePackage.BOUNDING_BOX__LOWER_CORNER:
				return LOWER_CORNER_EDEFAULT == null ? lowerCorner != null : !LOWER_CORNER_EDEFAULT.equals(lowerCorner);
			case corePackage.BOUNDING_BOX__UPPER_CORNER:
				return UPPER_CORNER_EDEFAULT == null ? upperCorner != null : !UPPER_CORNER_EDEFAULT.equals(upperCorner);
			case corePackage.BOUNDING_BOX__CRS:
				return CRS_EDEFAULT == null ? crs != null : !CRS_EDEFAULT.equals(crs);
			case corePackage.BOUNDING_BOX__DIMENSIONS:
				return DIMENSIONS_EDEFAULT == null ? dimensions != null : !DIMENSIONS_EDEFAULT.equals(dimensions);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (lowerCorner: ");
		result.append(lowerCorner);
		result.append(", upperCorner: ");
		result.append(upperCorner);
		result.append(", crs: ");
		result.append(crs);
		result.append(", dimensions: ");
		result.append(dimensions);
		result.append(')');
		return result.toString();
	}

} //BoundingBoxImpl
