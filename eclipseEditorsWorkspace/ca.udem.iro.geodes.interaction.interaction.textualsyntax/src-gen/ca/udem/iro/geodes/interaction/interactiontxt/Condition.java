/**
 * generated by Xtext 2.19.0
 */
package ca.udem.iro.geodes.interaction.interactiontxt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.Condition#getId <em>Id</em>}</li>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.Condition#getElements <em>Elements</em>}</li>
 *   <li>{@link ca.udem.iro.geodes.interaction.interactiontxt.Condition#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getCondition_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link ca.udem.iro.geodes.interaction.interactiontxt.Condition#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link ca.udem.iro.geodes.interaction.interactiontxt.CElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getCondition_Elements()
   * @model containment="true"
   * @generated
   */
  EList<CElement> getElements();

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference.
   * @see #setTransition(StartTransition)
   * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage#getCondition_Transition()
   * @model containment="true"
   * @generated
   */
  StartTransition getTransition();

  /**
   * Sets the value of the '{@link ca.udem.iro.geodes.interaction.interactiontxt.Condition#getTransition <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' containment reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(StartTransition value);

} // Condition
