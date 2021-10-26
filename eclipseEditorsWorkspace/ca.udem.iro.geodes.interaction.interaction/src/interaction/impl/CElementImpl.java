/**
 */
package interaction.impl;

import interaction.CElement;
import interaction.InteractionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CElement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interaction.impl.CElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link interaction.impl.CElementImpl#isIsNegative <em>Is Negative</em>}</li>
 *   <li>{@link interaction.impl.CElementImpl#isIsFocus <em>Is Focus</em>}</li>
 *   <li>{@link interaction.impl.CElementImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CElementImpl extends MinimalEObjectImpl.Container implements CElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNegative() <em>Is Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNegative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NEGATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNegative() <em>Is Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNegative()
	 * @generated
	 * @ordered
	 */
	protected boolean isNegative = IS_NEGATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFocus() <em>Is Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFocus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FOCUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFocus() <em>Is Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFocus()
	 * @generated
	 * @ordered
	 */
	protected boolean isFocus = IS_FOCUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.CELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.CELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNegative() {
		return isNegative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNegative(boolean newIsNegative) {
		boolean oldIsNegative = isNegative;
		isNegative = newIsNegative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.CELEMENT__IS_NEGATIVE, oldIsNegative, isNegative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFocus() {
		return isFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFocus(boolean newIsFocus) {
		boolean oldIsFocus = isFocus;
		isFocus = newIsFocus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.CELEMENT__IS_FOCUS, oldIsFocus, isFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.CELEMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.CELEMENT__ID:
				return getId();
			case InteractionPackage.CELEMENT__IS_NEGATIVE:
				return isIsNegative();
			case InteractionPackage.CELEMENT__IS_FOCUS:
				return isIsFocus();
			case InteractionPackage.CELEMENT__VALUE:
				return getValue();
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
			case InteractionPackage.CELEMENT__ID:
				setId((String)newValue);
				return;
			case InteractionPackage.CELEMENT__IS_NEGATIVE:
				setIsNegative((Boolean)newValue);
				return;
			case InteractionPackage.CELEMENT__IS_FOCUS:
				setIsFocus((Boolean)newValue);
				return;
			case InteractionPackage.CELEMENT__VALUE:
				setValue((String)newValue);
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
			case InteractionPackage.CELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case InteractionPackage.CELEMENT__IS_NEGATIVE:
				setIsNegative(IS_NEGATIVE_EDEFAULT);
				return;
			case InteractionPackage.CELEMENT__IS_FOCUS:
				setIsFocus(IS_FOCUS_EDEFAULT);
				return;
			case InteractionPackage.CELEMENT__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case InteractionPackage.CELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case InteractionPackage.CELEMENT__IS_NEGATIVE:
				return isNegative != IS_NEGATIVE_EDEFAULT;
			case InteractionPackage.CELEMENT__IS_FOCUS:
				return isFocus != IS_FOCUS_EDEFAULT;
			case InteractionPackage.CELEMENT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", isNegative: ");
		result.append(isNegative);
		result.append(", isFocus: ");
		result.append(isFocus);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //CElementImpl
