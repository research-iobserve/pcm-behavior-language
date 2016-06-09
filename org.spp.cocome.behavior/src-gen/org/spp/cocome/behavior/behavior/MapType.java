/**
 */
package org.spp.cocome.behavior.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.MapType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.MapType#getKeyType <em>Key Type</em>}</li>
 * </ul>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends DeclarationTypeReference
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(TypeReference)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getMapType_Reference()
   * @model containment="true"
   * @generated
   */
  TypeReference getReference();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.MapType#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(TypeReference value);

  /**
   * Returns the value of the '<em><b>Key Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Type</em>' containment reference.
   * @see #setKeyType(TypeReference)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getMapType_KeyType()
   * @model containment="true"
   * @generated
   */
  TypeReference getKeyType();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.MapType#getKeyType <em>Key Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Type</em>' containment reference.
   * @see #getKeyType()
   * @generated
   */
  void setKeyType(TypeReference value);

} // MapType
