/**
 * generated by Xtext 2.19.0
 */
package ca.udem.iro.geodes.interaction.interactiontxt.util;

import ca.udem.iro.geodes.interaction.interactiontxt.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.udem.iro.geodes.interaction.interactiontxt.InteractiontxtPackage
 * @generated
 */
public class InteractiontxtAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static InteractiontxtPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractiontxtAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = InteractiontxtPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected InteractiontxtSwitch<Adapter> modelSwitch =
    new InteractiontxtSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseCAElement(CAElement object)
      {
        return createCAElementAdapter();
      }
      @Override
      public Adapter caseCElement(CElement object)
      {
        return createCElementAdapter();
      }
      @Override
      public Adapter caseAElement(AElement object)
      {
        return createAElementAdapter();
      }
      @Override
      public Adapter caseInteraction(Interaction object)
      {
        return createInteractionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseStartTransition(StartTransition object)
      {
        return createStartTransitionAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseCIElement(CIElement object)
      {
        return createCIElementAdapter();
      }
      @Override
      public Adapter caseCLElement(CLElement object)
      {
        return createCLElementAdapter();
      }
      @Override
      public Adapter caseCCanvas(CCanvas object)
      {
        return createCCanvasAdapter();
      }
      @Override
      public Adapter caseCVElement(CVElement object)
      {
        return createCVElementAdapter();
      }
      @Override
      public Adapter caseAIElement(AIElement object)
      {
        return createAIElementAdapter();
      }
      @Override
      public Adapter caseAOElement(AOElement object)
      {
        return createAOElementAdapter();
      }
      @Override
      public Adapter caseALElement(ALElement object)
      {
        return createALElementAdapter();
      }
      @Override
      public Adapter caseACanvas(ACanvas object)
      {
        return createACanvasAdapter();
      }
      @Override
      public Adapter caseAVElement(AVElement object)
      {
        return createAVElementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.CAElement <em>CA Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.CAElement
   * @generated
   */
  public Adapter createCAElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.CElement <em>CElement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.CElement
   * @generated
   */
  public Adapter createCElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.AElement <em>AElement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.AElement
   * @generated
   */
  public Adapter createAElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.Interaction
   * @generated
   */
  public Adapter createInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.StartTransition <em>Start Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.StartTransition
   * @generated
   */
  public Adapter createStartTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.CIElement <em>CI Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.CIElement
   * @generated
   */
  public Adapter createCIElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.CLElement <em>CL Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.CLElement
   * @generated
   */
  public Adapter createCLElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.CCanvas <em>CCanvas</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.CCanvas
   * @generated
   */
  public Adapter createCCanvasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.CVElement <em>CV Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.CVElement
   * @generated
   */
  public Adapter createCVElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.AIElement <em>AI Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.AIElement
   * @generated
   */
  public Adapter createAIElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.AOElement <em>AO Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.AOElement
   * @generated
   */
  public Adapter createAOElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.ALElement <em>AL Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.ALElement
   * @generated
   */
  public Adapter createALElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.ACanvas <em>ACanvas</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.ACanvas
   * @generated
   */
  public Adapter createACanvasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.udem.iro.geodes.interaction.interactiontxt.AVElement <em>AV Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.udem.iro.geodes.interaction.interactiontxt.AVElement
   * @generated
   */
  public Adapter createAVElementAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //InteractiontxtAdapterFactory