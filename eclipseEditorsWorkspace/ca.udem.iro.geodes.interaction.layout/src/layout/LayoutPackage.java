/**
 */
package layout;

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
 * @see layout.LayoutFactory
 * @model kind="package"
 * @generated
 */
public interface LayoutPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "layout";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://udem.iro.geodes.ca/layout";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "layout";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayoutPackage eINSTANCE = layout.impl.LayoutPackageImpl.init();

	/**
	 * The meta object id for the '{@link layout.impl.LayoutDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.LayoutDiagramImpl
	 * @see layout.impl.LayoutPackageImpl#getLayoutDiagram()
	 * @generated
	 */
	int LAYOUT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Has Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DIAGRAM__HAS_LAYERS = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DIAGRAM__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DIAGRAM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layout.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.LayerImpl
	 * @see layout.impl.LayoutPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__IS_DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Has Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__HAS_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ANCHORS = 4;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layout.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.ElementImpl
	 * @see layout.impl.LayoutPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__XPOS = 0;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__YPOS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_DEFAULT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ANCHORS = 5;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layout.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.GroupImpl
	 * @see layout.impl.LayoutPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__XPOS = ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__YPOS = ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__IS_DEFAULT = ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANCHORS = ELEMENT__ANCHORS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VISIBLE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layout.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.GraphicalElementImpl
	 * @see layout.impl.LayoutPackageImpl#getGraphicalElement()
	 * @generated
	 */
	int GRAPHICAL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__XPOS = ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__YPOS = ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__IS_DEFAULT = ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__ANCHORS = ELEMENT__ANCHORS;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__BACKGROUND_COLOR = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foregroud Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__FOREGROUD_COLOR = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__BORDER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__BORDER_PATTERN = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__HEIGHT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__WITH = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Graphical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Graphical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layout.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.RectangleImpl
	 * @see layout.impl.LayoutPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 5;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__XPOS = GRAPHICAL_ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__YPOS = GRAPHICAL_ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__IS_DEFAULT = GRAPHICAL_ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ANCHORS = GRAPHICAL_ELEMENT__ANCHORS;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BACKGROUND_COLOR = GRAPHICAL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foregroud Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FOREGROUD_COLOR = GRAPHICAL_ELEMENT__FOREGROUD_COLOR;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BORDER = GRAPHICAL_ELEMENT__BORDER;

	/**
	 * The feature id for the '<em><b>Border Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BORDER_PATTERN = GRAPHICAL_ELEMENT__BORDER_PATTERN;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__HEIGHT = GRAPHICAL_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__WITH = GRAPHICAL_ELEMENT__WITH;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layout.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.TextImpl
	 * @see layout.impl.LayoutPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 6;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__XPOS = GRAPHICAL_ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__YPOS = GRAPHICAL_ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__IS_DEFAULT = GRAPHICAL_ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ANCHORS = GRAPHICAL_ELEMENT__ANCHORS;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__BACKGROUND_COLOR = GRAPHICAL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foregroud Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FOREGROUD_COLOR = GRAPHICAL_ELEMENT__FOREGROUD_COLOR;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__BORDER = GRAPHICAL_ELEMENT__BORDER;

	/**
	 * The feature id for the '<em><b>Border Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__BORDER_PATTERN = GRAPHICAL_ELEMENT__BORDER_PATTERN;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__HEIGHT = GRAPHICAL_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__WITH = GRAPHICAL_ELEMENT__WITH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT_SIZE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layout.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.ImageImpl
	 * @see layout.impl.LayoutPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 7;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__XPOS = GRAPHICAL_ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__YPOS = GRAPHICAL_ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IS_DEFAULT = GRAPHICAL_ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ANCHORS = GRAPHICAL_ELEMENT__ANCHORS;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BACKGROUND_COLOR = GRAPHICAL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foregroud Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FOREGROUD_COLOR = GRAPHICAL_ELEMENT__FOREGROUD_COLOR;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BORDER = GRAPHICAL_ELEMENT__BORDER;

	/**
	 * The feature id for the '<em><b>Border Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BORDER_PATTERN = GRAPHICAL_ELEMENT__BORDER_PATTERN;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = GRAPHICAL_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WITH = GRAPHICAL_ELEMENT__WITH;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SOURCE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layout.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.WidgetImpl
	 * @see layout.impl.LayoutPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 8;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__XPOS = GRAPHICAL_ELEMENT__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__YPOS = GRAPHICAL_ELEMENT__YPOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IS_DEFAULT = GRAPHICAL_ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ANCHORS = GRAPHICAL_ELEMENT__ANCHORS;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__BACKGROUND_COLOR = GRAPHICAL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foregroud Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__FOREGROUD_COLOR = GRAPHICAL_ELEMENT__FOREGROUD_COLOR;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__BORDER = GRAPHICAL_ELEMENT__BORDER;

	/**
	 * The feature id for the '<em><b>Border Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__BORDER_PATTERN = GRAPHICAL_ELEMENT__BORDER_PATTERN;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__HEIGHT = GRAPHICAL_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WITH = GRAPHICAL_ELEMENT__WITH;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link layout.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.CanvasImpl
	 * @see layout.impl.LayoutPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 9;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__IS_DEFAULT = ELEMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Anchors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ANCHORS = ELEMENT__ANCHORS;

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
	 * The feature id for the '<em><b>Grid Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__GRID_SCALE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link layout.impl.AnchorImpl <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.AnchorImpl
	 * @see layout.impl.LayoutPackageImpl#getAnchor()
	 * @generated
	 */
	int ANCHOR = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__ID = 0;

	/**
	 * The number of structural features of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layout.impl.AbsAnchorImpl <em>Abs Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.AbsAnchorImpl
	 * @see layout.impl.LayoutPackageImpl#getAbsAnchor()
	 * @generated
	 */
	int ABS_ANCHOR = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ANCHOR__ID = ANCHOR__ID;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ANCHOR__XPOS = ANCHOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ANCHOR__YPOS = ANCHOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abs Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ANCHOR_FEATURE_COUNT = ANCHOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abs Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ANCHOR_OPERATION_COUNT = ANCHOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layout.impl.RelAnchorImpl <em>Rel Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.RelAnchorImpl
	 * @see layout.impl.LayoutPackageImpl#getRelAnchor()
	 * @generated
	 */
	int REL_ANCHOR = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_ANCHOR__ID = ANCHOR__ID;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_ANCHOR__XAXIS = ANCHOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_ANCHOR__YAXIS = ANCHOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rel Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_ANCHOR_FEATURE_COUNT = ANCHOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rel Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_ANCHOR_OPERATION_COUNT = ANCHOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layout.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.ConstraintImpl
	 * @see layout.impl.LayoutPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__AXIS = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layout.ConstraintType <em>Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.ConstraintType
	 * @see layout.impl.LayoutPackageImpl#getConstraintType()
	 * @generated
	 */
	int CONSTRAINT_TYPE = 14;

	/**
	 * The meta object id for the '{@link layout.ConstraintAxis <em>Constraint Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.ConstraintAxis
	 * @see layout.impl.LayoutPackageImpl#getConstraintAxis()
	 * @generated
	 */
	int CONSTRAINT_AXIS = 15;

	/**
	 * The meta object id for the '{@link layout.XAlign <em>XAlign</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.XAlign
	 * @see layout.impl.LayoutPackageImpl#getXAlign()
	 * @generated
	 */
	int XALIGN = 16;

	/**
	 * The meta object id for the '{@link layout.YAlign <em>YAlign</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.YAlign
	 * @see layout.impl.LayoutPackageImpl#getYAlign()
	 * @generated
	 */
	int YALIGN = 17;


	/**
	 * Returns the meta object for class '{@link layout.LayoutDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see layout.LayoutDiagram
	 * @generated
	 */
	EClass getLayoutDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.LayoutDiagram#getHasLayers <em>Has Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Layers</em>'.
	 * @see layout.LayoutDiagram#getHasLayers()
	 * @see #getLayoutDiagram()
	 * @generated
	 */
	EReference getLayoutDiagram_HasLayers();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.LayoutDiagram#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see layout.LayoutDiagram#getConstraints()
	 * @see #getLayoutDiagram()
	 * @generated
	 */
	EReference getLayoutDiagram_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link layout.LayoutDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see layout.LayoutDiagram#getName()
	 * @see #getLayoutDiagram()
	 * @generated
	 */
	EAttribute getLayoutDiagram_Name();

	/**
	 * Returns the meta object for class '{@link layout.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see layout.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the attribute '{@link layout.Layer#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see layout.Layer#getPosition()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Position();

	/**
	 * Returns the meta object for the attribute '{@link layout.Layer#isIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see layout.Layer#isIsDefault()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_IsDefault();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.Layer#getHasElements <em>Has Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Elements</em>'.
	 * @see layout.Layer#getHasElements()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_HasElements();

	/**
	 * Returns the meta object for the attribute '{@link layout.Layer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see layout.Layer#getName()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.Layer#getAnchors <em>Anchors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anchors</em>'.
	 * @see layout.Layer#getAnchors()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Anchors();

	/**
	 * Returns the meta object for class '{@link layout.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see layout.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link layout.Element#getXPos <em>XPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPos</em>'.
	 * @see layout.Element#getXPos()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_XPos();

	/**
	 * Returns the meta object for the attribute '{@link layout.Element#getYPos <em>YPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPos</em>'.
	 * @see layout.Element#getYPos()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_YPos();

	/**
	 * Returns the meta object for the attribute '{@link layout.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see layout.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link layout.Element#isIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see layout.Element#isIsDefault()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsDefault();

	/**
	 * Returns the meta object for the attribute '{@link layout.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see layout.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.Element#getAnchors <em>Anchors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anchors</em>'.
	 * @see layout.Element#getAnchors()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Anchors();

	/**
	 * Returns the meta object for class '{@link layout.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see layout.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.Group#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see layout.Group#getGroups()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Groups();

	/**
	 * Returns the meta object for the attribute '{@link layout.Group#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see layout.Group#getVisible()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Visible();

	/**
	 * Returns the meta object for class '{@link layout.GraphicalElement <em>Graphical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Element</em>'.
	 * @see layout.GraphicalElement
	 * @generated
	 */
	EClass getGraphicalElement();

	/**
	 * Returns the meta object for the attribute '{@link layout.GraphicalElement#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see layout.GraphicalElement#getBackgroundColor()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link layout.GraphicalElement#getForegroudColor <em>Foregroud Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foregroud Color</em>'.
	 * @see layout.GraphicalElement#getForegroudColor()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_ForegroudColor();

	/**
	 * Returns the meta object for the attribute '{@link layout.GraphicalElement#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see layout.GraphicalElement#getBorder()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_Border();

	/**
	 * Returns the meta object for the attribute '{@link layout.GraphicalElement#getBorderPattern <em>Border Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Pattern</em>'.
	 * @see layout.GraphicalElement#getBorderPattern()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_BorderPattern();

	/**
	 * Returns the meta object for the attribute '{@link layout.GraphicalElement#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see layout.GraphicalElement#getHeight()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_Height();

	/**
	 * Returns the meta object for the attribute '{@link layout.GraphicalElement#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With</em>'.
	 * @see layout.GraphicalElement#getWith()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_With();

	/**
	 * Returns the meta object for class '{@link layout.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see layout.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for class '{@link layout.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see layout.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link layout.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see layout.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for the attribute '{@link layout.Text#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see layout.Text#getFont()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Font();

	/**
	 * Returns the meta object for the attribute '{@link layout.Text#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see layout.Text#getFontSize()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_FontSize();

	/**
	 * Returns the meta object for class '{@link layout.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see layout.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link layout.Image#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see layout.Image#getSource()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Source();

	/**
	 * Returns the meta object for class '{@link layout.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see layout.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for class '{@link layout.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see layout.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for the attribute '{@link layout.Canvas#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see layout.Canvas#getActive()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_Active();

	/**
	 * Returns the meta object for the attribute '{@link layout.Canvas#getGridSizeX <em>Grid Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Size X</em>'.
	 * @see layout.Canvas#getGridSizeX()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_GridSizeX();

	/**
	 * Returns the meta object for the attribute '{@link layout.Canvas#getGridSizeY <em>Grid Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Size Y</em>'.
	 * @see layout.Canvas#getGridSizeY()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_GridSizeY();

	/**
	 * Returns the meta object for the attribute '{@link layout.Canvas#getGridScale <em>Grid Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Scale</em>'.
	 * @see layout.Canvas#getGridScale()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_GridScale();

	/**
	 * Returns the meta object for class '{@link layout.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see layout.Anchor
	 * @generated
	 */
	EClass getAnchor();

	/**
	 * Returns the meta object for the attribute '{@link layout.Anchor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see layout.Anchor#getId()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Id();

	/**
	 * Returns the meta object for class '{@link layout.AbsAnchor <em>Abs Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Anchor</em>'.
	 * @see layout.AbsAnchor
	 * @generated
	 */
	EClass getAbsAnchor();

	/**
	 * Returns the meta object for the attribute '{@link layout.AbsAnchor#getXPos <em>XPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPos</em>'.
	 * @see layout.AbsAnchor#getXPos()
	 * @see #getAbsAnchor()
	 * @generated
	 */
	EAttribute getAbsAnchor_XPos();

	/**
	 * Returns the meta object for the attribute '{@link layout.AbsAnchor#getYPos <em>YPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPos</em>'.
	 * @see layout.AbsAnchor#getYPos()
	 * @see #getAbsAnchor()
	 * @generated
	 */
	EAttribute getAbsAnchor_YPos();

	/**
	 * Returns the meta object for class '{@link layout.RelAnchor <em>Rel Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rel Anchor</em>'.
	 * @see layout.RelAnchor
	 * @generated
	 */
	EClass getRelAnchor();

	/**
	 * Returns the meta object for the attribute '{@link layout.RelAnchor#getXAxis <em>XAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis</em>'.
	 * @see layout.RelAnchor#getXAxis()
	 * @see #getRelAnchor()
	 * @generated
	 */
	EAttribute getRelAnchor_XAxis();

	/**
	 * Returns the meta object for the attribute '{@link layout.RelAnchor#getYAxis <em>YAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis</em>'.
	 * @see layout.RelAnchor#getYAxis()
	 * @see #getRelAnchor()
	 * @generated
	 */
	EAttribute getRelAnchor_YAxis();

	/**
	 * Returns the meta object for class '{@link layout.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see layout.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference '{@link layout.Constraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see layout.Constraint#getSource()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Source();

	/**
	 * Returns the meta object for the reference '{@link layout.Constraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see layout.Constraint#getTarget()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Target();

	/**
	 * Returns the meta object for the attribute '{@link layout.Constraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see layout.Constraint#getType()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Type();

	/**
	 * Returns the meta object for the attribute '{@link layout.Constraint#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see layout.Constraint#getAxis()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Axis();

	/**
	 * Returns the meta object for the attribute '{@link layout.Constraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see layout.Constraint#getValue()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Value();

	/**
	 * Returns the meta object for enum '{@link layout.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Type</em>'.
	 * @see layout.ConstraintType
	 * @generated
	 */
	EEnum getConstraintType();

	/**
	 * Returns the meta object for enum '{@link layout.ConstraintAxis <em>Constraint Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Axis</em>'.
	 * @see layout.ConstraintAxis
	 * @generated
	 */
	EEnum getConstraintAxis();

	/**
	 * Returns the meta object for enum '{@link layout.XAlign <em>XAlign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XAlign</em>'.
	 * @see layout.XAlign
	 * @generated
	 */
	EEnum getXAlign();

	/**
	 * Returns the meta object for enum '{@link layout.YAlign <em>YAlign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YAlign</em>'.
	 * @see layout.YAlign
	 * @generated
	 */
	EEnum getYAlign();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LayoutFactory getLayoutFactory();

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
		 * The meta object literal for the '{@link layout.impl.LayoutDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.LayoutDiagramImpl
		 * @see layout.impl.LayoutPackageImpl#getLayoutDiagram()
		 * @generated
		 */
		EClass LAYOUT_DIAGRAM = eINSTANCE.getLayoutDiagram();

		/**
		 * The meta object literal for the '<em><b>Has Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_DIAGRAM__HAS_LAYERS = eINSTANCE.getLayoutDiagram_HasLayers();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_DIAGRAM__CONSTRAINTS = eINSTANCE.getLayoutDiagram_Constraints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DIAGRAM__NAME = eINSTANCE.getLayoutDiagram_Name();

		/**
		 * The meta object literal for the '{@link layout.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.LayerImpl
		 * @see layout.impl.LayoutPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__POSITION = eINSTANCE.getLayer_Position();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__IS_DEFAULT = eINSTANCE.getLayer_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Has Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__HAS_ELEMENTS = eINSTANCE.getLayer_HasElements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();

		/**
		 * The meta object literal for the '<em><b>Anchors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__ANCHORS = eINSTANCE.getLayer_Anchors();

		/**
		 * The meta object literal for the '{@link layout.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.ElementImpl
		 * @see layout.impl.LayoutPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_DEFAULT = eINSTANCE.getElement_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Anchors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ANCHORS = eINSTANCE.getElement_Anchors();

		/**
		 * The meta object literal for the '{@link layout.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.GroupImpl
		 * @see layout.impl.LayoutPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUPS = eINSTANCE.getGroup_Groups();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__VISIBLE = eINSTANCE.getGroup_Visible();

		/**
		 * The meta object literal for the '{@link layout.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.GraphicalElementImpl
		 * @see layout.impl.LayoutPackageImpl#getGraphicalElement()
		 * @generated
		 */
		EClass GRAPHICAL_ELEMENT = eINSTANCE.getGraphicalElement();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__BACKGROUND_COLOR = eINSTANCE.getGraphicalElement_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Foregroud Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__FOREGROUD_COLOR = eINSTANCE.getGraphicalElement_ForegroudColor();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__BORDER = eINSTANCE.getGraphicalElement_Border();

		/**
		 * The meta object literal for the '<em><b>Border Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__BORDER_PATTERN = eINSTANCE.getGraphicalElement_BorderPattern();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__HEIGHT = eINSTANCE.getGraphicalElement_Height();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__WITH = eINSTANCE.getGraphicalElement_With();

		/**
		 * The meta object literal for the '{@link layout.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.RectangleImpl
		 * @see layout.impl.LayoutPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '{@link layout.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.TextImpl
		 * @see layout.impl.LayoutPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__FONT = eINSTANCE.getText_Font();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__FONT_SIZE = eINSTANCE.getText_FontSize();

		/**
		 * The meta object literal for the '{@link layout.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.ImageImpl
		 * @see layout.impl.LayoutPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SOURCE = eINSTANCE.getImage_Source();

		/**
		 * The meta object literal for the '{@link layout.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.WidgetImpl
		 * @see layout.impl.LayoutPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '{@link layout.impl.CanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.CanvasImpl
		 * @see layout.impl.LayoutPackageImpl#getCanvas()
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
		 * The meta object literal for the '<em><b>Grid Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS__GRID_SCALE = eINSTANCE.getCanvas_GridScale();

		/**
		 * The meta object literal for the '{@link layout.impl.AnchorImpl <em>Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.AnchorImpl
		 * @see layout.impl.LayoutPackageImpl#getAnchor()
		 * @generated
		 */
		EClass ANCHOR = eINSTANCE.getAnchor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__ID = eINSTANCE.getAnchor_Id();

		/**
		 * The meta object literal for the '{@link layout.impl.AbsAnchorImpl <em>Abs Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.AbsAnchorImpl
		 * @see layout.impl.LayoutPackageImpl#getAbsAnchor()
		 * @generated
		 */
		EClass ABS_ANCHOR = eINSTANCE.getAbsAnchor();

		/**
		 * The meta object literal for the '<em><b>XPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_ANCHOR__XPOS = eINSTANCE.getAbsAnchor_XPos();

		/**
		 * The meta object literal for the '<em><b>YPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_ANCHOR__YPOS = eINSTANCE.getAbsAnchor_YPos();

		/**
		 * The meta object literal for the '{@link layout.impl.RelAnchorImpl <em>Rel Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.RelAnchorImpl
		 * @see layout.impl.LayoutPackageImpl#getRelAnchor()
		 * @generated
		 */
		EClass REL_ANCHOR = eINSTANCE.getRelAnchor();

		/**
		 * The meta object literal for the '<em><b>XAxis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REL_ANCHOR__XAXIS = eINSTANCE.getRelAnchor_XAxis();

		/**
		 * The meta object literal for the '<em><b>YAxis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REL_ANCHOR__YAXIS = eINSTANCE.getRelAnchor_YAxis();

		/**
		 * The meta object literal for the '{@link layout.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.ConstraintImpl
		 * @see layout.impl.LayoutPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__SOURCE = eINSTANCE.getConstraint_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__TARGET = eINSTANCE.getConstraint_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__AXIS = eINSTANCE.getConstraint_Axis();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__VALUE = eINSTANCE.getConstraint_Value();

		/**
		 * The meta object literal for the '{@link layout.ConstraintType <em>Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.ConstraintType
		 * @see layout.impl.LayoutPackageImpl#getConstraintType()
		 * @generated
		 */
		EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

		/**
		 * The meta object literal for the '{@link layout.ConstraintAxis <em>Constraint Axis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.ConstraintAxis
		 * @see layout.impl.LayoutPackageImpl#getConstraintAxis()
		 * @generated
		 */
		EEnum CONSTRAINT_AXIS = eINSTANCE.getConstraintAxis();

		/**
		 * The meta object literal for the '{@link layout.XAlign <em>XAlign</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.XAlign
		 * @see layout.impl.LayoutPackageImpl#getXAlign()
		 * @generated
		 */
		EEnum XALIGN = eINSTANCE.getXAlign();

		/**
		 * The meta object literal for the '{@link layout.YAlign <em>YAlign</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.YAlign
		 * @see layout.impl.LayoutPackageImpl#getYAlign()
		 * @generated
		 */
		EEnum YALIGN = eINSTANCE.getYAlign();

	}

} //LayoutPackage
