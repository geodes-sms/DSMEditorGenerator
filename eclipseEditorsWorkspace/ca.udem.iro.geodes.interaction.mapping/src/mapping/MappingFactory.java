/**
 */
package mapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mapping.MappingPackage
 * @generated
 */
public interface MappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingFactory eINSTANCE = mapping.impl.MappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	MappingDiagram createMappingDiagram();

	/**
	 * Returns a new object of class '<em>Editor Input Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editor Input Event</em>'.
	 * @generated
	 */
	EditorInputEvent createEditorInputEvent();

	/**
	 * Returns a new object of class '<em>Platform Input Event Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Input Event Code</em>'.
	 * @generated
	 */
	PlatformInputEventCode createPlatformInputEventCode();

	/**
	 * Returns a new object of class '<em>Editor Output Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editor Output Event</em>'.
	 * @generated
	 */
	EditorOutputEvent createEditorOutputEvent();

	/**
	 * Returns a new object of class '<em>Platform Output Event Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Output Event Code</em>'.
	 * @generated
	 */
	PlatformOutputEventCode createPlatformOutputEventCode();

	/**
	 * Returns a new object of class '<em>Platform IElement Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform IElement Code</em>'.
	 * @generated
	 */
	PlatformIElementCode createPlatformIElementCode();

	/**
	 * Returns a new object of class '<em>Platform LElement Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform LElement Code</em>'.
	 * @generated
	 */
	PlatformLElementCode createPlatformLElementCode();

	/**
	 * Returns a new object of class '<em>Platform Controll Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Controll Code</em>'.
	 * @generated
	 */
	PlatformControllCode createPlatformControllCode();

	/**
	 * Returns a new object of class '<em>Platform Output Controll Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Output Controll Code</em>'.
	 * @generated
	 */
	PlatformOutputControllCode createPlatformOutputControllCode();

	/**
	 * Returns a new object of class '<em>Platform Input Controll Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Input Controll Code</em>'.
	 * @generated
	 */
	PlatformInputControllCode createPlatformInputControllCode();

	/**
	 * Returns a new object of class '<em>Code Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Line</em>'.
	 * @generated
	 */
	CodeLine createCodeLine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MappingPackage getMappingPackage();

} //MappingFactory
