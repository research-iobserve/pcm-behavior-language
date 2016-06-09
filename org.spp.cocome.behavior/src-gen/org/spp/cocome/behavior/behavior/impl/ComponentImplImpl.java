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
import org.spp.cocome.behavior.behavior.ComponentKind;
import org.spp.cocome.behavior.behavior.InterfaceRealization;
import org.spp.cocome.behavior.behavior.LifeCycleMethod;

import org.spp.cocome.behavior.mapping.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl#getRefComponent <em>Ref Component</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl#getLocalDeclarations <em>Local Declarations</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl#getPostConstruct <em>Post Construct</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl#getPreDestroy <em>Pre Destroy</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImplImpl extends MinimalEObjectImpl.Container implements ComponentImpl
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final ComponentKind KIND_EDEFAULT = ComponentKind.STATELESS;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected ComponentKind kind = KIND_EDEFAULT;

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
   * The cached value of the '{@link #getPostConstruct() <em>Post Construct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostConstruct()
   * @generated
   * @ordered
   */
  protected LifeCycleMethod postConstruct;

  /**
   * The cached value of the '{@link #getPreDestroy() <em>Pre Destroy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreDestroy()
   * @generated
   * @ordered
   */
  protected LifeCycleMethod preDestroy;

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
  public ComponentKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(ComponentKind newKind)
  {
    ComponentKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPONENT_IMPL__KIND, oldKind, kind));
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
  public LifeCycleMethod getPostConstruct()
  {
    return postConstruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostConstruct(LifeCycleMethod newPostConstruct, NotificationChain msgs)
  {
    LifeCycleMethod oldPostConstruct = postConstruct;
    postConstruct = newPostConstruct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPONENT_IMPL__POST_CONSTRUCT, oldPostConstruct, newPostConstruct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostConstruct(LifeCycleMethod newPostConstruct)
  {
    if (newPostConstruct != postConstruct)
    {
      NotificationChain msgs = null;
      if (postConstruct != null)
        msgs = ((InternalEObject)postConstruct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.COMPONENT_IMPL__POST_CONSTRUCT, null, msgs);
      if (newPostConstruct != null)
        msgs = ((InternalEObject)newPostConstruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.COMPONENT_IMPL__POST_CONSTRUCT, null, msgs);
      msgs = basicSetPostConstruct(newPostConstruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPONENT_IMPL__POST_CONSTRUCT, newPostConstruct, newPostConstruct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LifeCycleMethod getPreDestroy()
  {
    return preDestroy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreDestroy(LifeCycleMethod newPreDestroy, NotificationChain msgs)
  {
    LifeCycleMethod oldPreDestroy = preDestroy;
    preDestroy = newPreDestroy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPONENT_IMPL__PRE_DESTROY, oldPreDestroy, newPreDestroy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreDestroy(LifeCycleMethod newPreDestroy)
  {
    if (newPreDestroy != preDestroy)
    {
      NotificationChain msgs = null;
      if (preDestroy != null)
        msgs = ((InternalEObject)preDestroy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.COMPONENT_IMPL__PRE_DESTROY, null, msgs);
      if (newPreDestroy != null)
        msgs = ((InternalEObject)newPreDestroy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.COMPONENT_IMPL__PRE_DESTROY, null, msgs);
      msgs = basicSetPreDestroy(newPreDestroy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPONENT_IMPL__PRE_DESTROY, newPreDestroy, newPreDestroy));
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
      case BehaviorPackage.COMPONENT_IMPL__POST_CONSTRUCT:
        return basicSetPostConstruct(null, msgs);
      case BehaviorPackage.COMPONENT_IMPL__PRE_DESTROY:
        return basicSetPreDestroy(null, msgs);
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
      case BehaviorPackage.COMPONENT_IMPL__KIND:
        return getKind();
      case BehaviorPackage.COMPONENT_IMPL__REF_COMPONENT:
        if (resolve) return getRefComponent();
        return basicGetRefComponent();
      case BehaviorPackage.COMPONENT_IMPL__LOCAL_DECLARATIONS:
        return getLocalDeclarations();
      case BehaviorPackage.COMPONENT_IMPL__POST_CONSTRUCT:
        return getPostConstruct();
      case BehaviorPackage.COMPONENT_IMPL__PRE_DESTROY:
        return getPreDestroy();
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
      case BehaviorPackage.COMPONENT_IMPL__KIND:
        setKind((ComponentKind)newValue);
        return;
      case BehaviorPackage.COMPONENT_IMPL__REF_COMPONENT:
        setRefComponent((Component)newValue);
        return;
      case BehaviorPackage.COMPONENT_IMPL__LOCAL_DECLARATIONS:
        getLocalDeclarations().clear();
        getLocalDeclarations().addAll((Collection<? extends EObject>)newValue);
        return;
      case BehaviorPackage.COMPONENT_IMPL__POST_CONSTRUCT:
        setPostConstruct((LifeCycleMethod)newValue);
        return;
      case BehaviorPackage.COMPONENT_IMPL__PRE_DESTROY:
        setPreDestroy((LifeCycleMethod)newValue);
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
      case BehaviorPackage.COMPONENT_IMPL__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case BehaviorPackage.COMPONENT_IMPL__REF_COMPONENT:
        setRefComponent((Component)null);
        return;
      case BehaviorPackage.COMPONENT_IMPL__LOCAL_DECLARATIONS:
        getLocalDeclarations().clear();
        return;
      case BehaviorPackage.COMPONENT_IMPL__POST_CONSTRUCT:
        setPostConstruct((LifeCycleMethod)null);
        return;
      case BehaviorPackage.COMPONENT_IMPL__PRE_DESTROY:
        setPreDestroy((LifeCycleMethod)null);
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
      case BehaviorPackage.COMPONENT_IMPL__KIND:
        return kind != KIND_EDEFAULT;
      case BehaviorPackage.COMPONENT_IMPL__REF_COMPONENT:
        return refComponent != null;
      case BehaviorPackage.COMPONENT_IMPL__LOCAL_DECLARATIONS:
        return localDeclarations != null && !localDeclarations.isEmpty();
      case BehaviorPackage.COMPONENT_IMPL__POST_CONSTRUCT:
        return postConstruct != null;
      case BehaviorPackage.COMPONENT_IMPL__PRE_DESTROY:
        return preDestroy != null;
      case BehaviorPackage.COMPONENT_IMPL__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (kind: ");
    result.append(kind);
    result.append(')');
    return result.toString();
  }

} //ComponentImplImpl
