/**
 */
package layoutRel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see layoutRel.LayoutRelFactory
 * @model kind="package"
 * @generated
 */
public interface LayoutRelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "layoutRel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://udem.iro.geodes.ca/layoutRel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "layoutRel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayoutRelPackage eINSTANCE = layoutRel.impl.LayoutRelPackageImpl.init();

	/**
	 * The meta object id for the '{@link layoutRel.impl.RelLayoutDiagramImpl <em>Rel Layout Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.RelLayoutDiagramImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getRelLayoutDiagram()
	 * @generated
	 */
	int REL_LAYOUT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_LAYOUT_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interaction Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_LAYOUT_DIAGRAM__INTERACTION_STREAMS = 1;

	/**
	 * The number of structural features of the '<em>Rel Layout Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_LAYOUT_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rel Layout Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_LAYOUT_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.InteractionStreamImpl <em>Interaction Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.InteractionStreamImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getInteractionStream()
	 * @generated
	 */
	int INTERACTION_STREAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_STREAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_STREAM__LAYERS = 1;

	/**
	 * The number of structural features of the '<em>Interaction Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_STREAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interaction Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_STREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.LayerImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__BEHAVIOUR = 3;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.ComponentImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.ElementImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__XPOS = 2;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__YPOS = 3;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_DEFAULT = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.ContainerElementImpl <em>Container Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.ContainerElementImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getContainerElement()
	 * @generated
	 */
	int CONTAINER_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__XPOS = ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__YPOS = ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__IS_DEFAULT = ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__ELEMENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__VISIBILITY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.ElemSequenceImpl <em>Elem Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.ElemSequenceImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getElemSequence()
	 * @generated
	 */
	int ELEM_SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SEQUENCE__ID = CONTAINER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SEQUENCE__NAME = CONTAINER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SEQUENCE__XPOS = CONTAINER_ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SEQUENCE__YPOS = CONTAINER_ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SEQUENCE__IS_DEFAULT = CONTAINER_ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SEQUENCE__ELEMENTS = CONTAINER_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SEQUENCE__VISIBILITY = CONTAINER_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Elem Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SEQUENCE_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elem Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SEQUENCE_OPERATION_COUNT = CONTAINER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.ElemSelectorImpl <em>Elem Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.ElemSelectorImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getElemSelector()
	 * @generated
	 */
	int ELEM_SELECTOR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SELECTOR__ID = CONTAINER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SELECTOR__NAME = CONTAINER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SELECTOR__XPOS = CONTAINER_ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SELECTOR__YPOS = CONTAINER_ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SELECTOR__IS_DEFAULT = CONTAINER_ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SELECTOR__ELEMENTS = CONTAINER_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SELECTOR__VISIBILITY = CONTAINER_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Elem Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SELECTOR_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elem Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_SELECTOR_OPERATION_COUNT = CONTAINER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.VisualContainerImpl <em>Visual Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.VisualContainerImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getVisualContainer()
	 * @generated
	 */
	int VISUAL_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONTAINER__ID = CONTAINER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONTAINER__NAME = CONTAINER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONTAINER__XPOS = CONTAINER_ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONTAINER__YPOS = CONTAINER_ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONTAINER__IS_DEFAULT = CONTAINER_ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONTAINER__ELEMENTS = CONTAINER_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONTAINER__VISIBILITY = CONTAINER_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONTAINER__BEHAVIOUR = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visual Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONTAINER_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Visual Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONTAINER_OPERATION_COUNT = CONTAINER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.VisualElementImpl <em>Visual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.VisualElementImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getVisualElement()
	 * @generated
	 */
	int VISUAL_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT__XPOS = ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT__YPOS = ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT__IS_DEFAULT = ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT__XSIZE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT__YSIZE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreground Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT__FOREGROUND_COLOUR = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT__BACKGROUND_COLOUR = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT__REF = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Visual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Visual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.ImageImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = VISUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = VISUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__XPOS = VISUAL_ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__YPOS = VISUAL_ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IS_DEFAULT = VISUAL_ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__XSIZE = VISUAL_ELEMENT__XSIZE;

	/**
	 * The feature id for the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__YSIZE = VISUAL_ELEMENT__YSIZE;

	/**
	 * The feature id for the '<em><b>Foreground Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FOREGROUND_COLOUR = VISUAL_ELEMENT__FOREGROUND_COLOUR;

	/**
	 * The feature id for the '<em><b>Background Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BACKGROUND_COLOUR = VISUAL_ELEMENT__BACKGROUND_COLOUR;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__REF = VISUAL_ELEMENT__REF;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = VISUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = VISUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.TextImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = VISUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = VISUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__XPOS = VISUAL_ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__YPOS = VISUAL_ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__IS_DEFAULT = VISUAL_ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__XSIZE = VISUAL_ELEMENT__XSIZE;

	/**
	 * The feature id for the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__YSIZE = VISUAL_ELEMENT__YSIZE;

	/**
	 * The feature id for the '<em><b>Foreground Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FOREGROUND_COLOUR = VISUAL_ELEMENT__FOREGROUND_COLOUR;

	/**
	 * The feature id for the '<em><b>Background Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__BACKGROUND_COLOUR = VISUAL_ELEMENT__BACKGROUND_COLOUR;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__REF = VISUAL_ELEMENT__REF;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = VISUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = VISUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.WidgetImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ID = VISUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = VISUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__XPOS = VISUAL_ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__YPOS = VISUAL_ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IS_DEFAULT = VISUAL_ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__XSIZE = VISUAL_ELEMENT__XSIZE;

	/**
	 * The feature id for the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__YSIZE = VISUAL_ELEMENT__YSIZE;

	/**
	 * The feature id for the '<em><b>Foreground Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__FOREGROUND_COLOUR = VISUAL_ELEMENT__FOREGROUND_COLOUR;

	/**
	 * The feature id for the '<em><b>Background Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__BACKGROUND_COLOUR = VISUAL_ELEMENT__BACKGROUND_COLOUR;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__REF = VISUAL_ELEMENT__REF;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = VISUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = VISUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.TextWidgetImpl <em>Text Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.TextWidgetImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getTextWidget()
	 * @generated
	 */
	int TEXT_WIDGET = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__IS_DEFAULT = WIDGET__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__XSIZE = WIDGET__XSIZE;

	/**
	 * The feature id for the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__YSIZE = WIDGET__YSIZE;

	/**
	 * The feature id for the '<em><b>Foreground Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__FOREGROUND_COLOUR = WIDGET__FOREGROUND_COLOUR;

	/**
	 * The feature id for the '<em><b>Background Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__BACKGROUND_COLOUR = WIDGET__BACKGROUND_COLOUR;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__REF = WIDGET__REF;

	/**
	 * The number of structural features of the '<em>Text Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.ButtonWidgetImpl <em>Button Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.ButtonWidgetImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getButtonWidget()
	 * @generated
	 */
	int BUTTON_WIDGET = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__IS_DEFAULT = WIDGET__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__XSIZE = WIDGET__XSIZE;

	/**
	 * The feature id for the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__YSIZE = WIDGET__YSIZE;

	/**
	 * The feature id for the '<em><b>Foreground Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__FOREGROUND_COLOUR = WIDGET__FOREGROUND_COLOUR;

	/**
	 * The feature id for the '<em><b>Background Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__BACKGROUND_COLOUR = WIDGET__BACKGROUND_COLOUR;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET__REF = WIDGET__REF;

	/**
	 * The number of structural features of the '<em>Button Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_WIDGET_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.impl.CanvasImpl
	 * @see layoutRel.impl.LayoutRelPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__XPOS = ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__YPOS = ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__IS_DEFAULT = ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ACTIVE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grid Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__GRID_SIZE_X = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grid Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__GRID_SIZE_Y = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Grid Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__GRID_SCALE_X = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grid Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__GRID_SCALE_Y = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layoutRel.ContainmentBehaviour <em>Containment Behaviour</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layoutRel.ContainmentBehaviour
	 * @see layoutRel.impl.LayoutRelPackageImpl#getContainmentBehaviour()
	 * @generated
	 */
	int CONTAINMENT_BEHAVIOUR = 16;


	/**
	 * Returns the meta object for class '{@link layoutRel.RelLayoutDiagram <em>Rel Layout Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rel Layout Diagram</em>'.
	 * @see layoutRel.RelLayoutDiagram
	 * @generated
	 */
	EClass getRelLayoutDiagram();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.RelLayoutDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see layoutRel.RelLayoutDiagram#getName()
	 * @see #getRelLayoutDiagram()
	 * @generated
	 */
	EAttribute getRelLayoutDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link layoutRel.RelLayoutDiagram#getInteractionStreams <em>Interaction Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Streams</em>'.
	 * @see layoutRel.RelLayoutDiagram#getInteractionStreams()
	 * @see #getRelLayoutDiagram()
	 * @generated
	 */
	EReference getRelLayoutDiagram_InteractionStreams();

	/**
	 * Returns the meta object for class '{@link layoutRel.InteractionStream <em>Interaction Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Stream</em>'.
	 * @see layoutRel.InteractionStream
	 * @generated
	 */
	EClass getInteractionStream();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.InteractionStream#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see layoutRel.InteractionStream#getName()
	 * @see #getInteractionStream()
	 * @generated
	 */
	EAttribute getInteractionStream_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link layoutRel.InteractionStream#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see layoutRel.InteractionStream#getLayers()
	 * @see #getInteractionStream()
	 * @generated
	 */
	EReference getInteractionStream_Layers();

	/**
	 * Returns the meta object for class '{@link layoutRel.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see layoutRel.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Layer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see layoutRel.Layer#getName()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Layer#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see layoutRel.Layer#getIndex()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link layoutRel.Layer#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see layoutRel.Layer#getComponents()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Components();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Layer#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behaviour</em>'.
	 * @see layoutRel.Layer#getBehaviour()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Behaviour();

	/**
	 * Returns the meta object for class '{@link layoutRel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see layoutRel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference '{@link layoutRel.Component#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see layoutRel.Component#getElement()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Element();

	/**
	 * Returns the meta object for class '{@link layoutRel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see layoutRel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see layoutRel.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see layoutRel.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Element#getXPos <em>XPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPos</em>'.
	 * @see layoutRel.Element#getXPos()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_XPos();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Element#getYPos <em>YPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPos</em>'.
	 * @see layoutRel.Element#getYPos()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_YPos();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Element#isIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see layoutRel.Element#isIsDefault()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsDefault();

	/**
	 * Returns the meta object for class '{@link layoutRel.ContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Element</em>'.
	 * @see layoutRel.ContainerElement
	 * @generated
	 */
	EClass getContainerElement();

	/**
	 * Returns the meta object for the containment reference list '{@link layoutRel.ContainerElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see layoutRel.ContainerElement#getElements()
	 * @see #getContainerElement()
	 * @generated
	 */
	EReference getContainerElement_Elements();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.ContainerElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see layoutRel.ContainerElement#getVisibility()
	 * @see #getContainerElement()
	 * @generated
	 */
	EAttribute getContainerElement_Visibility();

	/**
	 * Returns the meta object for class '{@link layoutRel.ElemSequence <em>Elem Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elem Sequence</em>'.
	 * @see layoutRel.ElemSequence
	 * @generated
	 */
	EClass getElemSequence();

	/**
	 * Returns the meta object for class '{@link layoutRel.ElemSelector <em>Elem Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elem Selector</em>'.
	 * @see layoutRel.ElemSelector
	 * @generated
	 */
	EClass getElemSelector();

	/**
	 * Returns the meta object for class '{@link layoutRel.VisualContainer <em>Visual Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Container</em>'.
	 * @see layoutRel.VisualContainer
	 * @generated
	 */
	EClass getVisualContainer();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.VisualContainer#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behaviour</em>'.
	 * @see layoutRel.VisualContainer#getBehaviour()
	 * @see #getVisualContainer()
	 * @generated
	 */
	EAttribute getVisualContainer_Behaviour();

	/**
	 * Returns the meta object for class '{@link layoutRel.VisualElement <em>Visual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Element</em>'.
	 * @see layoutRel.VisualElement
	 * @generated
	 */
	EClass getVisualElement();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.VisualElement#getXSize <em>XSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XSize</em>'.
	 * @see layoutRel.VisualElement#getXSize()
	 * @see #getVisualElement()
	 * @generated
	 */
	EAttribute getVisualElement_XSize();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.VisualElement#getYSize <em>YSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YSize</em>'.
	 * @see layoutRel.VisualElement#getYSize()
	 * @see #getVisualElement()
	 * @generated
	 */
	EAttribute getVisualElement_YSize();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.VisualElement#getForegroundColour <em>Foreground Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Colour</em>'.
	 * @see layoutRel.VisualElement#getForegroundColour()
	 * @see #getVisualElement()
	 * @generated
	 */
	EAttribute getVisualElement_ForegroundColour();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.VisualElement#getBackgroundColour <em>Background Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Colour</em>'.
	 * @see layoutRel.VisualElement#getBackgroundColour()
	 * @see #getVisualElement()
	 * @generated
	 */
	EAttribute getVisualElement_BackgroundColour();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.VisualElement#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see layoutRel.VisualElement#getRef()
	 * @see #getVisualElement()
	 * @generated
	 */
	EAttribute getVisualElement_Ref();

	/**
	 * Returns the meta object for class '{@link layoutRel.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see layoutRel.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link layoutRel.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see layoutRel.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link layoutRel.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see layoutRel.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for class '{@link layoutRel.TextWidget <em>Text Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Widget</em>'.
	 * @see layoutRel.TextWidget
	 * @generated
	 */
	EClass getTextWidget();

	/**
	 * Returns the meta object for class '{@link layoutRel.ButtonWidget <em>Button Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Widget</em>'.
	 * @see layoutRel.ButtonWidget
	 * @generated
	 */
	EClass getButtonWidget();

	/**
	 * Returns the meta object for class '{@link layoutRel.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see layoutRel.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Canvas#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see layoutRel.Canvas#getActive()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_Active();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Canvas#getGridSizeX <em>Grid Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Size X</em>'.
	 * @see layoutRel.Canvas#getGridSizeX()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_GridSizeX();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Canvas#getGridSizeY <em>Grid Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Size Y</em>'.
	 * @see layoutRel.Canvas#getGridSizeY()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_GridSizeY();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Canvas#getGridScaleX <em>Grid Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Scale X</em>'.
	 * @see layoutRel.Canvas#getGridScaleX()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_GridScaleX();

	/**
	 * Returns the meta object for the attribute '{@link layoutRel.Canvas#getGridScaleY <em>Grid Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Scale Y</em>'.
	 * @see layoutRel.Canvas#getGridScaleY()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_GridScaleY();

	/**
	 * Returns the meta object for enum '{@link layoutRel.ContainmentBehaviour <em>Containment Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Containment Behaviour</em>'.
	 * @see layoutRel.ContainmentBehaviour
	 * @generated
	 */
	EEnum getContainmentBehaviour();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LayoutRelFactory getLayoutRelFactory();

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
		 * The meta object literal for the '{@link layoutRel.impl.RelLayoutDiagramImpl <em>Rel Layout Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.RelLayoutDiagramImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getRelLayoutDiagram()
		 * @generated
		 */
		EClass REL_LAYOUT_DIAGRAM = eINSTANCE.getRelLayoutDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REL_LAYOUT_DIAGRAM__NAME = eINSTANCE.getRelLayoutDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Interaction Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REL_LAYOUT_DIAGRAM__INTERACTION_STREAMS = eINSTANCE.getRelLayoutDiagram_InteractionStreams();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.InteractionStreamImpl <em>Interaction Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.InteractionStreamImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getInteractionStream()
		 * @generated
		 */
		EClass INTERACTION_STREAM = eINSTANCE.getInteractionStream();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_STREAM__NAME = eINSTANCE.getInteractionStream_Name();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_STREAM__LAYERS = eINSTANCE.getInteractionStream_Layers();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.LayerImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__INDEX = eINSTANCE.getLayer_Index();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__COMPONENTS = eINSTANCE.getLayer_Components();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__BEHAVIOUR = eINSTANCE.getLayer_Behaviour();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.ComponentImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ELEMENT = eINSTANCE.getComponent_Element();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.ElementImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>XPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__XPOS = eINSTANCE.getElement_XPos();

		/**
		 * The meta object literal for the '<em><b>YPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__YPOS = eINSTANCE.getElement_YPos();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_DEFAULT = eINSTANCE.getElement_IsDefault();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.ContainerElementImpl <em>Container Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.ContainerElementImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getContainerElement()
		 * @generated
		 */
		EClass CONTAINER_ELEMENT = eINSTANCE.getContainerElement();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ELEMENT__ELEMENTS = eINSTANCE.getContainerElement_Elements();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ELEMENT__VISIBILITY = eINSTANCE.getContainerElement_Visibility();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.ElemSequenceImpl <em>Elem Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.ElemSequenceImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getElemSequence()
		 * @generated
		 */
		EClass ELEM_SEQUENCE = eINSTANCE.getElemSequence();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.ElemSelectorImpl <em>Elem Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.ElemSelectorImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getElemSelector()
		 * @generated
		 */
		EClass ELEM_SELECTOR = eINSTANCE.getElemSelector();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.VisualContainerImpl <em>Visual Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.VisualContainerImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getVisualContainer()
		 * @generated
		 */
		EClass VISUAL_CONTAINER = eINSTANCE.getVisualContainer();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_CONTAINER__BEHAVIOUR = eINSTANCE.getVisualContainer_Behaviour();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.VisualElementImpl <em>Visual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.VisualElementImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getVisualElement()
		 * @generated
		 */
		EClass VISUAL_ELEMENT = eINSTANCE.getVisualElement();

		/**
		 * The meta object literal for the '<em><b>XSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_ELEMENT__XSIZE = eINSTANCE.getVisualElement_XSize();

		/**
		 * The meta object literal for the '<em><b>YSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_ELEMENT__YSIZE = eINSTANCE.getVisualElement_YSize();

		/**
		 * The meta object literal for the '<em><b>Foreground Colour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_ELEMENT__FOREGROUND_COLOUR = eINSTANCE.getVisualElement_ForegroundColour();

		/**
		 * The meta object literal for the '<em><b>Background Colour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_ELEMENT__BACKGROUND_COLOUR = eINSTANCE.getVisualElement_BackgroundColour();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_ELEMENT__REF = eINSTANCE.getVisualElement_Ref();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.ImageImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.TextImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.WidgetImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.TextWidgetImpl <em>Text Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.TextWidgetImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getTextWidget()
		 * @generated
		 */
		EClass TEXT_WIDGET = eINSTANCE.getTextWidget();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.ButtonWidgetImpl <em>Button Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.ButtonWidgetImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getButtonWidget()
		 * @generated
		 */
		EClass BUTTON_WIDGET = eINSTANCE.getButtonWidget();

		/**
		 * The meta object literal for the '{@link layoutRel.impl.CanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.impl.CanvasImpl
		 * @see layoutRel.impl.LayoutRelPackageImpl#getCanvas()
		 * @generated
		 */
		EClass CANVAS = eINSTANCE.getCanvas();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS__ACTIVE = eINSTANCE.getCanvas_Active();

		/**
		 * The meta object literal for the '<em><b>Grid Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS__GRID_SIZE_X = eINSTANCE.getCanvas_GridSizeX();

		/**
		 * The meta object literal for the '<em><b>Grid Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS__GRID_SIZE_Y = eINSTANCE.getCanvas_GridSizeY();

		/**
		 * The meta object literal for the '<em><b>Grid Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS__GRID_SCALE_X = eINSTANCE.getCanvas_GridScaleX();

		/**
		 * The meta object literal for the '<em><b>Grid Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS__GRID_SCALE_Y = eINSTANCE.getCanvas_GridScaleY();

		/**
		 * The meta object literal for the '{@link layoutRel.ContainmentBehaviour <em>Containment Behaviour</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layoutRel.ContainmentBehaviour
		 * @see layoutRel.impl.LayoutRelPackageImpl#getContainmentBehaviour()
		 * @generated
		 */
		EEnum CONTAINMENT_BEHAVIOUR = eINSTANCE.getContainmentBehaviour();

	}

} //LayoutRelPackage
