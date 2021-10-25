/**
 */
package layoutRel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see layoutRel.LayoutRelPackage
 * @generated
 */
public interface LayoutRelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayoutRelFactory eINSTANCE = layoutRel.impl.LayoutRelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rel Layout Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rel Layout Diagram</em>'.
	 * @generated
	 */
	RelLayoutDiagram createRelLayoutDiagram();

	/**
	 * Returns a new object of class '<em>Interaction Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Stream</em>'.
	 * @generated
	 */
	InteractionStream createInteractionStream();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	Layer createLayer();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Container Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Element</em>'.
	 * @generated
	 */
	ContainerElement createContainerElement();

	/**
	 * Returns a new object of class '<em>Elem Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elem Sequence</em>'.
	 * @generated
	 */
	ElemSequence createElemSequence();

	/**
	 * Returns a new object of class '<em>Elem Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elem Selector</em>'.
	 * @generated
	 */
	ElemSelector createElemSelector();

	/**
	 * Returns a new object of class '<em>Visual Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Container</em>'.
	 * @generated
	 */
	VisualContainer createVisualContainer();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget</em>'.
	 * @generated
	 */
	Widget createWidget();

	/**
	 * Returns a new object of class '<em>Text Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Widget</em>'.
	 * @generated
	 */
	TextWidget createTextWidget();

	/**
	 * Returns a new object of class '<em>Button Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Widget</em>'.
	 * @generated
	 */
	ButtonWidget createButtonWidget();

	/**
	 * Returns a new object of class '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas</em>'.
	 * @generated
	 */
	Canvas createCanvas();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LayoutRelPackage getLayoutRelPackage();

} //LayoutRelFactory
