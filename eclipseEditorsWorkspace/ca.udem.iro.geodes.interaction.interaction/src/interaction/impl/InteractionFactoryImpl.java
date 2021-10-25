/**
 */
package interaction.impl;

import interaction.*;

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
public class InteractionFactoryImpl extends EFactoryImpl implements InteractionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionFactory init() {
		try {
			InteractionFactory theInteractionFactory = (InteractionFactory)EPackage.Registry.INSTANCE.getEFactory(InteractionPackage.eNS_URI);
			if (theInteractionFactory != null) {
				return theInteractionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFactoryImpl() {
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
			case InteractionPackage.STATE: return createState();
			case InteractionPackage.TRANSITION: return createTransition();
			case InteractionPackage.IELEMENT: return createIElement();
			case InteractionPackage.OELEMENT: return createOElement();
			case InteractionPackage.LELEMENT: return createLElement();
			case InteractionPackage.VELEMENT: return createVElement();
			case InteractionPackage.INTERACTIONS: return createInteractions();
			case InteractionPackage.ATOMIC_INTERACTION: return createAtomicInteraction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IElement createIElement() {
		IElementImpl iElement = new IElementImpl();
		return iElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OElement createOElement() {
		OElementImpl oElement = new OElementImpl();
		return oElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LElement createLElement() {
		LElementImpl lElement = new LElementImpl();
		return lElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VElement createVElement() {
		VElementImpl vElement = new VElementImpl();
		return vElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interactions createInteractions() {
		InteractionsImpl interactions = new InteractionsImpl();
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicInteraction createAtomicInteraction() {
		AtomicInteractionImpl atomicInteraction = new AtomicInteractionImpl();
		return atomicInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionPackage getInteractionPackage() {
		return (InteractionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractionPackage getPackage() {
		return InteractionPackage.eINSTANCE;
	}

} //InteractionFactoryImpl
