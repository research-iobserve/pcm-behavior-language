/**
 */
package org.spp.cocome.behavior.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Access Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.DataAccessStatement#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.DataAccessStatement#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getDataAccessStatement()
 * @model
 * @generated
 */
public interface DataAccessStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * The literals are from the enumeration {@link org.spp.cocome.behavior.behavior.DataAccessOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see org.spp.cocome.behavior.behavior.DataAccessOperation
   * @see #setOperation(DataAccessOperation)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getDataAccessStatement_Operation()
   * @model
   * @generated
   */
  DataAccessOperation getOperation();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.DataAccessStatement#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see org.spp.cocome.behavior.behavior.DataAccessOperation
   * @see #getOperation()
   * @generated
   */
  void setOperation(DataAccessOperation value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(VariableDecl)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getDataAccessStatement_Variable()
   * @model
   * @generated
   */
  VariableDecl getVariable();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.DataAccessStatement#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDecl value);

} // DataAccessStatement
