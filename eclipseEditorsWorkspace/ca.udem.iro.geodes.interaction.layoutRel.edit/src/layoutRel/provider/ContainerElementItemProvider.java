/**
 */
package layoutRel.provider;


import java.util.Collection;
import java.util.List;

import layoutRel.ContainerElement;
import layoutRel.LayoutRelFactory;
import layoutRel.LayoutRelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link layoutRel.ContainerElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerElementItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerElementItemProvider(AdapterFactory adapterFactory) {
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

			addVisibilityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContainerElement_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContainerElement_visibility_feature", "_UI_ContainerElement_type"),
				 LayoutRelPackage.Literals.CONTAINER_ELEMENT__VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS);
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
	 * This returns ContainerElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContainerElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContainerElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContainerElement_type") :
			getString("_UI_ContainerElement_type") + " " + label;
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

		switch (notification.getFeatureID(ContainerElement.class)) {
			case LayoutRelPackage.CONTAINER_ELEMENT__VISIBILITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LayoutRelPackage.CONTAINER_ELEMENT__ELEMENTS:
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
				(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS,
				 LayoutRelFactory.eINSTANCE.createContainerElement()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS,
				 LayoutRelFactory.eINSTANCE.createElemSequence()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS,
				 LayoutRelFactory.eINSTANCE.createElemSelector()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS,
				 LayoutRelFactory.eINSTANCE.createVisualContainer()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS,
				 LayoutRelFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS,
				 LayoutRelFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS,
				 LayoutRelFactory.eINSTANCE.createWidget()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS,
				 LayoutRelFactory.eINSTANCE.createTextWidget()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS,
				 LayoutRelFactory.eINSTANCE.createButtonWidget()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutRelPackage.Literals.CONTAINER_ELEMENT__ELEMENTS,
				 LayoutRelFactory.eINSTANCE.createCanvas()));
	}

}
