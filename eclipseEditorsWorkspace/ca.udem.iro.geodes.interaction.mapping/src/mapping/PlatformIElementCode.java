/**
 */
package mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform IElement Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.PlatformIElementCode#getSetterCode <em>Setter Code</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getPlatformIElementCode()
 * @model
 * @generated
 */
public interface PlatformIElementCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Setter Code</b></em>' reference list.
	 * The list contents are of type {@link mapping.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter Code</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter Code</em>' reference list.
	 * @see mapping.MappingPackage#getPlatformIElementCode_SetterCode()
	 * @model
	 * @generated
	 */
	EList<CodeLine> getSetterCode();

} // PlatformIElementCode
