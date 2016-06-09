/**
 */
package org.spp.cocome.behavior.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.mapping.Parameter#getPcmParameter <em>Pcm Parameter</em>}</li>
 * </ul>
 *
 * @see org.spp.cocome.behavior.mapping.MappingPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedValue {
	/**
	 * Returns the value of the '<em><b>Pcm Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Parameter</em>' reference.
	 * @see #setPcmParameter(org.palladiosimulator.pcm.repository.Parameter)
	 * @see org.spp.cocome.behavior.mapping.MappingPackage#getParameter_PcmParameter()
	 * @model required="true"
	 * @generated
	 */
	org.palladiosimulator.pcm.repository.Parameter getPcmParameter();

	/**
	 * Sets the value of the '{@link org.spp.cocome.behavior.mapping.Parameter#getPcmParameter <em>Pcm Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Parameter</em>' reference.
	 * @see #getPcmParameter()
	 * @generated
	 */
	void setPcmParameter(org.palladiosimulator.pcm.repository.Parameter value);

} // Parameter
