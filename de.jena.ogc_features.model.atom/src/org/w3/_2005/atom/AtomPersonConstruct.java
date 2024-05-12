/*
 */
package org.w3._2005.atom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2005.atom.AtomPersonConstruct#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2005.atom.AtomPersonConstruct#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._2005.atom.AtomPersonConstruct#getUri <em>Uri</em>}</li>
 *   <li>{@link org.w3._2005.atom.AtomPersonConstruct#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see org.w3._2005.atom.AtomPackage#getAtomPersonConstruct()
 * @model extendedMetaData="name='atomPersonConstruct' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AtomPersonConstruct extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._2005.atom.AtomPackage#getAtomPersonConstruct_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see org.w3._2005.atom.AtomPackage#getAtomPersonConstruct_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute list.
	 * @see org.w3._2005.atom.AtomPackage#getAtomPersonConstruct_Uri()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getUri();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute list.
	 * @see org.w3._2005.atom.AtomPackage#getAtomPersonConstruct_Email()
	 * @model unique="false" dataType="org.w3._2005.atom.AtomEmailAddress" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getEmail();

} // AtomPersonConstruct
