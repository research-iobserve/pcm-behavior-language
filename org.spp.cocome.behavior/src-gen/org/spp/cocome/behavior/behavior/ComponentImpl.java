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
 *   <li>{@link org.spp.cocome.behavior.behavior.ComponentImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.ComponentImpl#getRefComponent <em>Ref Component</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.ComponentImpl#getLocalDeclarations <em>Local Declarations</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.ComponentImpl#getPostConstruct <em>Post Construct</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.ComponentImpl#getPreDestroy <em>Pre Destroy</em>}</li>
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
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.spp.cocome.behavior.behavior.ComponentKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.spp.cocome.behavior.behavior.ComponentKind
   * @see #setKind(ComponentKind)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getComponentImpl_Kind()
   * @model
   * @generated
   */
  ComponentKind getKind();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.ComponentImpl#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.spp.cocome.behavior.behavior.ComponentKind
   * @see #getKind()
   * @generated
   */
  void setKind(ComponentKind value);

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
   * Returns the value of the '<em><b>Post Construct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Construct</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Construct</em>' containment reference.
   * @see #setPostConstruct(LifeCycleMethod)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getComponentImpl_PostConstruct()
   * @model containment="true"
   * @generated
   */
  LifeCycleMethod getPostConstruct();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.ComponentImpl#getPostConstruct <em>Post Construct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Construct</em>' containment reference.
   * @see #getPostConstruct()
   * @generated
   */
  void setPostConstruct(LifeCycleMethod value);

  /**
   * Returns the value of the '<em><b>Pre Destroy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Destroy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Destroy</em>' containment reference.
   * @see #setPreDestroy(LifeCycleMethod)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getComponentImpl_PreDestroy()
   * @model containment="true"
   * @generated
   */
  LifeCycleMethod getPreDestroy();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.ComponentImpl#getPreDestroy <em>Pre Destroy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Destroy</em>' containment reference.
   * @see #getPreDestroy()
   * @generated
   */
  void setPreDestroy(LifeCycleMethod value);

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
