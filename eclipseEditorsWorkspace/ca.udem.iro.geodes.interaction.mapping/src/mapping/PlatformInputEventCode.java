/**
 */
package mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Input Event Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.PlatformInputEventCode#getEditor <em>Editor</em>}</li>
 *   <li>{@link mapping.PlatformInputEventCode#getListnerCode <em>Listner Code</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getPlatformInputEventCode()
 * @model
 * @generated
 */
public interface PlatformInputEventCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Editor</b></em>' reference list.
	 * The list contents are of type {@link mapping.EditorInputEvent}.
	 * It is bidirectional and its opposite is '{@link mapping.EditorInputEvent#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' reference list.
	 * @see mapping.MappingPackage#getPlatformInputEventCode_Editor()
	 * @see mapping.EditorInputEvent#getPlatform
	 * @model opposite="platform"
	 * @generated
	 */
	EList<EditorInputEvent> getEditor();

	/**
	 * Returns the value of the '<em><b>Listner Code</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listner Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listner Code</em>' containment reference list.
	 * @see mapping.MappingPackage#getPlatformInputEventCode_ListnerCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getListnerCode();

} // PlatformInputEventCode
