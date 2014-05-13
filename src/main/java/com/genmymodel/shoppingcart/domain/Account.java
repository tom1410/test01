package com.genmymodel.shoppingcart.domain;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;


/**
 * Notice the aggregation from Customer. No account without a Customer. Account can be closed. Most of the time both Account and Customer stay in the database even when the customer unsuscribe/leave the shop.&nbsp;<div><br></div>
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class Account
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected String billingAddress;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
	@javax.persistence.Column(name = "OPENCOLUMN")
	protected Date open;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
	protected Date closed;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected Boolean isClosed;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL)
	protected ShoppingCart cart;
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
	@javax.persistence.OneToMany(mappedBy = "account", cascade = javax.persistence.CascadeType.ALL)
	protected Set<Order> order;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany(mappedBy = "acc") 
	protected Set<Payment> p;
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
	public Account(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetCart(ShoppingCart myCart) {
		if (this.cart != myCart) {
			if (myCart != null){
				if (this.cart != myCart) {
					ShoppingCart oldcart = this.cart;
					this.cart = myCart;
					if (oldcart != null)
						oldcart.unsetAccount();
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
	public void basicSetCustomer(Customer myCustomer) {
		if (this.customer != myCustomer) {
			if (myCustomer != null){
				if (this.customer != myCustomer) {
					Customer oldcustomer = this.customer;
					this.customer = myCustomer;
					if (oldcustomer != null)
						oldcustomer.unsetAccount();
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
	public String getBillingAddress() {
		return this.billingAddress;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Date getOpen() {
		return this.open;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Date getClosed() {
		return this.closed;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Boolean getIsClosed() {
		return this.isClosed;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public ShoppingCart getCart() {
		return this.cart;	
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
	public Set<Order> getOrder() {
		if(this.order == null) {
				this.order = new HashSet<Order>();
		}
		return (Set<Order>) this.order;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Payment> getP() {
		if(this.p == null) {
				this.p = new HashSet<Payment>();
		}
		return (Set<Payment>) this.p;	
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
	public void addAllOrder(Set<Order> newOrder) {
		if (this.order == null) {
			this.order = new HashSet<Order>();
		}
		for (Order tmp : newOrder)
			tmp.setAccount(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllP(Set<Payment> newP) {
		if (this.p == null) {
			this.p = new HashSet<Payment>();
		}
		for (Payment tmp : newP)
			tmp.setAcc(this);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllOrder(Set<Order> newOrder) {
		if(this.order == null) {
			return;
		}
		
		this.order.removeAll(newOrder);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllP(Set<Payment> newP) {
		if(this.p == null) {
			return;
		}
		
		this.p.removeAll(newP);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setBillingAddress(String myBillingAddress) {
		this.billingAddress = myBillingAddress;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setOpen(Date myOpen) {
		this.open = myOpen;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setClosed(Date myClosed) {
		this.closed = myClosed;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setIsClosed(Boolean myIsClosed) {
		this.isClosed = myIsClosed;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setCart(ShoppingCart myCart) {
		this.basicSetCart(myCart);
		myCart.basicSetAccount(this);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setCustomer(Customer myCustomer) {
		this.basicSetCustomer(myCustomer);
		myCustomer.basicSetAccount(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addOrder(Order newOrder) {
		if(this.order == null) {
			this.order = new HashSet<Order>();
		}
		
		if (this.order.add(newOrder))
			newOrder.basicSetAccount(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addP(Payment newP) {
		if(this.p == null) {
			this.p = new HashSet<Payment>();
		}
		
		if (this.p.add(newP))
			newP.basicSetAcc(this);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetBillingAddress() {
		this.billingAddress = null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetOpen() {
		this.open = null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetClosed() {
		this.closed = null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetIsClosed() {
		this.isClosed = null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetCart() {
		if (this.cart == null)
			return;
		ShoppingCart oldcart = this.cart;
		this.cart = null;
		oldcart.unsetAccount();	
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
		oldcustomer.unsetAccount();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeOrder(Order oldOrder) {
		if(this.order == null)
			return;
		
		if (this.order.remove(oldOrder))
			oldOrder.unsetAccount();
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeP(Payment oldP) {
		if(this.p == null)
			return;
		
		if (this.p.remove(oldP))
			oldP.unsetAcc();
			
	}
	
}

