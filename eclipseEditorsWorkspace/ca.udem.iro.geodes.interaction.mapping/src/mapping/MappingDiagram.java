/**
 */
package mapping;

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
 *   <li>{@link mapping.MappingDiagram#getEditorInputEvents <em>Editor Input Events</em>}</li>
 *   <li>{@link mapping.MappingDiagram#getEditorOutputEvents <em>Editor Output Events</em>}</li>
 *   <li>{@link mapping.MappingDiagram#getPlatformInputEvents <em>Platform Input Events</em>}</li>
 *   <li>{@link mapping.MappingDiagram#getPlatformOutputEvents <em>Platform Output Events</em>}</li>
 *   <li>{@link mapping.MappingDiagram#getPlatformIElementSetters <em>Platform IElement Setters</em>}</li>
 *   <li>{@link mapping.MappingDiagram#getPlatformLElementOperations <em>Platform LElement Operations</em>}</li>
 *   <li>{@link mapping.MappingDiagram#getPlatformOutputControll <em>Platform Output Controll</em>}</li>
 *   <li>{@link mapping.MappingDiagram#getPlatformInputControll <em>Platform Input Controll</em>}</li>
 *   <li>{@link mapping.MappingDiagram#getPlatformBaseCode <em>Platform Base Code</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getMappingDiagram()
 * @model
 * @generated
 */
public interface MappingDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Editor Input Events</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.EditorInputEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Input Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Input Events</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingDiagram_EditorInputEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EditorInputEvent> getEditorInputEvents();

	/**
	 * Returns the value of the '<em><b>Editor Output Events</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.EditorOutputEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Output Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Output Events</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingDiagram_EditorOutputEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EditorOutputEvent> getEditorOutputEvents();

	/**
	 * Returns the value of the '<em><b>Platform Input Events</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.PlatformInputEventCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Input Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Input Events</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingDiagram_PlatformInputEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlatformInputEventCode> getPlatformInputEvents();

	/**
	 * Returns the value of the '<em><b>Platform Output Events</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.PlatformOutputEventCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Output Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Output Events</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingDiagram_PlatformOutputEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlatformOutputEventCode> getPlatformOutputEvents();

	/**
	 * Returns the value of the '<em><b>Platform IElement Setters</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.PlatformIElementCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform IElement Setters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform IElement Setters</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingDiagram_PlatformIElementSetters()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlatformIElementCode> getPlatformIElementSetters();

	/**
	 * Returns the value of the '<em><b>Platform LElement Operations</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.PlatformLElementCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform LElement Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform LElement Operations</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingDiagram_PlatformLElementOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlatformLElementCode> getPlatformLElementOperations();

	/**
	 * Returns the value of the '<em><b>Platform Output Controll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Output Controll</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Output Controll</em>' containment reference.
	 * @see #setPlatformOutputControll(PlatformOutputControllCode)
	 * @see mapping.MappingPackage#getMappingDiagram_PlatformOutputControll()
	 * @model containment="true"
	 * @generated
	 */
	PlatformOutputControllCode getPlatformOutputControll();

	/**
	 * Sets the value of the '{@link mapping.MappingDiagram#getPlatformOutputControll <em>Platform Output Controll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Output Controll</em>' containment reference.
	 * @see #getPlatformOutputControll()
	 * @generated
	 */
	void setPlatformOutputControll(PlatformOutputControllCode value);

	/**
	 * Returns the value of the '<em><b>Platform Input Controll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Input Controll</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Input Controll</em>' containment reference.
	 * @see #setPlatformInputControll(PlatformInputControllCode)
	 * @see mapping.MappingPackage#getMappingDiagram_PlatformInputControll()
	 * @model containment="true"
	 * @generated
	 */
	PlatformInputControllCode getPlatformInputControll();

	/**
	 * Sets the value of the '{@link mapping.MappingDiagram#getPlatformInputControll <em>Platform Input Controll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Input Controll</em>' containment reference.
	 * @see #getPlatformInputControll()
	 * @generated
	 */
	void setPlatformInputControll(PlatformInputControllCode value);

	/**
	 * Returns the value of the '<em><b>Platform Base Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Base Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Base Code</em>' containment reference.
	 * @see #setPlatformBaseCode(PlatformControllCode)
	 * @see mapping.MappingPackage#getMappingDiagram_PlatformBaseCode()
	 * @model containment="true"
	 * @generated
	 */
	PlatformControllCode getPlatformBaseCode();

	/**
	 * Sets the value of the '{@link mapping.MappingDiagram#getPlatformBaseCode <em>Platform Base Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Base Code</em>' containment reference.
	 * @see #getPlatformBaseCode()
	 * @generated
	 */
	void setPlatformBaseCode(PlatformControllCode value);

} // MappingDiagram
