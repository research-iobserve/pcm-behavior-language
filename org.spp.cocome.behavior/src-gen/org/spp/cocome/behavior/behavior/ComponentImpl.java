/**
 */
package org.spp.cocome.behavior.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.spp.cocome.behavior.mapping.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.ComponentImpl#getRefComponent <em>Ref Component</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.ComponentImpl#getLocalDeclarations <em>Local Declarations</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.ComponentImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getComponentImpl()
 * @model
 * @generated
 */
public interface ComponentImpl extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Component</em>' reference.
   * @see #setRefComponent(Component)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getComponentImpl_RefComponent()
   * @model
   * @generated
   */
  Component getRefComponent();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.ComponentImpl#getRefComponent <em>Ref Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Component</em>' reference.
   * @see #getRefComponent()
   * @generated
   */
  void setRefComponent(Component value);

  /**
   * Returns the value of the '<em><b>Local Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Declarations</em>' containment reference list.
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getComponentImpl_LocalDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getLocalDeclarations();

  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
   * The list contents are of type {@link org.spp.cocome.behavior.behavior.InterfaceRealization}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' containment reference list.
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getComponentImpl_Interfaces()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceRealization> getInterfaces();

} // ComponentImpl
