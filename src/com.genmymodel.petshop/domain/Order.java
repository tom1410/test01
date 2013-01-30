package com.genmymodel.petshop.domain;


public class Order
{
  
  
  protected Cart cart;
  
  
  protected Customer customer;
  
  
  protected String date;
  
  
  protected Address deliveryAddress;
  
  
  protected Item items;
  
  
  protected Address paymentAddress;
  
  
  protected String reference;
  
  
  protected String status;

  //Start of user code Attribute bloc for Class Order

  //End of user code

  public Order(){
    //Start of user code standard constructor bloc for Class Order

    //End of user code
  }

  //Start of user code Other constructor bloc for Class Order

  //End of user code

  
  
  public void basicSetCart(Cart myCart) {
    if (this.cart != myCart) {
      if (myCart != null){
        if (this.cart != myCart) {
          Cart oldcart = this.cart;
          this.cart = myCart;
          if (oldcart != null)
            oldcart.unsetOrder();
        }
      }
    }	
  }
  
  
  
  public void basicSetCustomer(Customer myCustomer) {
    if (this.customer != myCustomer) {
      if (myCustomer != null){
        if (this.customer != myCustomer) {
          Customer oldcustomer = this.customer;
          this.customer = myCustomer;
          if (oldcustomer != null)
            oldcustomer.unsetOrders();
        }
      }
    }	
  }
  
  
  
  public Cart getCart() {
    return this.cart;	
  }
  
  
  
  public Customer getCustomer() {
    return this.customer;	
  }
  
  
  
  public String getDate() {
    return this.date;	
  }
  
  
  
  public Address getDeliveryAddress() {
    return this.deliveryAddress;	
  }
  
  
  
  public Item getItems() {
    return this.items;	
  }
  
  
  
  public Address getPaymentAddress() {
    return this.paymentAddress;	
  }
  
  
  
  public String getReference() {
    return this.reference;	
  }
  
  
  
  public String getStatus() {
    return this.status;	
  }
  
  
  
  public void setCart(Cart myCart) {
    this.basicSetCart(myCart);
    myCart.basicSetOrder(this);
      
  }
  
  
  
  public void setCustomer(Customer myCustomer) {
    this.basicSetCustomer(myCustomer);
    myCustomer.basicSetOrders(this);
      
  }
  
  
  
  public void setDate(String myDate) {
    this.date = myDate;	
  }
  
  
  
  public void setDeliveryAddress(Address myDeliveryAddress) {
    this.deliveryAddress = myDeliveryAddress;	
  }
  
  
  
  public void setItems(Item myItems) {
    this.items = myItems;	
  }
  
  
  
  public void setPaymentAddress(Address myPaymentAddress) {
    this.paymentAddress = myPaymentAddress;	
  }
  
  
  
  public void setReference(String myReference) {
    this.reference = myReference;	
  }
  
  
  
  public void setStatus(String myStatus) {
    this.status = myStatus;	
  }
  
  
  
  public void unsetCart() {
    if (this.cart == null)
      return;
    Cart oldcart = this.cart;
    this.cart = null;
    oldcart.unsetOrder();	
  }
  
  
  
  public void unsetCustomer() {
    if (this.customer == null)
      return;
    Customer oldcustomer = this.customer;
    this.customer = null;
    oldcustomer.unsetOrders();	
  }
  
  
  
  public void unsetDate() {
    this.date = "";	
  }
  
  
  
  public void unsetDeliveryAddress() {
    this.deliveryAddress = new Address();	
  }
  
  
  
  public void unsetItems() {
    this.items = new Item();	
  }
  
  
  
  public void unsetPaymentAddress() {
    this.paymentAddress = new Address();	
  }
  
  
  
  public void unsetReference() {
    this.reference = "";	
  }
  
  
  
  public void unsetStatus() {
    this.status = "";	
  }
  
  //Start of user code Method bloc for Class Order

  //End of user code

}