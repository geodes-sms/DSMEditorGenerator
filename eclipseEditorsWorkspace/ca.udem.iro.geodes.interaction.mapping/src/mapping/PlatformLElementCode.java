/**
 */
package mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform LElement Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.PlatformLElementCode#getCreateCode <em>Create Code</em>}</li>
 *   <li>{@link mapping.PlatformLElementCode#getUpdateCode <em>Update Code</em>}</li>
 *   <li>{@link mapping.PlatformLElementCode#getDeleteCode <em>Delete Code</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getPlatformLElementCode()
 * @model
 * @generated
 */
public interface PlatformLElementCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Create Code</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Code</em>' containment reference list.
	 * @see mapping.MappingPackage#getPlatformLElementCode_CreateCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getCreateCode();

	/**
	 * Returns the value of the '<em><b>Update Code</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Code</em>' containment reference list.
	 * @see mapping.MappingPackage#getPlatformLElementCode_UpdateCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getUpdateCode();

	/**
	 * Returns the value of the '<em><b>Delete Code</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Code</em>' containment reference list.
	 * @see mapping.MappingPackage#getPlatformLElementCode_DeleteCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getDeleteCode();

} // PlatformLElementCode
