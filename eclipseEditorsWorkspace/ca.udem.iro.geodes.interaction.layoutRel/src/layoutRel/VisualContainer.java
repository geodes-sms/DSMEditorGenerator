/**
 */
package layoutRel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layoutRel.VisualContainer#getBehaviour <em>Behaviour</em>}</li>
 * </ul>
 *
 * @see layoutRel.LayoutRelPackage#getVisualContainer()
 * @model
 * @generated
 */
public interface VisualContainer extends ContainerElement {
	/**
	 * Returns the value of the '<em><b>Behaviour</b></em>' attribute.
	 * The literals are from the enumeration {@link layoutRel.ContainmentBehaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour</em>' attribute.
	 * @see layoutRel.ContainmentBehaviour
	 * @see #setBehaviour(ContainmentBehaviour)
	 * @see layoutRel.LayoutRelPackage#getVisualContainer_Behaviour()
	 * @model
	 * @generated
	 */
	ContainmentBehaviour getBehaviour();

	/**
	 * Sets the value of the '{@link layoutRel.VisualContainer#getBehaviour <em>Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour</em>' attribute.
	 * @see layoutRel.ContainmentBehaviour
	 * @see #getBehaviour()
	 * @generated
	 */
	void setBehaviour(ContainmentBehaviour value);

} // VisualContainer
