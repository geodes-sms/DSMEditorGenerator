/**
 */
package mapping.provider;


import java.util.Collection;
import java.util.List;

import mapping.MappingDiagram;
import mapping.MappingFactory;
import mapping.MappingPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mapping.MappingDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_BASE_CODE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MappingDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MappingDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MappingDiagram_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MappingDiagram.class)) {
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS:
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS:
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS:
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS:
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS:
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS:
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL:
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL:
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_BASE_CODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS,
				 MappingFactory.eINSTANCE.createEditorInputEvent()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS,
				 MappingFactory.eINSTANCE.createEditorOutputEvent()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS,
				 MappingFactory.eINSTANCE.createPlatformInputEventCode()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS,
				 MappingFactory.eINSTANCE.createPlatformOutputEventCode()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS,
				 MappingFactory.eINSTANCE.createPlatformIElementCode()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS,
				 MappingFactory.eINSTANCE.createPlatformLElementCode()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL,
				 MappingFactory.eINSTANCE.createPlatformOutputControllCode()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL,
				 MappingFactory.eINSTANCE.createPlatformInputControllCode()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_BASE_CODE,
				 MappingFactory.eINSTANCE.createPlatformControllCode()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_BASE_CODE,
				 MappingFactory.eINSTANCE.createPlatformOutputControllCode()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_BASE_CODE,
				 MappingFactory.eINSTANCE.createPlatformInputControllCode()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL ||
			childFeature == MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_BASE_CODE ||
			childFeature == MappingPackage.Literals.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MappingEditPlugin.INSTANCE;
	}

}
