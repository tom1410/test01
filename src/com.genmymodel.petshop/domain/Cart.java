package com.genmymodel.petshop.domain;


import java.util.Date;

public class Cart
{
  
  
  protected boolean active;
  
  
  protected Date creationDate;
  
  
  protected Customer customer;
  
  
  protected Item items;
  
  
  protected Order order;

  //Start of user code Attribute bloc for Class Cart

  //End of user code

  public Cart(){
    //Start of user code standard constructor bloc for Class Cart

    //End of user code
  }

  //Start of user code Other constructor bloc for Class Cart

  //End of user code

  
  
  public void basicSetCustomer(Customer myCustomer) {
    if (this.customer != myCustomer) {
      if (myCustomer != null){
        if (this.customer != myCustomer) {
          Customer oldcustomer = this.customer;
          this.customer = myCustomer;
          if (oldcustomer != null)
            oldcustomer.unsetCarts();
        }
      }
    }	
  }
  
  
  
  public void basicSetOrder(Order myOrder) {
    if (this.order != myOrder) {
      if (myOrder != null){
        if (this.order != myOrder) {
          Order oldorder = this.order;
          this.order = myOrder;
          if (oldorder != null)
            oldorder.unsetCart();
        }
      }
    }	
  }
  
  
  
  public Date getCreationDate() {
    return this.creationDate;	
  }
  
  
  
  public Customer getCustomer() {
    return this.customer;	
  }
  
  
  
  public Item getItems() {
    return this.items;	
  }
  
  
  
  public Order getOrder() {
    return this.order;	
  }
  
  
  
  public boolean isActive() {
    return this.active;	
  }
  
  
  
  public void setActive(boolean myActive) {
    this.active = myActive;	
  }
  
  
  
  public void setCreationDate(Date myCreationDate) {
    this.creationDate = myCreationDate;	
  }
  
  
  
  public void setCustomer(Customer myCustomer) {
    this.basicSetCustomer(myCustomer);
    myCustomer.basicSetCarts(this);
      
  }
  
  
  
  public void setItems(Item myItems) {
    this.items = myItems;	
  }
  
  
  
  public void setOrder(Order myOrder) {
    this.basicSetOrder(myOrder);
    myOrder.basicSetCart(this);
      
  }
  
  
  
  public void unsetActive() {
    this.active = false;	
  }
  
  
  
  public void unsetCreationDate() {
    this.creationDate = new Date();;	
  }
  
  
  
  public void unsetCustomer() {
    if (this.customer == null)
      return;
    Customer oldcustomer = this.customer;
    this.customer = null;
    oldcustomer.unsetCarts();	
  }
  
  
  
  public void unsetItems() {
    this.items = new Item();	
  }
  
  
  
  public void unsetOrder() {
    if (this.order == null)
      return;
    Order oldorder = this.order;
    this.order = null;
    oldorder.unsetCart();	
  }
  
  //Start of user code Method bloc for Class Cart

  //End of user code

}