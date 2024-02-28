/*
 */
package org.w3._2005.atom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2005.atom.LinkType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._2005.atom.LinkType#getHreflang <em>Hreflang</em>}</li>
 *   <li>{@link org.w3._2005.atom.LinkType#getLength <em>Length</em>}</li>
 *   <li>{@link org.w3._2005.atom.LinkType#getRel <em>Rel</em>}</li>
 *   <li>{@link org.w3._2005.atom.LinkType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._2005.atom.LinkType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.w3._2005.atom.AtomPackage#getLinkType()
 * @model extendedMetaData="name='link_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface LinkType extends EObject {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._2005.atom.AtomPackage#getLinkType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._2005.atom.LinkType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Hreflang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hreflang</em>' attribute.
	 * @see #setHreflang(String)
	 * @see org.w3._2005.atom.AtomPackage#getLinkType_Hreflang()
	 * @model dataType="org.w3._2005.atom.AtomLanguageTag"
	 *        extendedMetaData="kind='attribute' name='hreflang'"
	 * @generated
	 */
	String getHreflang();

	/**
	 * Sets the value of the '{@link org.w3._2005.atom.LinkType#getHreflang <em>Hreflang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hreflang</em>' attribute.
	 * @see #getHreflang()
	 * @generated
	 */
	void setHreflang(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see org.w3._2005.atom.AtomPackage#getLinkType_Length()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='length'"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link org.w3._2005.atom.LinkType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(String)
	 * @see org.w3._2005.atom.AtomPackage#getLinkType_Rel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rel'"
	 * @generated
	 */
	String getRel();

	/**
	 * Sets the value of the '{@link org.w3._2005.atom.LinkType#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.w3._2005.atom.AtomPackage#getLinkType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.w3._2005.atom.LinkType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.w3._2005.atom.AtomPackage#getLinkType_Type()
	 * @model dataType="org.w3._2005.atom.AtomMediaType"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.w3._2005.atom.LinkType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // LinkType
