/**
 */
package interaction;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see interaction.InteractionPackage
 * @generated
 */
public interface InteractionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionFactory eINSTANCE = interaction.impl.InteractionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>IElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IElement</em>'.
	 * @generated
	 */
	IElement createIElement();

	/**
	 * Returns a new object of class '<em>OElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OElement</em>'.
	 * @generated
	 */
	OElement createOElement();

	/**
	 * Returns a new object of class '<em>LElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LElement</em>'.
	 * @generated
	 */
	LElement createLElement();

	/**
	 * Returns a new object of class '<em>VElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VElement</em>'.
	 * @generated
	 */
	VElement createVElement();

	/**
	 * Returns a new object of class '<em>Interactions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interactions</em>'.
	 * @generated
	 */
	Interactions createInteractions();

	/**
	 * Returns a new object of class '<em>Atomic Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Interaction</em>'.
	 * @generated
	 */
	AtomicInteraction createAtomicInteraction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteractionPackage getInteractionPackage();

} //InteractionFactory
