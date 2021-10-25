/**
 */
package layout.impl;

import layout.LayoutPackage;
import layout.RelAnchor;
import layout.XAlign;
import layout.YAlign;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rel Anchor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link layout.impl.RelAnchorImpl#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link layout.impl.RelAnchorImpl#getYAxis <em>YAxis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelAnchorImpl extends AnchorImpl implements RelAnchor {
	/**
	 * The default value of the '{@link #getXAxis() <em>XAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxis()
	 * @generated
	 * @ordered
	 */
	protected static final XAlign XAXIS_EDEFAULT = XAlign.MIDLE;

	/**
	 * The cached value of the '{@link #getXAxis() <em>XAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxis()
	 * @generated
	 * @ordered
	 */
	protected XAlign xAxis = XAXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxis() <em>YAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxis()
	 * @generated
	 * @ordered
	 */
	protected static final YAlign YAXIS_EDEFAULT = YAlign.MIDLE;

	/**
	 * The cached value of the '{@link #getYAxis() <em>YAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxis()
	 * @generated
	 * @ordered
	 */
	protected YAlign yAxis = YAXIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelAnchorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.REL_ANCHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAlign getXAxis() {
		return xAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxis(XAlign newXAxis) {
		XAlign oldXAxis = xAxis;
		xAxis = newXAxis == null ? XAXIS_EDEFAULT : newXAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.REL_ANCHOR__XAXIS, oldXAxis, xAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAlign getYAxis() {
		return yAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAxis(YAlign newYAxis) {
		YAlign oldYAxis = yAxis;
		yAxis = newYAxis == null ? YAXIS_EDEFAULT : newYAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.REL_ANCHOR__YAXIS, oldYAxis, yAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.REL_ANCHOR__XAXIS:
				return getXAxis();
			case LayoutPackage.REL_ANCHOR__YAXIS:
				return getYAxis();
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
			case LayoutPackage.REL_ANCHOR__XAXIS:
				setXAxis((XAlign)newValue);
				return;
			case LayoutPackage.REL_ANCHOR__YAXIS:
				setYAxis((YAlign)newValue);
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
			case LayoutPackage.REL_ANCHOR__XAXIS:
				setXAxis(XAXIS_EDEFAULT);
				return;
			case LayoutPackage.REL_ANCHOR__YAXIS:
				setYAxis(YAXIS_EDEFAULT);
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
			case LayoutPackage.REL_ANCHOR__XAXIS:
				return xAxis != XAXIS_EDEFAULT;
			case LayoutPackage.REL_ANCHOR__YAXIS:
				return yAxis != YAXIS_EDEFAULT;
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
		result.append(" (XAxis: ");
		result.append(xAxis);
		result.append(", YAxis: ");
		result.append(yAxis);
		result.append(')');
		return result.toString();
	}

} //RelAnchorImpl
