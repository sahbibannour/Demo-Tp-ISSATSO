/**
 */
package MyModele;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MyModele.category#getName <em>Name</em>}</li>
 *   <li>{@link MyModele.category#getArticle <em>Article</em>}</li>
 * </ul>
 *
 * @see MyModele.MyModelePackage#getcategory()
 * @model
 * @generated
 */
public interface category extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MyModele.MyModelePackage#getcategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MyModele.category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Article</b></em>' containment reference list.
	 * The list contents are of type {@link MyModele.article}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Article</em>' containment reference list.
	 * @see MyModele.MyModelePackage#getcategory_Article()
	 * @model type="MyModele.article" containment="true"
	 * @generated
	 */
	EList getArticle();

} // category
