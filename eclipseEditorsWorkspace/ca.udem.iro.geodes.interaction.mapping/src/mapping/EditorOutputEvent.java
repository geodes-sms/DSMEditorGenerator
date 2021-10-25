/**
 */
package mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor Output Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.EditorOutputEvent#getPlatform <em>Platform</em>}</li>
 *   <li>{@link mapping.EditorOutputEvent#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getEditorOutputEvent()
 * @model
 * @generated
 */
public interface EditorOutputEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' reference list.
	 * The list contents are of type {@link mapping.PlatformOutputEventCode}.
	 * It is bidirectional and its opposite is '{@link mapping.PlatformOutputEventCode#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' reference list.
	 * @see mapping.MappingPackage#getEditorOutputEvent_Platform()
	 * @see mapping.PlatformOutputEventCode#getEditor
	 * @model opposite="editor"
	 * @generated
	 */
	EList<PlatformOutputEventCode> getPlatform();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see mapping.MappingPackage#getEditorOutputEvent_Operation()
	 * @model
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link mapping.EditorOutputEvent#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

} // EditorOutputEvent
