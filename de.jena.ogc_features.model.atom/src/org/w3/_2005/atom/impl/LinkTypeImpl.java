/*
 */
package org.w3._2005.atom.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3._2005.atom.AtomPackage;
import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2005.atom.impl.LinkTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._2005.atom.impl.LinkTypeImpl#getHreflang <em>Hreflang</em>}</li>
 *   <li>{@link org.w3._2005.atom.impl.LinkTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.w3._2005.atom.impl.LinkTypeImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link org.w3._2005.atom.impl.LinkTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._2005.atom.impl.LinkTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkTypeImpl extends MinimalEObjectImpl.Container implements LinkType {
	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getHreflang() <em>Hreflang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHreflang()
	 * @generated
	 * @ordered
	 */
	protected static final String HREFLANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHreflang() <em>Hreflang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHreflang()
	 * @generated
	 * @ordered
	 */
	protected String hreflang = HREFLANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected static final String REL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected String rel = REL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomPackage.Literals.LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHreflang() {
		return hreflang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHreflang(String newHreflang) {
		String oldHreflang = hreflang;
		hreflang = newHreflang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK_TYPE__HREFLANG, oldHreflang, hreflang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK_TYPE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRel() {
		return rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRel(String newRel) {
		String oldRel = rel;
		rel = newRel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK_TYPE__REL, oldRel, rel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomPackage.LINK_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtomPackage.LINK_TYPE__HREF:
				return getHref();
			case AtomPackage.LINK_TYPE__HREFLANG:
				return getHreflang();
			case AtomPackage.LINK_TYPE__LENGTH:
				return getLength();
			case AtomPackage.LINK_TYPE__REL:
				return getRel();
			case AtomPackage.LINK_TYPE__TITLE:
				return getTitle();
			case AtomPackage.LINK_TYPE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AtomPackage.LINK_TYPE__HREF:
				setHref((String)newValue);
				return;
			case AtomPackage.LINK_TYPE__HREFLANG:
				setHreflang((String)newValue);
				return;
			case AtomPackage.LINK_TYPE__LENGTH:
				setLength((String)newValue);
				return;
			case AtomPackage.LINK_TYPE__REL:
				setRel((String)newValue);
				return;
			case AtomPackage.LINK_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case AtomPackage.LINK_TYPE__TYPE:
				setType((String)newValue);
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
			case AtomPackage.LINK_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case AtomPackage.LINK_TYPE__HREFLANG:
				setHreflang(HREFLANG_EDEFAULT);
				return;
			case AtomPackage.LINK_TYPE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case AtomPackage.LINK_TYPE__REL:
				setRel(REL_EDEFAULT);
				return;
			case AtomPackage.LINK_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AtomPackage.LINK_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case AtomPackage.LINK_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case AtomPackage.LINK_TYPE__HREFLANG:
				return HREFLANG_EDEFAULT == null ? hreflang != null : !HREFLANG_EDEFAULT.equals(hreflang);
			case AtomPackage.LINK_TYPE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case AtomPackage.LINK_TYPE__REL:
				return REL_EDEFAULT == null ? rel != null : !REL_EDEFAULT.equals(rel);
			case AtomPackage.LINK_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AtomPackage.LINK_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (href: ");
		result.append(href);
		result.append(", hreflang: ");
		result.append(hreflang);
		result.append(", length: ");
		result.append(length);
		result.append(", rel: ");
		result.append(rel);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LinkTypeImpl
