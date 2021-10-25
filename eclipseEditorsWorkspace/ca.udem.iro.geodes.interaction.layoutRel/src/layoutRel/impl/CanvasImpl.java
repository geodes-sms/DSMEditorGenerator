/**
 */
package layoutRel.impl;

import layoutRel.Canvas;
import layoutRel.LayoutRelPackage;

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
 *   <li>{@link layoutRel.impl.CanvasImpl#getActive <em>Active</em>}</li>
 *   <li>{@link layoutRel.impl.CanvasImpl#getGridSizeX <em>Grid Size X</em>}</li>
 *   <li>{@link layoutRel.impl.CanvasImpl#getGridSizeY <em>Grid Size Y</em>}</li>
 *   <li>{@link layoutRel.impl.CanvasImpl#getGridScaleX <em>Grid Scale X</em>}</li>
 *   <li>{@link layoutRel.impl.CanvasImpl#getGridScaleY <em>Grid Scale Y</em>}</li>
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
	 * The default value of the '{@link #getGridScaleX() <em>Grid Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridScaleX()
	 * @generated
	 * @ordered
	 */
	protected static final int GRID_SCALE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGridScaleX() <em>Grid Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridScaleX()
	 * @generated
	 * @ordered
	 */
	protected int gridScaleX = GRID_SCALE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getGridScaleY() <em>Grid Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridScaleY()
	 * @generated
	 * @ordered
	 */
	protected static final int GRID_SCALE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGridScaleY() <em>Grid Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridScaleY()
	 * @generated
	 * @ordered
	 */
	protected int gridScaleY = GRID_SCALE_Y_EDEFAULT;

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
		return LayoutRelPackage.Literals.CANVAS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.CANVAS__ACTIVE, oldActive, active));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.CANVAS__GRID_SIZE_X, oldGridSizeX, gridSizeX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.CANVAS__GRID_SIZE_Y, oldGridSizeY, gridSizeY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridScaleX() {
		return gridScaleX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridScaleX(int newGridScaleX) {
		int oldGridScaleX = gridScaleX;
		gridScaleX = newGridScaleX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.CANVAS__GRID_SCALE_X, oldGridScaleX, gridScaleX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridScaleY() {
		return gridScaleY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridScaleY(int newGridScaleY) {
		int oldGridScaleY = gridScaleY;
		gridScaleY = newGridScaleY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.CANVAS__GRID_SCALE_Y, oldGridScaleY, gridScaleY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutRelPackage.CANVAS__ACTIVE:
				return getActive();
			case LayoutRelPackage.CANVAS__GRID_SIZE_X:
				return getGridSizeX();
			case LayoutRelPackage.CANVAS__GRID_SIZE_Y:
				return getGridSizeY();
			case LayoutRelPackage.CANVAS__GRID_SCALE_X:
				return getGridScaleX();
			case LayoutRelPackage.CANVAS__GRID_SCALE_Y:
				return getGridScaleY();
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
			case LayoutRelPackage.CANVAS__ACTIVE:
				setActive((String)newValue);
				return;
			case LayoutRelPackage.CANVAS__GRID_SIZE_X:
				setGridSizeX((Integer)newValue);
				return;
			case LayoutRelPackage.CANVAS__GRID_SIZE_Y:
				setGridSizeY((Integer)newValue);
				return;
			case LayoutRelPackage.CANVAS__GRID_SCALE_X:
				setGridScaleX((Integer)newValue);
				return;
			case LayoutRelPackage.CANVAS__GRID_SCALE_Y:
				setGridScaleY((Integer)newValue);
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
			case LayoutRelPackage.CANVAS__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case LayoutRelPackage.CANVAS__GRID_SIZE_X:
				setGridSizeX(GRID_SIZE_X_EDEFAULT);
				return;
			case LayoutRelPackage.CANVAS__GRID_SIZE_Y:
				setGridSizeY(GRID_SIZE_Y_EDEFAULT);
				return;
			case LayoutRelPackage.CANVAS__GRID_SCALE_X:
				setGridScaleX(GRID_SCALE_X_EDEFAULT);
				return;
			case LayoutRelPackage.CANVAS__GRID_SCALE_Y:
				setGridScaleY(GRID_SCALE_Y_EDEFAULT);
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
			case LayoutRelPackage.CANVAS__ACTIVE:
				return ACTIVE_EDEFAULT == null ? active != null : !ACTIVE_EDEFAULT.equals(active);
			case LayoutRelPackage.CANVAS__GRID_SIZE_X:
				return gridSizeX != GRID_SIZE_X_EDEFAULT;
			case LayoutRelPackage.CANVAS__GRID_SIZE_Y:
				return gridSizeY != GRID_SIZE_Y_EDEFAULT;
			case LayoutRelPackage.CANVAS__GRID_SCALE_X:
				return gridScaleX != GRID_SCALE_X_EDEFAULT;
			case LayoutRelPackage.CANVAS__GRID_SCALE_Y:
				return gridScaleY != GRID_SCALE_Y_EDEFAULT;
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
		result.append(", gridScaleX: ");
		result.append(gridScaleX);
		result.append(", gridScaleY: ");
		result.append(gridScaleY);
		result.append(')');
		return result.toString();
	}

} //CanvasImpl
