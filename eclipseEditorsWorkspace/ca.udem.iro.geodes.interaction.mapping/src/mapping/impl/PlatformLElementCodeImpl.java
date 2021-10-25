/**
 */
package mapping.impl;

import java.util.Collection;

import mapping.CodeLine;
import mapping.MappingPackage;
import mapping.PlatformLElementCode;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform LElement Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapping.impl.PlatformLElementCodeImpl#getCreateCode <em>Create Code</em>}</li>
 *   <li>{@link mapping.impl.PlatformLElementCodeImpl#getUpdateCode <em>Update Code</em>}</li>
 *   <li>{@link mapping.impl.PlatformLElementCodeImpl#getDeleteCode <em>Delete Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformLElementCodeImpl extends MinimalEObjectImpl.Container implements PlatformLElementCode {
	/**
	 * The cached value of the '{@link #getCreateCode() <em>Create Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeLine> createCode;

	/**
	 * The cached value of the '{@link #getUpdateCode() <em>Update Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeLine> updateCode;

	/**
	 * The cached value of the '{@link #getDeleteCode() <em>Delete Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeLine> deleteCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformLElementCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.PLATFORM_LELEMENT_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeLine> getCreateCode() {
		if (createCode == null) {
			createCode = new EObjectContainmentEList<CodeLine>(CodeLine.class, this, MappingPackage.PLATFORM_LELEMENT_CODE__CREATE_CODE);
		}
		return createCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeLine> getUpdateCode() {
		if (updateCode == null) {
			updateCode = new EObjectContainmentEList<CodeLine>(CodeLine.class, this, MappingPackage.PLATFORM_LELEMENT_CODE__UPDATE_CODE);
		}
		return updateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeLine> getDeleteCode() {
		if (deleteCode == null) {
			deleteCode = new EObjectContainmentEList<CodeLine>(CodeLine.class, this, MappingPackage.PLATFORM_LELEMENT_CODE__DELETE_CODE);
		}
		return deleteCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.PLATFORM_LELEMENT_CODE__CREATE_CODE:
				return ((InternalEList<?>)getCreateCode()).basicRemove(otherEnd, msgs);
			case MappingPackage.PLATFORM_LELEMENT_CODE__UPDATE_CODE:
				return ((InternalEList<?>)getUpdateCode()).basicRemove(otherEnd, msgs);
			case MappingPackage.PLATFORM_LELEMENT_CODE__DELETE_CODE:
				return ((InternalEList<?>)getDeleteCode()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.PLATFORM_LELEMENT_CODE__CREATE_CODE:
				return getCreateCode();
			case MappingPackage.PLATFORM_LELEMENT_CODE__UPDATE_CODE:
				return getUpdateCode();
			case MappingPackage.PLATFORM_LELEMENT_CODE__DELETE_CODE:
				return getDeleteCode();
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
			case MappingPackage.PLATFORM_LELEMENT_CODE__CREATE_CODE:
				getCreateCode().clear();
				getCreateCode().addAll((Collection<? extends CodeLine>)newValue);
				return;
			case MappingPackage.PLATFORM_LELEMENT_CODE__UPDATE_CODE:
				getUpdateCode().clear();
				getUpdateCode().addAll((Collection<? extends CodeLine>)newValue);
				return;
			case MappingPackage.PLATFORM_LELEMENT_CODE__DELETE_CODE:
				getDeleteCode().clear();
				getDeleteCode().addAll((Collection<? extends CodeLine>)newValue);
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
			case MappingPackage.PLATFORM_LELEMENT_CODE__CREATE_CODE:
				getCreateCode().clear();
				return;
			case MappingPackage.PLATFORM_LELEMENT_CODE__UPDATE_CODE:
				getUpdateCode().clear();
				return;
			case MappingPackage.PLATFORM_LELEMENT_CODE__DELETE_CODE:
				getDeleteCode().clear();
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
			case MappingPackage.PLATFORM_LELEMENT_CODE__CREATE_CODE:
				return createCode != null && !createCode.isEmpty();
			case MappingPackage.PLATFORM_LELEMENT_CODE__UPDATE_CODE:
				return updateCode != null && !updateCode.isEmpty();
			case MappingPackage.PLATFORM_LELEMENT_CODE__DELETE_CODE:
				return deleteCode != null && !deleteCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformLElementCodeImpl
