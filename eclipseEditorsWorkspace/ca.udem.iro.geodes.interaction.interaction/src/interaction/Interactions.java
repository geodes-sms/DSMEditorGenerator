/**
 */
package interaction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interaction.Interactions#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @see interaction.InteractionPackage#getInteractions()
 * @model
 * @generated
 */
public interface Interactions extends EObject {
	/**
	 * Returns the value of the '<em><b>Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link interaction.AtomicInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactions</em>' containment reference list.
	 * @see interaction.InteractionPackage#getInteractions_Interactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtomicInteraction> getInteractions();

} // Interactions
