/**
 */
package net.opengis.ogcapi.features.core.impl;

import net.opengis.ogcapi.features.core.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class coreFactoryImpl extends EFactoryImpl implements coreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static coreFactory init() {
		try {
			coreFactory thecoreFactory = (coreFactory)EPackage.Registry.INSTANCE.getEFactory(corePackage.eNS_URI);
			if (thecoreFactory != null) {
				return thecoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new coreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public coreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case corePackage.BOUNDING_BOX: return createBoundingBox();
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER: return createOGCAPIFeaturesCollectionsWrapper();
			case corePackage.OGCAPI_FEATURES_COLLECTION: return createOGCAPIFeaturesCollection();
			case corePackage.CONFORMANCE_DECLARATION: return createConformanceDeclaration();
			case corePackage.EXTENT: return createExtent();
			case corePackage.LANDING_PAGE: return createLandingPage();
			case corePackage.SPATIAL_EXTENT: return createSpatialExtent();
			case corePackage.TEMPORAL_EXTENT: return createTemporalExtent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case corePackage.ARRAY2_D:
				return createArray2DFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case corePackage.ARRAY2_D:
				return convertArray2DToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingBox createBoundingBox() {
		BoundingBoxImpl boundingBox = new BoundingBoxImpl();
		return boundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OGCAPIFeaturesCollectionsWrapper createOGCAPIFeaturesCollectionsWrapper() {
		OGCAPIFeaturesCollectionsWrapperImpl ogcapiFeaturesCollectionsWrapper = new OGCAPIFeaturesCollectionsWrapperImpl();
		return ogcapiFeaturesCollectionsWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OGCAPIFeaturesCollection createOGCAPIFeaturesCollection() {
		OGCAPIFeaturesCollectionImpl ogcapiFeaturesCollection = new OGCAPIFeaturesCollectionImpl();
		return ogcapiFeaturesCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConformanceDeclaration createConformanceDeclaration() {
		ConformanceDeclarationImpl conformanceDeclaration = new ConformanceDeclarationImpl();
		return conformanceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extent createExtent() {
		ExtentImpl extent = new ExtentImpl();
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingPage createLandingPage() {
		LandingPageImpl landingPage = new LandingPageImpl();
		return landingPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialExtent createSpatialExtent() {
		SpatialExtentImpl spatialExtent = new SpatialExtentImpl();
		return spatialExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExtent createTemporalExtent() {
		TemporalExtentImpl temporalExtent = new TemporalExtentImpl();
		return temporalExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double[][] createArray2DFromString(EDataType eDataType, String initialValue) {
		return (Double[][])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArray2DToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public corePackage getcorePackage() {
		return (corePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static corePackage getPackage() {
		return corePackage.eINSTANCE;
	}

} //coreFactoryImpl
