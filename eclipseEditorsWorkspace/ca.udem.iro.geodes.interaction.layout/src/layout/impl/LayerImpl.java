/**
 */
package layout.impl;

import java.util.Collection;

import layout.Anchor;
import layout.Element;
import layout.Layer;
import layout.LayoutPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link layout.impl.LayerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link layout.impl.LayerImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link layout.impl.LayerImpl#getHasElements <em>Has Elements</em>}</li>
 *   <li>{@link layout.impl.LayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link layout.impl.LayerImpl#getAnchors <em>Anchors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerImpl extends MinimalEObjectImpl.Container implements Layer {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasElements() <em>Has Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> hasElements;

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
	 * The cached value of the '{@link #getAnchors() <em>Anchors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchors()
	 * @generated
	 * @ordered
	 */
	protected EList<Anchor> anchors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefault(boolean newIsDefault) {
		boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYER__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getHasElements() {
		if (hasElements == null) {
			hasElements = new EObjectContainmentEList<Element>(Element.class, this, LayoutPackage.LAYER__HAS_ELEMENTS);
		}
		return hasElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Anchor> getAnchors() {
		if (anchors == null) {
			anchors = new EObjectContainmentEList<Anchor>(Anchor.class, this, LayoutPackage.LAYER__ANCHORS);
		}
		return anchors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.LAYER__HAS_ELEMENTS:
				return ((InternalEList<?>)getHasElements()).basicRemove(otherEnd, msgs);
			case LayoutPackage.LAYER__ANCHORS:
				return ((InternalEList<?>)getAnchors()).basicRemove(otherEnd, msgs);
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
			case LayoutPackage.LAYER__POSITION:
				return getPosition();
			case LayoutPackage.LAYER__IS_DEFAULT:
				return isIsDefault();
			case LayoutPackage.LAYER__HAS_ELEMENTS:
				return getHasElements();
			case LayoutPackage.LAYER__NAME:
				return getName();
			case LayoutPackage.LAYER__ANCHORS:
				return getAnchors();
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
			case LayoutPackage.LAYER__POSITION:
				setPosition((Integer)newValue);
				return;
			case LayoutPackage.LAYER__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case LayoutPackage.LAYER__HAS_ELEMENTS:
				getHasElements().clear();
				getHasElements().addAll((Collection<? extends Element>)newValue);
				return;
			case LayoutPackage.LAYER__NAME:
				setName((String)newValue);
				return;
			case LayoutPackage.LAYER__ANCHORS:
				getAnchors().clear();
				getAnchors().addAll((Collection<? extends Anchor>)newValue);
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
			case LayoutPackage.LAYER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case LayoutPackage.LAYER__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case LayoutPackage.LAYER__HAS_ELEMENTS:
				getHasElements().clear();
				return;
			case LayoutPackage.LAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LayoutPackage.LAYER__ANCHORS:
				getAnchors().clear();
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
			case LayoutPackage.LAYER__POSITION:
				return position != POSITION_EDEFAULT;
			case LayoutPackage.LAYER__IS_DEFAULT:
				return isDefault != IS_DEFAULT_EDEFAULT;
			case LayoutPackage.LAYER__HAS_ELEMENTS:
				return hasElements != null && !hasElements.isEmpty();
			case LayoutPackage.LAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LayoutPackage.LAYER__ANCHORS:
				return anchors != null && !anchors.isEmpty();
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
		result.append(" (position: ");
		result.append(position);
		result.append(", isDefault: ");
		result.append(isDefault);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LayerImpl
