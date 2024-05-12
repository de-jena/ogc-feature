/*
 */
package net.opengis.ogcapi.features.core.impl;

import java.util.Collection;

import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper;
import net.opengis.ogcapi.features.core.corePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OGCAPI Features Collections Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionsWrapperImpl#getCollections <em>Collections</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionsWrapperImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OGCAPIFeaturesCollectionsWrapperImpl extends MinimalEObjectImpl.Container implements OGCAPIFeaturesCollectionsWrapper {
	/**
	 * The cached value of the '{@link #getCollections() <em>Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<OGCAPIFeaturesCollection> collections;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkType> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OGCAPIFeaturesCollectionsWrapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return corePackage.Literals.OGCAPI_FEATURES_COLLECTIONS_WRAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OGCAPIFeaturesCollection> getCollections() {
		if (collections == null) {
			collections = new EObjectContainmentEList<OGCAPIFeaturesCollection>(OGCAPIFeaturesCollection.class, this, corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__COLLECTIONS);
		}
		return collections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkType> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<LinkType>(LinkType.class, this, corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__COLLECTIONS:
				return ((InternalEList<?>)getCollections()).basicRemove(otherEnd, msgs);
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__COLLECTIONS:
				return getCollections();
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__LINKS:
				return getLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__COLLECTIONS:
				getCollections().clear();
				getCollections().addAll((Collection<? extends OGCAPIFeaturesCollection>)newValue);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends LinkType>)newValue);
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
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__COLLECTIONS:
				getCollections().clear();
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__LINKS:
				getLinks().clear();
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
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__COLLECTIONS:
				return collections != null && !collections.isEmpty();
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OGCAPIFeaturesCollectionsWrapperImpl
