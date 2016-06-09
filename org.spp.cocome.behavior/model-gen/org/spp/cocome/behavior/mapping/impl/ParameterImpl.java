/**
 */
package org.spp.cocome.behavior.mapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.spp.cocome.behavior.mapping.MappingPackage;
import org.spp.cocome.behavior.mapping.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.mapping.impl.ParameterImpl#getPcmParameter <em>Pcm Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends TypedValueImpl implements Parameter {
	/**
	 * The cached value of the '{@link #getPcmParameter() <em>Pcm Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmParameter()
	 * @generated
	 * @ordered
	 */
	protected org.palladiosimulator.pcm.repository.Parameter pcmParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.repository.Parameter getPcmParameter() {
		if (pcmParameter != null && ((EObject)pcmParameter).eIsProxy()) {
			InternalEObject oldPcmParameter = (InternalEObject)pcmParameter;
			pcmParameter = (org.palladiosimulator.pcm.repository.Parameter)eResolveProxy(oldPcmParameter);
			if (pcmParameter != oldPcmParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.PARAMETER__PCM_PARAMETER, oldPcmParameter, pcmParameter));
			}
		}
		return pcmParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.repository.Parameter basicGetPcmParameter() {
		return pcmParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmParameter(org.palladiosimulator.pcm.repository.Parameter newPcmParameter) {
		org.palladiosimulator.pcm.repository.Parameter oldPcmParameter = pcmParameter;
		pcmParameter = newPcmParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.PARAMETER__PCM_PARAMETER, oldPcmParameter, pcmParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.PARAMETER__PCM_PARAMETER:
				if (resolve) return getPcmParameter();
				return basicGetPcmParameter();
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
			case MappingPackage.PARAMETER__PCM_PARAMETER:
				setPcmParameter((org.palladiosimulator.pcm.repository.Parameter)newValue);
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
			case MappingPackage.PARAMETER__PCM_PARAMETER:
				setPcmParameter((org.palladiosimulator.pcm.repository.Parameter)null);
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
			case MappingPackage.PARAMETER__PCM_PARAMETER:
				return pcmParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterImpl
