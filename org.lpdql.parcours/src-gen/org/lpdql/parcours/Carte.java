/**
 */
package org.lpdql.parcours;

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
 *   <li>{@link org.lpdql.parcours.Carte#getPoint <em>Point</em>}</li>
 *   <li>{@link org.lpdql.parcours.Carte#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see org.lpdql.parcours.ParcoursPackage#getCarte()
 * @model
 * @generated
 */
public interface Carte extends EObject {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.lpdql.parcours.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see org.lpdql.parcours.ParcoursPackage#getCarte_Point()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoint();

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.lpdql.parcours.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see org.lpdql.parcours.ParcoursPackage#getCarte_Route()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoute();

} // Carte
