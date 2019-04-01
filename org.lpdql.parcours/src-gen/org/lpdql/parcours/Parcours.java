/**
 */
package org.lpdql.parcours;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parcours</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.parcours.Parcours#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see org.lpdql.parcours.ParcoursPackage#getParcours()
 * @model
 * @generated
 */
public interface Parcours extends EObject {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference list.
	 * The list contents are of type {@link org.lpdql.parcours.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference list.
	 * @see org.lpdql.parcours.ParcoursPackage#getParcours_Route()
	 * @model
	 * @generated
	 */
	EList<Route> getRoute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger calculDistance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger calculTemps();

} // Parcours
