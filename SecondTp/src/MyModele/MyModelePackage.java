/**
 */
package MyModele;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MyModele.MyModeleFactory
 * @model kind="package"
 * @generated
 */
public interface MyModelePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MyModele";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org/eclipse/MyModele";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.MyModele";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyModelePackage eINSTANCE = MyModele.impl.MyModelePackageImpl.init();

	/**
	 * The meta object id for the '{@link MyModele.impl.webpageImpl <em>webpage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyModele.impl.webpageImpl
	 * @see MyModele.impl.MyModelePackageImpl#getwebpage()
	 * @generated
	 */
	int WEBPAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__KEYWORDS = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__CATEGORY = 4;

	/**
	 * The number of structural features of the '<em>webpage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link MyModele.impl.webImpl <em>web</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyModele.impl.webImpl
	 * @see MyModele.impl.MyModelePackageImpl#getweb()
	 * @generated
	 */
	int WEB = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__KEYWORDS = 3;

	/**
	 * The feature id for the '<em><b>Webpage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__WEBPAGE = 4;

	/**
	 * The number of structural features of the '<em>web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link MyModele.impl.articleImpl <em>article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyModele.impl.articleImpl
	 * @see MyModele.impl.MyModelePackageImpl#getarticle()
	 * @generated
	 */
	int ARTICLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CREATED = 1;

	/**
	 * The number of structural features of the '<em>article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MyModele.impl.categoryImpl <em>category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyModele.impl.categoryImpl
	 * @see MyModele.impl.MyModelePackageImpl#getcategory()
	 * @generated
	 */
	int CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Article</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ARTICLE = 1;

	/**
	 * The number of structural features of the '<em>category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see MyModele.impl.MyModelePackageImpl#getcalendar()
	 * @generated
	 */
	int CALENDAR = 4;


	/**
	 * Returns the meta object for class '{@link MyModele.webpage <em>webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>webpage</em>'.
	 * @see MyModele.webpage
	 * @generated
	 */
	EClass getwebpage();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.webpage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MyModele.webpage#getName()
	 * @see #getwebpage()
	 * @generated
	 */
	EAttribute getwebpage_Name();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.webpage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see MyModele.webpage#getTitle()
	 * @see #getwebpage()
	 * @generated
	 */
	EAttribute getwebpage_Title();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.webpage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MyModele.webpage#getDescription()
	 * @see #getwebpage()
	 * @generated
	 */
	EAttribute getwebpage_Description();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.webpage#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see MyModele.webpage#getKeywords()
	 * @see #getwebpage()
	 * @generated
	 */
	EAttribute getwebpage_Keywords();

	/**
	 * Returns the meta object for the containment reference list '{@link MyModele.webpage#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see MyModele.webpage#getCategory()
	 * @see #getwebpage()
	 * @generated
	 */
	EReference getwebpage_Category();

	/**
	 * Returns the meta object for class '{@link MyModele.web <em>web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>web</em>'.
	 * @see MyModele.web
	 * @generated
	 */
	EClass getweb();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.web#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MyModele.web#getName()
	 * @see #getweb()
	 * @generated
	 */
	EAttribute getweb_Name();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.web#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see MyModele.web#getTitle()
	 * @see #getweb()
	 * @generated
	 */
	EAttribute getweb_Title();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.web#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MyModele.web#getDescription()
	 * @see #getweb()
	 * @generated
	 */
	EAttribute getweb_Description();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.web#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see MyModele.web#getKeywords()
	 * @see #getweb()
	 * @generated
	 */
	EAttribute getweb_Keywords();

	/**
	 * Returns the meta object for the containment reference list '{@link MyModele.web#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Webpage</em>'.
	 * @see MyModele.web#getWebpage()
	 * @see #getweb()
	 * @generated
	 */
	EReference getweb_Webpage();

	/**
	 * Returns the meta object for class '{@link MyModele.article <em>article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>article</em>'.
	 * @see MyModele.article
	 * @generated
	 */
	EClass getarticle();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.article#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MyModele.article#getName()
	 * @see #getarticle()
	 * @generated
	 */
	EAttribute getarticle_Name();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.article#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see MyModele.article#getCreated()
	 * @see #getarticle()
	 * @generated
	 */
	EAttribute getarticle_Created();

	/**
	 * Returns the meta object for class '{@link MyModele.category <em>category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>category</em>'.
	 * @see MyModele.category
	 * @generated
	 */
	EClass getcategory();

	/**
	 * Returns the meta object for the attribute '{@link MyModele.category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MyModele.category#getName()
	 * @see #getcategory()
	 * @generated
	 */
	EAttribute getcategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link MyModele.category#getArticle <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Article</em>'.
	 * @see MyModele.category#getArticle()
	 * @see #getcategory()
	 * @generated
	 */
	EReference getcategory_Article();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>calendar</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getcalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyModeleFactory getMyModeleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MyModele.impl.webpageImpl <em>webpage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyModele.impl.webpageImpl
		 * @see MyModele.impl.MyModelePackageImpl#getwebpage()
		 * @generated
		 */
		EClass WEBPAGE = eINSTANCE.getwebpage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__NAME = eINSTANCE.getwebpage_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__TITLE = eINSTANCE.getwebpage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__DESCRIPTION = eINSTANCE.getwebpage_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__KEYWORDS = eINSTANCE.getwebpage_Keywords();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBPAGE__CATEGORY = eINSTANCE.getwebpage_Category();

		/**
		 * The meta object literal for the '{@link MyModele.impl.webImpl <em>web</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyModele.impl.webImpl
		 * @see MyModele.impl.MyModelePackageImpl#getweb()
		 * @generated
		 */
		EClass WEB = eINSTANCE.getweb();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__NAME = eINSTANCE.getweb_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__TITLE = eINSTANCE.getweb_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__DESCRIPTION = eINSTANCE.getweb_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__KEYWORDS = eINSTANCE.getweb_Keywords();

		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB__WEBPAGE = eINSTANCE.getweb_Webpage();

		/**
		 * The meta object literal for the '{@link MyModele.impl.articleImpl <em>article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyModele.impl.articleImpl
		 * @see MyModele.impl.MyModelePackageImpl#getarticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getarticle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__NAME = eINSTANCE.getarticle_Name();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__CREATED = eINSTANCE.getarticle_Created();

		/**
		 * The meta object literal for the '{@link MyModele.impl.categoryImpl <em>category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyModele.impl.categoryImpl
		 * @see MyModele.impl.MyModelePackageImpl#getcategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getcategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getcategory_Name();

		/**
		 * The meta object literal for the '<em><b>Article</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ARTICLE = eINSTANCE.getcategory_Article();

		/**
		 * The meta object literal for the '<em>calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see MyModele.impl.MyModelePackageImpl#getcalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getcalendar();

	}

} //MyModelePackage
