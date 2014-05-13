package com.genmymodel.shoppingcart.domain;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;


/**
 * The entity ShoppingCart is related to one Account, one WebUser and references several LineItem.&nbsp;
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class ShoppingCart
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Temporal(javax.persistence.TemporalType.DATE) 
	protected Date creationDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne 
	protected Account account;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne(mappedBy = "shoppingCart") 
	protected WebUser webUser;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany 
	protected Set<LineItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id 
	@javax.persistence.Column(nullable = false) 
	protected final Long id = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ShoppingCart(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetAccount(Account myAccount) {
		if (this.account != myAccount) {
			if (myAccount != null){
				if (this.account != myAccount) {
					Account oldaccount = this.account;
					this.account = myAccount;
					if (oldaccount != null)
						oldaccount.unsetCart();
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
	public void basicSetWebUser(WebUser myWebUser) {
		if (this.webUser != myWebUser) {
			if (myWebUser != null){
				if (this.webUser != myWebUser) {
					WebUser oldwebUser = this.webUser;
					this.webUser = myWebUser;
					if (oldwebUser != null)
						oldwebUser.unsetShoppingCart();
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
	public Date getCreationDate() {
		return this.creationDate;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Account getAccount() {
		return this.account;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public WebUser getWebUser() {
		return this.webUser;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<LineItem> getItems() {
		if(this.items == null) {
				this.items = new HashSet<LineItem>();
		}
		return (Set<LineItem>) this.items;	
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
	public void addAllItems(Set<LineItem> newItems) {
		if (this.items == null) {
			this.items = new HashSet<LineItem>();
		}
		for (LineItem tmp : newItems)
			tmp.setSc(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllItems(Set<LineItem> newItems) {
		if(this.items == null) {
			return;
		}
		
		this.items.removeAll(newItems);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setCreationDate(Date myCreationDate) {
		this.creationDate = myCreationDate;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setAccount(Account myAccount) {
		this.basicSetAccount(myAccount);
		myAccount.basicSetCart(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setWebUser(WebUser myWebUser) {
		this.basicSetWebUser(myWebUser);
		myWebUser.basicSetShoppingCart(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addItems(LineItem newItems) {
		if(this.items == null) {
			this.items = new HashSet<LineItem>();
		}
		
		if (this.items.add(newItems))
			newItems.basicSetSc(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetCreationDate() {
		this.creationDate = null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetAccount() {
		if (this.account == null)
			return;
		Account oldaccount = this.account;
		this.account = null;
		oldaccount.unsetCart();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetWebUser() {
		if (this.webUser == null)
			return;
		WebUser oldwebUser = this.webUser;
		this.webUser = null;
		oldwebUser.unsetShoppingCart();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeItems(LineItem oldItems) {
		if(this.items == null)
			return;
		
		if (this.items.remove(oldItems))
			oldItems.unsetSc();
			
	}
	
}

