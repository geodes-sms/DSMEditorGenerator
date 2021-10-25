/**
 */
package mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Output Event Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.PlatformOutputEventCode#getEditor <em>Editor</em>}</li>
 *   <li>{@link mapping.PlatformOutputEventCode#getRaiseCode <em>Raise Code</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getPlatformOutputEventCode()
 * @model
 * @generated
 */
public interface PlatformOutputEventCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Editor</b></em>' reference list.
	 * The list contents are of type {@link mapping.EditorOutputEvent}.
	 * It is bidirectional and its opposite is '{@link mapping.EditorOutputEvent#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' reference list.
	 * @see mapping.MappingPackage#getPlatformOutputEventCode_Editor()
	 * @see mapping.EditorOutputEvent#getPlatform
	 * @model opposite="platform"
	 * @generated
	 */
	EList<EditorOutputEvent> getEditor();

	/**
	 * Returns the value of the '<em><b>Raise Code</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raise Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raise Code</em>' containment reference list.
	 * @see mapping.MappingPackage#getPlatformOutputEventCode_RaiseCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getRaiseCode();

} // PlatformOutputEventCode
