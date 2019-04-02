/**
 */
package navigationModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ville</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link navigationModeling.Ville#getNom <em>Nom</em>}</li>
 *   <li>{@link navigationModeling.Ville#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see navigationModeling.NavigationModelingPackage#getVille()
 * @model
 * @generated
 */
public interface Ville extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see navigationModeling.NavigationModelingPackage#getVille_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link navigationModeling.Ville#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link navigationModeling.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see navigationModeling.NavigationModelingPackage#getVille_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Ville
