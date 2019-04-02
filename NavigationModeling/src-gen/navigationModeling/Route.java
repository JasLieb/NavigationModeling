/**
 */
package navigationModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link navigationModeling.Route#getDuree <em>Duree</em>}</li>
 *   <li>{@link navigationModeling.Route#getVilleA <em>Ville A</em>}</li>
 *   <li>{@link navigationModeling.Route#getVilleB <em>Ville B</em>}</li>
 *   <li>{@link navigationModeling.Route#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see navigationModeling.NavigationModelingPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree</em>' attribute.
	 * @see #setDuree(int)
	 * @see navigationModeling.NavigationModelingPackage#getRoute_Duree()
	 * @model
	 * @generated
	 */
	int getDuree();

	/**
	 * Sets the value of the '{@link navigationModeling.Route#getDuree <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' attribute.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(int value);

	/**
	 * Returns the value of the '<em><b>Ville A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ville A</em>' reference.
	 * @see #setVilleA(Ville)
	 * @see navigationModeling.NavigationModelingPackage#getRoute_VilleA()
	 * @model
	 * @generated
	 */
	Ville getVilleA();

	/**
	 * Sets the value of the '{@link navigationModeling.Route#getVilleA <em>Ville A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ville A</em>' reference.
	 * @see #getVilleA()
	 * @generated
	 */
	void setVilleA(Ville value);

	/**
	 * Returns the value of the '<em><b>Ville B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ville B</em>' reference.
	 * @see #setVilleB(Ville)
	 * @see navigationModeling.NavigationModelingPackage#getRoute_VilleB()
	 * @model
	 * @generated
	 */
	Ville getVilleB();

	/**
	 * Sets the value of the '{@link navigationModeling.Route#getVilleB <em>Ville B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ville B</em>' reference.
	 * @see #getVilleB()
	 * @generated
	 */
	void setVilleB(Ville value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see navigationModeling.NavigationModelingPackage#getRoute_Distance()
	 * @model
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link navigationModeling.Route#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

} // Route
