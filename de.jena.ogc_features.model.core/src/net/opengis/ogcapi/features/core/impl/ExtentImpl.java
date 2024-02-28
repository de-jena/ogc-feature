/*
 */
package net.opengis.ogcapi.features.core.impl;

import net.opengis.ogcapi.features.core.Extent;
import net.opengis.ogcapi.features.core.SpatialExtent;
import net.opengis.ogcapi.features.core.TemporalExtent;
import net.opengis.ogcapi.features.core.corePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.ExtentImpl#getSpatial <em>Spatial</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.ExtentImpl#getTemporal <em>Temporal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtentImpl extends MinimalEObjectImpl.Container implements Extent {
	/**
	 * The cached value of the '{@link #getSpatial() <em>Spatial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatial()
	 * @generated
	 * @ordered
	 */
	protected SpatialExtent spatial;

	/**
	 * The cached value of the '{@link #getTemporal() <em>Temporal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporal()
	 * @generated
	 * @ordered
	 */
	protected TemporalExtent temporal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return corePackage.Literals.EXTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialExtent getSpatial() {
		return spatial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatial(SpatialExtent newSpatial, NotificationChain msgs) {
		SpatialExtent oldSpatial = spatial;
		spatial = newSpatial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, corePackage.EXTENT__SPATIAL, oldSpatial, newSpatial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpatial(SpatialExtent newSpatial) {
		if (newSpatial != spatial) {
			NotificationChain msgs = null;
			if (spatial != null)
				msgs = ((InternalEObject)spatial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - corePackage.EXTENT__SPATIAL, null, msgs);
			if (newSpatial != null)
				msgs = ((InternalEObject)newSpatial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - corePackage.EXTENT__SPATIAL, null, msgs);
			msgs = basicSetSpatial(newSpatial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.EXTENT__SPATIAL, newSpatial, newSpatial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExtent getTemporal() {
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporal(TemporalExtent newTemporal, NotificationChain msgs) {
		TemporalExtent oldTemporal = temporal;
		temporal = newTemporal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, corePackage.EXTENT__TEMPORAL, oldTemporal, newTemporal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporal(TemporalExtent newTemporal) {
		if (newTemporal != temporal) {
			NotificationChain msgs = null;
			if (temporal != null)
				msgs = ((InternalEObject)temporal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - corePackage.EXTENT__TEMPORAL, null, msgs);
			if (newTemporal != null)
				msgs = ((InternalEObject)newTemporal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - corePackage.EXTENT__TEMPORAL, null, msgs);
			msgs = basicSetTemporal(newTemporal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.EXTENT__TEMPORAL, newTemporal, newTemporal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case corePackage.EXTENT__SPATIAL:
				return basicSetSpatial(null, msgs);
			case corePackage.EXTENT__TEMPORAL:
				return basicSetTemporal(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case corePackage.EXTENT__SPATIAL:
				return getSpatial();
			case corePackage.EXTENT__TEMPORAL:
				return getTemporal();
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
			case corePackage.EXTENT__SPATIAL:
				setSpatial((SpatialExtent)newValue);
				return;
			case corePackage.EXTENT__TEMPORAL:
				setTemporal((TemporalExtent)newValue);
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
			case corePackage.EXTENT__SPATIAL:
				setSpatial((SpatialExtent)null);
				return;
			case corePackage.EXTENT__TEMPORAL:
				setTemporal((TemporalExtent)null);
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
			case corePackage.EXTENT__SPATIAL:
				return spatial != null;
			case corePackage.EXTENT__TEMPORAL:
				return temporal != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtentImpl
