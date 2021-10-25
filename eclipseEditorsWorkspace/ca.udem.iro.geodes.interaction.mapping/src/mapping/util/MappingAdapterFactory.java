/**
 */
package mapping.util;

import mapping.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mapping.MappingPackage
 * @generated
 */
public class MappingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MappingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingSwitch<Adapter> modelSwitch =
		new MappingSwitch<Adapter>() {
			@Override
			public Adapter caseMappingDiagram(MappingDiagram object) {
				return createMappingDiagramAdapter();
			}
			@Override
			public Adapter caseEditorInputEvent(EditorInputEvent object) {
				return createEditorInputEventAdapter();
			}
			@Override
			public Adapter casePlatformInputEventCode(PlatformInputEventCode object) {
				return createPlatformInputEventCodeAdapter();
			}
			@Override
			public Adapter caseEditorOutputEvent(EditorOutputEvent object) {
				return createEditorOutputEventAdapter();
			}
			@Override
			public Adapter casePlatformOutputEventCode(PlatformOutputEventCode object) {
				return createPlatformOutputEventCodeAdapter();
			}
			@Override
			public Adapter casePlatformIElementCode(PlatformIElementCode object) {
				return createPlatformIElementCodeAdapter();
			}
			@Override
			public Adapter casePlatformLElementCode(PlatformLElementCode object) {
				return createPlatformLElementCodeAdapter();
			}
			@Override
			public Adapter casePlatformControllCode(PlatformControllCode object) {
				return createPlatformControllCodeAdapter();
			}
			@Override
			public Adapter casePlatformOutputControllCode(PlatformOutputControllCode object) {
				return createPlatformOutputControllCodeAdapter();
			}
			@Override
			public Adapter casePlatformInputControllCode(PlatformInputControllCode object) {
				return createPlatformInputControllCodeAdapter();
			}
			@Override
			public Adapter caseCodeLine(CodeLine object) {
				return createCodeLineAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mapping.MappingDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.MappingDiagram
	 * @generated
	 */
	public Adapter createMappingDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.EditorInputEvent <em>Editor Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.EditorInputEvent
	 * @generated
	 */
	public Adapter createEditorInputEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.PlatformInputEventCode <em>Platform Input Event Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.PlatformInputEventCode
	 * @generated
	 */
	public Adapter createPlatformInputEventCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.EditorOutputEvent <em>Editor Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.EditorOutputEvent
	 * @generated
	 */
	public Adapter createEditorOutputEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.PlatformOutputEventCode <em>Platform Output Event Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.PlatformOutputEventCode
	 * @generated
	 */
	public Adapter createPlatformOutputEventCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.PlatformIElementCode <em>Platform IElement Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.PlatformIElementCode
	 * @generated
	 */
	public Adapter createPlatformIElementCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.PlatformLElementCode <em>Platform LElement Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.PlatformLElementCode
	 * @generated
	 */
	public Adapter createPlatformLElementCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.PlatformControllCode <em>Platform Controll Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.PlatformControllCode
	 * @generated
	 */
	public Adapter createPlatformControllCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.PlatformOutputControllCode <em>Platform Output Controll Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.PlatformOutputControllCode
	 * @generated
	 */
	public Adapter createPlatformOutputControllCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.PlatformInputControllCode <em>Platform Input Controll Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.PlatformInputControllCode
	 * @generated
	 */
	public Adapter createPlatformInputControllCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.CodeLine <em>Code Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.CodeLine
	 * @generated
	 */
	public Adapter createCodeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MappingAdapterFactory
