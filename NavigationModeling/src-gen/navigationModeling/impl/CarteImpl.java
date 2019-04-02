/**
 */
package navigationModeling.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import navigationModeling.Carte;
import navigationModeling.IParcours;
import navigationModeling.NavigationModelingPackage;
import navigationModeling.Route;
import navigationModeling.Ville;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link navigationModeling.impl.CarteImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link navigationModeling.impl.CarteImpl#getVilles <em>Villes</em>}</li>
 *   <li>{@link navigationModeling.impl.CarteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link navigationModeling.impl.CarteImpl#getIparcours <em>Iparcours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarteImpl extends MinimalEObjectImpl.Container implements Carte {
	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * The cached value of the '{@link #getVilles() <em>Villes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVilles()
	 * @generated
	 * @ordered
	 */
	protected EList<Ville> villes;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIparcours() <em>Iparcours</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIparcours()
	 * @generated
	 * @ordered
	 */
	protected IParcours iparcours;

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
		return NavigationModelingPackage.Literals.CARTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<Route>(Route.class, this, NavigationModelingPackage.CARTE__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ville> getVilles() {
		if (villes == null) {
			villes = new EObjectContainmentEList<Ville>(Ville.class, this, NavigationModelingPackage.CARTE__VILLES);
		}
		return villes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationModelingPackage.CARTE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IParcours getIparcours() {
		if (iparcours != null && iparcours.eIsProxy()) {
			InternalEObject oldIparcours = (InternalEObject) iparcours;
			iparcours = (IParcours) eResolveProxy(oldIparcours);
			if (iparcours != oldIparcours) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NavigationModelingPackage.CARTE__IPARCOURS, oldIparcours, iparcours));
			}
		}
		return iparcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IParcours basicGetIparcours() {
		return iparcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIparcours(IParcours newIparcours) {
		IParcours oldIparcours = iparcours;
		iparcours = newIparcours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationModelingPackage.CARTE__IPARCOURS,
					oldIparcours, iparcours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void demandeParcours() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NavigationModelingPackage.CARTE__ROUTES:
			return ((InternalEList<?>) getRoutes()).basicRemove(otherEnd, msgs);
		case NavigationModelingPackage.CARTE__VILLES:
			return ((InternalEList<?>) getVilles()).basicRemove(otherEnd, msgs);
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
		case NavigationModelingPackage.CARTE__ROUTES:
			return getRoutes();
		case NavigationModelingPackage.CARTE__VILLES:
			return getVilles();
		case NavigationModelingPackage.CARTE__NOM:
			return getNom();
		case NavigationModelingPackage.CARTE__IPARCOURS:
			if (resolve)
				return getIparcours();
			return basicGetIparcours();
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
		case NavigationModelingPackage.CARTE__ROUTES:
			getRoutes().clear();
			getRoutes().addAll((Collection<? extends Route>) newValue);
			return;
		case NavigationModelingPackage.CARTE__VILLES:
			getVilles().clear();
			getVilles().addAll((Collection<? extends Ville>) newValue);
			return;
		case NavigationModelingPackage.CARTE__NOM:
			setNom((String) newValue);
			return;
		case NavigationModelingPackage.CARTE__IPARCOURS:
			setIparcours((IParcours) newValue);
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
		case NavigationModelingPackage.CARTE__ROUTES:
			getRoutes().clear();
			return;
		case NavigationModelingPackage.CARTE__VILLES:
			getVilles().clear();
			return;
		case NavigationModelingPackage.CARTE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case NavigationModelingPackage.CARTE__IPARCOURS:
			setIparcours((IParcours) null);
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
		case NavigationModelingPackage.CARTE__ROUTES:
			return routes != null && !routes.isEmpty();
		case NavigationModelingPackage.CARTE__VILLES:
			return villes != null && !villes.isEmpty();
		case NavigationModelingPackage.CARTE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case NavigationModelingPackage.CARTE__IPARCOURS:
			return iparcours != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case NavigationModelingPackage.CARTE___DEMANDE_PARCOURS:
			demandeParcours();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //CarteImpl
