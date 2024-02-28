/*
 */
package org.w3._2005.atom;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * There is no official atom XSD. This XSD is created based on:
 *       http://atompub.org/2005/08/17/atom.rnc. A subset of Atom as used in the
 *       ogckml22.xsd is defined here. 
 * <!-- end-model-doc -->
 * @see org.w3._2005.atom.AtomFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = AtomPackage.eNS_URI, genModel = "/model/atom.genmodel", genModelSourceLocations = {"model/atom.genmodel","de.jena.ogc_features.model.atom/model/atom.genmodel"}, ecore="/model/atom.ecore", ecoreSourceLocations="/model/atom.ecore")
public interface AtomPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2005/Atom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtomPackage eINSTANCE = org.w3._2005.atom.impl.AtomPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3._2005.atom.impl.AtomPersonConstructImpl <em>Person Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005.atom.impl.AtomPersonConstructImpl
	 * @see org.w3._2005.atom.impl.AtomPackageImpl#getAtomPersonConstruct()
	 * @generated
	 */
	int ATOM_PERSON_CONSTRUCT = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_PERSON_CONSTRUCT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_PERSON_CONSTRUCT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_PERSON_CONSTRUCT__URI = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_PERSON_CONSTRUCT__EMAIL = 3;

	/**
	 * The number of structural features of the '<em>Person Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_PERSON_CONSTRUCT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Person Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_PERSON_CONSTRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2005.atom.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005.atom.impl.DocumentRootImpl
	 * @see org.w3._2005.atom.impl.AtomPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHOR = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMAIL = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 6;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URI = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2005.atom.impl.LinkTypeImpl <em>Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2005.atom.impl.LinkTypeImpl
	 * @see org.w3._2005.atom.impl.AtomPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__HREF = 0;

	/**
	 * The feature id for the '<em><b>Hreflang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__HREFLANG = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__REL = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__TITLE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Email Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2005.atom.impl.AtomPackageImpl#getAtomEmailAddress()
	 * @generated
	 */
	int ATOM_EMAIL_ADDRESS = 3;

	/**
	 * The meta object id for the '<em>Language Tag</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2005.atom.impl.AtomPackageImpl#getAtomLanguageTag()
	 * @generated
	 */
	int ATOM_LANGUAGE_TAG = 4;

	/**
	 * The meta object id for the '<em>Media Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3._2005.atom.impl.AtomPackageImpl#getAtomMediaType()
	 * @generated
	 */
	int ATOM_MEDIA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link org.w3._2005.atom.AtomPersonConstruct <em>Person Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Construct</em>'.
	 * @see org.w3._2005.atom.AtomPersonConstruct
	 * @generated
	 */
	EClass getAtomPersonConstruct();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005.atom.AtomPersonConstruct#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2005.atom.AtomPersonConstruct#getGroup()
	 * @see #getAtomPersonConstruct()
	 * @generated
	 */
	EAttribute getAtomPersonConstruct_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005.atom.AtomPersonConstruct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see org.w3._2005.atom.AtomPersonConstruct#getName()
	 * @see #getAtomPersonConstruct()
	 * @generated
	 */
	EAttribute getAtomPersonConstruct_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005.atom.AtomPersonConstruct#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uri</em>'.
	 * @see org.w3._2005.atom.AtomPersonConstruct#getUri()
	 * @see #getAtomPersonConstruct()
	 * @generated
	 */
	EAttribute getAtomPersonConstruct_Uri();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005.atom.AtomPersonConstruct#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email</em>'.
	 * @see org.w3._2005.atom.AtomPersonConstruct#getEmail()
	 * @see #getAtomPersonConstruct()
	 * @generated
	 */
	EAttribute getAtomPersonConstruct_Email();

	/**
	 * Returns the meta object for class '{@link org.w3._2005.atom.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3._2005.atom.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2005.atom.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2005.atom.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3._2005.atom.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3._2005.atom.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3._2005.atom.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3._2005.atom.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005.atom.DocumentRoot#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see org.w3._2005.atom.DocumentRoot#getAuthor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005.atom.DocumentRoot#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.w3._2005.atom.DocumentRoot#getEmail()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Email();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2005.atom.DocumentRoot#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see org.w3._2005.atom.DocumentRoot#getLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Link();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005.atom.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3._2005.atom.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005.atom.DocumentRoot#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.w3._2005.atom.DocumentRoot#getUri()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Uri();

	/**
	 * Returns the meta object for class '{@link org.w3._2005.atom.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type</em>'.
	 * @see org.w3._2005.atom.LinkType
	 * @generated
	 */
	EClass getLinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005.atom.LinkType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.w3._2005.atom.LinkType#getHref()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005.atom.LinkType#getHreflang <em>Hreflang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hreflang</em>'.
	 * @see org.w3._2005.atom.LinkType#getHreflang()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Hreflang();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005.atom.LinkType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.w3._2005.atom.LinkType#getLength()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005.atom.LinkType#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see org.w3._2005.atom.LinkType#getRel()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Rel();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005.atom.LinkType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3._2005.atom.LinkType#getTitle()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2005.atom.LinkType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3._2005.atom.LinkType#getType()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Email Address</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='atomEmailAddress' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='.+@.+'"
	 * @generated
	 */
	EDataType getAtomEmailAddress();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Language Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Language Tag</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='atomLanguageTag' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z]{1,8}(-[A-Za-z0-9]{1,8})*'"
	 * @generated
	 */
	EDataType getAtomLanguageTag();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Media Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='atomMediaType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='.+/.+'"
	 * @generated
	 */
	EDataType getAtomMediaType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtomFactory getAtomFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.w3._2005.atom.impl.AtomPersonConstructImpl <em>Person Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005.atom.impl.AtomPersonConstructImpl
		 * @see org.w3._2005.atom.impl.AtomPackageImpl#getAtomPersonConstruct()
		 * @generated
		 */
		EClass ATOM_PERSON_CONSTRUCT = eINSTANCE.getAtomPersonConstruct();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM_PERSON_CONSTRUCT__GROUP = eINSTANCE.getAtomPersonConstruct_Group();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM_PERSON_CONSTRUCT__NAME = eINSTANCE.getAtomPersonConstruct_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM_PERSON_CONSTRUCT__URI = eINSTANCE.getAtomPersonConstruct_Uri();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM_PERSON_CONSTRUCT__EMAIL = eINSTANCE.getAtomPersonConstruct_Email();

		/**
		 * The meta object literal for the '{@link org.w3._2005.atom.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005.atom.impl.DocumentRootImpl
		 * @see org.w3._2005.atom.impl.AtomPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTHOR = eINSTANCE.getDocumentRoot_Author();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EMAIL = eINSTANCE.getDocumentRoot_Email();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINK = eINSTANCE.getDocumentRoot_Link();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__URI = eINSTANCE.getDocumentRoot_Uri();

		/**
		 * The meta object literal for the '{@link org.w3._2005.atom.impl.LinkTypeImpl <em>Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2005.atom.impl.LinkTypeImpl
		 * @see org.w3._2005.atom.impl.AtomPackageImpl#getLinkType()
		 * @generated
		 */
		EClass LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__HREF = eINSTANCE.getLinkType_Href();

		/**
		 * The meta object literal for the '<em><b>Hreflang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__HREFLANG = eINSTANCE.getLinkType_Hreflang();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__LENGTH = eINSTANCE.getLinkType_Length();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__REL = eINSTANCE.getLinkType_Rel();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__TITLE = eINSTANCE.getLinkType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__TYPE = eINSTANCE.getLinkType_Type();

		/**
		 * The meta object literal for the '<em>Email Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2005.atom.impl.AtomPackageImpl#getAtomEmailAddress()
		 * @generated
		 */
		EDataType ATOM_EMAIL_ADDRESS = eINSTANCE.getAtomEmailAddress();

		/**
		 * The meta object literal for the '<em>Language Tag</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2005.atom.impl.AtomPackageImpl#getAtomLanguageTag()
		 * @generated
		 */
		EDataType ATOM_LANGUAGE_TAG = eINSTANCE.getAtomLanguageTag();

		/**
		 * The meta object literal for the '<em>Media Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3._2005.atom.impl.AtomPackageImpl#getAtomMediaType()
		 * @generated
		 */
		EDataType ATOM_MEDIA_TYPE = eINSTANCE.getAtomMediaType();

	}

} //AtomPackage
