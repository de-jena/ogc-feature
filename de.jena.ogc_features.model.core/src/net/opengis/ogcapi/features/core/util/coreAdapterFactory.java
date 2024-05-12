/**
 */
package net.opengis.ogcapi.features.core.util;

import net.opengis.ogcapi.features.core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.ogcapi.features.core.corePackage
 * @generated
 */
public class coreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static corePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public coreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = corePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected coreSwitch<Adapter> modelSwitch =
		new coreSwitch<Adapter>() {
			@Override
			public Adapter caseBoundingBox(BoundingBox object) {
				return createBoundingBoxAdapter();
			}
			@Override
			public Adapter caseOGCAPIFeaturesCollectionsWrapper(OGCAPIFeaturesCollectionsWrapper object) {
				return createOGCAPIFeaturesCollectionsWrapperAdapter();
			}
			@Override
			public Adapter caseOGCAPIFeaturesCollection(OGCAPIFeaturesCollection object) {
				return createOGCAPIFeaturesCollectionAdapter();
			}
			@Override
			public Adapter caseConformanceDeclaration(ConformanceDeclaration object) {
				return createConformanceDeclarationAdapter();
			}
			@Override
			public Adapter caseExtent(Extent object) {
				return createExtentAdapter();
			}
			@Override
			public Adapter caseLandingPage(LandingPage object) {
				return createLandingPageAdapter();
			}
			@Override
			public Adapter caseSpatialExtent(SpatialExtent object) {
				return createSpatialExtentAdapter();
			}
			@Override
			public Adapter caseTemporalExtent(TemporalExtent object) {
				return createTemporalExtentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogcapi.features.core.BoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogcapi.features.core.BoundingBox
	 * @generated
	 */
	public Adapter createBoundingBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper <em>OGCAPI Features Collections Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollectionsWrapper
	 * @generated
	 */
	public Adapter createOGCAPIFeaturesCollectionsWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection <em>OGCAPI Features Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogcapi.features.core.OGCAPIFeaturesCollection
	 * @generated
	 */
	public Adapter createOGCAPIFeaturesCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogcapi.features.core.ConformanceDeclaration <em>Conformance Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogcapi.features.core.ConformanceDeclaration
	 * @generated
	 */
	public Adapter createConformanceDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogcapi.features.core.Extent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogcapi.features.core.Extent
	 * @generated
	 */
	public Adapter createExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogcapi.features.core.LandingPage <em>Landing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogcapi.features.core.LandingPage
	 * @generated
	 */
	public Adapter createLandingPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogcapi.features.core.SpatialExtent <em>Spatial Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogcapi.features.core.SpatialExtent
	 * @generated
	 */
	public Adapter createSpatialExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogcapi.features.core.TemporalExtent <em>Temporal Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogcapi.features.core.TemporalExtent
	 * @generated
	 */
	public Adapter createTemporalExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //coreAdapterFactory
