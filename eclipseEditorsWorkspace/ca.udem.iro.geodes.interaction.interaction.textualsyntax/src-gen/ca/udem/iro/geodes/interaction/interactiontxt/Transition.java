/**
 * generated by Xtext 2.19.0
 */
package ca.udem.iro.geodes.interaction.interactiontxt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.Transition#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link ca.udem.iro.geodes.interaction.interactiontxt.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getTransition_Action()
   * @model containment="true"
   * @generated
   */
  EList<Action> getAction();

} // Transition