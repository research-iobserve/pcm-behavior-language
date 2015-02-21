/**
 */
package org.spp.cocome.behavior.mapping;

import de.uka.ipd.sdq.pcm.repository.Signature;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.mapping.MethodDecl#getPcmMethod <em>Pcm Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.behavior.mapping.MappingPackage#getMethodDecl()
 * @model
 * @generated
 */
public interface MethodDecl extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Pcm Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Method</em>' reference.
	 * @see #setPcmMethod(Signature)
	 * @see org.spp.cocome.behavior.mapping.MappingPackage#getMethodDecl_PcmMethod()
	 * @model required="true"
	 * @generated
	 */
	Signature getPcmMethod();

	/**
	 * Sets the value of the '{@link org.spp.cocome.behavior.mapping.MethodDecl#getPcmMethod <em>Pcm Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Method</em>' reference.
	 * @see #getPcmMethod()
	 * @generated
	 */
	void setPcmMethod(Signature value);
} // MethodDecl
