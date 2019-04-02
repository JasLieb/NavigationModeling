/**
 */
package navigationModeling.impl;

import java.lang.reflect.InvocationTargetException;

import navigationModeling.NavigationModelingPackage;
import navigationModeling.ParoursCourt;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parours Court</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ParoursCourtImpl extends MinimalEObjectImpl.Container implements ParoursCourt {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParoursCourtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationModelingPackage.Literals.PAROURS_COURT;
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
		case NavigationModelingPackage.PAROURS_COURT___CALCUL_PARCOURS:
			CalculParcours();
			return null;
		case NavigationModelingPackage.PAROURS_COURT___CALCUL_DISTANCE:
			return CalculDistance();
		case NavigationModelingPackage.PAROURS_COURT___CALCUL_DUREE:
			return CalculDuree();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ParoursCourtImpl
