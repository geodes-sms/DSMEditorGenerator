/**
 */
package mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Controll Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.PlatformControllCode#getHeatherCode <em>Heather Code</em>}</li>
 *   <li>{@link mapping.PlatformControllCode#getFooterCode <em>Footer Code</em>}</li>
 *   <li>{@link mapping.PlatformControllCode#getCodeSeperator <em>Code Seperator</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getPlatformControllCode()
 * @model
 * @generated
 */
public interface PlatformControllCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Heather Code</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heather Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heather Code</em>' containment reference list.
	 * @see mapping.MappingPackage#getPlatformControllCode_HeatherCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getHeatherCode();

	/**
	 * Returns the value of the '<em><b>Footer Code</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Code</em>' containment reference list.
	 * @see mapping.MappingPackage#getPlatformControllCode_FooterCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getFooterCode();

	/**
	 * Returns the value of the '<em><b>Code Seperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Seperator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Seperator</em>' containment reference.
	 * @see #setCodeSeperator(CodeLine)
	 * @see mapping.MappingPackage#getPlatformControllCode_CodeSeperator()
	 * @model containment="true"
	 * @generated
	 */
	CodeLine getCodeSeperator();

	/**
	 * Sets the value of the '{@link mapping.PlatformControllCode#getCodeSeperator <em>Code Seperator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Seperator</em>' containment reference.
	 * @see #getCodeSeperator()
	 * @generated
	 */
	void setCodeSeperator(CodeLine value);

} // PlatformControllCode
