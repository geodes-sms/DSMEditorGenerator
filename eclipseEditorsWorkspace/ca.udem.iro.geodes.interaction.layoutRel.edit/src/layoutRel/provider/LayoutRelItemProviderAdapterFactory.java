/**
 */
package layoutRel.provider;

import java.util.ArrayList;
import java.util.Collection;

import layoutRel.util.LayoutRelAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutRelItemProviderAdapterFactory extends LayoutRelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutRelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.RelLayoutDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelLayoutDiagramItemProvider relLayoutDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.RelLayoutDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelLayoutDiagramAdapter() {
		if (relLayoutDiagramItemProvider == null) {
			relLayoutDiagramItemProvider = new RelLayoutDiagramItemProvider(this);
		}

		return relLayoutDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.InteractionStream} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionStreamItemProvider interactionStreamItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.InteractionStream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInteractionStreamAdapter() {
		if (interactionStreamItemProvider == null) {
			interactionStreamItemProvider = new InteractionStreamItemProvider(this);
		}

		return interactionStreamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.Layer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerItemProvider layerItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayerAdapter() {
		if (layerItemProvider == null) {
			layerItemProvider = new LayerItemProvider(this);
		}

		return layerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.ContainerElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerElementItemProvider containerElementItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.ContainerElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerElementAdapter() {
		if (containerElementItemProvider == null) {
			containerElementItemProvider = new ContainerElementItemProvider(this);
		}

		return containerElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.ElemSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElemSequenceItemProvider elemSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.ElemSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElemSequenceAdapter() {
		if (elemSequenceItemProvider == null) {
			elemSequenceItemProvider = new ElemSequenceItemProvider(this);
		}

		return elemSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.ElemSelector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElemSelectorItemProvider elemSelectorItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.ElemSelector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElemSelectorAdapter() {
		if (elemSelectorItemProvider == null) {
			elemSelectorItemProvider = new ElemSelectorItemProvider(this);
		}

		return elemSelectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.VisualContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualContainerItemProvider visualContainerItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.VisualContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisualContainerAdapter() {
		if (visualContainerItemProvider == null) {
			visualContainerItemProvider = new VisualContainerItemProvider(this);
		}

		return visualContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageItemProvider imageItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter() {
		if (imageItemProvider == null) {
			imageItemProvider = new ImageItemProvider(this);
		}

		return imageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.Text} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemProvider textItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAdapter() {
		if (textItemProvider == null) {
			textItemProvider = new TextItemProvider(this);
		}

		return textItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.Widget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetItemProvider widgetItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.Widget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWidgetAdapter() {
		if (widgetItemProvider == null) {
			widgetItemProvider = new WidgetItemProvider(this);
		}

		return widgetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.TextWidget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextWidgetItemProvider textWidgetItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.TextWidget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextWidgetAdapter() {
		if (textWidgetItemProvider == null) {
			textWidgetItemProvider = new TextWidgetItemProvider(this);
		}

		return textWidgetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.ButtonWidget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonWidgetItemProvider buttonWidgetItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.ButtonWidget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonWidgetAdapter() {
		if (buttonWidgetItemProvider == null) {
			buttonWidgetItemProvider = new ButtonWidgetItemProvider(this);
		}

		return buttonWidgetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link layoutRel.Canvas} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasItemProvider canvasItemProvider;

	/**
	 * This creates an adapter for a {@link layoutRel.Canvas}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCanvasAdapter() {
		if (canvasItemProvider == null) {
			canvasItemProvider = new CanvasItemProvider(this);
		}

		return canvasItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (relLayoutDiagramItemProvider != null) relLayoutDiagramItemProvider.dispose();
		if (interactionStreamItemProvider != null) interactionStreamItemProvider.dispose();
		if (layerItemProvider != null) layerItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (containerElementItemProvider != null) containerElementItemProvider.dispose();
		if (elemSequenceItemProvider != null) elemSequenceItemProvider.dispose();
		if (elemSelectorItemProvider != null) elemSelectorItemProvider.dispose();
		if (visualContainerItemProvider != null) visualContainerItemProvider.dispose();
		if (imageItemProvider != null) imageItemProvider.dispose();
		if (textItemProvider != null) textItemProvider.dispose();
		if (widgetItemProvider != null) widgetItemProvider.dispose();
		if (textWidgetItemProvider != null) textWidgetItemProvider.dispose();
		if (buttonWidgetItemProvider != null) buttonWidgetItemProvider.dispose();
		if (canvasItemProvider != null) canvasItemProvider.dispose();
	}

}
