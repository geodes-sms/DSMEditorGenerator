/**
 */
package layout;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.Group#getGroups <em>Groups</em>}</li>
 *   <li>{@link layout.Group#getVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Element {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link layout.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see layout.LayoutPackage#getGroup_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getGroups();

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(int)
	 * @see layout.LayoutPackage#getGroup_Visible()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getVisible();

	/**
	 * Sets the value of the '{@link layout.Group#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #getVisible()
	 * @generated
	 */
	void setVisible(int value);

} // Group
