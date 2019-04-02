/**
 */
package navigationModeling.impl;

import navigationModeling.NavigationModelingPackage;
import navigationModeling.Route;
import navigationModeling.Ville;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link navigationModeling.impl.RouteImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link navigationModeling.impl.RouteImpl#getVilleA <em>Ville A</em>}</li>
 *   <li>{@link navigationModeling.impl.RouteImpl#getVilleB <em>Ville B</em>}</li>
 *   <li>{@link navigationModeling.impl.RouteImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
	 * The default value of the '{@link #getDuree() <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected static final int DUREE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuree() <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected int duree = DUREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVilleA() <em>Ville A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVilleA()
	 * @generated
	 * @ordered
	 */
	protected Ville villeA;

	/**
	 * The cached value of the '{@link #getVilleB() <em>Ville B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVilleB()
	 * @generated
	 * @ordered
	 */
	protected Ville villeB;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected int distance = DISTANCE_EDEFAULT;

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
		return NavigationModelingPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(int newDuree) {
		int oldDuree = duree;
		duree = newDuree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationModelingPackage.ROUTE__DUREE, oldDuree,
					duree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ville getVilleA() {
		if (villeA != null && villeA.eIsProxy()) {
			InternalEObject oldVilleA = (InternalEObject) villeA;
			villeA = (Ville) eResolveProxy(oldVilleA);
			if (villeA != oldVilleA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NavigationModelingPackage.ROUTE__VILLE_A,
							oldVilleA, villeA));
			}
		}
		return villeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ville basicGetVilleA() {
		return villeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVilleA(Ville newVilleA) {
		Ville oldVilleA = villeA;
		villeA = newVilleA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationModelingPackage.ROUTE__VILLE_A, oldVilleA,
					villeA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ville getVilleB() {
		if (villeB != null && villeB.eIsProxy()) {
			InternalEObject oldVilleB = (InternalEObject) villeB;
			villeB = (Ville) eResolveProxy(oldVilleB);
			if (villeB != oldVilleB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NavigationModelingPackage.ROUTE__VILLE_B,
							oldVilleB, villeB));
			}
		}
		return villeB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ville basicGetVilleB() {
		return villeB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVilleB(Ville newVilleB) {
		Ville oldVilleB = villeB;
		villeB = newVilleB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationModelingPackage.ROUTE__VILLE_B, oldVilleB,
					villeB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(int newDistance) {
		int oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationModelingPackage.ROUTE__DISTANCE,
					oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NavigationModelingPackage.ROUTE__DUREE:
			return getDuree();
		case NavigationModelingPackage.ROUTE__VILLE_A:
			if (resolve)
				return getVilleA();
			return basicGetVilleA();
		case NavigationModelingPackage.ROUTE__VILLE_B:
			if (resolve)
				return getVilleB();
			return basicGetVilleB();
		case NavigationModelingPackage.ROUTE__DISTANCE:
			return getDistance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NavigationModelingPackage.ROUTE__DUREE:
			setDuree((Integer) newValue);
			return;
		case NavigationModelingPackage.ROUTE__VILLE_A:
			setVilleA((Ville) newValue);
			return;
		case NavigationModelingPackage.ROUTE__VILLE_B:
			setVilleB((Ville) newValue);
			return;
		case NavigationModelingPackage.ROUTE__DISTANCE:
			setDistance((Integer) newValue);
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
		case NavigationModelingPackage.ROUTE__DUREE:
			setDuree(DUREE_EDEFAULT);
			return;
		case NavigationModelingPackage.ROUTE__VILLE_A:
			setVilleA((Ville) null);
			return;
		case NavigationModelingPackage.ROUTE__VILLE_B:
			setVilleB((Ville) null);
			return;
		case NavigationModelingPackage.ROUTE__DISTANCE:
			setDistance(DISTANCE_EDEFAULT);
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
		case NavigationModelingPackage.ROUTE__DUREE:
			return duree != DUREE_EDEFAULT;
		case NavigationModelingPackage.ROUTE__VILLE_A:
			return villeA != null;
		case NavigationModelingPackage.ROUTE__VILLE_B:
			return villeB != null;
		case NavigationModelingPackage.ROUTE__DISTANCE:
			return distance != DISTANCE_EDEFAULT;
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
		result.append(" (duree: ");
		result.append(duree);
		result.append(", distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
