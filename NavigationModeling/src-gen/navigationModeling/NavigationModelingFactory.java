/**
 */
package navigationModeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see navigationModeling.NavigationModelingPackage
 * @generated
 */
public interface NavigationModelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NavigationModelingFactory eINSTANCE = navigationModeling.impl.NavigationModelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Carte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carte</em>'.
	 * @generated
	 */
	Carte createCarte();

	/**
	 * Returns a new object of class '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route</em>'.
	 * @generated
	 */
	Route createRoute();

	/**
	 * Returns a new object of class '<em>Ville</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ville</em>'.
	 * @generated
	 */
	Ville createVille();

	/**
	 * Returns a new object of class '<em>Parours Rapide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parours Rapide</em>'.
	 * @generated
	 */
	ParoursRapide createParoursRapide();

	/**
	 * Returns a new object of class '<em>Parours Court</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parours Court</em>'.
	 * @generated
	 */
	ParoursCourt createParoursCourt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NavigationModelingPackage getNavigationModelingPackage();

} //NavigationModelingFactory
