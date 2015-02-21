/**
 */
package org.spp.cocome.behavior.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.VariableCall#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.VariableCall#getIndex <em>Index</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.VariableCall#getSubProperty <em>Sub Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getVariableCall()
 * @model
 * @generated
 */
public interface VariableCall extends Expression
{
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
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getVariableCall_Variable()
   * @model
   * @generated
   */
  VariableDecl getVariable();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.VariableCall#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDecl value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(Expression)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getVariableCall_Index()
   * @model containment="true"
   * @generated
   */
  Expression getIndex();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.VariableCall#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Expression value);

  /**
   * Returns the value of the '<em><b>Sub Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Property</em>' containment reference.
   * @see #setSubProperty(PropertyCall)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getVariableCall_SubProperty()
   * @model containment="true"
   * @generated
   */
  PropertyCall getSubProperty();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.VariableCall#getSubProperty <em>Sub Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Property</em>' containment reference.
   * @see #getSubProperty()
   * @generated
   */
  void setSubProperty(PropertyCall value);

} // VariableCall
