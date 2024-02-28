/*
 */
package net.opengis.ogcapi.features.core;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.ogcapi.features.core.corePackage
 * @generated
 */
@ProviderType
public interface coreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	coreFactory eINSTANCE = net.opengis.ogcapi.features.core.impl.coreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bounding Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounding Box</em>'.
	 * @generated
	 */
	BoundingBox createBoundingBox();

	/**
	 * Returns a new object of class '<em>OGCAPI Features Collections Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OGCAPI Features Collections Wrapper</em>'.
	 * @generated
	 */
	OGCAPIFeaturesCollectionsWrapper createOGCAPIFeaturesCollectionsWrapper();

	/**
	 * Returns a new object of class '<em>OGCAPI Features Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OGCAPI Features Collection</em>'.
	 * @generated
	 */
	OGCAPIFeaturesCollection createOGCAPIFeaturesCollection();

	/**
	 * Returns a new object of class '<em>Conformance Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Declaration</em>'.
	 * @generated
	 */
	ConformanceDeclaration createConformanceDeclaration();

	/**
	 * Returns a new object of class '<em>Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extent</em>'.
	 * @generated
	 */
	Extent createExtent();

	/**
	 * Returns a new object of class '<em>Landing Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Landing Page</em>'.
	 * @generated
	 */
	LandingPage createLandingPage();

	/**
	 * Returns a new object of class '<em>Spatial Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spatial Extent</em>'.
	 * @generated
	 */
	SpatialExtent createSpatialExtent();

	/**
	 * Returns a new object of class '<em>Temporal Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Extent</em>'.
	 * @generated
	 */
	TemporalExtent createTemporalExtent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	corePackage getcorePackage();

} //coreFactory
