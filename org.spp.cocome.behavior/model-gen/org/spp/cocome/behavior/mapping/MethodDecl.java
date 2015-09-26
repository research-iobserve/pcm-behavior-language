/**
 */
package org.spp.cocome.behavior.mapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.mapping.MethodDecl#getPcmMethod <em>Pcm Method</em>}</li>
 * </ul>
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
	 * @see #setPcmMethod(org.palladiosimulator.pcm.repository.Signature)
	 * @see org.spp.cocome.behavior.mapping.MappingPackage#getMethodDecl_PcmMethod()
	 * @model required="true"
	 * @generated
	 */
	org.palladiosimulator.pcm.repository.Signature getPcmMethod();

	/**
	 * Sets the value of the '{@link org.spp.cocome.behavior.mapping.MethodDecl#getPcmMethod <em>Pcm Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Method</em>' reference.
	 * @see #getPcmMethod()
	 * @generated
	 */
	void setPcmMethod(org.palladiosimulator.pcm.repository.Signature value);
} // MethodDecl
