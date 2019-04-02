/**
 */
package navigationModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see navigationModeling.NavigationModelingFactory
 * @model kind="package"
 * @generated
 */
public interface NavigationModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "navigationModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lpdql.org/navigationModeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "navigationModeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NavigationModelingPackage eINSTANCE = navigationModeling.impl.NavigationModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link navigationModeling.impl.CarteImpl <em>Carte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see navigationModeling.impl.CarteImpl
	 * @see navigationModeling.impl.NavigationModelingPackageImpl#getCarte()
	 * @generated
	 */
	int CARTE = 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__ROUTES = 0;

	/**
	 * The feature id for the '<em><b>Villes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__VILLES = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__NOM = 2;

	/**
	 * The feature id for the '<em><b>Iparcours</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__IPARCOURS = 3;

	/**
	 * The number of structural features of the '<em>Carte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Demande Parcours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE___DEMANDE_PARCOURS = 0;

	/**
	 * The number of operations of the '<em>Carte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link navigationModeling.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see navigationModeling.impl.RouteImpl
	 * @see navigationModeling.impl.NavigationModelingPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 1;

	/**
	 * The feature id for the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DUREE = 0;

	/**
	 * The feature id for the '<em><b>Ville A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__VILLE_A = 1;

	/**
	 * The feature id for the '<em><b>Ville B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__VILLE_B = 2;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DISTANCE = 3;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link navigationModeling.impl.VilleImpl <em>Ville</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see navigationModeling.impl.VilleImpl
	 * @see navigationModeling.impl.NavigationModelingPackageImpl#getVille()
	 * @generated
	 */
	int VILLE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__ROUTES = 1;

	/**
	 * The number of structural features of the '<em>Ville</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ville</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link navigationModeling.IParcours <em>IParcours</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see navigationModeling.IParcours
	 * @see navigationModeling.impl.NavigationModelingPackageImpl#getIParcours()
	 * @generated
	 */
	int IPARCOURS = 4;

	/**
	 * The number of structural features of the '<em>IParcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPARCOURS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calcul Parcours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPARCOURS___CALCUL_PARCOURS = 0;

	/**
	 * The operation id for the '<em>Calcul Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPARCOURS___CALCUL_DISTANCE = 1;

	/**
	 * The operation id for the '<em>Calcul Duree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPARCOURS___CALCUL_DUREE = 2;

	/**
	 * The number of operations of the '<em>IParcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPARCOURS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link navigationModeling.impl.ParoursRapideImpl <em>Parours Rapide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see navigationModeling.impl.ParoursRapideImpl
	 * @see navigationModeling.impl.NavigationModelingPackageImpl#getParoursRapide()
	 * @generated
	 */
	int PAROURS_RAPIDE = 3;

	/**
	 * The number of structural features of the '<em>Parours Rapide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAROURS_RAPIDE_FEATURE_COUNT = IPARCOURS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calcul Parcours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAROURS_RAPIDE___CALCUL_PARCOURS = IPARCOURS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Calcul Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAROURS_RAPIDE___CALCUL_DISTANCE = IPARCOURS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calcul Duree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAROURS_RAPIDE___CALCUL_DUREE = IPARCOURS_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parours Rapide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAROURS_RAPIDE_OPERATION_COUNT = IPARCOURS_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link navigationModeling.impl.ParoursCourtImpl <em>Parours Court</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see navigationModeling.impl.ParoursCourtImpl
	 * @see navigationModeling.impl.NavigationModelingPackageImpl#getParoursCourt()
	 * @generated
	 */
	int PAROURS_COURT = 5;

	/**
	 * The number of structural features of the '<em>Parours Court</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAROURS_COURT_FEATURE_COUNT = IPARCOURS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calcul Parcours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAROURS_COURT___CALCUL_PARCOURS = IPARCOURS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Calcul Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAROURS_COURT___CALCUL_DISTANCE = IPARCOURS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calcul Duree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAROURS_COURT___CALCUL_DUREE = IPARCOURS_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parours Court</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAROURS_COURT_OPERATION_COUNT = IPARCOURS_OPERATION_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link navigationModeling.Carte <em>Carte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carte</em>'.
	 * @see navigationModeling.Carte
	 * @generated
	 */
	EClass getCarte();

	/**
	 * Returns the meta object for the containment reference list '{@link navigationModeling.Carte#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see navigationModeling.Carte#getRoutes()
	 * @see #getCarte()
	 * @generated
	 */
	EReference getCarte_Routes();

	/**
	 * Returns the meta object for the containment reference list '{@link navigationModeling.Carte#getVilles <em>Villes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Villes</em>'.
	 * @see navigationModeling.Carte#getVilles()
	 * @see #getCarte()
	 * @generated
	 */
	EReference getCarte_Villes();

	/**
	 * Returns the meta object for the attribute '{@link navigationModeling.Carte#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see navigationModeling.Carte#getNom()
	 * @see #getCarte()
	 * @generated
	 */
	EAttribute getCarte_Nom();

	/**
	 * Returns the meta object for the reference '{@link navigationModeling.Carte#getIparcours <em>Iparcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iparcours</em>'.
	 * @see navigationModeling.Carte#getIparcours()
	 * @see #getCarte()
	 * @generated
	 */
	EReference getCarte_Iparcours();

	/**
	 * Returns the meta object for the '{@link navigationModeling.Carte#demandeParcours() <em>Demande Parcours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Demande Parcours</em>' operation.
	 * @see navigationModeling.Carte#demandeParcours()
	 * @generated
	 */
	EOperation getCarte__DemandeParcours();

	/**
	 * Returns the meta object for class '{@link navigationModeling.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see navigationModeling.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link navigationModeling.Route#getDuree <em>Duree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duree</em>'.
	 * @see navigationModeling.Route#getDuree()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Duree();

	/**
	 * Returns the meta object for the reference '{@link navigationModeling.Route#getVilleA <em>Ville A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ville A</em>'.
	 * @see navigationModeling.Route#getVilleA()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_VilleA();

	/**
	 * Returns the meta object for the reference '{@link navigationModeling.Route#getVilleB <em>Ville B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ville B</em>'.
	 * @see navigationModeling.Route#getVilleB()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_VilleB();

	/**
	 * Returns the meta object for the attribute '{@link navigationModeling.Route#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see navigationModeling.Route#getDistance()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Distance();

	/**
	 * Returns the meta object for class '{@link navigationModeling.Ville <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ville</em>'.
	 * @see navigationModeling.Ville
	 * @generated
	 */
	EClass getVille();

	/**
	 * Returns the meta object for the attribute '{@link navigationModeling.Ville#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see navigationModeling.Ville#getNom()
	 * @see #getVille()
	 * @generated
	 */
	EAttribute getVille_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link navigationModeling.Ville#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see navigationModeling.Ville#getRoutes()
	 * @see #getVille()
	 * @generated
	 */
	EReference getVille_Routes();

	/**
	 * Returns the meta object for class '{@link navigationModeling.ParoursRapide <em>Parours Rapide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parours Rapide</em>'.
	 * @see navigationModeling.ParoursRapide
	 * @generated
	 */
	EClass getParoursRapide();

	/**
	 * Returns the meta object for the '{@link navigationModeling.ParoursRapide#CalculParcours() <em>Calcul Parcours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Parcours</em>' operation.
	 * @see navigationModeling.ParoursRapide#CalculParcours()
	 * @generated
	 */
	EOperation getParoursRapide__CalculParcours();

	/**
	 * Returns the meta object for the '{@link navigationModeling.ParoursRapide#CalculDistance() <em>Calcul Distance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Distance</em>' operation.
	 * @see navigationModeling.ParoursRapide#CalculDistance()
	 * @generated
	 */
	EOperation getParoursRapide__CalculDistance();

	/**
	 * Returns the meta object for the '{@link navigationModeling.ParoursRapide#CalculDuree() <em>Calcul Duree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Duree</em>' operation.
	 * @see navigationModeling.ParoursRapide#CalculDuree()
	 * @generated
	 */
	EOperation getParoursRapide__CalculDuree();

	/**
	 * Returns the meta object for class '{@link navigationModeling.IParcours <em>IParcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IParcours</em>'.
	 * @see navigationModeling.IParcours
	 * @generated
	 */
	EClass getIParcours();

	/**
	 * Returns the meta object for the '{@link navigationModeling.IParcours#CalculParcours() <em>Calcul Parcours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Parcours</em>' operation.
	 * @see navigationModeling.IParcours#CalculParcours()
	 * @generated
	 */
	EOperation getIParcours__CalculParcours();

	/**
	 * Returns the meta object for the '{@link navigationModeling.IParcours#CalculDistance() <em>Calcul Distance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Distance</em>' operation.
	 * @see navigationModeling.IParcours#CalculDistance()
	 * @generated
	 */
	EOperation getIParcours__CalculDistance();

	/**
	 * Returns the meta object for the '{@link navigationModeling.IParcours#CalculDuree() <em>Calcul Duree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Duree</em>' operation.
	 * @see navigationModeling.IParcours#CalculDuree()
	 * @generated
	 */
	EOperation getIParcours__CalculDuree();

	/**
	 * Returns the meta object for class '{@link navigationModeling.ParoursCourt <em>Parours Court</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parours Court</em>'.
	 * @see navigationModeling.ParoursCourt
	 * @generated
	 */
	EClass getParoursCourt();

	/**
	 * Returns the meta object for the '{@link navigationModeling.ParoursCourt#CalculParcours() <em>Calcul Parcours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Parcours</em>' operation.
	 * @see navigationModeling.ParoursCourt#CalculParcours()
	 * @generated
	 */
	EOperation getParoursCourt__CalculParcours();

	/**
	 * Returns the meta object for the '{@link navigationModeling.ParoursCourt#CalculDistance() <em>Calcul Distance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Distance</em>' operation.
	 * @see navigationModeling.ParoursCourt#CalculDistance()
	 * @generated
	 */
	EOperation getParoursCourt__CalculDistance();

	/**
	 * Returns the meta object for the '{@link navigationModeling.ParoursCourt#CalculDuree() <em>Calcul Duree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Duree</em>' operation.
	 * @see navigationModeling.ParoursCourt#CalculDuree()
	 * @generated
	 */
	EOperation getParoursCourt__CalculDuree();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NavigationModelingFactory getNavigationModelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link navigationModeling.impl.CarteImpl <em>Carte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see navigationModeling.impl.CarteImpl
		 * @see navigationModeling.impl.NavigationModelingPackageImpl#getCarte()
		 * @generated
		 */
		EClass CARTE = eINSTANCE.getCarte();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTE__ROUTES = eINSTANCE.getCarte_Routes();

		/**
		 * The meta object literal for the '<em><b>Villes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTE__VILLES = eINSTANCE.getCarte_Villes();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTE__NOM = eINSTANCE.getCarte_Nom();

		/**
		 * The meta object literal for the '<em><b>Iparcours</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTE__IPARCOURS = eINSTANCE.getCarte_Iparcours();

		/**
		 * The meta object literal for the '<em><b>Demande Parcours</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTE___DEMANDE_PARCOURS = eINSTANCE.getCarte__DemandeParcours();

		/**
		 * The meta object literal for the '{@link navigationModeling.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see navigationModeling.impl.RouteImpl
		 * @see navigationModeling.impl.NavigationModelingPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__DUREE = eINSTANCE.getRoute_Duree();

		/**
		 * The meta object literal for the '<em><b>Ville A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__VILLE_A = eINSTANCE.getRoute_VilleA();

		/**
		 * The meta object literal for the '<em><b>Ville B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__VILLE_B = eINSTANCE.getRoute_VilleB();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__DISTANCE = eINSTANCE.getRoute_Distance();

		/**
		 * The meta object literal for the '{@link navigationModeling.impl.VilleImpl <em>Ville</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see navigationModeling.impl.VilleImpl
		 * @see navigationModeling.impl.NavigationModelingPackageImpl#getVille()
		 * @generated
		 */
		EClass VILLE = eINSTANCE.getVille();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VILLE__NOM = eINSTANCE.getVille_Nom();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VILLE__ROUTES = eINSTANCE.getVille_Routes();

		/**
		 * The meta object literal for the '{@link navigationModeling.impl.ParoursRapideImpl <em>Parours Rapide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see navigationModeling.impl.ParoursRapideImpl
		 * @see navigationModeling.impl.NavigationModelingPackageImpl#getParoursRapide()
		 * @generated
		 */
		EClass PAROURS_RAPIDE = eINSTANCE.getParoursRapide();

		/**
		 * The meta object literal for the '<em><b>Calcul Parcours</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAROURS_RAPIDE___CALCUL_PARCOURS = eINSTANCE.getParoursRapide__CalculParcours();

		/**
		 * The meta object literal for the '<em><b>Calcul Distance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAROURS_RAPIDE___CALCUL_DISTANCE = eINSTANCE.getParoursRapide__CalculDistance();

		/**
		 * The meta object literal for the '<em><b>Calcul Duree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAROURS_RAPIDE___CALCUL_DUREE = eINSTANCE.getParoursRapide__CalculDuree();

		/**
		 * The meta object literal for the '{@link navigationModeling.IParcours <em>IParcours</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see navigationModeling.IParcours
		 * @see navigationModeling.impl.NavigationModelingPackageImpl#getIParcours()
		 * @generated
		 */
		EClass IPARCOURS = eINSTANCE.getIParcours();

		/**
		 * The meta object literal for the '<em><b>Calcul Parcours</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPARCOURS___CALCUL_PARCOURS = eINSTANCE.getIParcours__CalculParcours();

		/**
		 * The meta object literal for the '<em><b>Calcul Distance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPARCOURS___CALCUL_DISTANCE = eINSTANCE.getIParcours__CalculDistance();

		/**
		 * The meta object literal for the '<em><b>Calcul Duree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPARCOURS___CALCUL_DUREE = eINSTANCE.getIParcours__CalculDuree();

		/**
		 * The meta object literal for the '{@link navigationModeling.impl.ParoursCourtImpl <em>Parours Court</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see navigationModeling.impl.ParoursCourtImpl
		 * @see navigationModeling.impl.NavigationModelingPackageImpl#getParoursCourt()
		 * @generated
		 */
		EClass PAROURS_COURT = eINSTANCE.getParoursCourt();

		/**
		 * The meta object literal for the '<em><b>Calcul Parcours</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAROURS_COURT___CALCUL_PARCOURS = eINSTANCE.getParoursCourt__CalculParcours();

		/**
		 * The meta object literal for the '<em><b>Calcul Distance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAROURS_COURT___CALCUL_DISTANCE = eINSTANCE.getParoursCourt__CalculDistance();

		/**
		 * The meta object literal for the '<em><b>Calcul Duree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAROURS_COURT___CALCUL_DUREE = eINSTANCE.getParoursCourt__CalculDuree();

	}

} //NavigationModelingPackage
