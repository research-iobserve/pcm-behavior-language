/**
 */
package org.spp.cocome.behavior.mapping;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.mapping.Component#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.mapping.Component#getPcmComponent <em>Pcm Component</em>}</li>
 * </ul>
 *
 * @see org.spp.cocome.behavior.mapping.MappingPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.spp.cocome.behavior.mapping.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see org.spp.cocome.behavior.mapping.MappingPackage#getComponent_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Pcm Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Component</em>' reference.
	 * @see #setPcmComponent(org.palladiosimulator.pcm.repository.ImplementationComponentType)
	 * @see org.spp.cocome.behavior.mapping.MappingPackage#getComponent_PcmComponent()
	 * @model required="true"
	 * @generated
	 */
	org.palladiosimulator.pcm.repository.ImplementationComponentType getPcmComponent();

	/**
	 * Sets the value of the '{@link org.spp.cocome.behavior.mapping.Component#getPcmComponent <em>Pcm Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Component</em>' reference.
	 * @see #getPcmComponent()
	 * @generated
	 */
	void setPcmComponent(org.palladiosimulator.pcm.repository.ImplementationComponentType value);
} // Component
