/**
 */
package org.spp.cocome.behavior.behavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.spp.cocome.behavior.behavior.BehaviorPackage;
import org.spp.cocome.behavior.behavior.Expression;
import org.spp.cocome.behavior.behavior.PropertyCall;
import org.spp.cocome.behavior.behavior.VariableCall;
import org.spp.cocome.behavior.behavior.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.VariableCallImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.VariableCallImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.impl.VariableCallImpl#getSubProperty <em>Sub Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableCallImpl extends ExpressionImpl implements VariableCall
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VariableDecl variable;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected Expression index;

  /**
   * The cached value of the '{@link #getSubProperty() <em>Sub Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubProperty()
   * @generated
   * @ordered
   */
  protected PropertyCall subProperty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableCallImpl()
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
    return BehaviorPackage.Literals.VARIABLE_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (VariableDecl)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.VARIABLE_CALL__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(VariableDecl newVariable)
  {
    VariableDecl oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_CALL__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(Expression newIndex, NotificationChain msgs)
  {
    Expression oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_CALL__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(Expression newIndex)
  {
    if (newIndex != index)
    {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE_CALL__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE_CALL__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_CALL__INDEX, newIndex, newIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyCall getSubProperty()
  {
    return subProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubProperty(PropertyCall newSubProperty, NotificationChain msgs)
  {
    PropertyCall oldSubProperty = subProperty;
    subProperty = newSubProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_CALL__SUB_PROPERTY, oldSubProperty, newSubProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubProperty(PropertyCall newSubProperty)
  {
    if (newSubProperty != subProperty)
    {
      NotificationChain msgs = null;
      if (subProperty != null)
        msgs = ((InternalEObject)subProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE_CALL__SUB_PROPERTY, null, msgs);
      if (newSubProperty != null)
        msgs = ((InternalEObject)newSubProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.VARIABLE_CALL__SUB_PROPERTY, null, msgs);
      msgs = basicSetSubProperty(newSubProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.VARIABLE_CALL__SUB_PROPERTY, newSubProperty, newSubProperty));
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
      case BehaviorPackage.VARIABLE_CALL__INDEX:
        return basicSetIndex(null, msgs);
      case BehaviorPackage.VARIABLE_CALL__SUB_PROPERTY:
        return basicSetSubProperty(null, msgs);
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
      case BehaviorPackage.VARIABLE_CALL__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case BehaviorPackage.VARIABLE_CALL__INDEX:
        return getIndex();
      case BehaviorPackage.VARIABLE_CALL__SUB_PROPERTY:
        return getSubProperty();
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
      case BehaviorPackage.VARIABLE_CALL__VARIABLE:
        setVariable((VariableDecl)newValue);
        return;
      case BehaviorPackage.VARIABLE_CALL__INDEX:
        setIndex((Expression)newValue);
        return;
      case BehaviorPackage.VARIABLE_CALL__SUB_PROPERTY:
        setSubProperty((PropertyCall)newValue);
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
      case BehaviorPackage.VARIABLE_CALL__VARIABLE:
        setVariable((VariableDecl)null);
        return;
      case BehaviorPackage.VARIABLE_CALL__INDEX:
        setIndex((Expression)null);
        return;
      case BehaviorPackage.VARIABLE_CALL__SUB_PROPERTY:
        setSubProperty((PropertyCall)null);
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
      case BehaviorPackage.VARIABLE_CALL__VARIABLE:
        return variable != null;
      case BehaviorPackage.VARIABLE_CALL__INDEX:
        return index != null;
      case BehaviorPackage.VARIABLE_CALL__SUB_PROPERTY:
        return subProperty != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableCallImpl
