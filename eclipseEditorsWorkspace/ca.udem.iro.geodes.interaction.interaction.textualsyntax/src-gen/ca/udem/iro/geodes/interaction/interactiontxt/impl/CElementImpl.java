/**
 * generated by Xtext 2.19.0
 */
package ca.udem.iro.geodes.interaction.interactiontxt.impl;

import ca.udem.iro.geodes.interaction.interactiontxt.CElement;
import ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CElement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.impl.CElementImpl#isIsNegative <em>Is Negative</em>}</li>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.impl.CElementImpl#isIsFocus <em>Is Focus</em>}</li>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.impl.CElementImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CElementImpl extends CAElementImpl implements CElement
{
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
  protected CElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return InteractiontxtPackage.Literals.CELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsNegative()
  {
    return isNegative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsNegative(boolean newIsNegative)
  {
    boolean oldIsNegative = isNegative;
    isNegative = newIsNegative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InteractiontxtPackage.CELEMENT__IS_NEGATIVE, oldIsNegative, isNegative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsFocus()
  {
    return isFocus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsFocus(boolean newIsFocus)
  {
    boolean oldIsFocus = isFocus;
    isFocus = newIsFocus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InteractiontxtPackage.CELEMENT__IS_FOCUS, oldIsFocus, isFocus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InteractiontxtPackage.CELEMENT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case InteractiontxtPackage.CELEMENT__IS_NEGATIVE:
        return isIsNegative();
      case InteractiontxtPackage.CELEMENT__IS_FOCUS:
        return isIsFocus();
      case InteractiontxtPackage.CELEMENT__VALUE:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InteractiontxtPackage.CELEMENT__IS_NEGATIVE:
        setIsNegative((Boolean)newValue);
        return;
      case InteractiontxtPackage.CELEMENT__IS_FOCUS:
        setIsFocus((Boolean)newValue);
        return;
      case InteractiontxtPackage.CELEMENT__VALUE:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case InteractiontxtPackage.CELEMENT__IS_NEGATIVE:
        setIsNegative(IS_NEGATIVE_EDEFAULT);
        return;
      case InteractiontxtPackage.CELEMENT__IS_FOCUS:
        setIsFocus(IS_FOCUS_EDEFAULT);
        return;
      case InteractiontxtPackage.CELEMENT__VALUE:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case InteractiontxtPackage.CELEMENT__IS_NEGATIVE:
        return isNegative != IS_NEGATIVE_EDEFAULT;
      case InteractiontxtPackage.CELEMENT__IS_FOCUS:
        return isFocus != IS_FOCUS_EDEFAULT;
      case InteractiontxtPackage.CELEMENT__VALUE:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (isNegative: ");
    result.append(isNegative);
    result.append(", isFocus: ");
    result.append(isFocus);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //CElementImpl
