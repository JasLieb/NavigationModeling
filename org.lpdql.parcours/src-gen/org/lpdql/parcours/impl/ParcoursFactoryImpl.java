/**
 */
package org.lpdql.parcours.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lpdql.parcours.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParcoursFactoryImpl extends EFactoryImpl implements ParcoursFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParcoursFactory init() {
		try {
			ParcoursFactory theParcoursFactory = (ParcoursFactory) EPackage.Registry.INSTANCE
					.getEFactory(ParcoursPackage.eNS_URI);
			if (theParcoursFactory != null) {
				return theParcoursFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParcoursFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcoursFactoryImpl() {
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
		case ParcoursPackage.CARTE:
			return createCarte();
		case ParcoursPackage.POINT:
			return createPoint();
		case ParcoursPackage.ROUTE:
			return createRoute();
		case ParcoursPackage.PARCOURS:
			return createParcours();
		case ParcoursPackage.ORACLE_PARCOURS:
			return createOracleParcours();
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
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
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
	public Parcours createParcours() {
		ParcoursImpl parcours = new ParcoursImpl();
		return parcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleParcours createOracleParcours() {
		OracleParcoursImpl oracleParcours = new OracleParcoursImpl();
		return oracleParcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcoursPackage getParcoursPackage() {
		return (ParcoursPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParcoursPackage getPackage() {
		return ParcoursPackage.eINSTANCE;
	}

} //ParcoursFactoryImpl
