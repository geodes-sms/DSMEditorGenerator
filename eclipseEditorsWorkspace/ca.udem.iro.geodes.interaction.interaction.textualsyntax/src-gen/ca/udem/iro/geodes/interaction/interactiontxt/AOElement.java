/**
 * generated by Xtext 2.19.0
 */
package ca.udem.iro.geodes.interaction.interactiontxt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AO Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.AOElement#getOperation <em>Operation</em>}</li>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.AOElement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getAOElement()
 * @model
 * @generated
 */
public interface AOElement extends AElement
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see #setOperation(String)
   * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getAOElement_Operation()
   * @model
   * @generated
   */
  String getOperation();

  /**
   * Sets the value of the '{@link ca.udem.iro.geodes.interaction.interactiontxt.AOElement#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see #getOperation()
   * @generated
   */
  void setOperation(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getAOElement_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link ca.udem.iro.geodes.interaction.interactiontxt.AOElement#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // AOElement