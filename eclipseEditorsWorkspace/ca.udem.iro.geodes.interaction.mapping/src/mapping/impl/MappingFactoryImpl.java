/**
 */
package mapping.impl;

import mapping.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingFactoryImpl extends EFactoryImpl implements MappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappingFactory init() {
		try {
			MappingFactory theMappingFactory = (MappingFactory)EPackage.Registry.INSTANCE.getEFactory(MappingPackage.eNS_URI);
			if (theMappingFactory != null) {
				return theMappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MappingPackage.MAPPING_DIAGRAM: return createMappingDiagram();
			case MappingPackage.EDITOR_INPUT_EVENT: return createEditorInputEvent();
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE: return createPlatformInputEventCode();
			case MappingPackage.EDITOR_OUTPUT_EVENT: return createEditorOutputEvent();
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE: return createPlatformOutputEventCode();
			case MappingPackage.PLATFORM_IELEMENT_CODE: return createPlatformIElementCode();
			case MappingPackage.PLATFORM_LELEMENT_CODE: return createPlatformLElementCode();
			case MappingPackage.PLATFORM_CONTROLL_CODE: return createPlatformControllCode();
			case MappingPackage.PLATFORM_OUTPUT_CONTROLL_CODE: return createPlatformOutputControllCode();
			case MappingPackage.PLATFORM_INPUT_CONTROLL_CODE: return createPlatformInputControllCode();
			case MappingPackage.CODE_LINE: return createCodeLine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingDiagram createMappingDiagram() {
		MappingDiagramImpl mappingDiagram = new MappingDiagramImpl();
		return mappingDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorInputEvent createEditorInputEvent() {
		EditorInputEventImpl editorInputEvent = new EditorInputEventImpl();
		return editorInputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformInputEventCode createPlatformInputEventCode() {
		PlatformInputEventCodeImpl platformInputEventCode = new PlatformInputEventCodeImpl();
		return platformInputEventCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorOutputEvent createEditorOutputEvent() {
		EditorOutputEventImpl editorOutputEvent = new EditorOutputEventImpl();
		return editorOutputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformOutputEventCode createPlatformOutputEventCode() {
		PlatformOutputEventCodeImpl platformOutputEventCode = new PlatformOutputEventCodeImpl();
		return platformOutputEventCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformIElementCode createPlatformIElementCode() {
		PlatformIElementCodeImpl platformIElementCode = new PlatformIElementCodeImpl();
		return platformIElementCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformLElementCode createPlatformLElementCode() {
		PlatformLElementCodeImpl platformLElementCode = new PlatformLElementCodeImpl();
		return platformLElementCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformControllCode createPlatformControllCode() {
		PlatformControllCodeImpl platformControllCode = new PlatformControllCodeImpl();
		return platformControllCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformOutputControllCode createPlatformOutputControllCode() {
		PlatformOutputControllCodeImpl platformOutputControllCode = new PlatformOutputControllCodeImpl();
		return platformOutputControllCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformInputControllCode createPlatformInputControllCode() {
		PlatformInputControllCodeImpl platformInputControllCode = new PlatformInputControllCodeImpl();
		return platformInputControllCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeLine createCodeLine() {
		CodeLineImpl codeLine = new CodeLineImpl();
		return codeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingPackage getMappingPackage() {
		return (MappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MappingPackage getPackage() {
		return MappingPackage.eINSTANCE;
	}

} //MappingFactoryImpl
