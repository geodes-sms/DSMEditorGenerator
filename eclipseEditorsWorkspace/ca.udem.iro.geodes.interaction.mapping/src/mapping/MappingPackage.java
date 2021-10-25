/**
 */
package mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://udem.iro.geodes.ca/mapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingPackage eINSTANCE = mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link mapping.impl.MappingDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.MappingDiagramImpl
	 * @see mapping.impl.MappingPackageImpl#getMappingDiagram()
	 * @generated
	 */
	int MAPPING_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Editor Input Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Editor Output Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Platform Input Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS = 2;

	/**
	 * The feature id for the '<em><b>Platform Output Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Platform IElement Setters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS = 4;

	/**
	 * The feature id for the '<em><b>Platform LElement Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS = 5;

	/**
	 * The feature id for the '<em><b>Platform Output Controll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL = 6;

	/**
	 * The feature id for the '<em><b>Platform Input Controll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL = 7;

	/**
	 * The feature id for the '<em><b>Platform Base Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM__PLATFORM_BASE_CODE = 8;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.EditorInputEventImpl <em>Editor Input Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.EditorInputEventImpl
	 * @see mapping.impl.MappingPackageImpl#getEditorInputEvent()
	 * @generated
	 */
	int EDITOR_INPUT_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_INPUT_EVENT__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_INPUT_EVENT__EVENT = 1;

	/**
	 * The number of structural features of the '<em>Editor Input Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_INPUT_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Editor Input Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_INPUT_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.PlatformInputEventCodeImpl <em>Platform Input Event Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.PlatformInputEventCodeImpl
	 * @see mapping.impl.MappingPackageImpl#getPlatformInputEventCode()
	 * @generated
	 */
	int PLATFORM_INPUT_EVENT_CODE = 2;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_INPUT_EVENT_CODE__EDITOR = 0;

	/**
	 * The feature id for the '<em><b>Listner Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_INPUT_EVENT_CODE__LISTNER_CODE = 1;

	/**
	 * The number of structural features of the '<em>Platform Input Event Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_INPUT_EVENT_CODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Platform Input Event Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_INPUT_EVENT_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.EditorOutputEventImpl <em>Editor Output Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.EditorOutputEventImpl
	 * @see mapping.impl.MappingPackageImpl#getEditorOutputEvent()
	 * @generated
	 */
	int EDITOR_OUTPUT_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OUTPUT_EVENT__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OUTPUT_EVENT__OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Editor Output Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OUTPUT_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Editor Output Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OUTPUT_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.PlatformOutputEventCodeImpl <em>Platform Output Event Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.PlatformOutputEventCodeImpl
	 * @see mapping.impl.MappingPackageImpl#getPlatformOutputEventCode()
	 * @generated
	 */
	int PLATFORM_OUTPUT_EVENT_CODE = 4;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OUTPUT_EVENT_CODE__EDITOR = 0;

	/**
	 * The feature id for the '<em><b>Raise Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OUTPUT_EVENT_CODE__RAISE_CODE = 1;

	/**
	 * The number of structural features of the '<em>Platform Output Event Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OUTPUT_EVENT_CODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Platform Output Event Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OUTPUT_EVENT_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.PlatformIElementCodeImpl <em>Platform IElement Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.PlatformIElementCodeImpl
	 * @see mapping.impl.MappingPackageImpl#getPlatformIElementCode()
	 * @generated
	 */
	int PLATFORM_IELEMENT_CODE = 5;

	/**
	 * The feature id for the '<em><b>Setter Code</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_IELEMENT_CODE__SETTER_CODE = 0;

	/**
	 * The number of structural features of the '<em>Platform IElement Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_IELEMENT_CODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Platform IElement Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_IELEMENT_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.PlatformLElementCodeImpl <em>Platform LElement Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.PlatformLElementCodeImpl
	 * @see mapping.impl.MappingPackageImpl#getPlatformLElementCode()
	 * @generated
	 */
	int PLATFORM_LELEMENT_CODE = 6;

	/**
	 * The feature id for the '<em><b>Create Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_LELEMENT_CODE__CREATE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Update Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_LELEMENT_CODE__UPDATE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Delete Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_LELEMENT_CODE__DELETE_CODE = 2;

	/**
	 * The number of structural features of the '<em>Platform LElement Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_LELEMENT_CODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Platform LElement Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_LELEMENT_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.PlatformControllCodeImpl <em>Platform Controll Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.PlatformControllCodeImpl
	 * @see mapping.impl.MappingPackageImpl#getPlatformControllCode()
	 * @generated
	 */
	int PLATFORM_CONTROLL_CODE = 7;

	/**
	 * The feature id for the '<em><b>Heather Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONTROLL_CODE__HEATHER_CODE = 0;

	/**
	 * The feature id for the '<em><b>Footer Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONTROLL_CODE__FOOTER_CODE = 1;

	/**
	 * The feature id for the '<em><b>Code Seperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONTROLL_CODE__CODE_SEPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Platform Controll Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONTROLL_CODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Platform Controll Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_CONTROLL_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.PlatformOutputControllCodeImpl <em>Platform Output Controll Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.PlatformOutputControllCodeImpl
	 * @see mapping.impl.MappingPackageImpl#getPlatformOutputControllCode()
	 * @generated
	 */
	int PLATFORM_OUTPUT_CONTROLL_CODE = 8;

	/**
	 * The feature id for the '<em><b>Heather Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OUTPUT_CONTROLL_CODE__HEATHER_CODE = PLATFORM_CONTROLL_CODE__HEATHER_CODE;

	/**
	 * The feature id for the '<em><b>Footer Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OUTPUT_CONTROLL_CODE__FOOTER_CODE = PLATFORM_CONTROLL_CODE__FOOTER_CODE;

	/**
	 * The feature id for the '<em><b>Code Seperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OUTPUT_CONTROLL_CODE__CODE_SEPERATOR = PLATFORM_CONTROLL_CODE__CODE_SEPERATOR;

	/**
	 * The number of structural features of the '<em>Platform Output Controll Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OUTPUT_CONTROLL_CODE_FEATURE_COUNT = PLATFORM_CONTROLL_CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform Output Controll Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OUTPUT_CONTROLL_CODE_OPERATION_COUNT = PLATFORM_CONTROLL_CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mapping.impl.PlatformInputControllCodeImpl <em>Platform Input Controll Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.PlatformInputControllCodeImpl
	 * @see mapping.impl.MappingPackageImpl#getPlatformInputControllCode()
	 * @generated
	 */
	int PLATFORM_INPUT_CONTROLL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Heather Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_INPUT_CONTROLL_CODE__HEATHER_CODE = PLATFORM_CONTROLL_CODE__HEATHER_CODE;

	/**
	 * The feature id for the '<em><b>Footer Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_INPUT_CONTROLL_CODE__FOOTER_CODE = PLATFORM_CONTROLL_CODE__FOOTER_CODE;

	/**
	 * The feature id for the '<em><b>Code Seperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_INPUT_CONTROLL_CODE__CODE_SEPERATOR = PLATFORM_CONTROLL_CODE__CODE_SEPERATOR;

	/**
	 * The number of structural features of the '<em>Platform Input Controll Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_INPUT_CONTROLL_CODE_FEATURE_COUNT = PLATFORM_CONTROLL_CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform Input Controll Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_INPUT_CONTROLL_CODE_OPERATION_COUNT = PLATFORM_CONTROLL_CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mapping.impl.CodeLineImpl <em>Code Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.CodeLineImpl
	 * @see mapping.impl.MappingPackageImpl#getCodeLine()
	 * @generated
	 */
	int CODE_LINE = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE__LINE = 0;

	/**
	 * The number of structural features of the '<em>Code Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Code Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mapping.MappingDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see mapping.MappingDiagram
	 * @generated
	 */
	EClass getMappingDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingDiagram#getEditorInputEvents <em>Editor Input Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editor Input Events</em>'.
	 * @see mapping.MappingDiagram#getEditorInputEvents()
	 * @see #getMappingDiagram()
	 * @generated
	 */
	EReference getMappingDiagram_EditorInputEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingDiagram#getEditorOutputEvents <em>Editor Output Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editor Output Events</em>'.
	 * @see mapping.MappingDiagram#getEditorOutputEvents()
	 * @see #getMappingDiagram()
	 * @generated
	 */
	EReference getMappingDiagram_EditorOutputEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingDiagram#getPlatformInputEvents <em>Platform Input Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Input Events</em>'.
	 * @see mapping.MappingDiagram#getPlatformInputEvents()
	 * @see #getMappingDiagram()
	 * @generated
	 */
	EReference getMappingDiagram_PlatformInputEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingDiagram#getPlatformOutputEvents <em>Platform Output Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Output Events</em>'.
	 * @see mapping.MappingDiagram#getPlatformOutputEvents()
	 * @see #getMappingDiagram()
	 * @generated
	 */
	EReference getMappingDiagram_PlatformOutputEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingDiagram#getPlatformIElementSetters <em>Platform IElement Setters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform IElement Setters</em>'.
	 * @see mapping.MappingDiagram#getPlatformIElementSetters()
	 * @see #getMappingDiagram()
	 * @generated
	 */
	EReference getMappingDiagram_PlatformIElementSetters();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingDiagram#getPlatformLElementOperations <em>Platform LElement Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform LElement Operations</em>'.
	 * @see mapping.MappingDiagram#getPlatformLElementOperations()
	 * @see #getMappingDiagram()
	 * @generated
	 */
	EReference getMappingDiagram_PlatformLElementOperations();

	/**
	 * Returns the meta object for the containment reference '{@link mapping.MappingDiagram#getPlatformOutputControll <em>Platform Output Controll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform Output Controll</em>'.
	 * @see mapping.MappingDiagram#getPlatformOutputControll()
	 * @see #getMappingDiagram()
	 * @generated
	 */
	EReference getMappingDiagram_PlatformOutputControll();

	/**
	 * Returns the meta object for the containment reference '{@link mapping.MappingDiagram#getPlatformInputControll <em>Platform Input Controll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform Input Controll</em>'.
	 * @see mapping.MappingDiagram#getPlatformInputControll()
	 * @see #getMappingDiagram()
	 * @generated
	 */
	EReference getMappingDiagram_PlatformInputControll();

	/**
	 * Returns the meta object for the containment reference '{@link mapping.MappingDiagram#getPlatformBaseCode <em>Platform Base Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform Base Code</em>'.
	 * @see mapping.MappingDiagram#getPlatformBaseCode()
	 * @see #getMappingDiagram()
	 * @generated
	 */
	EReference getMappingDiagram_PlatformBaseCode();

	/**
	 * Returns the meta object for class '{@link mapping.EditorInputEvent <em>Editor Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor Input Event</em>'.
	 * @see mapping.EditorInputEvent
	 * @generated
	 */
	EClass getEditorInputEvent();

	/**
	 * Returns the meta object for the reference list '{@link mapping.EditorInputEvent#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Platform</em>'.
	 * @see mapping.EditorInputEvent#getPlatform()
	 * @see #getEditorInputEvent()
	 * @generated
	 */
	EReference getEditorInputEvent_Platform();

	/**
	 * Returns the meta object for the attribute '{@link mapping.EditorInputEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see mapping.EditorInputEvent#getEvent()
	 * @see #getEditorInputEvent()
	 * @generated
	 */
	EAttribute getEditorInputEvent_Event();

	/**
	 * Returns the meta object for class '{@link mapping.PlatformInputEventCode <em>Platform Input Event Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Input Event Code</em>'.
	 * @see mapping.PlatformInputEventCode
	 * @generated
	 */
	EClass getPlatformInputEventCode();

	/**
	 * Returns the meta object for the reference list '{@link mapping.PlatformInputEventCode#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editor</em>'.
	 * @see mapping.PlatformInputEventCode#getEditor()
	 * @see #getPlatformInputEventCode()
	 * @generated
	 */
	EReference getPlatformInputEventCode_Editor();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.PlatformInputEventCode#getListnerCode <em>Listner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listner Code</em>'.
	 * @see mapping.PlatformInputEventCode#getListnerCode()
	 * @see #getPlatformInputEventCode()
	 * @generated
	 */
	EReference getPlatformInputEventCode_ListnerCode();

	/**
	 * Returns the meta object for class '{@link mapping.EditorOutputEvent <em>Editor Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor Output Event</em>'.
	 * @see mapping.EditorOutputEvent
	 * @generated
	 */
	EClass getEditorOutputEvent();

	/**
	 * Returns the meta object for the reference list '{@link mapping.EditorOutputEvent#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Platform</em>'.
	 * @see mapping.EditorOutputEvent#getPlatform()
	 * @see #getEditorOutputEvent()
	 * @generated
	 */
	EReference getEditorOutputEvent_Platform();

	/**
	 * Returns the meta object for the attribute '{@link mapping.EditorOutputEvent#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see mapping.EditorOutputEvent#getOperation()
	 * @see #getEditorOutputEvent()
	 * @generated
	 */
	EAttribute getEditorOutputEvent_Operation();

	/**
	 * Returns the meta object for class '{@link mapping.PlatformOutputEventCode <em>Platform Output Event Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Output Event Code</em>'.
	 * @see mapping.PlatformOutputEventCode
	 * @generated
	 */
	EClass getPlatformOutputEventCode();

	/**
	 * Returns the meta object for the reference list '{@link mapping.PlatformOutputEventCode#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editor</em>'.
	 * @see mapping.PlatformOutputEventCode#getEditor()
	 * @see #getPlatformOutputEventCode()
	 * @generated
	 */
	EReference getPlatformOutputEventCode_Editor();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.PlatformOutputEventCode#getRaiseCode <em>Raise Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raise Code</em>'.
	 * @see mapping.PlatformOutputEventCode#getRaiseCode()
	 * @see #getPlatformOutputEventCode()
	 * @generated
	 */
	EReference getPlatformOutputEventCode_RaiseCode();

	/**
	 * Returns the meta object for class '{@link mapping.PlatformIElementCode <em>Platform IElement Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform IElement Code</em>'.
	 * @see mapping.PlatformIElementCode
	 * @generated
	 */
	EClass getPlatformIElementCode();

	/**
	 * Returns the meta object for the reference list '{@link mapping.PlatformIElementCode#getSetterCode <em>Setter Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setter Code</em>'.
	 * @see mapping.PlatformIElementCode#getSetterCode()
	 * @see #getPlatformIElementCode()
	 * @generated
	 */
	EReference getPlatformIElementCode_SetterCode();

	/**
	 * Returns the meta object for class '{@link mapping.PlatformLElementCode <em>Platform LElement Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform LElement Code</em>'.
	 * @see mapping.PlatformLElementCode
	 * @generated
	 */
	EClass getPlatformLElementCode();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.PlatformLElementCode#getCreateCode <em>Create Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Code</em>'.
	 * @see mapping.PlatformLElementCode#getCreateCode()
	 * @see #getPlatformLElementCode()
	 * @generated
	 */
	EReference getPlatformLElementCode_CreateCode();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.PlatformLElementCode#getUpdateCode <em>Update Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update Code</em>'.
	 * @see mapping.PlatformLElementCode#getUpdateCode()
	 * @see #getPlatformLElementCode()
	 * @generated
	 */
	EReference getPlatformLElementCode_UpdateCode();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.PlatformLElementCode#getDeleteCode <em>Delete Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Code</em>'.
	 * @see mapping.PlatformLElementCode#getDeleteCode()
	 * @see #getPlatformLElementCode()
	 * @generated
	 */
	EReference getPlatformLElementCode_DeleteCode();

	/**
	 * Returns the meta object for class '{@link mapping.PlatformControllCode <em>Platform Controll Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Controll Code</em>'.
	 * @see mapping.PlatformControllCode
	 * @generated
	 */
	EClass getPlatformControllCode();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.PlatformControllCode#getHeatherCode <em>Heather Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Heather Code</em>'.
	 * @see mapping.PlatformControllCode#getHeatherCode()
	 * @see #getPlatformControllCode()
	 * @generated
	 */
	EReference getPlatformControllCode_HeatherCode();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.PlatformControllCode#getFooterCode <em>Footer Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Footer Code</em>'.
	 * @see mapping.PlatformControllCode#getFooterCode()
	 * @see #getPlatformControllCode()
	 * @generated
	 */
	EReference getPlatformControllCode_FooterCode();

	/**
	 * Returns the meta object for the containment reference '{@link mapping.PlatformControllCode#getCodeSeperator <em>Code Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Seperator</em>'.
	 * @see mapping.PlatformControllCode#getCodeSeperator()
	 * @see #getPlatformControllCode()
	 * @generated
	 */
	EReference getPlatformControllCode_CodeSeperator();

	/**
	 * Returns the meta object for class '{@link mapping.PlatformOutputControllCode <em>Platform Output Controll Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Output Controll Code</em>'.
	 * @see mapping.PlatformOutputControllCode
	 * @generated
	 */
	EClass getPlatformOutputControllCode();

	/**
	 * Returns the meta object for class '{@link mapping.PlatformInputControllCode <em>Platform Input Controll Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Input Controll Code</em>'.
	 * @see mapping.PlatformInputControllCode
	 * @generated
	 */
	EClass getPlatformInputControllCode();

	/**
	 * Returns the meta object for class '{@link mapping.CodeLine <em>Code Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Line</em>'.
	 * @see mapping.CodeLine
	 * @generated
	 */
	EClass getCodeLine();

	/**
	 * Returns the meta object for the attribute '{@link mapping.CodeLine#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see mapping.CodeLine#getLine()
	 * @see #getCodeLine()
	 * @generated
	 */
	EAttribute getCodeLine_Line();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingFactory getMappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mapping.impl.MappingDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.MappingDiagramImpl
		 * @see mapping.impl.MappingPackageImpl#getMappingDiagram()
		 * @generated
		 */
		EClass MAPPING_DIAGRAM = eINSTANCE.getMappingDiagram();

		/**
		 * The meta object literal for the '<em><b>Editor Input Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS = eINSTANCE.getMappingDiagram_EditorInputEvents();

		/**
		 * The meta object literal for the '<em><b>Editor Output Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS = eINSTANCE.getMappingDiagram_EditorOutputEvents();

		/**
		 * The meta object literal for the '<em><b>Platform Input Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS = eINSTANCE.getMappingDiagram_PlatformInputEvents();

		/**
		 * The meta object literal for the '<em><b>Platform Output Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS = eINSTANCE.getMappingDiagram_PlatformOutputEvents();

		/**
		 * The meta object literal for the '<em><b>Platform IElement Setters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS = eINSTANCE.getMappingDiagram_PlatformIElementSetters();

		/**
		 * The meta object literal for the '<em><b>Platform LElement Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS = eINSTANCE.getMappingDiagram_PlatformLElementOperations();

		/**
		 * The meta object literal for the '<em><b>Platform Output Controll</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL = eINSTANCE.getMappingDiagram_PlatformOutputControll();

		/**
		 * The meta object literal for the '<em><b>Platform Input Controll</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL = eINSTANCE.getMappingDiagram_PlatformInputControll();

		/**
		 * The meta object literal for the '<em><b>Platform Base Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_DIAGRAM__PLATFORM_BASE_CODE = eINSTANCE.getMappingDiagram_PlatformBaseCode();

		/**
		 * The meta object literal for the '{@link mapping.impl.EditorInputEventImpl <em>Editor Input Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.EditorInputEventImpl
		 * @see mapping.impl.MappingPackageImpl#getEditorInputEvent()
		 * @generated
		 */
		EClass EDITOR_INPUT_EVENT = eINSTANCE.getEditorInputEvent();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR_INPUT_EVENT__PLATFORM = eINSTANCE.getEditorInputEvent_Platform();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR_INPUT_EVENT__EVENT = eINSTANCE.getEditorInputEvent_Event();

		/**
		 * The meta object literal for the '{@link mapping.impl.PlatformInputEventCodeImpl <em>Platform Input Event Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.PlatformInputEventCodeImpl
		 * @see mapping.impl.MappingPackageImpl#getPlatformInputEventCode()
		 * @generated
		 */
		EClass PLATFORM_INPUT_EVENT_CODE = eINSTANCE.getPlatformInputEventCode();

		/**
		 * The meta object literal for the '<em><b>Editor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_INPUT_EVENT_CODE__EDITOR = eINSTANCE.getPlatformInputEventCode_Editor();

		/**
		 * The meta object literal for the '<em><b>Listner Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_INPUT_EVENT_CODE__LISTNER_CODE = eINSTANCE.getPlatformInputEventCode_ListnerCode();

		/**
		 * The meta object literal for the '{@link mapping.impl.EditorOutputEventImpl <em>Editor Output Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.EditorOutputEventImpl
		 * @see mapping.impl.MappingPackageImpl#getEditorOutputEvent()
		 * @generated
		 */
		EClass EDITOR_OUTPUT_EVENT = eINSTANCE.getEditorOutputEvent();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR_OUTPUT_EVENT__PLATFORM = eINSTANCE.getEditorOutputEvent_Platform();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR_OUTPUT_EVENT__OPERATION = eINSTANCE.getEditorOutputEvent_Operation();

		/**
		 * The meta object literal for the '{@link mapping.impl.PlatformOutputEventCodeImpl <em>Platform Output Event Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.PlatformOutputEventCodeImpl
		 * @see mapping.impl.MappingPackageImpl#getPlatformOutputEventCode()
		 * @generated
		 */
		EClass PLATFORM_OUTPUT_EVENT_CODE = eINSTANCE.getPlatformOutputEventCode();

		/**
		 * The meta object literal for the '<em><b>Editor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_OUTPUT_EVENT_CODE__EDITOR = eINSTANCE.getPlatformOutputEventCode_Editor();

		/**
		 * The meta object literal for the '<em><b>Raise Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_OUTPUT_EVENT_CODE__RAISE_CODE = eINSTANCE.getPlatformOutputEventCode_RaiseCode();

		/**
		 * The meta object literal for the '{@link mapping.impl.PlatformIElementCodeImpl <em>Platform IElement Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.PlatformIElementCodeImpl
		 * @see mapping.impl.MappingPackageImpl#getPlatformIElementCode()
		 * @generated
		 */
		EClass PLATFORM_IELEMENT_CODE = eINSTANCE.getPlatformIElementCode();

		/**
		 * The meta object literal for the '<em><b>Setter Code</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_IELEMENT_CODE__SETTER_CODE = eINSTANCE.getPlatformIElementCode_SetterCode();

		/**
		 * The meta object literal for the '{@link mapping.impl.PlatformLElementCodeImpl <em>Platform LElement Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.PlatformLElementCodeImpl
		 * @see mapping.impl.MappingPackageImpl#getPlatformLElementCode()
		 * @generated
		 */
		EClass PLATFORM_LELEMENT_CODE = eINSTANCE.getPlatformLElementCode();

		/**
		 * The meta object literal for the '<em><b>Create Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_LELEMENT_CODE__CREATE_CODE = eINSTANCE.getPlatformLElementCode_CreateCode();

		/**
		 * The meta object literal for the '<em><b>Update Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_LELEMENT_CODE__UPDATE_CODE = eINSTANCE.getPlatformLElementCode_UpdateCode();

		/**
		 * The meta object literal for the '<em><b>Delete Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_LELEMENT_CODE__DELETE_CODE = eINSTANCE.getPlatformLElementCode_DeleteCode();

		/**
		 * The meta object literal for the '{@link mapping.impl.PlatformControllCodeImpl <em>Platform Controll Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.PlatformControllCodeImpl
		 * @see mapping.impl.MappingPackageImpl#getPlatformControllCode()
		 * @generated
		 */
		EClass PLATFORM_CONTROLL_CODE = eINSTANCE.getPlatformControllCode();

		/**
		 * The meta object literal for the '<em><b>Heather Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_CONTROLL_CODE__HEATHER_CODE = eINSTANCE.getPlatformControllCode_HeatherCode();

		/**
		 * The meta object literal for the '<em><b>Footer Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_CONTROLL_CODE__FOOTER_CODE = eINSTANCE.getPlatformControllCode_FooterCode();

		/**
		 * The meta object literal for the '<em><b>Code Seperator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_CONTROLL_CODE__CODE_SEPERATOR = eINSTANCE.getPlatformControllCode_CodeSeperator();

		/**
		 * The meta object literal for the '{@link mapping.impl.PlatformOutputControllCodeImpl <em>Platform Output Controll Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.PlatformOutputControllCodeImpl
		 * @see mapping.impl.MappingPackageImpl#getPlatformOutputControllCode()
		 * @generated
		 */
		EClass PLATFORM_OUTPUT_CONTROLL_CODE = eINSTANCE.getPlatformOutputControllCode();

		/**
		 * The meta object literal for the '{@link mapping.impl.PlatformInputControllCodeImpl <em>Platform Input Controll Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.PlatformInputControllCodeImpl
		 * @see mapping.impl.MappingPackageImpl#getPlatformInputControllCode()
		 * @generated
		 */
		EClass PLATFORM_INPUT_CONTROLL_CODE = eINSTANCE.getPlatformInputControllCode();

		/**
		 * The meta object literal for the '{@link mapping.impl.CodeLineImpl <em>Code Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.CodeLineImpl
		 * @see mapping.impl.MappingPackageImpl#getCodeLine()
		 * @generated
		 */
		EClass CODE_LINE = eINSTANCE.getCodeLine();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LINE__LINE = eINSTANCE.getCodeLine_Line();

	}

} //MappingPackage
