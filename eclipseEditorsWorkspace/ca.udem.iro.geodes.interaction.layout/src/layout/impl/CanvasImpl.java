/**
 */
package layout.impl;

import layout.Canvas;
import layout.LayoutPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link layout.impl.CanvasImpl#getActive <em>Active</em>}</li>
 *   <li>{@link layout.impl.CanvasImpl#getGridSizeX <em>Grid Size X</em>}</li>
 *   <li>{@link layout.impl.CanvasImpl#getGridSizeY <em>Grid Size Y</em>}</li>
 *   <li>{@link layout.impl.CanvasImpl#getGridScale <em>Grid Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CanvasImpl extends ElementImpl implements Canvas {
	/**
	 * The default value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected String active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGridSizeX() <em>Grid Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSizeX()
	 * @generated
	 * @ordered
	 */
	protected static final int GRID_SIZE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGridSizeX() <em>Grid Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSizeX()
	 * @generated
	 * @ordered
	 */
	protected int gridSizeX = GRID_SIZE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getGridSizeY() <em>Grid Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSizeY()
	 * @generated
	 * @ordered
	 */
	protected static final int GRID_SIZE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGridSizeY() <em>Grid Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSizeY()
	 * @generated
	 * @ordered
	 */
	protected int gridSizeY = GRID_SIZE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getGridScale() <em>Grid Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridScale()
	 * @generated
	 * @ordered
	 */
	protected static final int GRID_SCALE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGridScale() <em>Grid Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridScale()
	 * @generated
	 * @ordered
	 */
	protected int gridScale = GRID_SCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.CANVAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(String newActive) {
		String oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.CANVAS__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridSizeX() {
		return gridSizeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridSizeX(int newGridSizeX) {
		int oldGridSizeX = gridSizeX;
		gridSizeX = newGridSizeX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.CANVAS__GRID_SIZE_X, oldGridSizeX, gridSizeX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridSizeY() {
		return gridSizeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridSizeY(int newGridSizeY) {
		int oldGridSizeY = gridSizeY;
		gridSizeY = newGridSizeY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.CANVAS__GRID_SIZE_Y, oldGridSizeY, gridSizeY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridScale() {
		return gridScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridScale(int newGridScale) {
		int oldGridScale = gridScale;
		gridScale = newGridScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.CANVAS__GRID_SCALE, oldGridScale, gridScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.CANVAS__ACTIVE:
				return getActive();
			case LayoutPackage.CANVAS__GRID_SIZE_X:
				return getGridSizeX();
			case LayoutPackage.CANVAS__GRID_SIZE_Y:
				return getGridSizeY();
			case LayoutPackage.CANVAS__GRID_SCALE:
				return getGridScale();
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
			case LayoutPackage.CANVAS__ACTIVE:
				setActive((String)newValue);
				return;
			case LayoutPackage.CANVAS__GRID_SIZE_X:
				setGridSizeX((Integer)newValue);
				return;
			case LayoutPackage.CANVAS__GRID_SIZE_Y:
				setGridSizeY((Integer)newValue);
				return;
			case LayoutPackage.CANVAS__GRID_SCALE:
				setGridScale((Integer)newValue);
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
			case LayoutPackage.CANVAS__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case LayoutPackage.CANVAS__GRID_SIZE_X:
				setGridSizeX(GRID_SIZE_X_EDEFAULT);
				return;
			case LayoutPackage.CANVAS__GRID_SIZE_Y:
				setGridSizeY(GRID_SIZE_Y_EDEFAULT);
				return;
			case LayoutPackage.CANVAS__GRID_SCALE:
				setGridScale(GRID_SCALE_EDEFAULT);
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
			case LayoutPackage.CANVAS__ACTIVE:
				return ACTIVE_EDEFAULT == null ? active != null : !ACTIVE_EDEFAULT.equals(active);
			case LayoutPackage.CANVAS__GRID_SIZE_X:
				return gridSizeX != GRID_SIZE_X_EDEFAULT;
			case LayoutPackage.CANVAS__GRID_SIZE_Y:
				return gridSizeY != GRID_SIZE_Y_EDEFAULT;
			case LayoutPackage.CANVAS__GRID_SCALE:
				return gridScale != GRID_SCALE_EDEFAULT;
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
		result.append(" (active: ");
		result.append(active);
		result.append(", gridSizeX: ");
		result.append(gridSizeX);
		result.append(", gridSizeY: ");
		result.append(gridSizeY);
		result.append(", gridScale: ");
		result.append(gridScale);
		result.append(')');
		return result.toString();
	}

} //CanvasImpl
