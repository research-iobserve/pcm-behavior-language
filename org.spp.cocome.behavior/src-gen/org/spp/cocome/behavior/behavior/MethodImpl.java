/**
 */
package org.spp.cocome.behavior.behavior;

import org.eclipse.emf.ecore.EObject;

import org.spp.cocome.behavior.mapping.MethodDecl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.MethodImpl#getRefMethod <em>Ref Method</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.MethodImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getMethodImpl()
 * @model
 * @generated
 */
public interface MethodImpl extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Method</em>' reference.
   * @see #setRefMethod(MethodDecl)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getMethodImpl_RefMethod()
   * @model
   * @generated
   */
  MethodDecl getRefMethod();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.MethodImpl#getRefMethod <em>Ref Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Method</em>' reference.
   * @see #getRefMethod()
   * @generated
   */
  void setRefMethod(MethodDecl value);

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
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getMethodImpl_Body()
   * @model containment="true"
   * @generated
   */
  BlockStatement getBody();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.MethodImpl#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(BlockStatement value);

} // MethodImpl
