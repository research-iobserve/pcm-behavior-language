/**
 */
package org.spp.cocome.behavior.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Cycle Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.LifeCycleMethod#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getLifeCycleMethod()
 * @model
 * @generated
 */
public interface LifeCycleMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(BlockStatement)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getLifeCycleMethod_Body()
   * @model containment="true"
   * @generated
   */
  BlockStatement getBody();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.LifeCycleMethod#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(BlockStatement value);

} // LifeCycleMethod
