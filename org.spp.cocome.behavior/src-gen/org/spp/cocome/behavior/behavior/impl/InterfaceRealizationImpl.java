/**
 */
package org.spp.cocome.behavior.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spp.cocome.behavior.behavior.BehaviorPackage;
import org.spp.cocome.behavior.behavior.InterfaceRealization;
import org.spp.cocome.behavior.behavior.MethodImpl;

import org.spp.cocome.behavior.mapping.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.InterfaceRealizationImpl#getRefInterface <em>Ref Interface</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.InterfaceRealizationImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceRealizationImpl extends MinimalEObjectImpl.Container implements InterfaceRealization
{
  /**
   * The cached value of the '{@link #getRefInterface() <em>Ref Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefInterface()
   * @generated
   * @ordered
   */
  protected Interface refInterface;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<MethodImpl> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceRealizationImpl()
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
    return BehaviorPackage.Literals.INTERFACE_REALIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getRefInterface()
  {
    if (refInterface != null && refInterface.eIsProxy())
    {
      InternalEObject oldRefInterface = (InternalEObject)refInterface;
      refInterface = (Interface)eResolveProxy(oldRefInterface);
      if (refInterface != oldRefInterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.INTERFACE_REALIZATION__REF_INTERFACE, oldRefInterface, refInterface));
      }
    }
    return refInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetRefInterface()
  {
    return refInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefInterface(Interface newRefInterface)
  {
    Interface oldRefInterface = refInterface;
    refInterface = newRefInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.INTERFACE_REALIZATION__REF_INTERFACE, oldRefInterface, refInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MethodImpl> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<MethodImpl>(MethodImpl.class, this, BehaviorPackage.INTERFACE_REALIZATION__METHODS);
    }
    return methods;
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
      case BehaviorPackage.INTERFACE_REALIZATION__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case BehaviorPackage.INTERFACE_REALIZATION__REF_INTERFACE:
        if (resolve) return getRefInterface();
        return basicGetRefInterface();
      case BehaviorPackage.INTERFACE_REALIZATION__METHODS:
        return getMethods();
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
      case BehaviorPackage.INTERFACE_REALIZATION__REF_INTERFACE:
        setRefInterface((Interface)newValue);
        return;
      case BehaviorPackage.INTERFACE_REALIZATION__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends MethodImpl>)newValue);
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
      case BehaviorPackage.INTERFACE_REALIZATION__REF_INTERFACE:
        setRefInterface((Interface)null);
        return;
      case BehaviorPackage.INTERFACE_REALIZATION__METHODS:
        getMethods().clear();
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
      case BehaviorPackage.INTERFACE_REALIZATION__REF_INTERFACE:
        return refInterface != null;
      case BehaviorPackage.INTERFACE_REALIZATION__METHODS:
        return methods != null && !methods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceRealizationImpl
