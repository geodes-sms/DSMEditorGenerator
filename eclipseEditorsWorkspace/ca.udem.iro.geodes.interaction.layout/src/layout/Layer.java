/**
 */
package layout;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.Layer#getPosition <em>Position</em>}</li>
 *   <li>{@link layout.Layer#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link layout.Layer#getHasElements <em>Has Elements</em>}</li>
 *   <li>{@link layout.Layer#getName <em>Name</em>}</li>
 *   <li>{@link layout.Layer#getAnchors <em>Anchors</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see layout.LayoutPackage#getLayer_Position()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link layout.Layer#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see layout.LayoutPackage#getLayer_IsDefault()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link layout.Layer#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Elements</b></em>' containment reference list.
	 * The list contents are of type {@link layout.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Elements</em>' containment reference list.
	 * @see layout.LayoutPackage#getLayer_HasElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getHasElements();

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
	 * @see layout.LayoutPackage#getLayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link layout.Layer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Anchors</b></em>' containment reference list.
	 * The list contents are of type {@link layout.Anchor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchors</em>' containment reference list.
	 * @see layout.LayoutPackage#getLayer_Anchors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Anchor> getAnchors();

} // Layer
