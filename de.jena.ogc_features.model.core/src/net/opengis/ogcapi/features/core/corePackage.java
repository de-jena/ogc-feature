/*
 */
package net.opengis.ogcapi.features.core;


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
 * @see net.opengis.ogcapi.features.core.coreFactory
 * @model kind="package"
 *        annotation="Version value='1.0.1'"
 * @generated
 */
@ProviderType
@EPackage(uri = corePackage.eNS_URI, genModel = "/model/ogc_features-core.genmodel", genModelSourceLocations = {"model/ogc_features-core.genmodel","de.jena.ogc_features.model.core/model/ogc_features-core.genmodel"}, ecore="/model/ogc_features-core.ecore", ecoreSourceLocations="/model/ogc_features-core.ecore")
public interface corePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/ogcapi-features-1/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	corePackage eINSTANCE = net.opengis.ogcapi.features.core.impl.corePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.ogcapi.features.core.impl.BoundingBoxImpl <em>Bounding Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogcapi.features.core.impl.BoundingBoxImpl
	 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getBoundingBox()
	 * @generated
	 */
	int BOUNDING_BOX = 0;

	/**
	 * The feature id for the '<em><b>Lower Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX__LOWER_CORNER = 0;

	/**
	 * The feature id for the '<em><b>Upper Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX__UPPER_CORNER = 1;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX__CRS = 2;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX__DIMENSIONS = 3;

	/**
	 * The number of structural features of the '<em>Bounding Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bounding Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionsWrapperImpl <em>OGCAPI Features Collections Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionsWrapperImpl
	 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getOGCAPIFeaturesCollectionsWrapper()
	 * @generated
	 */
	int OGCAPI_FEATURES_COLLECTIONS_WRAPPER = 1;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTIONS_WRAPPER__COLLECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTIONS_WRAPPER__LINKS = 1;

	/**
	 * The number of structural features of the '<em>OGCAPI Features Collections Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTIONS_WRAPPER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OGCAPI Features Collections Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTIONS_WRAPPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl <em>OGCAPI Features Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl
	 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getOGCAPIFeaturesCollection()
	 * @generated
	 */
	int OGCAPI_FEATURES_COLLECTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTION__ITEM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTION__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTION__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTION__LINKS = 4;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTION__EXTENT = 5;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTION__CRS = 6;

	/**
	 * The feature id for the '<em><b>Storage Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTION__STORAGE_CRS = 7;

	/**
	 * The number of structural features of the '<em>OGCAPI Features Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>OGCAPI Features Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OGCAPI_FEATURES_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogcapi.features.core.impl.ConformanceDeclarationImpl <em>Conformance Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogcapi.features.core.impl.ConformanceDeclarationImpl
	 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getConformanceDeclaration()
	 * @generated
	 */
	int CONFORMANCE_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_DECLARATION__CONFORMS_TO = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_DECLARATION__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Conformance Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conformance Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogcapi.features.core.impl.ExtentImpl <em>Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogcapi.features.core.impl.ExtentImpl
	 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getExtent()
	 * @generated
	 */
	int EXTENT = 4;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__SPATIAL = 0;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__TEMPORAL = 1;

	/**
	 * The number of structural features of the '<em>Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogcapi.features.core.impl.LandingPageImpl <em>Landing Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogcapi.features.core.impl.LandingPageImpl
	 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getLandingPage()
	 * @generated
	 */
	int LANDING_PAGE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__LINKS = 2;

	/**
	 * The number of structural features of the '<em>Landing Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Landing Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogcapi.features.core.impl.SpatialExtentImpl <em>Spatial Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogcapi.features.core.impl.SpatialExtentImpl
	 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getSpatialExtent()
	 * @generated
	 */
	int SPATIAL_EXTENT = 6;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_EXTENT__BBOX = 0;

	/**
	 * The feature id for the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_EXTENT__CRS = 1;

	/**
	 * The number of structural features of the '<em>Spatial Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_EXTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Spatial Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_EXTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogcapi.features.core.impl.TemporalExtentImpl <em>Temporal Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogcapi.features.core.impl.TemporalExtentImpl
	 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getTemporalExtent()
	 * @generated
	 */
	int TEMPORAL_EXTENT = 7;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXTENT__INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Trs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXTENT__TRS = 1;

	/**
	 * The number of structural features of the '<em>Temporal Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Temporal Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_EXTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Array1 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getArray1D()
	 * @generated
	 */
	int ARRAY1_D = 8;

	/**
	 * The meta object id for the '<em>Array2 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getArray2D()
	 * @generated
	 */
	int ARRAY2_D = 9;


	/**
	 * Returns the meta object for class '{@link net.opengis.ogcapi.features.core.BoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounding Box</em>'.
	 * @see net.opengis.ogcapi.features.core.BoundingBox
	 * @generated
	 */
	EClass getBoundingBox();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.BoundingBox#getLowerCorner <em>Lower Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Corner</em>'.
	 * @see net.opengis.ogcapi.features.core.BoundingBox#getLowerCorner()
	 * @see #getBoundingBox()
	 * @generated
	 */
	EAttribute getBoundingBox_LowerCorner();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.BoundingBox#getUpperCorner <em>Upper Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Corner</em>'.
	 * @see net.opengis.ogcapi.features.core.BoundingBox#getUpperCorner()
	 * @see #getBoundingBox()
	 * @generated
	 */
	EAttribute getBoundingBox_UpperCorner();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.BoundingBox#getCrs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crs</em>'.
	 * @see net.opengis.ogcapi.features.core.BoundingBox#getCrs()
	 * @see #getBoundingBox()
	 * @generated
	 */
	EAttribute getBoundingBox_Crs();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.BoundingBox#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions</em>'.
	 * @see net.opengis.ogcapi.features.core.BoundingBox#getDimensions()
	 * @see #getBoundingBox()
	 * @generated
	 */
	EAttribute getBoundingBox_Dimensions();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper <em>OGCAPI Features Collections Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OGCAPI Features Collections Wrapper</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper
	 * @generated
	 */
	EClass getOGCAPIFeaturesCollectionsWrapper();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper#getCollections()
	 * @see #getOGCAPIFeaturesCollectionsWrapper()
	 * @generated
	 */
	EReference getOGCAPIFeaturesCollectionsWrapper_Collections();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper#getLinks()
	 * @see #getOGCAPIFeaturesCollectionsWrapper()
	 * @generated
	 */
	EReference getOGCAPIFeaturesCollectionsWrapper_Links();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection <em>OGCAPI Features Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OGCAPI Features Collection</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection
	 * @generated
	 */
	EClass getOGCAPIFeaturesCollection();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getId()
	 * @see #getOGCAPIFeaturesCollection()
	 * @generated
	 */
	EAttribute getOGCAPIFeaturesCollection_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Type</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getItemType()
	 * @see #getOGCAPIFeaturesCollection()
	 * @generated
	 */
	EAttribute getOGCAPIFeaturesCollection_ItemType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getTitle()
	 * @see #getOGCAPIFeaturesCollection()
	 * @generated
	 */
	EAttribute getOGCAPIFeaturesCollection_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getDescription()
	 * @see #getOGCAPIFeaturesCollection()
	 * @generated
	 */
	EAttribute getOGCAPIFeaturesCollection_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getLinks()
	 * @see #getOGCAPIFeaturesCollection()
	 * @generated
	 */
	EReference getOGCAPIFeaturesCollection_Links();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extent</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getExtent()
	 * @see #getOGCAPIFeaturesCollection()
	 * @generated
	 */
	EReference getOGCAPIFeaturesCollection_Extent();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getCrs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Crs</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getCrs()
	 * @see #getOGCAPIFeaturesCollection()
	 * @generated
	 */
	EAttribute getOGCAPIFeaturesCollection_Crs();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getStorageCrs <em>Storage Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Crs</em>'.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection#getStorageCrs()
	 * @see #getOGCAPIFeaturesCollection()
	 * @generated
	 */
	EAttribute getOGCAPIFeaturesCollection_StorageCrs();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogcapi.features.core.ConformanceDeclaration <em>Conformance Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conformance Declaration</em>'.
	 * @see net.opengis.ogcapi.features.core.ConformanceDeclaration
	 * @generated
	 */
	EClass getConformanceDeclaration();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogcapi.features.core.ConformanceDeclaration#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Conforms To</em>'.
	 * @see net.opengis.ogcapi.features.core.ConformanceDeclaration#getConformsTo()
	 * @see #getConformanceDeclaration()
	 * @generated
	 */
	EAttribute getConformanceDeclaration_ConformsTo();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogcapi.features.core.ConformanceDeclaration#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see net.opengis.ogcapi.features.core.ConformanceDeclaration#getLinks()
	 * @see #getConformanceDeclaration()
	 * @generated
	 */
	EReference getConformanceDeclaration_Links();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogcapi.features.core.Extent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extent</em>'.
	 * @see net.opengis.ogcapi.features.core.Extent
	 * @generated
	 */
	EClass getExtent();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogcapi.features.core.Extent#getSpatial <em>Spatial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial</em>'.
	 * @see net.opengis.ogcapi.features.core.Extent#getSpatial()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_Spatial();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogcapi.features.core.Extent#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal</em>'.
	 * @see net.opengis.ogcapi.features.core.Extent#getTemporal()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_Temporal();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogcapi.features.core.LandingPage <em>Landing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landing Page</em>'.
	 * @see net.opengis.ogcapi.features.core.LandingPage
	 * @generated
	 */
	EClass getLandingPage();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.LandingPage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.ogcapi.features.core.LandingPage#getTitle()
	 * @see #getLandingPage()
	 * @generated
	 */
	EAttribute getLandingPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.LandingPage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.opengis.ogcapi.features.core.LandingPage#getDescription()
	 * @see #getLandingPage()
	 * @generated
	 */
	EAttribute getLandingPage_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogcapi.features.core.LandingPage#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see net.opengis.ogcapi.features.core.LandingPage#getLinks()
	 * @see #getLandingPage()
	 * @generated
	 */
	EReference getLandingPage_Links();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogcapi.features.core.SpatialExtent <em>Spatial Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Extent</em>'.
	 * @see net.opengis.ogcapi.features.core.SpatialExtent
	 * @generated
	 */
	EClass getSpatialExtent();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.SpatialExtent#getBbox <em>Bbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbox</em>'.
	 * @see net.opengis.ogcapi.features.core.SpatialExtent#getBbox()
	 * @see #getSpatialExtent()
	 * @generated
	 */
	EAttribute getSpatialExtent_Bbox();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.SpatialExtent#getCrs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crs</em>'.
	 * @see net.opengis.ogcapi.features.core.SpatialExtent#getCrs()
	 * @see #getSpatialExtent()
	 * @generated
	 */
	EAttribute getSpatialExtent_Crs();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogcapi.features.core.TemporalExtent <em>Temporal Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Extent</em>'.
	 * @see net.opengis.ogcapi.features.core.TemporalExtent
	 * @generated
	 */
	EClass getTemporalExtent();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.TemporalExtent#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see net.opengis.ogcapi.features.core.TemporalExtent#getInterval()
	 * @see #getTemporalExtent()
	 * @generated
	 */
	EAttribute getTemporalExtent_Interval();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogcapi.features.core.TemporalExtent#getTrs <em>Trs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trs</em>'.
	 * @see net.opengis.ogcapi.features.core.TemporalExtent#getTrs()
	 * @see #getTemporalExtent()
	 * @generated
	 */
	EAttribute getTemporalExtent_Trs();

	/**
	 * Returns the meta object for data type '<em>Array1 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array1 D</em>'.
	 * @model instanceClass="java.lang.Double[]"
	 * @generated
	 */
	EDataType getArray1D();

	/**
	 * Returns the meta object for data type '<em>Array2 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array2 D</em>'.
	 * @model instanceClass="java.lang.Double[][]"
	 * @generated
	 */
	EDataType getArray2D();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	coreFactory getcoreFactory();

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
		 * The meta object literal for the '{@link net.opengis.ogcapi.features.core.impl.BoundingBoxImpl <em>Bounding Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogcapi.features.core.impl.BoundingBoxImpl
		 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getBoundingBox()
		 * @generated
		 */
		EClass BOUNDING_BOX = eINSTANCE.getBoundingBox();

		/**
		 * The meta object literal for the '<em><b>Lower Corner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX__LOWER_CORNER = eINSTANCE.getBoundingBox_LowerCorner();

		/**
		 * The meta object literal for the '<em><b>Upper Corner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX__UPPER_CORNER = eINSTANCE.getBoundingBox_UpperCorner();

		/**
		 * The meta object literal for the '<em><b>Crs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX__CRS = eINSTANCE.getBoundingBox_Crs();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDING_BOX__DIMENSIONS = eINSTANCE.getBoundingBox_Dimensions();

		/**
		 * The meta object literal for the '{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionsWrapperImpl <em>OGCAPI Features Collections Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionsWrapperImpl
		 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getOGCAPIFeaturesCollectionsWrapper()
		 * @generated
		 */
		EClass OGCAPI_FEATURES_COLLECTIONS_WRAPPER = eINSTANCE.getOGCAPIFeaturesCollectionsWrapper();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OGCAPI_FEATURES_COLLECTIONS_WRAPPER__COLLECTIONS = eINSTANCE.getOGCAPIFeaturesCollectionsWrapper_Collections();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OGCAPI_FEATURES_COLLECTIONS_WRAPPER__LINKS = eINSTANCE.getOGCAPIFeaturesCollectionsWrapper_Links();

		/**
		 * The meta object literal for the '{@link net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl <em>OGCAPI Features Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogcapi.features.core.impl.OGCAPIFeaturesCollectionImpl
		 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getOGCAPIFeaturesCollection()
		 * @generated
		 */
		EClass OGCAPI_FEATURES_COLLECTION = eINSTANCE.getOGCAPIFeaturesCollection();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OGCAPI_FEATURES_COLLECTION__ID = eINSTANCE.getOGCAPIFeaturesCollection_Id();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OGCAPI_FEATURES_COLLECTION__ITEM_TYPE = eINSTANCE.getOGCAPIFeaturesCollection_ItemType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OGCAPI_FEATURES_COLLECTION__TITLE = eINSTANCE.getOGCAPIFeaturesCollection_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OGCAPI_FEATURES_COLLECTION__DESCRIPTION = eINSTANCE.getOGCAPIFeaturesCollection_Description();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OGCAPI_FEATURES_COLLECTION__LINKS = eINSTANCE.getOGCAPIFeaturesCollection_Links();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OGCAPI_FEATURES_COLLECTION__EXTENT = eINSTANCE.getOGCAPIFeaturesCollection_Extent();

		/**
		 * The meta object literal for the '<em><b>Crs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OGCAPI_FEATURES_COLLECTION__CRS = eINSTANCE.getOGCAPIFeaturesCollection_Crs();

		/**
		 * The meta object literal for the '<em><b>Storage Crs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OGCAPI_FEATURES_COLLECTION__STORAGE_CRS = eINSTANCE.getOGCAPIFeaturesCollection_StorageCrs();

		/**
		 * The meta object literal for the '{@link net.opengis.ogcapi.features.core.impl.ConformanceDeclarationImpl <em>Conformance Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogcapi.features.core.impl.ConformanceDeclarationImpl
		 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getConformanceDeclaration()
		 * @generated
		 */
		EClass CONFORMANCE_DECLARATION = eINSTANCE.getConformanceDeclaration();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFORMANCE_DECLARATION__CONFORMS_TO = eINSTANCE.getConformanceDeclaration_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORMANCE_DECLARATION__LINKS = eINSTANCE.getConformanceDeclaration_Links();

		/**
		 * The meta object literal for the '{@link net.opengis.ogcapi.features.core.impl.ExtentImpl <em>Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogcapi.features.core.impl.ExtentImpl
		 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getExtent()
		 * @generated
		 */
		EClass EXTENT = eINSTANCE.getExtent();

		/**
		 * The meta object literal for the '<em><b>Spatial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__SPATIAL = eINSTANCE.getExtent_Spatial();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__TEMPORAL = eINSTANCE.getExtent_Temporal();

		/**
		 * The meta object literal for the '{@link net.opengis.ogcapi.features.core.impl.LandingPageImpl <em>Landing Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogcapi.features.core.impl.LandingPageImpl
		 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getLandingPage()
		 * @generated
		 */
		EClass LANDING_PAGE = eINSTANCE.getLandingPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDING_PAGE__TITLE = eINSTANCE.getLandingPage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDING_PAGE__DESCRIPTION = eINSTANCE.getLandingPage_Description();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_PAGE__LINKS = eINSTANCE.getLandingPage_Links();

		/**
		 * The meta object literal for the '{@link net.opengis.ogcapi.features.core.impl.SpatialExtentImpl <em>Spatial Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogcapi.features.core.impl.SpatialExtentImpl
		 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getSpatialExtent()
		 * @generated
		 */
		EClass SPATIAL_EXTENT = eINSTANCE.getSpatialExtent();

		/**
		 * The meta object literal for the '<em><b>Bbox</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_EXTENT__BBOX = eINSTANCE.getSpatialExtent_Bbox();

		/**
		 * The meta object literal for the '<em><b>Crs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_EXTENT__CRS = eINSTANCE.getSpatialExtent_Crs();

		/**
		 * The meta object literal for the '{@link net.opengis.ogcapi.features.core.impl.TemporalExtentImpl <em>Temporal Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogcapi.features.core.impl.TemporalExtentImpl
		 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getTemporalExtent()
		 * @generated
		 */
		EClass TEMPORAL_EXTENT = eINSTANCE.getTemporalExtent();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXTENT__INTERVAL = eINSTANCE.getTemporalExtent_Interval();

		/**
		 * The meta object literal for the '<em><b>Trs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_EXTENT__TRS = eINSTANCE.getTemporalExtent_Trs();

		/**
		 * The meta object literal for the '<em>Array1 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getArray1D()
		 * @generated
		 */
		EDataType ARRAY1_D = eINSTANCE.getArray1D();

		/**
		 * The meta object literal for the '<em>Array2 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogcapi.features.core.impl.corePackageImpl#getArray2D()
		 * @generated
		 */
		EDataType ARRAY2_D = eINSTANCE.getArray2D();

	}

} //corePackage
