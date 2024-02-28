/*
 */
package org.w3._2005.atom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2005.atom.AtomPackage;
import org.w3._2005.atom.AtomPersonConstruct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2005.atom.impl.AtomPersonConstructImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2005.atom.impl.AtomPersonConstructImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._2005.atom.impl.AtomPersonConstructImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.w3._2005.atom.impl.AtomPersonConstructImpl#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomPersonConstructImpl extends MinimalEObjectImpl.Container implements AtomPersonConstruct {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomPersonConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomPackage.Literals.ATOM_PERSON_CONSTRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AtomPackage.ATOM_PERSON_CONSTRUCT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getName() {
		return getGroup().list(AtomPackage.Literals.ATOM_PERSON_CONSTRUCT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUri() {
		return getGroup().list(AtomPackage.Literals.ATOM_PERSON_CONSTRUCT__URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEmail() {
		return getGroup().list(AtomPackage.Literals.ATOM_PERSON_CONSTRUCT__EMAIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtomPackage.ATOM_PERSON_CONSTRUCT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case AtomPackage.ATOM_PERSON_CONSTRUCT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AtomPackage.ATOM_PERSON_CONSTRUCT__NAME:
				return getName();
			case AtomPackage.ATOM_PERSON_CONSTRUCT__URI:
				return getUri();
			case AtomPackage.ATOM_PERSON_CONSTRUCT__EMAIL:
				return getEmail();
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
			case AtomPackage.ATOM_PERSON_CONSTRUCT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AtomPackage.ATOM_PERSON_CONSTRUCT__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case AtomPackage.ATOM_PERSON_CONSTRUCT__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends String>)newValue);
				return;
			case AtomPackage.ATOM_PERSON_CONSTRUCT__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends String>)newValue);
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
			case AtomPackage.ATOM_PERSON_CONSTRUCT__GROUP:
				getGroup().clear();
				return;
			case AtomPackage.ATOM_PERSON_CONSTRUCT__NAME:
				getName().clear();
				return;
			case AtomPackage.ATOM_PERSON_CONSTRUCT__URI:
				getUri().clear();
				return;
			case AtomPackage.ATOM_PERSON_CONSTRUCT__EMAIL:
				getEmail().clear();
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
			case AtomPackage.ATOM_PERSON_CONSTRUCT__GROUP:
				return group != null && !group.isEmpty();
			case AtomPackage.ATOM_PERSON_CONSTRUCT__NAME:
				return !getName().isEmpty();
			case AtomPackage.ATOM_PERSON_CONSTRUCT__URI:
				return !getUri().isEmpty();
			case AtomPackage.ATOM_PERSON_CONSTRUCT__EMAIL:
				return !getEmail().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //AtomPersonConstructImpl
