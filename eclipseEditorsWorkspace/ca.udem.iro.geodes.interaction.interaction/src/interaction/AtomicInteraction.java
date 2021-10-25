/**
 */
package interaction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interaction.AtomicInteraction#getHasStates <em>Has States</em>}</li>
 *   <li>{@link interaction.AtomicInteraction#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link interaction.AtomicInteraction#getGoal <em>Goal</em>}</li>
 *   <li>{@link interaction.AtomicInteraction#getHasTransitions <em>Has Transitions</em>}</li>
 *   <li>{@link interaction.AtomicInteraction#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see interaction.InteractionPackage#getAtomicInteraction()
 * @model
 * @generated
 */
public interface AtomicInteraction extends EObject {
	/**
	 * Returns the value of the '<em><b>Has States</b></em>' containment reference list.
	 * The list contents are of type {@link interaction.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has States</em>' containment reference list.
	 * @see interaction.InteractionPackage#getAtomicInteraction_HasStates()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<State> getHasStates();

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' reference.
	 * @see #setPreCondition(State)
	 * @see interaction.InteractionPackage#getAtomicInteraction_PreCondition()
	 * @model required="true"
	 * @generated
	 */
	State getPreCondition();

	/**
	 * Sets the value of the '{@link interaction.AtomicInteraction#getPreCondition <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(State value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(State)
	 * @see interaction.InteractionPackage#getAtomicInteraction_Goal()
	 * @model required="true"
	 * @generated
	 */
	State getGoal();

	/**
	 * Sets the value of the '{@link interaction.AtomicInteraction#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(State value);

	/**
	 * Returns the value of the '<em><b>Has Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link interaction.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Transitions</em>' containment reference list.
	 * @see interaction.InteractionPackage#getAtomicInteraction_HasTransitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getHasTransitions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see interaction.InteractionPackage#getAtomicInteraction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link interaction.AtomicInteraction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AtomicInteraction
