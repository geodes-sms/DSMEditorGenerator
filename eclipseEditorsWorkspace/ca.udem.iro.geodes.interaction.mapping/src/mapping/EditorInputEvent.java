/**
 */
package mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor Input Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.EditorInputEvent#getPlatform <em>Platform</em>}</li>
 *   <li>{@link mapping.EditorInputEvent#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getEditorInputEvent()
 * @model
 * @generated
 */
public interface EditorInputEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' reference list.
	 * The list contents are of type {@link mapping.PlatformInputEventCode}.
	 * It is bidirectional and its opposite is '{@link mapping.PlatformInputEventCode#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' reference list.
	 * @see mapping.MappingPackage#getEditorInputEvent_Platform()
	 * @see mapping.PlatformInputEventCode#getEditor
	 * @model opposite="editor"
	 * @generated
	 */
	EList<PlatformInputEventCode> getPlatform();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see mapping.MappingPackage#getEditorInputEvent_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link mapping.EditorInputEvent#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

} // EditorInputEvent
