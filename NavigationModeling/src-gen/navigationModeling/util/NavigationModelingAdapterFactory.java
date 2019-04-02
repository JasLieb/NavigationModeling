/**
 */
package navigationModeling.util;

import navigationModeling.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see navigationModeling.NavigationModelingPackage
 * @generated
 */
public class NavigationModelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NavigationModelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationModelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NavigationModelingPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationModelingSwitch<Adapter> modelSwitch = new NavigationModelingSwitch<Adapter>() {
		@Override
		public Adapter caseCarte(Carte object) {
			return createCarteAdapter();
		}

		@Override
		public Adapter caseRoute(Route object) {
			return createRouteAdapter();
		}

		@Override
		public Adapter caseVille(Ville object) {
			return createVilleAdapter();
		}

		@Override
		public Adapter caseParoursRapide(ParoursRapide object) {
			return createParoursRapideAdapter();
		}

		@Override
		public Adapter caseIParcours(IParcours object) {
			return createIParcoursAdapter();
		}

		@Override
		public Adapter caseParoursCourt(ParoursCourt object) {
			return createParoursCourtAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link navigationModeling.Carte <em>Carte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see navigationModeling.Carte
	 * @generated
	 */
	public Adapter createCarteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link navigationModeling.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see navigationModeling.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link navigationModeling.Ville <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see navigationModeling.Ville
	 * @generated
	 */
	public Adapter createVilleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link navigationModeling.ParoursRapide <em>Parours Rapide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see navigationModeling.ParoursRapide
	 * @generated
	 */
	public Adapter createParoursRapideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link navigationModeling.IParcours <em>IParcours</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see navigationModeling.IParcours
	 * @generated
	 */
	public Adapter createIParcoursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link navigationModeling.ParoursCourt <em>Parours Court</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see navigationModeling.ParoursCourt
	 * @generated
	 */
	public Adapter createParoursCourtAdapter() {
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

} //NavigationModelingAdapterFactory
