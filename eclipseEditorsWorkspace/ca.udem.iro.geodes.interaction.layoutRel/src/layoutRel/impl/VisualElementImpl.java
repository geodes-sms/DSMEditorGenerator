/**
 */
package layoutRel.impl;

import layoutRel.LayoutRelPackage;
import layoutRel.VisualElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link layoutRel.impl.VisualElementImpl#getXSize <em>XSize</em>}</li>
 *   <li>{@link layoutRel.impl.VisualElementImpl#getYSize <em>YSize</em>}</li>
 *   <li>{@link layoutRel.impl.VisualElementImpl#getForegroundColour <em>Foreground Colour</em>}</li>
 *   <li>{@link layoutRel.impl.VisualElementImpl#getBackgroundColour <em>Background Colour</em>}</li>
 *   <li>{@link layoutRel.impl.VisualElementImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VisualElementImpl extends ElementImpl implements VisualElement {
	/**
	 * The default value of the '{@link #getXSize() <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSize()
	 * @generated
	 * @ordered
	 */
	protected static final int XSIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXSize() <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSize()
	 * @generated
	 * @ordered
	 */
	protected int xSize = XSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYSize() <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSize()
	 * @generated
	 * @ordered
	 */
	protected static final int YSIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYSize() <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSize()
	 * @generated
	 * @ordered
	 */
	protected int ySize = YSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getForegroundColour() <em>Foreground Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColour()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREGROUND_COLOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForegroundColour() <em>Foreground Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColour()
	 * @generated
	 * @ordered
	 */
	protected String foregroundColour = FOREGROUND_COLOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColour() <em>Background Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColour()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColour() <em>Background Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColour()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColour = BACKGROUND_COLOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutRelPackage.Literals.VISUAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXSize() {
		return xSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXSize(int newXSize) {
		int oldXSize = xSize;
		xSize = newXSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.VISUAL_ELEMENT__XSIZE, oldXSize, xSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYSize() {
		return ySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYSize(int newYSize) {
		int oldYSize = ySize;
		ySize = newYSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.VISUAL_ELEMENT__YSIZE, oldYSize, ySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForegroundColour() {
		return foregroundColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForegroundColour(String newForegroundColour) {
		String oldForegroundColour = foregroundColour;
		foregroundColour = newForegroundColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.VISUAL_ELEMENT__FOREGROUND_COLOUR, oldForegroundColour, foregroundColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColour() {
		return backgroundColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColour(String newBackgroundColour) {
		String oldBackgroundColour = backgroundColour;
		backgroundColour = newBackgroundColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.VISUAL_ELEMENT__BACKGROUND_COLOUR, oldBackgroundColour, backgroundColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.VISUAL_ELEMENT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutRelPackage.VISUAL_ELEMENT__XSIZE:
				return getXSize();
			case LayoutRelPackage.VISUAL_ELEMENT__YSIZE:
				return getYSize();
			case LayoutRelPackage.VISUAL_ELEMENT__FOREGROUND_COLOUR:
				return getForegroundColour();
			case LayoutRelPackage.VISUAL_ELEMENT__BACKGROUND_COLOUR:
				return getBackgroundColour();
			case LayoutRelPackage.VISUAL_ELEMENT__REF:
				return getRef();
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
			case LayoutRelPackage.VISUAL_ELEMENT__XSIZE:
				setXSize((Integer)newValue);
				return;
			case LayoutRelPackage.VISUAL_ELEMENT__YSIZE:
				setYSize((Integer)newValue);
				return;
			case LayoutRelPackage.VISUAL_ELEMENT__FOREGROUND_COLOUR:
				setForegroundColour((String)newValue);
				return;
			case LayoutRelPackage.VISUAL_ELEMENT__BACKGROUND_COLOUR:
				setBackgroundColour((String)newValue);
				return;
			case LayoutRelPackage.VISUAL_ELEMENT__REF:
				setRef((String)newValue);
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
			case LayoutRelPackage.VISUAL_ELEMENT__XSIZE:
				setXSize(XSIZE_EDEFAULT);
				return;
			case LayoutRelPackage.VISUAL_ELEMENT__YSIZE:
				setYSize(YSIZE_EDEFAULT);
				return;
			case LayoutRelPackage.VISUAL_ELEMENT__FOREGROUND_COLOUR:
				setForegroundColour(FOREGROUND_COLOUR_EDEFAULT);
				return;
			case LayoutRelPackage.VISUAL_ELEMENT__BACKGROUND_COLOUR:
				setBackgroundColour(BACKGROUND_COLOUR_EDEFAULT);
				return;
			case LayoutRelPackage.VISUAL_ELEMENT__REF:
				setRef(REF_EDEFAULT);
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
			case LayoutRelPackage.VISUAL_ELEMENT__XSIZE:
				return xSize != XSIZE_EDEFAULT;
			case LayoutRelPackage.VISUAL_ELEMENT__YSIZE:
				return ySize != YSIZE_EDEFAULT;
			case LayoutRelPackage.VISUAL_ELEMENT__FOREGROUND_COLOUR:
				return FOREGROUND_COLOUR_EDEFAULT == null ? foregroundColour != null : !FOREGROUND_COLOUR_EDEFAULT.equals(foregroundColour);
			case LayoutRelPackage.VISUAL_ELEMENT__BACKGROUND_COLOUR:
				return BACKGROUND_COLOUR_EDEFAULT == null ? backgroundColour != null : !BACKGROUND_COLOUR_EDEFAULT.equals(backgroundColour);
			case LayoutRelPackage.VISUAL_ELEMENT__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
		result.append(" (xSize: ");
		result.append(xSize);
		result.append(", ySize: ");
		result.append(ySize);
		result.append(", foregroundColour: ");
		result.append(foregroundColour);
		result.append(", backgroundColour: ");
		result.append(backgroundColour);
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //VisualElementImpl
