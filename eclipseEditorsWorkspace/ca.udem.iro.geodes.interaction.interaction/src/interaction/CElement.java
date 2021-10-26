/**
 */
package interaction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CElement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interaction.CElement#getId <em>Id</em>}</li>
 *   <li>{@link interaction.CElement#isIsNegative <em>Is Negative</em>}</li>
 *   <li>{@link interaction.CElement#isIsFocus <em>Is Focus</em>}</li>
 *   <li>{@link interaction.CElement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see interaction.InteractionPackage#getCElement()
 * @model abstract="true"
 * @generated
 */
public interface CElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see interaction.InteractionPackage#getCElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link interaction.CElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Negative</em>' attribute.
	 * @see #setIsNegative(boolean)
	 * @see interaction.InteractionPackage#getCElement_IsNegative()
	 * @model
	 * @generated
	 */
	boolean isIsNegative();

	/**
	 * Sets the value of the '{@link interaction.CElement#isIsNegative <em>Is Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Negative</em>' attribute.
	 * @see #isIsNegative()
	 * @generated
	 */
	void setIsNegative(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Focus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Focus</em>' attribute.
	 * @see #setIsFocus(boolean)
	 * @see interaction.InteractionPackage#getCElement_IsFocus()
	 * @model
	 * @generated
	 */
	boolean isIsFocus();

	/**
	 * Sets the value of the '{@link interaction.CElement#isIsFocus <em>Is Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Focus</em>' attribute.
	 * @see #isIsFocus()
	 * @generated
	 */
	void setIsFocus(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see interaction.InteractionPackage#getCElement_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link interaction.CElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // CElement
