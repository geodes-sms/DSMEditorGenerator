/**
 */
package layoutRel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rel Layout Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layoutRel.RelLayoutDiagram#getName <em>Name</em>}</li>
 *   <li>{@link layoutRel.RelLayoutDiagram#getInteractionStreams <em>Interaction Streams</em>}</li>
 * </ul>
 *
 * @see layoutRel.LayoutRelPackage#getRelLayoutDiagram()
 * @model
 * @generated
 */
public interface RelLayoutDiagram extends EObject {
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
	 * @see layoutRel.LayoutRelPackage#getRelLayoutDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link layoutRel.RelLayoutDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interaction Streams</b></em>' containment reference list.
	 * The list contents are of type {@link layoutRel.InteractionStream}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Streams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Streams</em>' containment reference list.
	 * @see layoutRel.LayoutRelPackage#getRelLayoutDiagram_InteractionStreams()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InteractionStream> getInteractionStreams();

} // RelLayoutDiagram
