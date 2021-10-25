/**
 */
package layoutRel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layoutRel.ContainerElement#getElements <em>Elements</em>}</li>
 *   <li>{@link layoutRel.ContainerElement#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see layoutRel.LayoutRelPackage#getContainerElement()
 * @model
 * @generated
 */
public interface ContainerElement extends Element {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link layoutRel.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see layoutRel.LayoutRelPackage#getContainerElement_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(int)
	 * @see layoutRel.LayoutRelPackage#getContainerElement_Visibility()
	 * @model default="0"
	 * @generated
	 */
	int getVisibility();

	/**
	 * Sets the value of the '{@link layoutRel.ContainerElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(int value);

} // ContainerElement
