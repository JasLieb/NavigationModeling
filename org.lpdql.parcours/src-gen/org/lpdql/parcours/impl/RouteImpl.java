/**
 */
package org.lpdql.parcours.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.lpdql.parcours.ParcoursPackage;
import org.lpdql.parcours.Point;
import org.lpdql.parcours.Route;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.parcours.impl.RouteImpl#getPoint1 <em>Point1</em>}</li>
 *   <li>{@link org.lpdql.parcours.impl.RouteImpl#getPoint2 <em>Point2</em>}</li>
 *   <li>{@link org.lpdql.parcours.impl.RouteImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.lpdql.parcours.impl.RouteImpl#getTemps <em>Temps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
	 * The cached value of the '{@link #getPoint1() <em>Point1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint1()
	 * @generated
	 * @ordered
	 */
	protected Point point1;

	/**
	 * The cached value of the '{@link #getPoint2() <em>Point2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint2()
	 * @generated
	 * @ordered
	 */
	protected Point point2;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> distance;

	/**
	 * The cached value of the '{@link #getTemps() <em>Temps</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemps()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> temps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParcoursPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPoint1() {
		if (point1 != null && point1.eIsProxy()) {
			InternalEObject oldPoint1 = (InternalEObject) point1;
			point1 = (Point) eResolveProxy(oldPoint1);
			if (point1 != oldPoint1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParcoursPackage.ROUTE__POINT1, oldPoint1,
							point1));
			}
		}
		return point1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point basicGetPoint1() {
		return point1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint1(Point newPoint1) {
		Point oldPoint1 = point1;
		point1 = newPoint1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParcoursPackage.ROUTE__POINT1, oldPoint1, point1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPoint2() {
		if (point2 != null && point2.eIsProxy()) {
			InternalEObject oldPoint2 = (InternalEObject) point2;
			point2 = (Point) eResolveProxy(oldPoint2);
			if (point2 != oldPoint2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParcoursPackage.ROUTE__POINT2, oldPoint2,
							point2));
			}
		}
		return point2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point basicGetPoint2() {
		return point2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint2(Point newPoint2) {
		Point oldPoint2 = point2;
		point2 = newPoint2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParcoursPackage.ROUTE__POINT2, oldPoint2, point2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDistance() {
		if (distance == null) {
			distance = new EDataTypeUniqueEList<Integer>(Integer.class, this, ParcoursPackage.ROUTE__DISTANCE);
		}
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getTemps() {
		if (temps == null) {
			temps = new EDataTypeUniqueEList<Integer>(Integer.class, this, ParcoursPackage.ROUTE__TEMPS);
		}
		return temps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ParcoursPackage.ROUTE__POINT1:
			if (resolve)
				return getPoint1();
			return basicGetPoint1();
		case ParcoursPackage.ROUTE__POINT2:
			if (resolve)
				return getPoint2();
			return basicGetPoint2();
		case ParcoursPackage.ROUTE__DISTANCE:
			return getDistance();
		case ParcoursPackage.ROUTE__TEMPS:
			return getTemps();
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
		case ParcoursPackage.ROUTE__POINT1:
			setPoint1((Point) newValue);
			return;
		case ParcoursPackage.ROUTE__POINT2:
			setPoint2((Point) newValue);
			return;
		case ParcoursPackage.ROUTE__DISTANCE:
			getDistance().clear();
			getDistance().addAll((Collection<? extends Integer>) newValue);
			return;
		case ParcoursPackage.ROUTE__TEMPS:
			getTemps().clear();
			getTemps().addAll((Collection<? extends Integer>) newValue);
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
		case ParcoursPackage.ROUTE__POINT1:
			setPoint1((Point) null);
			return;
		case ParcoursPackage.ROUTE__POINT2:
			setPoint2((Point) null);
			return;
		case ParcoursPackage.ROUTE__DISTANCE:
			getDistance().clear();
			return;
		case ParcoursPackage.ROUTE__TEMPS:
			getTemps().clear();
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
		case ParcoursPackage.ROUTE__POINT1:
			return point1 != null;
		case ParcoursPackage.ROUTE__POINT2:
			return point2 != null;
		case ParcoursPackage.ROUTE__DISTANCE:
			return distance != null && !distance.isEmpty();
		case ParcoursPackage.ROUTE__TEMPS:
			return temps != null && !temps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (distance: ");
		result.append(distance);
		result.append(", temps: ");
		result.append(temps);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
