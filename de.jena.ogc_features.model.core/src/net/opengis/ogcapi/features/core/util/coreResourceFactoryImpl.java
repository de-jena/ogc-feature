/*
 */
package net.opengis.ogcapi.features.core.util;

import java.util.HashMap;
import java.util.Map;

import net.opengis.ogcapi.features.core.corePackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.gecko.emf.osgi.constants.EMFNamespaces;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see net.opengis.ogcapi.features.core.util.coreResourceImpl
 * @generated
 */
public class coreResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public coreResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new coreResourceImpl(uri);
		return result;
	}

	/**
	 * A method providing the Properties the services around this ResourceFactory should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_NAME, corePackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "core");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0.1");
		return properties;
	}

} //coreResourceFactoryImpl
