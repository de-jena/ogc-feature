/*
 */
package net.opengis.ogcapi.features.core.impl;

import java.util.Collection;

import net.opengis.ogcapi.features.core.Extent;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection;
import net.opengis.ogcapi.features.core.corePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OGCAPI Features Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl#getCrs <em>Crs</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl#getStorageCrs <em>Storage Crs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OGCAPIFeaturesCollectionImpl extends MinimalEObjectImpl.Container implements OGCAPIFeaturesCollection {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected String itemType = ITEM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected Extent extent;

	/**
	 * The cached value of the '{@link #getCrs() <em>Crs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> crs;

	/**
	 * The default value of the '{@link #getStorageCrs() <em>Storage Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCrs()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_CRS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageCrs() <em>Storage Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCrs()
	 * @generated
	 * @ordered
	 */
	protected String storageCrs = STORAGE_CRS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OGCAPIFeaturesCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return corePackage.Literals.OGCAPI_FEATURES_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.OGCAPI_FEATURES_COLLECTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemType(String newItemType) {
		String oldItemType = itemType;
		itemType = newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.OGCAPI_FEATURES_COLLECTION__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.OGCAPI_FEATURES_COLLECTION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.OGCAPI_FEATURES_COLLECTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkType> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<LinkType>(LinkType.class, this, corePackage.OGCAPI_FEATURES_COLLECTION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extent getExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtent(Extent newExtent, NotificationChain msgs) {
		Extent oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, corePackage.OGCAPI_FEATURES_COLLECTION__EXTENT, oldExtent, newExtent);
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
	public void setExtent(Extent newExtent) {
		if (newExtent != extent) {
			NotificationChain msgs = null;
			if (extent != null)
				msgs = ((InternalEObject)extent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - corePackage.OGCAPI_FEATURES_COLLECTION__EXTENT, null, msgs);
			if (newExtent != null)
				msgs = ((InternalEObject)newExtent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - corePackage.OGCAPI_FEATURES_COLLECTION__EXTENT, null, msgs);
			msgs = basicSetExtent(newExtent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.OGCAPI_FEATURES_COLLECTION__EXTENT, newExtent, newExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCrs() {
		if (crs == null) {
			crs = new EDataTypeEList<String>(String.class, this, corePackage.OGCAPI_FEATURES_COLLECTION__CRS);
		}
		return crs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorageCrs() {
		return storageCrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageCrs(String newStorageCrs) {
		String oldStorageCrs = storageCrs;
		storageCrs = newStorageCrs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, corePackage.OGCAPI_FEATURES_COLLECTION__STORAGE_CRS, oldStorageCrs, storageCrs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case corePackage.OGCAPI_FEATURES_COLLECTION__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case corePackage.OGCAPI_FEATURES_COLLECTION__EXTENT:
				return basicSetExtent(null, msgs);
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
			case corePackage.OGCAPI_FEATURES_COLLECTION__ID:
				return getId();
			case corePackage.OGCAPI_FEATURES_COLLECTION__ITEM_TYPE:
				return getItemType();
			case corePackage.OGCAPI_FEATURES_COLLECTION__TITLE:
				return getTitle();
			case corePackage.OGCAPI_FEATURES_COLLECTION__DESCRIPTION:
				return getDescription();
			case corePackage.OGCAPI_FEATURES_COLLECTION__LINKS:
				return getLinks();
			case corePackage.OGCAPI_FEATURES_COLLECTION__EXTENT:
				return getExtent();
			case corePackage.OGCAPI_FEATURES_COLLECTION__CRS:
				return getCrs();
			case corePackage.OGCAPI_FEATURES_COLLECTION__STORAGE_CRS:
				return getStorageCrs();
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
			case corePackage.OGCAPI_FEATURES_COLLECTION__ID:
				setId((String)newValue);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__ITEM_TYPE:
				setItemType((String)newValue);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__TITLE:
				setTitle((String)newValue);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends LinkType>)newValue);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__EXTENT:
				setExtent((Extent)newValue);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__CRS:
				getCrs().clear();
				getCrs().addAll((Collection<? extends String>)newValue);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__STORAGE_CRS:
				setStorageCrs((String)newValue);
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
			case corePackage.OGCAPI_FEATURES_COLLECTION__ID:
				setId(ID_EDEFAULT);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__ITEM_TYPE:
				setItemType(ITEM_TYPE_EDEFAULT);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__LINKS:
				getLinks().clear();
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__EXTENT:
				setExtent((Extent)null);
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__CRS:
				getCrs().clear();
				return;
			case corePackage.OGCAPI_FEATURES_COLLECTION__STORAGE_CRS:
				setStorageCrs(STORAGE_CRS_EDEFAULT);
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
			case corePackage.OGCAPI_FEATURES_COLLECTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case corePackage.OGCAPI_FEATURES_COLLECTION__ITEM_TYPE:
				return ITEM_TYPE_EDEFAULT == null ? itemType != null : !ITEM_TYPE_EDEFAULT.equals(itemType);
			case corePackage.OGCAPI_FEATURES_COLLECTION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case corePackage.OGCAPI_FEATURES_COLLECTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case corePackage.OGCAPI_FEATURES_COLLECTION__LINKS:
				return links != null && !links.isEmpty();
			case corePackage.OGCAPI_FEATURES_COLLECTION__EXTENT:
				return extent != null;
			case corePackage.OGCAPI_FEATURES_COLLECTION__CRS:
				return crs != null && !crs.isEmpty();
			case corePackage.OGCAPI_FEATURES_COLLECTION__STORAGE_CRS:
				return STORAGE_CRS_EDEFAULT == null ? storageCrs != null : !STORAGE_CRS_EDEFAULT.equals(storageCrs);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", crs: ");
		result.append(crs);
		result.append(", storageCrs: ");
		result.append(storageCrs);
		result.append(')');
		return result.toString();
	}

} //OGCAPIFeaturesCollectionImpl
