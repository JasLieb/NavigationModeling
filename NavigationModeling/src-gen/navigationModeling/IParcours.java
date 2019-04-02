/**
 */
package navigationModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IParcours</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see navigationModeling.NavigationModelingPackage#getIParcours()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IParcours extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CalculParcours();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int CalculDistance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int CalculDuree();

} // IParcours
