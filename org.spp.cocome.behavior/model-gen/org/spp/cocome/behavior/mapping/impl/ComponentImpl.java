/**
 */
package org.spp.cocome.behavior.mapping.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.spp.cocome.behavior.mapping.Component;
import org.spp.cocome.behavior.mapping.Interface;
import org.spp.cocome.behavior.mapping.MappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.mapping.impl.ComponentImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.mapping.impl.ComponentImpl#getPcmComponent <em>Pcm Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;
	/**
	 * The cached value of the '{@link #getPcmComponent() <em>Pcm Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmComponent()
	 * @generated
	 * @ordered
	 */
	protected org.palladiosimulator.pcm.repository.ImplementationComponentType pcmComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, MappingPackage.COMPONENT__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.repository.ImplementationComponentType getPcmComponent() {
		if (pcmComponent != null && ((EObject)pcmComponent).eIsProxy()) {
			InternalEObject oldPcmComponent = (InternalEObject)pcmComponent;
			pcmComponent = (org.palladiosimulator.pcm.repository.ImplementationComponentType)eResolveProxy(oldPcmComponent);
			if (pcmComponent != oldPcmComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.COMPONENT__PCM_COMPONENT, oldPcmComponent, pcmComponent));
			}
		}
		return pcmComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.repository.ImplementationComponentType basicGetPcmComponent() {
		return pcmComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmComponent(org.palladiosimulator.pcm.repository.ImplementationComponentType newPcmComponent) {
		org.palladiosimulator.pcm.repository.ImplementationComponentType oldPcmComponent = pcmComponent;
		pcmComponent = newPcmComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COMPONENT__PCM_COMPONENT, oldPcmComponent, pcmComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.COMPONENT__INTERFACES:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.COMPONENT__INTERFACES:
				return getInterfaces();
			case MappingPackage.COMPONENT__PCM_COMPONENT:
				if (resolve) return getPcmComponent();
				return basicGetPcmComponent();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingPackage.COMPONENT__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case MappingPackage.COMPONENT__PCM_COMPONENT:
				setPcmComponent((org.palladiosimulator.pcm.repository.ImplementationComponentType)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MappingPackage.COMPONENT__INTERFACES:
				getInterfaces().clear();
				return;
			case MappingPackage.COMPONENT__PCM_COMPONENT:
				setPcmComponent((org.palladiosimulator.pcm.repository.ImplementationComponentType)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MappingPackage.COMPONENT__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case MappingPackage.COMPONENT__PCM_COMPONENT:
				return pcmComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
