/**
 */
package org.w3._2005.atom.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.w3._2005.atom.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.w3._2005.atom.AtomPackage
 * @generated
 */
public class AtomValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AtomValidator INSTANCE = new AtomValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.w3._2005.atom";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AtomPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AtomPackage.ATOM_PERSON_CONSTRUCT:
				return validateAtomPersonConstruct((AtomPersonConstruct)value, diagnostics, context);
			case AtomPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case AtomPackage.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			case AtomPackage.ATOM_EMAIL_ADDRESS:
				return validateAtomEmailAddress((String)value, diagnostics, context);
			case AtomPackage.ATOM_LANGUAGE_TAG:
				return validateAtomLanguageTag((String)value, diagnostics, context);
			case AtomPackage.ATOM_MEDIA_TYPE:
				return validateAtomMediaType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomPersonConstruct(AtomPersonConstruct atomPersonConstruct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atomPersonConstruct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomEmailAddress(String atomEmailAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAtomEmailAddress_Pattern(atomEmailAddress, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAtomEmailAddress_Pattern
	 */
	public static final  PatternMatcher [][] ATOM_EMAIL_ADDRESS__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".+@.+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Email Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomEmailAddress_Pattern(String atomEmailAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(AtomPackage.Literals.ATOM_EMAIL_ADDRESS, atomEmailAddress, ATOM_EMAIL_ADDRESS__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomLanguageTag(String atomLanguageTag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAtomLanguageTag_Pattern(atomLanguageTag, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAtomLanguageTag_Pattern
	 */
	public static final  PatternMatcher [][] ATOM_LANGUAGE_TAG__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z]{1,8}(-[A-Za-z0-9]{1,8})*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Language Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomLanguageTag_Pattern(String atomLanguageTag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(AtomPackage.Literals.ATOM_LANGUAGE_TAG, atomLanguageTag, ATOM_LANGUAGE_TAG__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomMediaType(String atomMediaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAtomMediaType_Pattern(atomMediaType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAtomMediaType_Pattern
	 */
	public static final  PatternMatcher [][] ATOM_MEDIA_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".+/.+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomMediaType_Pattern(String atomMediaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(AtomPackage.Literals.ATOM_MEDIA_TYPE, atomMediaType, ATOM_MEDIA_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AtomValidator
