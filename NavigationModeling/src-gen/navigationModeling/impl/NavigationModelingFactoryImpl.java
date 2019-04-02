/**
 */
package navigationModeling.impl;

import navigationModeling.*;

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
public class NavigationModelingFactoryImpl extends EFactoryImpl implements NavigationModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NavigationModelingFactory init() {
		try {
			NavigationModelingFactory theNavigationModelingFactory = (NavigationModelingFactory) EPackage.Registry.INSTANCE
					.getEFactory(NavigationModelingPackage.eNS_URI);
			if (theNavigationModelingFactory != null) {
				return theNavigationModelingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NavigationModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationModelingFactoryImpl() {
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
		case NavigationModelingPackage.CARTE:
			return createCarte();
		case NavigationModelingPackage.ROUTE:
			return createRoute();
		case NavigationModelingPackage.VILLE:
			return createVille();
		case NavigationModelingPackage.PAROURS_RAPIDE:
			return createParoursRapide();
		case NavigationModelingPackage.PAROURS_COURT:
			return createParoursCourt();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carte createCarte() {
		CarteImpl carte = new CarteImpl();
		return carte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ville createVille() {
		VilleImpl ville = new VilleImpl();
		return ville;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParoursRapide createParoursRapide() {
		ParoursRapideImpl paroursRapide = new ParoursRapideImpl();
		return paroursRapide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParoursCourt createParoursCourt() {
		ParoursCourtImpl paroursCourt = new ParoursCourtImpl();
		return paroursCourt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationModelingPackage getNavigationModelingPackage() {
		return (NavigationModelingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NavigationModelingPackage getPackage() {
		return NavigationModelingPackage.eINSTANCE;
	}

} //NavigationModelingFactoryImpl
