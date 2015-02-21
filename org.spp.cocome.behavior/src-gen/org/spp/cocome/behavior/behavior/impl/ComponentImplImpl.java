/**
 */
package org.spp.cocome.behavior.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spp.cocome.behavior.behavior.BehaviorPackage;
import org.spp.cocome.behavior.behavior.ComponentImpl;
import org.spp.cocome.behavior.behavior.InterfaceRealization;

import org.spp.cocome.behavior.mapping.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl#getRefComponent <em>Ref Component</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl#getLocalDeclarations <em>Local Declarations</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImplImpl extends MinimalEObjectImpl.Container implements ComponentImpl
{
  /**
   * The cached value of the '{@link #getRefComponent() <em>Ref Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefComponent()
   * @generated
   * @ordered
   */
  protected Component refComponent;

  /**
   * The cached value of the '{@link #getLocalDeclarations() <em>Local Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalDeclarations()
   * @generated
   * @ordered
   */
  protected EList<EObject> localDeclarations;

  /**
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EList<InterfaceRealization> interfaces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImplImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BehaviorPackage.Literals.COMPONENT_IMPL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getRefComponent()
  {
    if (refComponent != null && refComponent.eIsProxy())
    {
      InternalEObject oldRefComponent = (InternalEObject)refComponent;
      refComponent = (Component)eResolveProxy(oldRefComponent);
      if (refComponent != oldRefComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.COMPONENT_IMPL__REF_COMPONENT, oldRefComponent, refComponent));
      }
    }
    return refComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetRefComponent()
  {
    return refComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefComponent(Component newRefComponent)
  {
    Component oldRefComponent = refComponent;
    refComponent = newRefComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPONENT_IMPL__REF_COMPONENT, oldRefComponent, refComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getLocalDeclarations()
  {
    if (localDeclarations == null)
    {
      localDeclarations = new EObjectContainmentEList<EObject>(EObject.class, this, BehaviorPackage.COMPONENT_IMPL__LOCAL_DECLARATIONS);
    }
    return localDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterfaceRealization> getInterfaces()
  {
    if (interfaces == null)
    {
      interfaces = new EObjectContainmentEList<InterfaceRealization>(InterfaceRealization.class, this, BehaviorPackage.COMPONENT_IMPL__INTERFACES);
    }
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BehaviorPackage.COMPONENT_IMPL__LOCAL_DECLARATIONS:
        return ((InternalEList<?>)getLocalDeclarations()).basicRemove(otherEnd, msgs);
      case BehaviorPackage.COMPONENT_IMPL__INTERFACES:
        return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BehaviorPackage.COMPONENT_IMPL__REF_COMPONENT:
        if (resolve) return getRefComponent();
        return basicGetRefComponent();
      case BehaviorPackage.COMPONENT_IMPL__LOCAL_DECLARATIONS:
        return getLocalDeclarations();
      case BehaviorPackage.COMPONENT_IMPL__INTERFACES:
        return getInterfaces();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BehaviorPackage.COMPONENT_IMPL__REF_COMPONENT:
        setRefComponent((Component)newValue);
        return;
      case BehaviorPackage.COMPONENT_IMPL__LOCAL_DECLARATIONS:
        getLocalDeclarations().clear();
        getLocalDeclarations().addAll((Collection<? extends EObject>)newValue);
        return;
      case BehaviorPackage.COMPONENT_IMPL__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends InterfaceRealization>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BehaviorPackage.COMPONENT_IMPL__REF_COMPONENT:
        setRefComponent((Component)null);
        return;
      case BehaviorPackage.COMPONENT_IMPL__LOCAL_DECLARATIONS:
        getLocalDeclarations().clear();
        return;
      case BehaviorPackage.COMPONENT_IMPL__INTERFACES:
        getInterfaces().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BehaviorPackage.COMPONENT_IMPL__REF_COMPONENT:
        return refComponent != null;
      case BehaviorPackage.COMPONENT_IMPL__LOCAL_DECLARATIONS:
        return localDeclarations != null && !localDeclarations.isEmpty();
      case BehaviorPackage.COMPONENT_IMPL__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComponentImplImpl
