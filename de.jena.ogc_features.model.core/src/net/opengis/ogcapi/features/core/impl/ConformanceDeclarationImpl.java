/*
 */
package net.opengis.ogcapi.features.core.impl;

import java.util.Collection;

import net.opengis.ogcapi.features.core.ConformanceDeclaration;
import net.opengis.ogcapi.features.core.corePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.ConformanceDeclarationImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link net.opengis.ogcapi.features.core.impl.ConformanceDeclarationImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceDeclarationImpl extends MinimalEObjectImpl.Container implements ConformanceDeclaration {
	/**
	 * The cached value of the '{@link #getConformsTo() <em>Conforms To</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> conformsTo;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return corePackage.Literals.CONFORMANCE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConformsTo() {
		if (conformsTo == null) {
			conformsTo = new EDataTypeUniqueEList<String>(String.class, this, corePackage.CONFORMANCE_DECLARATION__CONFORMS_TO);
		}
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkType> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<LinkType>(LinkType.class, this, corePackage.CONFORMANCE_DECLARATION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case corePackage.CONFORMANCE_DECLARATION__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case corePackage.CONFORMANCE_DECLARATION__CONFORMS_TO:
				return getConformsTo();
			case corePackage.CONFORMANCE_DECLARATION__LINKS:
				return getLinks();
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
			case corePackage.CONFORMANCE_DECLARATION__CONFORMS_TO:
				getConformsTo().clear();
				getConformsTo().addAll((Collection<? extends String>)newValue);
				return;
			case corePackage.CONFORMANCE_DECLARATION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends LinkType>)newValue);
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
			case corePackage.CONFORMANCE_DECLARATION__CONFORMS_TO:
				getConformsTo().clear();
				return;
			case corePackage.CONFORMANCE_DECLARATION__LINKS:
				getLinks().clear();
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
			case corePackage.CONFORMANCE_DECLARATION__CONFORMS_TO:
				return conformsTo != null && !conformsTo.isEmpty();
			case corePackage.CONFORMANCE_DECLARATION__LINKS:
				return links != null && !links.isEmpty();
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
		result.append(" (conformsTo: ");
		result.append(conformsTo);
		result.append(')');
		return result.toString();
	}

} //ConformanceDeclarationImpl
