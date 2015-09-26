/**
 */
package org.spp.cocome.behavior.mapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.spp.cocome.behavior.mapping.MappingPackage;
import org.spp.cocome.behavior.mapping.MethodDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.mapping.impl.MethodDeclImpl#getPcmMethod <em>Pcm Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclImpl extends NamedElementImpl implements MethodDecl {
	/**
	 * The cached value of the '{@link #getPcmMethod() <em>Pcm Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmMethod()
	 * @generated
	 * @ordered
	 */
	protected org.palladiosimulator.pcm.repository.Signature pcmMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.METHOD_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.repository.Signature getPcmMethod() {
		if (pcmMethod != null && ((EObject)pcmMethod).eIsProxy()) {
			InternalEObject oldPcmMethod = (InternalEObject)pcmMethod;
			pcmMethod = (org.palladiosimulator.pcm.repository.Signature)eResolveProxy(oldPcmMethod);
			if (pcmMethod != oldPcmMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.METHOD_DECL__PCM_METHOD, oldPcmMethod, pcmMethod));
			}
		}
		return pcmMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.repository.Signature basicGetPcmMethod() {
		return pcmMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmMethod(org.palladiosimulator.pcm.repository.Signature newPcmMethod) {
		org.palladiosimulator.pcm.repository.Signature oldPcmMethod = pcmMethod;
		pcmMethod = newPcmMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.METHOD_DECL__PCM_METHOD, oldPcmMethod, pcmMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.METHOD_DECL__PCM_METHOD:
				if (resolve) return getPcmMethod();
				return basicGetPcmMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingPackage.METHOD_DECL__PCM_METHOD:
				setPcmMethod((org.palladiosimulator.pcm.repository.Signature)newValue);
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
			case MappingPackage.METHOD_DECL__PCM_METHOD:
				setPcmMethod((org.palladiosimulator.pcm.repository.Signature)null);
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
			case MappingPackage.METHOD_DECL__PCM_METHOD:
				return pcmMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodDeclImpl
