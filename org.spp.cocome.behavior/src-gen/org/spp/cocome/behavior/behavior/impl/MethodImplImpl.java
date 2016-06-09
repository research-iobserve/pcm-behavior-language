/**
 */
package org.spp.cocome.behavior.behavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spp.cocome.behavior.behavior.BehaviorPackage;
import org.spp.cocome.behavior.behavior.BlockStatement;
import org.spp.cocome.behavior.behavior.MethodImpl;

import org.spp.cocome.behavior.mapping.MethodDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.MethodImplImpl#getRefMethod <em>Ref Method</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.MethodImplImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImplImpl extends MinimalEObjectImpl.Container implements MethodImpl
{
  /**
   * The cached value of the '{@link #getRefMethod() <em>Ref Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefMethod()
   * @generated
   * @ordered
   */
  protected MethodDecl refMethod;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected BlockStatement body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImplImpl()
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
    return BehaviorPackage.Literals.METHOD_IMPL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDecl getRefMethod()
  {
    if (refMethod != null && refMethod.eIsProxy())
    {
      InternalEObject oldRefMethod = (InternalEObject)refMethod;
      refMethod = (MethodDecl)eResolveProxy(oldRefMethod);
      if (refMethod != oldRefMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.METHOD_IMPL__REF_METHOD, oldRefMethod, refMethod));
      }
    }
    return refMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDecl basicGetRefMethod()
  {
    return refMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefMethod(MethodDecl newRefMethod)
  {
    MethodDecl oldRefMethod = refMethod;
    refMethod = newRefMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.METHOD_IMPL__REF_METHOD, oldRefMethod, refMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockStatement getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(BlockStatement newBody, NotificationChain msgs)
  {
    BlockStatement oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.METHOD_IMPL__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(BlockStatement newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.METHOD_IMPL__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.METHOD_IMPL__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.METHOD_IMPL__BODY, newBody, newBody));
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
      case BehaviorPackage.METHOD_IMPL__BODY:
        return basicSetBody(null, msgs);
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
      case BehaviorPackage.METHOD_IMPL__REF_METHOD:
        if (resolve) return getRefMethod();
        return basicGetRefMethod();
      case BehaviorPackage.METHOD_IMPL__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BehaviorPackage.METHOD_IMPL__REF_METHOD:
        setRefMethod((MethodDecl)newValue);
        return;
      case BehaviorPackage.METHOD_IMPL__BODY:
        setBody((BlockStatement)newValue);
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
      case BehaviorPackage.METHOD_IMPL__REF_METHOD:
        setRefMethod((MethodDecl)null);
        return;
      case BehaviorPackage.METHOD_IMPL__BODY:
        setBody((BlockStatement)null);
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
      case BehaviorPackage.METHOD_IMPL__REF_METHOD:
        return refMethod != null;
      case BehaviorPackage.METHOD_IMPL__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodImplImpl
