/**
 */
package org.lpdql.parcours;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.lpdql.parcours.Route#getPoint1 <em>Point1</em>}</li>
 *   <li>{@link org.lpdql.parcours.Route#getPoint2 <em>Point2</em>}</li>
 *   <li>{@link org.lpdql.parcours.Route#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.lpdql.parcours.Route#getTemps <em>Temps</em>}</li>
 * </ul>
 *
 * @see org.lpdql.parcours.ParcoursPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Point1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point1</em>' reference.
	 * @see #setPoint1(Point)
	 * @see org.lpdql.parcours.ParcoursPackage#getRoute_Point1()
	 * @model
	 * @generated
	 */
	Point getPoint1();

	/**
	 * Sets the value of the '{@link org.lpdql.parcours.Route#getPoint1 <em>Point1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point1</em>' reference.
	 * @see #getPoint1()
	 * @generated
	 */
	void setPoint1(Point value);

	/**
	 * Returns the value of the '<em><b>Point2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point2</em>' reference.
	 * @see #setPoint2(Point)
	 * @see org.lpdql.parcours.ParcoursPackage#getRoute_Point2()
	 * @model
	 * @generated
	 */
	Point getPoint2();

	/**
	 * Sets the value of the '{@link org.lpdql.parcours.Route#getPoint2 <em>Point2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point2</em>' reference.
	 * @see #getPoint2()
	 * @generated
	 */
	void setPoint2(Point value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute list.
	 * @see org.lpdql.parcours.ParcoursPackage#getRoute_Distance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	EList<Integer> getDistance();

	/**
	 * Returns the value of the '<em><b>Temps</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps</em>' attribute list.
	 * @see org.lpdql.parcours.ParcoursPackage#getRoute_Temps()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	EList<Integer> getTemps();

} // Route
