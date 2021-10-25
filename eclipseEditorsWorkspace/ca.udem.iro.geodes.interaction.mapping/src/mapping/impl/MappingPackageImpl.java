/**
 */
package mapping.impl;

import mapping.CodeLine;
import mapping.EditorInputEvent;
import mapping.EditorOutputEvent;
import mapping.MappingDiagram;
import mapping.MappingFactory;
import mapping.MappingPackage;
import mapping.PlatformControllCode;
import mapping.PlatformIElementCode;
import mapping.PlatformInputControllCode;
import mapping.PlatformInputEventCode;
import mapping.PlatformLElementCode;
import mapping.PlatformOutputControllCode;
import mapping.PlatformOutputEventCode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingPackageImpl extends EPackageImpl implements MappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editorInputEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformInputEventCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editorOutputEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformOutputEventCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformIElementCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformLElementCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformControllCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformOutputControllCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformInputControllCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeLineEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mapping.MappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MappingPackageImpl() {
		super(eNS_URI, MappingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MappingPackage init() {
		if (isInited) return (MappingPackage)EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);

		// Obtain or create and register package
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MappingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMappingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MappingPackage.eNS_URI, theMappingPackage);
		return theMappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingDiagram() {
		return mappingDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingDiagram_EditorInputEvents() {
		return (EReference)mappingDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingDiagram_EditorOutputEvents() {
		return (EReference)mappingDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingDiagram_PlatformInputEvents() {
		return (EReference)mappingDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingDiagram_PlatformOutputEvents() {
		return (EReference)mappingDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingDiagram_PlatformIElementSetters() {
		return (EReference)mappingDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingDiagram_PlatformLElementOperations() {
		return (EReference)mappingDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingDiagram_PlatformOutputControll() {
		return (EReference)mappingDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingDiagram_PlatformInputControll() {
		return (EReference)mappingDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingDiagram_PlatformBaseCode() {
		return (EReference)mappingDiagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditorInputEvent() {
		return editorInputEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditorInputEvent_Platform() {
		return (EReference)editorInputEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorInputEvent_Event() {
		return (EAttribute)editorInputEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformInputEventCode() {
		return platformInputEventCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformInputEventCode_Editor() {
		return (EReference)platformInputEventCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformInputEventCode_ListnerCode() {
		return (EReference)platformInputEventCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditorOutputEvent() {
		return editorOutputEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditorOutputEvent_Platform() {
		return (EReference)editorOutputEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorOutputEvent_Operation() {
		return (EAttribute)editorOutputEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformOutputEventCode() {
		return platformOutputEventCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformOutputEventCode_Editor() {
		return (EReference)platformOutputEventCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformOutputEventCode_RaiseCode() {
		return (EReference)platformOutputEventCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformIElementCode() {
		return platformIElementCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformIElementCode_SetterCode() {
		return (EReference)platformIElementCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformLElementCode() {
		return platformLElementCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformLElementCode_CreateCode() {
		return (EReference)platformLElementCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformLElementCode_UpdateCode() {
		return (EReference)platformLElementCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformLElementCode_DeleteCode() {
		return (EReference)platformLElementCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformControllCode() {
		return platformControllCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformControllCode_HeatherCode() {
		return (EReference)platformControllCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformControllCode_FooterCode() {
		return (EReference)platformControllCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformControllCode_CodeSeperator() {
		return (EReference)platformControllCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformOutputControllCode() {
		return platformOutputControllCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformInputControllCode() {
		return platformInputControllCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeLine() {
		return codeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeLine_Line() {
		return (EAttribute)codeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactory getMappingFactory() {
		return (MappingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mappingDiagramEClass = createEClass(MAPPING_DIAGRAM);
		createEReference(mappingDiagramEClass, MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS);
		createEReference(mappingDiagramEClass, MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS);
		createEReference(mappingDiagramEClass, MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS);
		createEReference(mappingDiagramEClass, MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS);
		createEReference(mappingDiagramEClass, MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS);
		createEReference(mappingDiagramEClass, MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS);
		createEReference(mappingDiagramEClass, MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL);
		createEReference(mappingDiagramEClass, MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL);
		createEReference(mappingDiagramEClass, MAPPING_DIAGRAM__PLATFORM_BASE_CODE);

		editorInputEventEClass = createEClass(EDITOR_INPUT_EVENT);
		createEReference(editorInputEventEClass, EDITOR_INPUT_EVENT__PLATFORM);
		createEAttribute(editorInputEventEClass, EDITOR_INPUT_EVENT__EVENT);

		platformInputEventCodeEClass = createEClass(PLATFORM_INPUT_EVENT_CODE);
		createEReference(platformInputEventCodeEClass, PLATFORM_INPUT_EVENT_CODE__EDITOR);
		createEReference(platformInputEventCodeEClass, PLATFORM_INPUT_EVENT_CODE__LISTNER_CODE);

		editorOutputEventEClass = createEClass(EDITOR_OUTPUT_EVENT);
		createEReference(editorOutputEventEClass, EDITOR_OUTPUT_EVENT__PLATFORM);
		createEAttribute(editorOutputEventEClass, EDITOR_OUTPUT_EVENT__OPERATION);

		platformOutputEventCodeEClass = createEClass(PLATFORM_OUTPUT_EVENT_CODE);
		createEReference(platformOutputEventCodeEClass, PLATFORM_OUTPUT_EVENT_CODE__EDITOR);
		createEReference(platformOutputEventCodeEClass, PLATFORM_OUTPUT_EVENT_CODE__RAISE_CODE);

		platformIElementCodeEClass = createEClass(PLATFORM_IELEMENT_CODE);
		createEReference(platformIElementCodeEClass, PLATFORM_IELEMENT_CODE__SETTER_CODE);

		platformLElementCodeEClass = createEClass(PLATFORM_LELEMENT_CODE);
		createEReference(platformLElementCodeEClass, PLATFORM_LELEMENT_CODE__CREATE_CODE);
		createEReference(platformLElementCodeEClass, PLATFORM_LELEMENT_CODE__UPDATE_CODE);
		createEReference(platformLElementCodeEClass, PLATFORM_LELEMENT_CODE__DELETE_CODE);

		platformControllCodeEClass = createEClass(PLATFORM_CONTROLL_CODE);
		createEReference(platformControllCodeEClass, PLATFORM_CONTROLL_CODE__HEATHER_CODE);
		createEReference(platformControllCodeEClass, PLATFORM_CONTROLL_CODE__FOOTER_CODE);
		createEReference(platformControllCodeEClass, PLATFORM_CONTROLL_CODE__CODE_SEPERATOR);

		platformOutputControllCodeEClass = createEClass(PLATFORM_OUTPUT_CONTROLL_CODE);

		platformInputControllCodeEClass = createEClass(PLATFORM_INPUT_CONTROLL_CODE);

		codeLineEClass = createEClass(CODE_LINE);
		createEAttribute(codeLineEClass, CODE_LINE__LINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		platformOutputControllCodeEClass.getESuperTypes().add(this.getPlatformControllCode());
		platformInputControllCodeEClass.getESuperTypes().add(this.getPlatformControllCode());

		// Initialize classes, features, and operations; add parameters
		initEClass(mappingDiagramEClass, MappingDiagram.class, "MappingDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingDiagram_EditorInputEvents(), this.getEditorInputEvent(), null, "editorInputEvents", null, 0, -1, MappingDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingDiagram_EditorOutputEvents(), this.getEditorOutputEvent(), null, "editorOutputEvents", null, 0, -1, MappingDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingDiagram_PlatformInputEvents(), this.getPlatformInputEventCode(), null, "platformInputEvents", null, 0, -1, MappingDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingDiagram_PlatformOutputEvents(), this.getPlatformOutputEventCode(), null, "platformOutputEvents", null, 0, -1, MappingDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingDiagram_PlatformIElementSetters(), this.getPlatformIElementCode(), null, "platformIElementSetters", null, 0, -1, MappingDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingDiagram_PlatformLElementOperations(), this.getPlatformLElementCode(), null, "platformLElementOperations", null, 0, -1, MappingDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingDiagram_PlatformOutputControll(), this.getPlatformOutputControllCode(), null, "platformOutputControll", null, 0, 1, MappingDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingDiagram_PlatformInputControll(), this.getPlatformInputControllCode(), null, "platformInputControll", null, 0, 1, MappingDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingDiagram_PlatformBaseCode(), this.getPlatformControllCode(), null, "platformBaseCode", null, 0, 1, MappingDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editorInputEventEClass, EditorInputEvent.class, "EditorInputEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditorInputEvent_Platform(), this.getPlatformInputEventCode(), this.getPlatformInputEventCode_Editor(), "platform", null, 0, -1, EditorInputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorInputEvent_Event(), ecorePackage.getEString(), "event", null, 0, 1, EditorInputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformInputEventCodeEClass, PlatformInputEventCode.class, "PlatformInputEventCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformInputEventCode_Editor(), this.getEditorInputEvent(), this.getEditorInputEvent_Platform(), "editor", null, 0, -1, PlatformInputEventCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformInputEventCode_ListnerCode(), this.getCodeLine(), null, "listnerCode", null, 0, -1, PlatformInputEventCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editorOutputEventEClass, EditorOutputEvent.class, "EditorOutputEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditorOutputEvent_Platform(), this.getPlatformOutputEventCode(), this.getPlatformOutputEventCode_Editor(), "platform", null, 0, -1, EditorOutputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditorOutputEvent_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, EditorOutputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformOutputEventCodeEClass, PlatformOutputEventCode.class, "PlatformOutputEventCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformOutputEventCode_Editor(), this.getEditorOutputEvent(), this.getEditorOutputEvent_Platform(), "editor", null, 0, -1, PlatformOutputEventCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformOutputEventCode_RaiseCode(), this.getCodeLine(), null, "raiseCode", null, 0, -1, PlatformOutputEventCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformIElementCodeEClass, PlatformIElementCode.class, "PlatformIElementCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformIElementCode_SetterCode(), this.getCodeLine(), null, "setterCode", null, 0, -1, PlatformIElementCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformLElementCodeEClass, PlatformLElementCode.class, "PlatformLElementCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformLElementCode_CreateCode(), this.getCodeLine(), null, "createCode", null, 0, -1, PlatformLElementCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformLElementCode_UpdateCode(), this.getCodeLine(), null, "updateCode", null, 0, -1, PlatformLElementCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformLElementCode_DeleteCode(), this.getCodeLine(), null, "deleteCode", null, 0, -1, PlatformLElementCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformControllCodeEClass, PlatformControllCode.class, "PlatformControllCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformControllCode_HeatherCode(), this.getCodeLine(), null, "heatherCode", null, 0, -1, PlatformControllCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformControllCode_FooterCode(), this.getCodeLine(), null, "footerCode", null, 0, -1, PlatformControllCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformControllCode_CodeSeperator(), this.getCodeLine(), null, "codeSeperator", null, 0, 1, PlatformControllCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformOutputControllCodeEClass, PlatformOutputControllCode.class, "PlatformOutputControllCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(platformInputControllCodeEClass, PlatformInputControllCode.class, "PlatformInputControllCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeLineEClass, CodeLine.class, "CodeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeLine_Line(), ecorePackage.getEString(), "line", null, 0, 1, CodeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MappingPackageImpl
