/*
 */
package org.w3._2005.atom.configuration;

import java.util.HashMap;
import java.util.Map;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.gecko.emf.osgi.constants.EMFNamespaces;

import org.w3._2005.atom.AtomPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * There is no official atom XSD. This XSD is created based on:
 *       http://atompub.org/2005/08/17/atom.rnc. A subset of Atom as used in the
 *       ogckml22.xsd is defined here. 
 * <!-- end-model-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class AtomEPackageConfigurator implements EPackageConfigurator {
	
	private AtomPackage ePackage;

	protected AtomEPackageConfigurator(AtomPackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(AtomPackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(AtomPackage.eNS_URI);
	}
	
	/**
	 * A method providing the Properties the services around this Model should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, AtomPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, AtomPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "atom");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		return properties;
	}
}