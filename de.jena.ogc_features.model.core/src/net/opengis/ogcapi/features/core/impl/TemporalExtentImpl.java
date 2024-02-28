/*
 */
package net.opengis.ogcapi.features.core.impl;

import net.opengis.ogcapi.features.core.TemporalExtent;
import net.opengis.ogcapi.features.core.corePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.TemporalExtentImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.TemporalExtentImpl#getTrs <em>Trs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalExtentImpl extends MinimalEObjectImpl.Container implements TemporalExtent {
	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Double[][] INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected Double[][] interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrs() <em>Trs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrs()
	 * @generated
	 * @ordered
	 */
	protected static final String TRS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrs() <em>Trs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrs()
	 * @generated
	 * @ordered
	 */
	protected String trs = TRS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return corePackage.Literals.TEMPORAL_EXTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double[][] getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterval(Double[][] newInterval) {
		Double[][] oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.TEMPORAL_EXTENT__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrs() {
		return trs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrs(String newTrs) {
		String oldTrs = trs;
		trs = newTrs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.TEMPORAL_EXTENT__TRS, oldTrs, trs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case corePackage.TEMPORAL_EXTENT__INTERVAL:
				return getInterval();
			case corePackage.TEMPORAL_EXTENT__TRS:
				return getTrs();
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
			case corePackage.TEMPORAL_EXTENT__INTERVAL:
				setInterval((Double[][])newValue);
				return;
			case corePackage.TEMPORAL_EXTENT__TRS:
				setTrs((String)newValue);
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
			case corePackage.TEMPORAL_EXTENT__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case corePackage.TEMPORAL_EXTENT__TRS:
				setTrs(TRS_EDEFAULT);
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
			case corePackage.TEMPORAL_EXTENT__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
			case corePackage.TEMPORAL_EXTENT__TRS:
				return TRS_EDEFAULT == null ? trs != null : !TRS_EDEFAULT.equals(trs);
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
		result.append(" (interval: ");
		result.append(interval);
		result.append(", trs: ");
		result.append(trs);
		result.append(')');
		return result.toString();
	}

} //TemporalExtentImpl
