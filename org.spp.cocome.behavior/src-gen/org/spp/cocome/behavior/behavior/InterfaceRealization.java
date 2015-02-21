/**
 */
package org.spp.cocome.behavior.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.spp.cocome.behavior.mapping.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.InterfaceRealization#getRefInterface <em>Ref Interface</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.InterfaceRealization#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getInterfaceRealization()
 * @model
 * @generated
 */
public interface InterfaceRealization extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Interface</em>' reference.
   * @see #setRefInterface(Interface)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getInterfaceRealization_RefInterface()
   * @model
   * @generated
   */
  Interface getRefInterface();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.InterfaceRealization#getRefInterface <em>Ref Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Interface</em>' reference.
   * @see #getRefInterface()
   * @generated
   */
  void setRefInterface(Interface value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.spp.cocome.behavior.behavior.MethodImpl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getInterfaceRealization_Methods()
   * @model containment="true"
   * @generated
   */
  EList<MethodImpl> getMethods();

} // InterfaceRealization
