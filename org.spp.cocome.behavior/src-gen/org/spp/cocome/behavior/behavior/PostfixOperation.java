/**
 */
package org.spp.cocome.behavior.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postfix Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.PostfixOperation#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.PostfixOperation#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getPostfixOperation()
 * @model
 * @generated
 */
public interface PostfixOperation extends Expression
{
  /**
   * Returns the value of the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' containment reference.
   * @see #setOperand(Expression)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getPostfixOperation_Operand()
   * @model containment="true"
   * @generated
   */
  Expression getOperand();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.PostfixOperation#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(Expression value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' attribute.
   * @see #setFeature(String)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getPostfixOperation_Feature()
   * @model
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.PostfixOperation#getFeature <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' attribute.
   * @see #getFeature()
   * @generated
   */
  void setFeature(String value);

} // PostfixOperation
