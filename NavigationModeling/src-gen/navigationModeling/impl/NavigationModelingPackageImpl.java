/**
 */
package navigationModeling.impl;

import navigationModeling.Carte;
import navigationModeling.IParcours;
import navigationModeling.NavigationModelingFactory;
import navigationModeling.NavigationModelingPackage;
import navigationModeling.ParoursCourt;
import navigationModeling.ParoursRapide;
import navigationModeling.Route;
import navigationModeling.Ville;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationModelingPackageImpl extends EPackageImpl implements NavigationModelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass villeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paroursRapideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iParcoursEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paroursCourtEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see navigationModeling.NavigationModelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NavigationModelingPackageImpl() {
		super(eNS_URI, NavigationModelingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NavigationModelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NavigationModelingPackage init() {
		if (isInited)
			return (NavigationModelingPackage) EPackage.Registry.INSTANCE
					.getEPackage(NavigationModelingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNavigationModelingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NavigationModelingPackageImpl theNavigationModelingPackage = registeredNavigationModelingPackage instanceof NavigationModelingPackageImpl
				? (NavigationModelingPackageImpl) registeredNavigationModelingPackage
				: new NavigationModelingPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theNavigationModelingPackage.createPackageContents();

		// Initialize created meta-data
		theNavigationModelingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNavigationModelingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NavigationModelingPackage.eNS_URI, theNavigationModelingPackage);
		return theNavigationModelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarte() {
		return carteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarte_Routes() {
		return (EReference) carteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarte_Villes() {
		return (EReference) carteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarte_Nom() {
		return (EAttribute) carteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarte_Iparcours() {
		return (EReference) carteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarte__DemandeParcours() {
		return carteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Duree() {
		return (EAttribute) routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_VilleA() {
		return (EReference) routeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_VilleB() {
		return (EReference) routeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Distance() {
		return (EAttribute) routeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVille() {
		return villeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVille_Nom() {
		return (EAttribute) villeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVille_Routes() {
		return (EReference) villeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParoursRapide() {
		return paroursRapideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParoursRapide__CalculParcours() {
		return paroursRapideEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParoursRapide__CalculDistance() {
		return paroursRapideEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParoursRapide__CalculDuree() {
		return paroursRapideEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIParcours() {
		return iParcoursEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIParcours__CalculParcours() {
		return iParcoursEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIParcours__CalculDistance() {
		return iParcoursEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIParcours__CalculDuree() {
		return iParcoursEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParoursCourt() {
		return paroursCourtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParoursCourt__CalculParcours() {
		return paroursCourtEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParoursCourt__CalculDistance() {
		return paroursCourtEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParoursCourt__CalculDuree() {
		return paroursCourtEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationModelingFactory getNavigationModelingFactory() {
		return (NavigationModelingFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		carteEClass = createEClass(CARTE);
		createEReference(carteEClass, CARTE__ROUTES);
		createEReference(carteEClass, CARTE__VILLES);
		createEAttribute(carteEClass, CARTE__NOM);
		createEReference(carteEClass, CARTE__IPARCOURS);
		createEOperation(carteEClass, CARTE___DEMANDE_PARCOURS);

		routeEClass = createEClass(ROUTE);
		createEAttribute(routeEClass, ROUTE__DUREE);
		createEReference(routeEClass, ROUTE__VILLE_A);
		createEReference(routeEClass, ROUTE__VILLE_B);
		createEAttribute(routeEClass, ROUTE__DISTANCE);

		villeEClass = createEClass(VILLE);
		createEAttribute(villeEClass, VILLE__NOM);
		createEReference(villeEClass, VILLE__ROUTES);

		paroursRapideEClass = createEClass(PAROURS_RAPIDE);
		createEOperation(paroursRapideEClass, PAROURS_RAPIDE___CALCUL_PARCOURS);
		createEOperation(paroursRapideEClass, PAROURS_RAPIDE___CALCUL_DISTANCE);
		createEOperation(paroursRapideEClass, PAROURS_RAPIDE___CALCUL_DUREE);

		iParcoursEClass = createEClass(IPARCOURS);
		createEOperation(iParcoursEClass, IPARCOURS___CALCUL_PARCOURS);
		createEOperation(iParcoursEClass, IPARCOURS___CALCUL_DISTANCE);
		createEOperation(iParcoursEClass, IPARCOURS___CALCUL_DUREE);

		paroursCourtEClass = createEClass(PAROURS_COURT);
		createEOperation(paroursCourtEClass, PAROURS_COURT___CALCUL_PARCOURS);
		createEOperation(paroursCourtEClass, PAROURS_COURT___CALCUL_DISTANCE);
		createEOperation(paroursCourtEClass, PAROURS_COURT___CALCUL_DUREE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		paroursRapideEClass.getESuperTypes().add(this.getIParcours());
		paroursCourtEClass.getESuperTypes().add(this.getIParcours());

		// Initialize classes, features, and operations; add parameters
		initEClass(carteEClass, Carte.class, "Carte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarte_Routes(), this.getRoute(), null, "routes", null, 0, -1, Carte.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCarte_Villes(), this.getVille(), null, "villes", null, 0, -1, Carte.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCarte_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Carte.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarte_Iparcours(), this.getIParcours(), null, "iparcours", null, 0, 1, Carte.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCarte__DemandeParcours(), null, "demandeParcours", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(routeEClass, Route.class, "Route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoute_Duree(), ecorePackage.getEInt(), "duree", null, 0, 1, Route.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoute_VilleA(), this.getVille(), null, "villeA", null, 0, 1, Route.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRoute_VilleB(), this.getVille(), null, "villeB", null, 0, 1, Route.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRoute_Distance(), ecorePackage.getEInt(), "distance", null, 0, 1, Route.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(villeEClass, Ville.class, "Ville", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVille_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Ville.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVille_Routes(), this.getRoute(), null, "routes", null, 0, -1, Ville.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(paroursRapideEClass, ParoursRapide.class, "ParoursRapide", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getParoursRapide__CalculParcours(), null, "CalculParcours", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParoursRapide__CalculDistance(), ecorePackage.getEInt(), "CalculDistance", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getParoursRapide__CalculDuree(), ecorePackage.getEInt(), "CalculDuree", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(iParcoursEClass, IParcours.class, "IParcours", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIParcours__CalculParcours(), null, "CalculParcours", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIParcours__CalculDistance(), ecorePackage.getEInt(), "CalculDistance", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIParcours__CalculDuree(), ecorePackage.getEInt(), "CalculDuree", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paroursCourtEClass, ParoursCourt.class, "ParoursCourt", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getParoursCourt__CalculParcours(), null, "CalculParcours", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParoursCourt__CalculDistance(), ecorePackage.getEInt(), "CalculDistance", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getParoursCourt__CalculDuree(), ecorePackage.getEInt(), "CalculDuree", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //NavigationModelingPackageImpl
