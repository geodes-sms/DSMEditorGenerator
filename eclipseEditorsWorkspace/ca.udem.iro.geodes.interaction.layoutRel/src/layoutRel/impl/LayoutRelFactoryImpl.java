/**
 */
package layoutRel.impl;

import layoutRel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class LayoutRelFactoryImpl extends EFactoryImpl implements LayoutRelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutRelFactory init() {
		try {
			LayoutRelFactory theLayoutRelFactory = (LayoutRelFactory)EPackage.Registry.INSTANCE.getEFactory(LayoutRelPackage.eNS_URI);
			if (theLayoutRelFactory != null) {
				return theLayoutRelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LayoutRelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutRelFactoryImpl() {
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
			case LayoutRelPackage.REL_LAYOUT_DIAGRAM: return createRelLayoutDiagram();
			case LayoutRelPackage.INTERACTION_STREAM: return createInteractionStream();
			case LayoutRelPackage.LAYER: return createLayer();
			case LayoutRelPackage.COMPONENT: return createComponent();
			case LayoutRelPackage.CONTAINER_ELEMENT: return createContainerElement();
			case LayoutRelPackage.ELEM_SEQUENCE: return createElemSequence();
			case LayoutRelPackage.ELEM_SELECTOR: return createElemSelector();
			case LayoutRelPackage.VISUAL_CONTAINER: return createVisualContainer();
			case LayoutRelPackage.IMAGE: return createImage();
			case LayoutRelPackage.TEXT: return createText();
			case LayoutRelPackage.WIDGET: return createWidget();
			case LayoutRelPackage.TEXT_WIDGET: return createTextWidget();
			case LayoutRelPackage.BUTTON_WIDGET: return createButtonWidget();
			case LayoutRelPackage.CANVAS: return createCanvas();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LayoutRelPackage.CONTAINMENT_BEHAVIOUR:
				return createContainmentBehaviourFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LayoutRelPackage.CONTAINMENT_BEHAVIOUR:
				return convertContainmentBehaviourToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelLayoutDiagram createRelLayoutDiagram() {
		RelLayoutDiagramImpl relLayoutDiagram = new RelLayoutDiagramImpl();
		return relLayoutDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionStream createInteractionStream() {
		InteractionStreamImpl interactionStream = new InteractionStreamImpl();
		return interactionStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerElement createContainerElement() {
		ContainerElementImpl containerElement = new ContainerElementImpl();
		return containerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElemSequence createElemSequence() {
		ElemSequenceImpl elemSequence = new ElemSequenceImpl();
		return elemSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElemSelector createElemSelector() {
		ElemSelectorImpl elemSelector = new ElemSelectorImpl();
		return elemSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualContainer createVisualContainer() {
		VisualContainerImpl visualContainer = new VisualContainerImpl();
		return visualContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextWidget createTextWidget() {
		TextWidgetImpl textWidget = new TextWidgetImpl();
		return textWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonWidget createButtonWidget() {
		ButtonWidgetImpl buttonWidget = new ButtonWidgetImpl();
		return buttonWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas createCanvas() {
		CanvasImpl canvas = new CanvasImpl();
		return canvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentBehaviour createContainmentBehaviourFromString(EDataType eDataType, String initialValue) {
		ContainmentBehaviour result = ContainmentBehaviour.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainmentBehaviourToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutRelPackage getLayoutRelPackage() {
		return (LayoutRelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LayoutRelPackage getPackage() {
		return LayoutRelPackage.eINSTANCE;
	}

} //LayoutRelFactoryImpl
