/**
 */
package org.spp.cocome.behavior.behavior;

import org.eclipse.emf.ecore.EObject;

import org.spp.cocome.types.types.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.PropertyCall#getProperty <em>Property</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.PropertyCall#getIndex <em>Index</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.behavior.PropertyCall#getSubProperty <em>Sub Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getPropertyCall()
 * @model
 * @generated
 */
public interface PropertyCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(Property)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getPropertyCall_Property()
   * @model
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.PropertyCall#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(Expression)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getPropertyCall_Index()
   * @model containment="true"
   * @generated
   */
  Expression getIndex();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.PropertyCall#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Expression value);

  /**
   * Returns the value of the '<em><b>Sub Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Property</em>' containment reference.
   * @see #setSubProperty(PropertyCall)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getPropertyCall_SubProperty()
   * @model containment="true"
   * @generated
   */
  PropertyCall getSubProperty();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.PropertyCall#getSubProperty <em>Sub Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Property</em>' containment reference.
   * @see #getSubProperty()
   * @generated
   */
  void setSubProperty(PropertyCall value);

} // PropertyCall
