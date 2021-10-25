/**
 */
package layout;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.LayoutDiagram#getHasLayers <em>Has Layers</em>}</li>
 *   <li>{@link layout.LayoutDiagram#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link layout.LayoutDiagram#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getLayoutDiagram()
 * @model
 * @generated
 */
public interface LayoutDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Layers</b></em>' containment reference list.
	 * The list contents are of type {@link layout.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Layers</em>' containment reference list.
	 * @see layout.LayoutPackage#getLayoutDiagram_HasLayers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getHasLayers();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link layout.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see layout.LayoutPackage#getLayoutDiagram_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

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
	 * @see layout.LayoutPackage#getLayoutDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link layout.LayoutDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LayoutDiagram
