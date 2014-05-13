package com.genmymodel.shoppingcart.domain;


/**
 * Differentiated from Product to introduce quantity.
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class LineItem
{
	/**
	 * The number of products
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected Integer quantity;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected Double price;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.ManyToOne
	@javax.persistence.JoinColumn(nullable = false)
	protected Product product;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.ManyToOne
	@javax.persistence.JoinColumn(nullable = false)
	protected ShoppingCart sc;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id@javax.persistence.Column(nullable = false)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	protected final Long id = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public LineItem(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetProduct(Product myProduct) {
		if (this.product != myProduct) {
			if (myProduct != null){
				if (this.product != myProduct) {
					Product oldproduct = this.product;
					this.product = myProduct;
					if (oldproduct != null)
						oldproduct.removeLineItems(this);
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetSc(ShoppingCart mySc) {
		if (this.sc != mySc) {
			if (mySc != null){
				if (this.sc != mySc) {
					ShoppingCart oldsc = this.sc;
					this.sc = mySc;
					if (oldsc != null)
						oldsc.removeItems(this);
				}
			}
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Integer getQuantity() {
		return this.quantity;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Double getPrice() {
		return this.price;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Product getProduct() {
		return this.product;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public ShoppingCart getSc() {
		return this.sc;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setQuantity(Integer myQuantity) {
		this.quantity = myQuantity;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setPrice(Double myPrice) {
		this.price = myPrice;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setProduct(Product myProduct) {
		this.basicSetProduct(myProduct);
		myProduct.addLineItems(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setSc(ShoppingCart mySc) {
		this.basicSetSc(mySc);
		mySc.addItems(this);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetQuantity() {
		this.quantity = null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetPrice() {
		this.price = null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetProduct() {
		if (this.product == null)
			return;
		Product oldproduct = this.product;
		this.product = null;
		oldproduct.removeLineItems(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetSc() {
		if (this.sc == null)
			return;
		ShoppingCart oldsc = this.sc;
		this.sc = null;
		oldsc.removeItems(this);	
	}
	
}

