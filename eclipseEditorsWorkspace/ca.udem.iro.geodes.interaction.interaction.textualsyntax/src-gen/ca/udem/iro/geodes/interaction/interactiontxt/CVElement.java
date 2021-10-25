/**
 * generated by Xtext 2.19.0
 */
package ca.udem.iro.geodes.interaction.interactiontxt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CV Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.CVElement#getId <em>Id</em>}</li>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.CVElement#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getCVElement()
 * @model
 * @generated
 */
public interface CVElement extends CElement
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getCVElement_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link ca.udem.iro.geodes.interaction.interactiontxt.CVElement#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(CAElement)
   * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getCVElement_Element()
   * @model
   * @generated
   */
  CAElement getElement();

  /**
   * Sets the value of the '{@link ca.udem.iro.geodes.interaction.interactiontxt.CVElement#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(CAElement value);

} // CVElement