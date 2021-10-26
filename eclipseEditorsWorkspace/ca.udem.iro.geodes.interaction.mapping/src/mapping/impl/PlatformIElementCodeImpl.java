/**
 */
package mapping.impl;

import java.util.Collection;

import mapping.CodeLine;
import mapping.MappingPackage;
import mapping.PlatformIElementCode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform IElement Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapping.impl.PlatformIElementCodeImpl#getSetterCode <em>Setter Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformIElementCodeImpl extends MinimalEObjectImpl.Container implements PlatformIElementCode {
	/**
	 * The cached value of the '{@link #getSetterCode() <em>Setter Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeLine> setterCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformIElementCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.PLATFORM_IELEMENT_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeLine> getSetterCode() {
		if (setterCode == null) {
			setterCode = new EObjectResolvingEList<CodeLine>(CodeLine.class, this, MappingPackage.PLATFORM_IELEMENT_CODE__SETTER_CODE);
		}
		return setterCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.PLATFORM_IELEMENT_CODE__SETTER_CODE:
				return getSetterCode();
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
			case MappingPackage.PLATFORM_IELEMENT_CODE__SETTER_CODE:
				getSetterCode().clear();
				getSetterCode().addAll((Collection<? extends CodeLine>)newValue);
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
			case MappingPackage.PLATFORM_IELEMENT_CODE__SETTER_CODE:
				getSetterCode().clear();
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
			case MappingPackage.PLATFORM_IELEMENT_CODE__SETTER_CODE:
				return setterCode != null && !setterCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformIElementCodeImpl
