/**
 */
package org.spp.cocome.behavior.mapping;

import de.uka.ipd.sdq.pcm.repository.ProvidedRole;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.mapping.Interface#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.mapping.Interface#getPcmInterface <em>Pcm Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.behavior.mapping.MappingPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.spp.cocome.behavior.mapping.MethodDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.spp.cocome.behavior.mapping.MappingPackage#getInterface_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodDecl> getMethods();

	/**
	 * Returns the value of the '<em><b>Pcm Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Interface</em>' reference.
	 * @see #setPcmInterface(ProvidedRole)
	 * @see org.spp.cocome.behavior.mapping.MappingPackage#getInterface_PcmInterface()
	 * @model required="true"
	 * @generated
	 */
	ProvidedRole getPcmInterface();

	/**
	 * Sets the value of the '{@link org.spp.cocome.behavior.mapping.Interface#getPcmInterface <em>Pcm Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Interface</em>' reference.
	 * @see #getPcmInterface()
	 * @generated
	 */
	void setPcmInterface(ProvidedRole value);
} // Interface
