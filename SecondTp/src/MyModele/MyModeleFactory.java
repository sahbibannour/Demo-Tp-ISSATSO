/**
 */
package MyModele;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MyModele.MyModelePackage
 * @generated
 */
public interface MyModeleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyModeleFactory eINSTANCE = MyModele.impl.MyModeleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>webpage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>webpage</em>'.
	 * @generated
	 */
	webpage createwebpage();

	/**
	 * Returns a new object of class '<em>web</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>web</em>'.
	 * @generated
	 */
	web createweb();

	/**
	 * Returns a new object of class '<em>article</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>article</em>'.
	 * @generated
	 */
	article createarticle();

	/**
	 * Returns a new object of class '<em>category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>category</em>'.
	 * @generated
	 */
	category createcategory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MyModelePackage getMyModelePackage();

} //MyModeleFactory
