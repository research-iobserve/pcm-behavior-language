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
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.spp.cocome.behavior.mapping.Interface;
import org.spp.cocome.behavior.mapping.MappingPackage;
import org.spp.cocome.behavior.mapping.MethodDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.mapping.impl.InterfaceImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.spp.cocome.behavior.mapping.impl.InterfaceImpl#getPcmInterface <em>Pcm Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends NamedElementImpl implements Interface {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDecl> methods;
	/**
	 * The cached value of the '{@link #getPcmInterface() <em>Pcm Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmInterface()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole pcmInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodDecl> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<MethodDecl>(MethodDecl.class, this, MappingPackage.INTERFACE__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getPcmInterface() {
		if (pcmInterface != null && ((EObject)pcmInterface).eIsProxy()) {
			InternalEObject oldPcmInterface = (InternalEObject)pcmInterface;
			pcmInterface = (ProvidedRole)eResolveProxy(oldPcmInterface);
			if (pcmInterface != oldPcmInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.INTERFACE__PCM_INTERFACE, oldPcmInterface, pcmInterface));
			}
		}
		return pcmInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetPcmInterface() {
		return pcmInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmInterface(ProvidedRole newPcmInterface) {
		ProvidedRole oldPcmInterface = pcmInterface;
		pcmInterface = newPcmInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.INTERFACE__PCM_INTERFACE, oldPcmInterface, pcmInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.INTERFACE__METHODS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.INTERFACE__METHODS:
				return getMethods();
			case MappingPackage.INTERFACE__PCM_INTERFACE:
				if (resolve) return getPcmInterface();
				return basicGetPcmInterface();
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
			case MappingPackage.INTERFACE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends MethodDecl>)newValue);
				return;
			case MappingPackage.INTERFACE__PCM_INTERFACE:
				setPcmInterface((ProvidedRole)newValue);
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
			case MappingPackage.INTERFACE__METHODS:
				getMethods().clear();
				return;
			case MappingPackage.INTERFACE__PCM_INTERFACE:
				setPcmInterface((ProvidedRole)null);
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
			case MappingPackage.INTERFACE__METHODS:
				return methods != null && !methods.isEmpty();
			case MappingPackage.INTERFACE__PCM_INTERFACE:
				return pcmInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
