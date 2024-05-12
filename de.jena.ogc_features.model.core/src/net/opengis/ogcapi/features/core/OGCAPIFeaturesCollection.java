/*
 */
package net.opengis.ogcapi.features.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OGCAPI Features Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getItemType <em>Item Type</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getLinks <em>Links</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getExtent <em>Extent</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getCrs <em>Crs</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getStorageCrs <em>Storage Crs</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollection()
 * @model
 * @generated
 */
@ProviderType
public interface OGCAPIFeaturesCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollection_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(String)
	 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollection_ItemType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getItemType();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollection_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollection_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005.atom.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollection_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkType> getLinks();

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(Extent)
	 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollection_Extent()
	 * @model containment="true"
	 * @generated
	 */
	Extent getExtent();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(Extent value);

	/**
	 * Returns the value of the '<em><b>Crs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crs</em>' attribute list.
	 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollection_Crs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	EList<String> getCrs();

	/**
	 * Returns the value of the '<em><b>Storage Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Crs</em>' attribute.
	 * @see #setStorageCrs(String)
	 * @see net.opengis.ogcapi.features.core.corePackage#getOGCAPIFeaturesCollection_StorageCrs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getStorageCrs();

	/**
	 * Sets the value of the '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getStorageCrs <em>Storage Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Crs</em>' attribute.
	 * @see #getStorageCrs()
	 * @generated
	 */
	void setStorageCrs(String value);

} // OGCAPIFeaturesCollection
