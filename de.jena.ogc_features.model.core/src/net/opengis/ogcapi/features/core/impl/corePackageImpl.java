/**
 */
package net.opengis.ogcapi.features.core.impl;

import net.opengis.ogcapi.features.core.BoundingBox;
import net.opengis.ogcapi.features.core.ConformanceDeclaration;
import net.opengis.ogcapi.features.core.Extent;
import net.opengis.ogcapi.features.core.LandingPage;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection;
import net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper;
import net.opengis.ogcapi.features.core.SpatialExtent;
import net.opengis.ogcapi.features.core.TemporalExtent;
import net.opengis.ogcapi.features.core.coreFactory;
import net.opengis.ogcapi.features.core.corePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2005.atom.AtomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class corePackageImpl extends EPackageImpl implements corePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundingBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ogcapiFeaturesCollectionsWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ogcapiFeaturesCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landingPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialExtentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalExtentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType array2DEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.opengis.ogcapi.features.core.corePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private corePackageImpl() {
		super(eNS_URI, coreFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link corePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static corePackage init() {
		if (isInited) return (corePackage)EPackage.Registry.INSTANCE.getEPackage(corePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredcorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		corePackageImpl thecorePackage = registeredcorePackage instanceof corePackageImpl ? (corePackageImpl)registeredcorePackage : new corePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AtomPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thecorePackage.createPackageContents();

		// Initialize created meta-data
		thecorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(corePackage.eNS_URI, thecorePackage);
		return thecorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundingBox() {
		return boundingBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBox_LowerCorner() {
		return (EAttribute)boundingBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBox_UpperCorner() {
		return (EAttribute)boundingBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBox_Crs() {
		return (EAttribute)boundingBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBox_Dimensions() {
		return (EAttribute)boundingBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOGCAPIFeaturesCollectionsWrapper() {
		return ogcapiFeaturesCollectionsWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOGCAPIFeaturesCollectionsWrapper_Collections() {
		return (EReference)ogcapiFeaturesCollectionsWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOGCAPIFeaturesCollectionsWrapper_Links() {
		return (EReference)ogcapiFeaturesCollectionsWrapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOGCAPIFeaturesCollection() {
		return ogcapiFeaturesCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOGCAPIFeaturesCollection_Id() {
		return (EAttribute)ogcapiFeaturesCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOGCAPIFeaturesCollection_ItemType() {
		return (EAttribute)ogcapiFeaturesCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOGCAPIFeaturesCollection_Title() {
		return (EAttribute)ogcapiFeaturesCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOGCAPIFeaturesCollection_Description() {
		return (EAttribute)ogcapiFeaturesCollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOGCAPIFeaturesCollection_Links() {
		return (EReference)ogcapiFeaturesCollectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOGCAPIFeaturesCollection_Extent() {
		return (EReference)ogcapiFeaturesCollectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOGCAPIFeaturesCollection_Crs() {
		return (EAttribute)ogcapiFeaturesCollectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOGCAPIFeaturesCollection_StorageCrs() {
		return (EAttribute)ogcapiFeaturesCollectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConformanceDeclaration() {
		return conformanceDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConformanceDeclaration_ConformsTo() {
		return (EAttribute)conformanceDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConformanceDeclaration_Links() {
		return (EReference)conformanceDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtent() {
		return extentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtent_Spatial() {
		return (EReference)extentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtent_Temporal() {
		return (EReference)extentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLandingPage() {
		return landingPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLandingPage_Title() {
		return (EAttribute)landingPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLandingPage_Description() {
		return (EAttribute)landingPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLandingPage_Links() {
		return (EReference)landingPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialExtent() {
		return spatialExtentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialExtent_Bbox() {
		return (EAttribute)spatialExtentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialExtent_Crs() {
		return (EAttribute)spatialExtentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalExtent() {
		return temporalExtentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalExtent_Interval() {
		return (EAttribute)temporalExtentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalExtent_Trs() {
		return (EAttribute)temporalExtentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getArray2D() {
		return array2DEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public coreFactory getcoreFactory() {
		return (coreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boundingBoxEClass = createEClass(BOUNDING_BOX);
		createEAttribute(boundingBoxEClass, BOUNDING_BOX__LOWER_CORNER);
		createEAttribute(boundingBoxEClass, BOUNDING_BOX__UPPER_CORNER);
		createEAttribute(boundingBoxEClass, BOUNDING_BOX__CRS);
		createEAttribute(boundingBoxEClass, BOUNDING_BOX__DIMENSIONS);

		ogcapiFeaturesCollectionsWrapperEClass = createEClass(OGCAPI_FEATURES_COLLECTIONS_WRAPPER);
		createEReference(ogcapiFeaturesCollectionsWrapperEClass, OGCAPI_FEATURES_COLLECTIONS_WRAPPER__COLLECTIONS);
		createEReference(ogcapiFeaturesCollectionsWrapperEClass, OGCAPI_FEATURES_COLLECTIONS_WRAPPER__LINKS);

		ogcapiFeaturesCollectionEClass = createEClass(OGCAPI_FEATURES_COLLECTION);
		createEAttribute(ogcapiFeaturesCollectionEClass, OGCAPI_FEATURES_COLLECTION__ID);
		createEAttribute(ogcapiFeaturesCollectionEClass, OGCAPI_FEATURES_COLLECTION__ITEM_TYPE);
		createEAttribute(ogcapiFeaturesCollectionEClass, OGCAPI_FEATURES_COLLECTION__TITLE);
		createEAttribute(ogcapiFeaturesCollectionEClass, OGCAPI_FEATURES_COLLECTION__DESCRIPTION);
		createEReference(ogcapiFeaturesCollectionEClass, OGCAPI_FEATURES_COLLECTION__LINKS);
		createEReference(ogcapiFeaturesCollectionEClass, OGCAPI_FEATURES_COLLECTION__EXTENT);
		createEAttribute(ogcapiFeaturesCollectionEClass, OGCAPI_FEATURES_COLLECTION__CRS);
		createEAttribute(ogcapiFeaturesCollectionEClass, OGCAPI_FEATURES_COLLECTION__STORAGE_CRS);

		conformanceDeclarationEClass = createEClass(CONFORMANCE_DECLARATION);
		createEAttribute(conformanceDeclarationEClass, CONFORMANCE_DECLARATION__CONFORMS_TO);
		createEReference(conformanceDeclarationEClass, CONFORMANCE_DECLARATION__LINKS);

		extentEClass = createEClass(EXTENT);
		createEReference(extentEClass, EXTENT__SPATIAL);
		createEReference(extentEClass, EXTENT__TEMPORAL);

		landingPageEClass = createEClass(LANDING_PAGE);
		createEAttribute(landingPageEClass, LANDING_PAGE__TITLE);
		createEAttribute(landingPageEClass, LANDING_PAGE__DESCRIPTION);
		createEReference(landingPageEClass, LANDING_PAGE__LINKS);

		spatialExtentEClass = createEClass(SPATIAL_EXTENT);
		createEAttribute(spatialExtentEClass, SPATIAL_EXTENT__BBOX);
		createEAttribute(spatialExtentEClass, SPATIAL_EXTENT__CRS);

		temporalExtentEClass = createEClass(TEMPORAL_EXTENT);
		createEAttribute(temporalExtentEClass, TEMPORAL_EXTENT__INTERVAL);
		createEAttribute(temporalExtentEClass, TEMPORAL_EXTENT__TRS);

		// Create data types
		array2DEDataType = createEDataType(ARRAY2_D);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		AtomPackage theAtomPackage = (AtomPackage)EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(boundingBoxEClass, BoundingBox.class, "BoundingBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundingBox_LowerCorner(), ecorePackage.getEDoubleObject(), "lowerCorner", null, 2, 2, BoundingBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBox_UpperCorner(), ecorePackage.getEDoubleObject(), "upperCorner", null, 2, 2, BoundingBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBox_Crs(), theXMLTypePackage.getAnyURI(), "crs", null, 0, 1, BoundingBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBox_Dimensions(), theXMLTypePackage.getPositiveInteger(), "dimensions", null, 0, 1, BoundingBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ogcapiFeaturesCollectionsWrapperEClass, OGCAPIFeaturesCollectionsWrapper.class, "OGCAPIFeaturesCollectionsWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOGCAPIFeaturesCollectionsWrapper_Collections(), this.getOGCAPIFeaturesCollection(), null, "collections", null, 1, -1, OGCAPIFeaturesCollectionsWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOGCAPIFeaturesCollectionsWrapper_Links(), theAtomPackage.getLinkType(), null, "links", null, 0, -1, OGCAPIFeaturesCollectionsWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ogcapiFeaturesCollectionEClass, OGCAPIFeaturesCollection.class, "OGCAPIFeaturesCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOGCAPIFeaturesCollection_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, OGCAPIFeaturesCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOGCAPIFeaturesCollection_ItemType(), theXMLTypePackage.getString(), "itemType", null, 1, 1, OGCAPIFeaturesCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOGCAPIFeaturesCollection_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, OGCAPIFeaturesCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOGCAPIFeaturesCollection_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, OGCAPIFeaturesCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOGCAPIFeaturesCollection_Links(), theAtomPackage.getLinkType(), null, "links", null, 0, -1, OGCAPIFeaturesCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOGCAPIFeaturesCollection_Extent(), this.getExtent(), null, "extent", null, 0, 1, OGCAPIFeaturesCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOGCAPIFeaturesCollection_Crs(), theXMLTypePackage.getAnyURI(), "crs", null, 0, -1, OGCAPIFeaturesCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOGCAPIFeaturesCollection_StorageCrs(), theXMLTypePackage.getAnyURI(), "storageCrs", null, 0, 1, OGCAPIFeaturesCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conformanceDeclarationEClass, ConformanceDeclaration.class, "ConformanceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConformanceDeclaration_ConformsTo(), theXMLTypePackage.getString(), "conformsTo", null, 0, -1, ConformanceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConformanceDeclaration_Links(), theAtomPackage.getLinkType(), null, "links", null, 1, -1, ConformanceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extentEClass, Extent.class, "Extent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtent_Spatial(), this.getSpatialExtent(), null, "spatial", null, 0, 1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtent_Temporal(), this.getTemporalExtent(), null, "temporal", null, 0, 1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(landingPageEClass, LandingPage.class, "LandingPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLandingPage_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, LandingPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLandingPage_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, LandingPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLandingPage_Links(), theAtomPackage.getLinkType(), null, "links", null, 0, -1, LandingPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialExtentEClass, SpatialExtent.class, "SpatialExtent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpatialExtent_Bbox(), this.getArray2D(), "bbox", null, 1, 1, SpatialExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialExtent_Crs(), theXMLTypePackage.getAnyURI(), "crs", null, 0, 1, SpatialExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalExtentEClass, TemporalExtent.class, "TemporalExtent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporalExtent_Interval(), this.getArray2D(), "interval", null, 1, 1, TemporalExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalExtent_Trs(), theXMLTypePackage.getAnyURI(), "trs", null, 0, 1, TemporalExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(array2DEDataType, Double[][].class, "Array2D", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0.1"
		   });
	}

} //corePackageImpl
