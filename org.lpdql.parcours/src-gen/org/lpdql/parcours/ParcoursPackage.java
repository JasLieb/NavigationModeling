/**
 */
package org.lpdql.parcours;

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
 * @see org.lpdql.parcours.ParcoursFactory
 * @model kind="package"
 * @generated
 */
public interface ParcoursPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parcours";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lpdql.org/parcours/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parcours";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParcoursPackage eINSTANCE = org.lpdql.parcours.impl.ParcoursPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lpdql.parcours.impl.CarteImpl <em>Carte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.parcours.impl.CarteImpl
	 * @see org.lpdql.parcours.impl.ParcoursPackageImpl#getCarte()
	 * @generated
	 */
	int CARTE = 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__POINT = 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__ROUTE = 1;

	/**
	 * The number of structural features of the '<em>Carte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Carte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lpdql.parcours.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.parcours.impl.PointImpl
	 * @see org.lpdql.parcours.impl.ParcoursPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__NOM = 0;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lpdql.parcours.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.parcours.impl.RouteImpl
	 * @see org.lpdql.parcours.impl.ParcoursPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Point1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__POINT1 = 0;

	/**
	 * The feature id for the '<em><b>Point2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__POINT2 = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DISTANCE = 2;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TEMPS = 3;

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
	 * The meta object id for the '{@link org.lpdql.parcours.impl.ParcoursImpl <em>Parcours</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.parcours.impl.ParcoursImpl
	 * @see org.lpdql.parcours.impl.ParcoursPackageImpl#getParcours()
	 * @generated
	 */
	int PARCOURS = 3;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__ROUTE = 0;

	/**
	 * The number of structural features of the '<em>Parcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Calcul Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS___CALCUL_DISTANCE = 0;

	/**
	 * The operation id for the '<em>Calcul Temps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS___CALCUL_TEMPS = 1;

	/**
	 * The number of operations of the '<em>Parcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lpdql.parcours.impl.OracleParcoursImpl <em>Oracle Parcours</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.parcours.impl.OracleParcoursImpl
	 * @see org.lpdql.parcours.impl.ParcoursPackageImpl#getOracleParcours()
	 * @generated
	 */
	int ORACLE_PARCOURS = 4;

	/**
	 * The number of structural features of the '<em>Oracle Parcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_PARCOURS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calcul Parcours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_PARCOURS___CALCUL_PARCOURS = 0;

	/**
	 * The number of operations of the '<em>Oracle Parcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_PARCOURS_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.lpdql.parcours.Carte <em>Carte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carte</em>'.
	 * @see org.lpdql.parcours.Carte
	 * @generated
	 */
	EClass getCarte();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.parcours.Carte#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see org.lpdql.parcours.Carte#getPoint()
	 * @see #getCarte()
	 * @generated
	 */
	EReference getCarte_Point();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.parcours.Carte#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route</em>'.
	 * @see org.lpdql.parcours.Carte#getRoute()
	 * @see #getCarte()
	 * @generated
	 */
	EReference getCarte_Route();

	/**
	 * Returns the meta object for class '{@link org.lpdql.parcours.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.lpdql.parcours.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.parcours.Point#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see org.lpdql.parcours.Point#getNom()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Nom();

	/**
	 * Returns the meta object for class '{@link org.lpdql.parcours.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see org.lpdql.parcours.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the reference '{@link org.lpdql.parcours.Route#getPoint1 <em>Point1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point1</em>'.
	 * @see org.lpdql.parcours.Route#getPoint1()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Point1();

	/**
	 * Returns the meta object for the reference '{@link org.lpdql.parcours.Route#getPoint2 <em>Point2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point2</em>'.
	 * @see org.lpdql.parcours.Route#getPoint2()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Point2();

	/**
	 * Returns the meta object for the attribute list '{@link org.lpdql.parcours.Route#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Distance</em>'.
	 * @see org.lpdql.parcours.Route#getDistance()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Distance();

	/**
	 * Returns the meta object for the attribute list '{@link org.lpdql.parcours.Route#getTemps <em>Temps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Temps</em>'.
	 * @see org.lpdql.parcours.Route#getTemps()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Temps();

	/**
	 * Returns the meta object for class '{@link org.lpdql.parcours.Parcours <em>Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcours</em>'.
	 * @see org.lpdql.parcours.Parcours
	 * @generated
	 */
	EClass getParcours();

	/**
	 * Returns the meta object for the reference list '{@link org.lpdql.parcours.Parcours#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Route</em>'.
	 * @see org.lpdql.parcours.Parcours#getRoute()
	 * @see #getParcours()
	 * @generated
	 */
	EReference getParcours_Route();

	/**
	 * Returns the meta object for the '{@link org.lpdql.parcours.Parcours#calculDistance() <em>Calcul Distance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Distance</em>' operation.
	 * @see org.lpdql.parcours.Parcours#calculDistance()
	 * @generated
	 */
	EOperation getParcours__CalculDistance();

	/**
	 * Returns the meta object for the '{@link org.lpdql.parcours.Parcours#calculTemps() <em>Calcul Temps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Temps</em>' operation.
	 * @see org.lpdql.parcours.Parcours#calculTemps()
	 * @generated
	 */
	EOperation getParcours__CalculTemps();

	/**
	 * Returns the meta object for class '{@link org.lpdql.parcours.OracleParcours <em>Oracle Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oracle Parcours</em>'.
	 * @see org.lpdql.parcours.OracleParcours
	 * @generated
	 */
	EClass getOracleParcours();

	/**
	 * Returns the meta object for the '{@link org.lpdql.parcours.OracleParcours#calculParcours() <em>Calcul Parcours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Parcours</em>' operation.
	 * @see org.lpdql.parcours.OracleParcours#calculParcours()
	 * @generated
	 */
	EOperation getOracleParcours__CalculParcours();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParcoursFactory getParcoursFactory();

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
		 * The meta object literal for the '{@link org.lpdql.parcours.impl.CarteImpl <em>Carte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.parcours.impl.CarteImpl
		 * @see org.lpdql.parcours.impl.ParcoursPackageImpl#getCarte()
		 * @generated
		 */
		EClass CARTE = eINSTANCE.getCarte();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTE__POINT = eINSTANCE.getCarte_Point();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTE__ROUTE = eINSTANCE.getCarte_Route();

		/**
		 * The meta object literal for the '{@link org.lpdql.parcours.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.parcours.impl.PointImpl
		 * @see org.lpdql.parcours.impl.ParcoursPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__NOM = eINSTANCE.getPoint_Nom();

		/**
		 * The meta object literal for the '{@link org.lpdql.parcours.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.parcours.impl.RouteImpl
		 * @see org.lpdql.parcours.impl.ParcoursPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Point1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__POINT1 = eINSTANCE.getRoute_Point1();

		/**
		 * The meta object literal for the '<em><b>Point2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__POINT2 = eINSTANCE.getRoute_Point2();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__DISTANCE = eINSTANCE.getRoute_Distance();

		/**
		 * The meta object literal for the '<em><b>Temps</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__TEMPS = eINSTANCE.getRoute_Temps();

		/**
		 * The meta object literal for the '{@link org.lpdql.parcours.impl.ParcoursImpl <em>Parcours</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.parcours.impl.ParcoursImpl
		 * @see org.lpdql.parcours.impl.ParcoursPackageImpl#getParcours()
		 * @generated
		 */
		EClass PARCOURS = eINSTANCE.getParcours();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCOURS__ROUTE = eINSTANCE.getParcours_Route();

		/**
		 * The meta object literal for the '<em><b>Calcul Distance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARCOURS___CALCUL_DISTANCE = eINSTANCE.getParcours__CalculDistance();

		/**
		 * The meta object literal for the '<em><b>Calcul Temps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARCOURS___CALCUL_TEMPS = eINSTANCE.getParcours__CalculTemps();

		/**
		 * The meta object literal for the '{@link org.lpdql.parcours.impl.OracleParcoursImpl <em>Oracle Parcours</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.parcours.impl.OracleParcoursImpl
		 * @see org.lpdql.parcours.impl.ParcoursPackageImpl#getOracleParcours()
		 * @generated
		 */
		EClass ORACLE_PARCOURS = eINSTANCE.getOracleParcours();

		/**
		 * The meta object literal for the '<em><b>Calcul Parcours</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORACLE_PARCOURS___CALCUL_PARCOURS = eINSTANCE.getOracleParcours__CalculParcours();

	}

} //ParcoursPackage
