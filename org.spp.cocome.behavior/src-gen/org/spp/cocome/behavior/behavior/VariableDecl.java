/**
 */
package org.spp.cocome.behavior.behavior;

import org.spp.cocome.behavior.mapping.TypedValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.VariableDecl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.VariableDecl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getVariableDecl()
 * @model
 * @generated
 */
public interface VariableDecl extends TypedValue
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see #setModifier(String)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getVariableDecl_Modifier()
   * @model
   * @generated
   */
  String getModifier();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.VariableDecl#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see #getModifier()
   * @generated
   */
  void setModifier(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DeclarationTypeReference)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getVariableDecl_Type()
   * @model containment="true"
   * @generated
   */
  DeclarationTypeReference getType();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.VariableDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DeclarationTypeReference value);

} // VariableDecl
