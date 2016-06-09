/**
 */
package org.spp.cocome.behavior.mapping;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.OperationSignature;

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
 *   <li>{@link org.spp.cocome.behavior.mapping.MethodDecl#getParameters <em>Parameters</em>}</li>
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
	 * @see #setPcmMethod(OperationSignature)
	 * @see org.spp.cocome.behavior.mapping.MappingPackage#getMethodDecl_PcmMethod()
	 * @model required="true"
	 * @generated
	 */
	OperationSignature getPcmMethod();

	/**
	 * Sets the value of the '{@link org.spp.cocome.behavior.mapping.MethodDecl#getPcmMethod <em>Pcm Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Method</em>' reference.
	 * @see #getPcmMethod()
	 * @generated
	 */
	void setPcmMethod(OperationSignature value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.spp.cocome.behavior.mapping.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.spp.cocome.behavior.mapping.MappingPackage#getMethodDecl_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();
} // MethodDecl
