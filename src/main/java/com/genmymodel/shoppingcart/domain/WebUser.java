package com.genmymodel.shoppingcart.domain;


/**
 * The website visitor, considered not logged in yet.
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class WebUser
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected String login;
	/**
	 * Should be encrypted
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Column(name = "PASSWORDCOLUMN")
	protected String password;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	@javax.persistence.Column(name = "STATECOLUMN")
	protected UserState state;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToOne(optional = false)
	protected Customer customer;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne 
	protected ShoppingCart shoppingCart;
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
	public WebUser(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetCustomer(Customer myCustomer) {
		if (this.customer != myCustomer) {
			if (myCustomer != null){
				if (this.customer != myCustomer) {
					Customer oldcustomer = this.customer;
					this.customer = myCustomer;
					if (oldcustomer != null)
						oldcustomer.unsetWebUser();
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
	public void basicSetShoppingCart(ShoppingCart myShoppingCart) {
		if (this.shoppingCart != myShoppingCart) {
			if (myShoppingCart != null){
				if (this.shoppingCart != myShoppingCart) {
					ShoppingCart oldshoppingCart = this.shoppingCart;
					this.shoppingCart = myShoppingCart;
					if (oldshoppingCart != null)
						oldshoppingCart.unsetWebUser();
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
	protected String getLogin() {
		return this.login;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private String getPassword() {
		return this.password;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public UserState getState() {
		return this.state;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Customer getCustomer() {
		return this.customer;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public ShoppingCart getShoppingCart() {
		return this.shoppingCart;	
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
	protected void setLogin(String myLogin) {
		this.login = myLogin;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setPassword(String myPassword) {
		this.password = myPassword;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setState(UserState myState) {
		this.state = myState;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setCustomer(Customer myCustomer) {
		this.basicSetCustomer(myCustomer);
		myCustomer.basicSetWebUser(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setShoppingCart(ShoppingCart myShoppingCart) {
		this.basicSetShoppingCart(myShoppingCart);
		myShoppingCart.basicSetWebUser(this);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	protected void unsetLogin() {
		this.login = null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetPassword() {
		this.password = null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetState() {
		this.state = null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetCustomer() {
		if (this.customer == null)
			return;
		Customer oldcustomer = this.customer;
		this.customer = null;
		oldcustomer.unsetWebUser();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetShoppingCart() {
		if (this.shoppingCart == null)
			return;
		ShoppingCart oldshoppingCart = this.shoppingCart;
		this.shoppingCart = null;
		oldshoppingCart.unsetWebUser();	
	}
	
}

