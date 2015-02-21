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

import org.spp.cocome.behavior.behavior.BehaviorModel;
import org.spp.cocome.behavior.behavior.BehaviorPackage;
import org.spp.cocome.behavior.behavior.ComponentImpl;
import org.spp.cocome.behavior.behavior.Import;
import org.spp.cocome.behavior.behavior.RepositoryReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.BehaviorModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.BehaviorModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.BehaviorModelImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.BehaviorModelImpl#getComponentImpl <em>Component Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorModelImpl extends MinimalEObjectImpl.Container implements BehaviorModel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositories()
   * @generated
   * @ordered
   */
  protected EList<RepositoryReference> repositories;

  /**
   * The cached value of the '{@link #getComponentImpl() <em>Component Impl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentImpl()
   * @generated
   * @ordered
   */
  protected ComponentImpl componentImpl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BehaviorModelImpl()
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
    return BehaviorPackage.Literals.BEHAVIOR_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, BehaviorPackage.BEHAVIOR_MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RepositoryReference> getRepositories()
  {
    if (repositories == null)
    {
      repositories = new EObjectContainmentEList<RepositoryReference>(RepositoryReference.class, this, BehaviorPackage.BEHAVIOR_MODEL__REPOSITORIES);
    }
    return repositories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImpl getComponentImpl()
  {
    return componentImpl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponentImpl(ComponentImpl newComponentImpl, NotificationChain msgs)
  {
    ComponentImpl oldComponentImpl = componentImpl;
    componentImpl = newComponentImpl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_MODEL__COMPONENT_IMPL, oldComponentImpl, newComponentImpl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentImpl(ComponentImpl newComponentImpl)
  {
    if (newComponentImpl != componentImpl)
    {
      NotificationChain msgs = null;
      if (componentImpl != null)
        msgs = ((InternalEObject)componentImpl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BEHAVIOR_MODEL__COMPONENT_IMPL, null, msgs);
      if (newComponentImpl != null)
        msgs = ((InternalEObject)newComponentImpl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.BEHAVIOR_MODEL__COMPONENT_IMPL, null, msgs);
      msgs = basicSetComponentImpl(newComponentImpl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_MODEL__COMPONENT_IMPL, newComponentImpl, newComponentImpl));
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
      case BehaviorPackage.BEHAVIOR_MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case BehaviorPackage.BEHAVIOR_MODEL__REPOSITORIES:
        return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
      case BehaviorPackage.BEHAVIOR_MODEL__COMPONENT_IMPL:
        return basicSetComponentImpl(null, msgs);
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
      case BehaviorPackage.BEHAVIOR_MODEL__NAME:
        return getName();
      case BehaviorPackage.BEHAVIOR_MODEL__IMPORTS:
        return getImports();
      case BehaviorPackage.BEHAVIOR_MODEL__REPOSITORIES:
        return getRepositories();
      case BehaviorPackage.BEHAVIOR_MODEL__COMPONENT_IMPL:
        return getComponentImpl();
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
      case BehaviorPackage.BEHAVIOR_MODEL__NAME:
        setName((String)newValue);
        return;
      case BehaviorPackage.BEHAVIOR_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case BehaviorPackage.BEHAVIOR_MODEL__REPOSITORIES:
        getRepositories().clear();
        getRepositories().addAll((Collection<? extends RepositoryReference>)newValue);
        return;
      case BehaviorPackage.BEHAVIOR_MODEL__COMPONENT_IMPL:
        setComponentImpl((ComponentImpl)newValue);
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
      case BehaviorPackage.BEHAVIOR_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BehaviorPackage.BEHAVIOR_MODEL__IMPORTS:
        getImports().clear();
        return;
      case BehaviorPackage.BEHAVIOR_MODEL__REPOSITORIES:
        getRepositories().clear();
        return;
      case BehaviorPackage.BEHAVIOR_MODEL__COMPONENT_IMPL:
        setComponentImpl((ComponentImpl)null);
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
      case BehaviorPackage.BEHAVIOR_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BehaviorPackage.BEHAVIOR_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case BehaviorPackage.BEHAVIOR_MODEL__REPOSITORIES:
        return repositories != null && !repositories.isEmpty();
      case BehaviorPackage.BEHAVIOR_MODEL__COMPONENT_IMPL:
        return componentImpl != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BehaviorModelImpl
