/**
 */
package org.spp.cocome.behavior.behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.BehaviorModel#getName <em>Name</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.BehaviorModel#getImports <em>Imports</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.BehaviorModel#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.BehaviorModel#getComponentImpl <em>Component Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getBehaviorModel()
 * @model
 * @generated
 */
public interface BehaviorModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getBehaviorModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.BehaviorModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.spp.cocome.behavior.behavior.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getBehaviorModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
   * The list contents are of type {@link org.spp.cocome.behavior.behavior.RepositoryReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repositories</em>' containment reference list.
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getBehaviorModel_Repositories()
   * @model containment="true"
   * @generated
   */
  EList<RepositoryReference> getRepositories();

  /**
   * Returns the value of the '<em><b>Component Impl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Impl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Impl</em>' containment reference.
   * @see #setComponentImpl(ComponentImpl)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getBehaviorModel_ComponentImpl()
   * @model containment="true"
   * @generated
   */
  ComponentImpl getComponentImpl();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.BehaviorModel#getComponentImpl <em>Component Impl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Impl</em>' containment reference.
   * @see #getComponentImpl()
   * @generated
   */
  void setComponentImpl(ComponentImpl value);

} // BehaviorModel
