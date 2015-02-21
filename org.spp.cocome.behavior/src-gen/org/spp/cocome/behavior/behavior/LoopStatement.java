/**
 */
package org.spp.cocome.behavior.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.LoopStatement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.LoopStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.LoopStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getLoopStatement()
 * @model
 * @generated
 */
public interface LoopStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDecl)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getLoopStatement_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDecl getVariable();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.LoopStatement#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDecl value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getLoopStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.LoopStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(BlockStatement)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getLoopStatement_Statement()
   * @model containment="true"
   * @generated
   */
  BlockStatement getStatement();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.LoopStatement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(BlockStatement value);

} // LoopStatement
