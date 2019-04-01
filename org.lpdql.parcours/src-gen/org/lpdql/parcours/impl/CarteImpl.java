/**
 */
package org.lpdql.parcours.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lpdql.parcours.Carte;
import org.lpdql.parcours.ParcoursPackage;
import org.lpdql.parcours.Point;
import org.lpdql.parcours.Route;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.parcours.impl.CarteImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link org.lpdql.parcours.impl.CarteImpl#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarteImpl extends MinimalEObjectImpl.Container implements Carte {
	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> point;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> route;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParcoursPackage.Literals.CARTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getPoint() {
		if (point == null) {
			point = new EObjectContainmentEList<Point>(Point.class, this, ParcoursPackage.CARTE__POINT);
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoute() {
		if (route == null) {
			route = new EObjectContainmentEList<Route>(Route.class, this, ParcoursPackage.CARTE__ROUTE);
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ParcoursPackage.CARTE__POINT:
			return ((InternalEList<?>) getPoint()).basicRemove(otherEnd, msgs);
		case ParcoursPackage.CARTE__ROUTE:
			return ((InternalEList<?>) getRoute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ParcoursPackage.CARTE__POINT:
			return getPoint();
		case ParcoursPackage.CARTE__ROUTE:
			return getRoute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ParcoursPackage.CARTE__POINT:
			getPoint().clear();
			getPoint().addAll((Collection<? extends Point>) newValue);
			return;
		case ParcoursPackage.CARTE__ROUTE:
			getRoute().clear();
			getRoute().addAll((Collection<? extends Route>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ParcoursPackage.CARTE__POINT:
			getPoint().clear();
			return;
		case ParcoursPackage.CARTE__ROUTE:
			getRoute().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ParcoursPackage.CARTE__POINT:
			return point != null && !point.isEmpty();
		case ParcoursPackage.CARTE__ROUTE:
			return route != null && !route.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarteImpl
