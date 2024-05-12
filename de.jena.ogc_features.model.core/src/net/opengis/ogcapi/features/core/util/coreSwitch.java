/**
 */
package net.opengis.ogcapi.features.core.util;

import net.opengis.ogcapi.features.core.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.opengis.ogcapi.features.core.corePackage
 * @generated
 */
public class coreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static corePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public coreSwitch() {
		if (modelPackage == null) {
			modelPackage = corePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case corePackage.BOUNDING_BOX: {
				BoundingBox boundingBox = (BoundingBox)theEObject;
				T result = caseBoundingBox(boundingBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case corePackage.OGCAPI_FEATURES_COLLECTIONS_WRAPPER: {
				OGCAPIFeaturesCollectionsWrapper ogcapiFeaturesCollectionsWrapper = (OGCAPIFeaturesCollectionsWrapper)theEObject;
				T result = caseOGCAPIFeaturesCollectionsWrapper(ogcapiFeaturesCollectionsWrapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case corePackage.OGCAPI_FEATURES_COLLECTION: {
				OGCAPIFeaturesCollection ogcapiFeaturesCollection = (OGCAPIFeaturesCollection)theEObject;
				T result = caseOGCAPIFeaturesCollection(ogcapiFeaturesCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case corePackage.CONFORMANCE_DECLARATION: {
				ConformanceDeclaration conformanceDeclaration = (ConformanceDeclaration)theEObject;
				T result = caseConformanceDeclaration(conformanceDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case corePackage.EXTENT: {
				Extent extent = (Extent)theEObject;
				T result = caseExtent(extent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case corePackage.LANDING_PAGE: {
				LandingPage landingPage = (LandingPage)theEObject;
				T result = caseLandingPage(landingPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case corePackage.SPATIAL_EXTENT: {
				SpatialExtent spatialExtent = (SpatialExtent)theEObject;
				T result = caseSpatialExtent(spatialExtent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case corePackage.TEMPORAL_EXTENT: {
				TemporalExtent temporalExtent = (TemporalExtent)theEObject;
				T result = caseTemporalExtent(temporalExtent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounding Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounding Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundingBox(BoundingBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OGCAPI Features Collections Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OGCAPI Features Collections Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOGCAPIFeaturesCollectionsWrapper(OGCAPIFeaturesCollectionsWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OGCAPI Features Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OGCAPI Features Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOGCAPIFeaturesCollection(OGCAPIFeaturesCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceDeclaration(ConformanceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtent(Extent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingPage(LandingPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialExtent(SpatialExtent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalExtent(TemporalExtent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //coreSwitch
