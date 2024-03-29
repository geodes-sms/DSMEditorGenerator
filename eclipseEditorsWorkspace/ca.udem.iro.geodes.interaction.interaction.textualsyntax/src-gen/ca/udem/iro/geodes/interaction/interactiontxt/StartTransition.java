/**
 * generated by Xtext 2.19.0
 */
package ca.udem.iro.geodes.interaction.interactiontxt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.StartTransition#getEvent <em>Event</em>}</li>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.StartTransition#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getStartTransition()
 * @model
 * @generated
 */
public interface StartTransition extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see #setEvent(String)
   * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getStartTransition_Event()
   * @model
   * @generated
   */
  String getEvent();

  /**
   * Sets the value of the '{@link ca.udem.iro.geodes.interaction.interactiontxt.StartTransition#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see #getEvent()
   * @generated
   */
  void setEvent(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link ca.udem.iro.geodes.interaction.interactiontxt.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getStartTransition_Action()
   * @model containment="true"
   * @generated
   */
  EList<Action> getAction();

} // StartTransition
