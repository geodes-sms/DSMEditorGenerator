/**
 */
package mapping.util;

import mapping.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mapping.MappingPackage
 * @generated
 */
public class MappingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSwitch() {
		if (modelPackage == null) {
			modelPackage = MappingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MappingPackage.MAPPING_DIAGRAM: {
				MappingDiagram mappingDiagram = (MappingDiagram)theEObject;
				T result = caseMappingDiagram(mappingDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.EDITOR_INPUT_EVENT: {
				EditorInputEvent editorInputEvent = (EditorInputEvent)theEObject;
				T result = caseEditorInputEvent(editorInputEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE: {
				PlatformInputEventCode platformInputEventCode = (PlatformInputEventCode)theEObject;
				T result = casePlatformInputEventCode(platformInputEventCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.EDITOR_OUTPUT_EVENT: {
				EditorOutputEvent editorOutputEvent = (EditorOutputEvent)theEObject;
				T result = caseEditorOutputEvent(editorOutputEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE: {
				PlatformOutputEventCode platformOutputEventCode = (PlatformOutputEventCode)theEObject;
				T result = casePlatformOutputEventCode(platformOutputEventCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PLATFORM_IELEMENT_CODE: {
				PlatformIElementCode platformIElementCode = (PlatformIElementCode)theEObject;
				T result = casePlatformIElementCode(platformIElementCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PLATFORM_LELEMENT_CODE: {
				PlatformLElementCode platformLElementCode = (PlatformLElementCode)theEObject;
				T result = casePlatformLElementCode(platformLElementCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PLATFORM_CONTROLL_CODE: {
				PlatformControllCode platformControllCode = (PlatformControllCode)theEObject;
				T result = casePlatformControllCode(platformControllCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PLATFORM_OUTPUT_CONTROLL_CODE: {
				PlatformOutputControllCode platformOutputControllCode = (PlatformOutputControllCode)theEObject;
				T result = casePlatformOutputControllCode(platformOutputControllCode);
				if (result == null) result = casePlatformControllCode(platformOutputControllCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PLATFORM_INPUT_CONTROLL_CODE: {
				PlatformInputControllCode platformInputControllCode = (PlatformInputControllCode)theEObject;
				T result = casePlatformInputControllCode(platformInputControllCode);
				if (result == null) result = casePlatformControllCode(platformInputControllCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.CODE_LINE: {
				CodeLine codeLine = (CodeLine)theEObject;
				T result = caseCodeLine(codeLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingDiagram(MappingDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editor Input Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editor Input Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditorInputEvent(EditorInputEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Input Event Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Input Event Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformInputEventCode(PlatformInputEventCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editor Output Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editor Output Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditorOutputEvent(EditorOutputEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Output Event Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Output Event Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformOutputEventCode(PlatformOutputEventCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform IElement Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform IElement Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformIElementCode(PlatformIElementCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform LElement Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform LElement Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformLElementCode(PlatformLElementCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Controll Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Controll Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformControllCode(PlatformControllCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Output Controll Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Output Controll Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformOutputControllCode(PlatformOutputControllCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Input Controll Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Input Controll Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformInputControllCode(PlatformInputControllCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLine(CodeLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MappingSwitch
