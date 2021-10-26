/**
 */
package layout.impl;

import layout.GraphicalElement;
import layout.LayoutPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link layout.impl.GraphicalElementImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link layout.impl.GraphicalElementImpl#getForegroudColor <em>Foregroud Color</em>}</li>
 *   <li>{@link layout.impl.GraphicalElementImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link layout.impl.GraphicalElementImpl#getBorderPattern <em>Border Pattern</em>}</li>
 *   <li>{@link layout.impl.GraphicalElementImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link layout.impl.GraphicalElementImpl#getWith <em>With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicalElementImpl extends ElementImpl implements GraphicalElement {
	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final int BACKGROUND_COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected int backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getForegroudColor() <em>Foregroud Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroudColor()
	 * @generated
	 * @ordered
	 */
	protected static final int FOREGROUD_COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getForegroudColor() <em>Foregroud Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroudColor()
	 * @generated
	 * @ordered
	 */
	protected int foregroudColor = FOREGROUD_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected int border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderPattern() <em>Border Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderPattern() <em>Border Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderPattern()
	 * @generated
	 * @ordered
	 */
	protected String borderPattern = BORDER_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWith() <em>With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith()
	 * @generated
	 * @ordered
	 */
	protected static final int WITH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWith() <em>With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith()
	 * @generated
	 * @ordered
	 */
	protected int with = WITH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.GRAPHICAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(int newBackgroundColor) {
		int oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.GRAPHICAL_ELEMENT__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getForegroudColor() {
		return foregroudColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForegroudColor(int newForegroudColor) {
		int oldForegroudColor = foregroudColor;
		foregroudColor = newForegroudColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.GRAPHICAL_ELEMENT__FOREGROUD_COLOR, oldForegroudColor, foregroudColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(int newBorder) {
		int oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.GRAPHICAL_ELEMENT__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderPattern() {
		return borderPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderPattern(String newBorderPattern) {
		String oldBorderPattern = borderPattern;
		borderPattern = newBorderPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.GRAPHICAL_ELEMENT__BORDER_PATTERN, oldBorderPattern, borderPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.GRAPHICAL_ELEMENT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWith() {
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWith(int newWith) {
		int oldWith = with;
		with = newWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.GRAPHICAL_ELEMENT__WITH, oldWith, with));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.GRAPHICAL_ELEMENT__BACKGROUND_COLOR:
				return getBackgroundColor();
			case LayoutPackage.GRAPHICAL_ELEMENT__FOREGROUD_COLOR:
				return getForegroudColor();
			case LayoutPackage.GRAPHICAL_ELEMENT__BORDER:
				return getBorder();
			case LayoutPackage.GRAPHICAL_ELEMENT__BORDER_PATTERN:
				return getBorderPattern();
			case LayoutPackage.GRAPHICAL_ELEMENT__HEIGHT:
				return getHeight();
			case LayoutPackage.GRAPHICAL_ELEMENT__WITH:
				return getWith();
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
			case LayoutPackage.GRAPHICAL_ELEMENT__BACKGROUND_COLOR:
				setBackgroundColor((Integer)newValue);
				return;
			case LayoutPackage.GRAPHICAL_ELEMENT__FOREGROUD_COLOR:
				setForegroudColor((Integer)newValue);
				return;
			case LayoutPackage.GRAPHICAL_ELEMENT__BORDER:
				setBorder((Integer)newValue);
				return;
			case LayoutPackage.GRAPHICAL_ELEMENT__BORDER_PATTERN:
				setBorderPattern((String)newValue);
				return;
			case LayoutPackage.GRAPHICAL_ELEMENT__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case LayoutPackage.GRAPHICAL_ELEMENT__WITH:
				setWith((Integer)newValue);
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
			case LayoutPackage.GRAPHICAL_ELEMENT__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case LayoutPackage.GRAPHICAL_ELEMENT__FOREGROUD_COLOR:
				setForegroudColor(FOREGROUD_COLOR_EDEFAULT);
				return;
			case LayoutPackage.GRAPHICAL_ELEMENT__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case LayoutPackage.GRAPHICAL_ELEMENT__BORDER_PATTERN:
				setBorderPattern(BORDER_PATTERN_EDEFAULT);
				return;
			case LayoutPackage.GRAPHICAL_ELEMENT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case LayoutPackage.GRAPHICAL_ELEMENT__WITH:
				setWith(WITH_EDEFAULT);
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
			case LayoutPackage.GRAPHICAL_ELEMENT__BACKGROUND_COLOR:
				return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
			case LayoutPackage.GRAPHICAL_ELEMENT__FOREGROUD_COLOR:
				return foregroudColor != FOREGROUD_COLOR_EDEFAULT;
			case LayoutPackage.GRAPHICAL_ELEMENT__BORDER:
				return border != BORDER_EDEFAULT;
			case LayoutPackage.GRAPHICAL_ELEMENT__BORDER_PATTERN:
				return BORDER_PATTERN_EDEFAULT == null ? borderPattern != null : !BORDER_PATTERN_EDEFAULT.equals(borderPattern);
			case LayoutPackage.GRAPHICAL_ELEMENT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case LayoutPackage.GRAPHICAL_ELEMENT__WITH:
				return with != WITH_EDEFAULT;
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
		result.append(" (backgroundColor: ");
		result.append(backgroundColor);
		result.append(", foregroudColor: ");
		result.append(foregroudColor);
		result.append(", border: ");
		result.append(border);
		result.append(", borderPattern: ");
		result.append(borderPattern);
		result.append(", height: ");
		result.append(height);
		result.append(", with: ");
		result.append(with);
		result.append(')');
		return result.toString();
	}

} //GraphicalElementImpl
