/*
 */
package net.opengis.ogcapi.features.core.impl;

import net.opengis.ogcapi.features.core.SpatialExtent;
import net.opengis.ogcapi.features.core.corePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.SpatialExtentImpl#getBbox <em>Bbox</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.SpatialExtentImpl#getCrs <em>Crs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpatialExtentImpl extends MinimalEObjectImpl.Container implements SpatialExtent {
	/**
	 * The default value of the '{@link #getBbox() <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBbox()
	 * @generated
	 * @ordered
	 */
	protected static final Double[][] BBOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBbox() <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBbox()
	 * @generated
	 * @ordered
	 */
	protected Double[][] bbox = BBOX_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpatialExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return corePackage.Literals.SPATIAL_EXTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double[][] getBbox() {
		return bbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBbox(Double[][] newBbox) {
		Double[][] oldBbox = bbox;
		bbox = newBbox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.SPATIAL_EXTENT__BBOX, oldBbox, bbox));
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
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.SPATIAL_EXTENT__CRS, oldCrs, crs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case corePackage.SPATIAL_EXTENT__BBOX:
				return getBbox();
			case corePackage.SPATIAL_EXTENT__CRS:
				return getCrs();
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
			case corePackage.SPATIAL_EXTENT__BBOX:
				setBbox((Double[][])newValue);
				return;
			case corePackage.SPATIAL_EXTENT__CRS:
				setCrs((String)newValue);
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
			case corePackage.SPATIAL_EXTENT__BBOX:
				setBbox(BBOX_EDEFAULT);
				return;
			case corePackage.SPATIAL_EXTENT__CRS:
				setCrs(CRS_EDEFAULT);
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
			case corePackage.SPATIAL_EXTENT__BBOX:
				return BBOX_EDEFAULT == null ? bbox != null : !BBOX_EDEFAULT.equals(bbox);
			case corePackage.SPATIAL_EXTENT__CRS:
				return CRS_EDEFAULT == null ? crs != null : !CRS_EDEFAULT.equals(crs);
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
		result.append(" (bbox: ");
		result.append(bbox);
		result.append(", crs: ");
		result.append(crs);
		result.append(')');
		return result.toString();
	}

} //SpatialExtentImpl
