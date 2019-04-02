/**
 */
package navigationModeling.impl;

import java.lang.reflect.InvocationTargetException;

import navigationModeling.NavigationModelingPackage;
import navigationModeling.ParoursRapide;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parours Rapide</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ParoursRapideImpl extends MinimalEObjectImpl.Container implements ParoursRapide {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParoursRapideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationModelingPackage.Literals.PAROURS_RAPIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CalculParcours() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int CalculDistance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int CalculDuree() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case NavigationModelingPackage.PAROURS_RAPIDE___CALCUL_PARCOURS:
			CalculParcours();
			return null;
		case NavigationModelingPackage.PAROURS_RAPIDE___CALCUL_DISTANCE:
			return CalculDistance();
		case NavigationModelingPackage.PAROURS_RAPIDE___CALCUL_DUREE:
			return CalculDuree();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ParoursRapideImpl
