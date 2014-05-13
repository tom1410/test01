package com.genmymodel.shoppingcart;


/**
 * Differentiated from Product to introduce quantity.
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class LineItem
{
	/**
	 * The number of products
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Integer quantity;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Double price;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Product product;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public ShoppingCart sc;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public LineItem(){
		super();
	}

}

