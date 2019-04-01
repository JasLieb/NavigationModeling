/**
 */
package org.lpdql.parcours.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lpdql.parcours.OracleParcours;
import org.lpdql.parcours.ParcoursPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oracle Parcours</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OracleParcoursImpl extends MinimalEObjectImpl.Container implements OracleParcours {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OracleParcoursImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParcoursPackage.Literals.ORACLE_PARCOURS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculParcours() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ParcoursPackage.ORACLE_PARCOURS___CALCUL_PARCOURS:
			calculParcours();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //OracleParcoursImpl
