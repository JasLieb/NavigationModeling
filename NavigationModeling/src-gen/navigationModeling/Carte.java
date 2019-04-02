/**
 */
package navigationModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link navigationModeling.Carte#getRoutes <em>Routes</em>}</li>
 *   <li>{@link navigationModeling.Carte#getVilles <em>Villes</em>}</li>
 *   <li>{@link navigationModeling.Carte#getNom <em>Nom</em>}</li>
 *   <li>{@link navigationModeling.Carte#getIparcours <em>Iparcours</em>}</li>
 * </ul>
 *
 * @see navigationModeling.NavigationModelingPackage#getCarte()
 * @model
 * @generated
 */
public interface Carte extends EObject {
	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link navigationModeling.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see navigationModeling.NavigationModelingPackage#getCarte_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Villes</b></em>' containment reference list.
	 * The list contents are of type {@link navigationModeling.Ville}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Villes</em>' containment reference list.
	 * @see navigationModeling.NavigationModelingPackage#getCarte_Villes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ville> getVilles();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see navigationModeling.NavigationModelingPackage#getCarte_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link navigationModeling.Carte#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Iparcours</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iparcours</em>' reference.
	 * @see #setIparcours(IParcours)
	 * @see navigationModeling.NavigationModelingPackage#getCarte_Iparcours()
	 * @model
	 * @generated
	 */
	IParcours getIparcours();

	/**
	 * Sets the value of the '{@link navigationModeling.Carte#getIparcours <em>Iparcours</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iparcours</em>' reference.
	 * @see #getIparcours()
	 * @generated
	 */
	void setIparcours(IParcours value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void demandeParcours();

} // Carte
