package com.genmymodel.petshop.domain;


public class Customer
{
  
  
  protected Address address;
  
  
  protected Cart carts;
  
  
  protected String firstName;
  
  
  protected String lastName;
  
  
  protected Order orders;

  //Start of user code Attribute bloc for Class Customer

  //End of user code

  public Customer(){
    //Start of user code standard constructor bloc for Class Customer

    //End of user code
  }

  //Start of user code Other constructor bloc for Class Customer

  //End of user code

  
  
  public void basicSetCarts(Cart myCarts) {
    if (this.carts != myCarts) {
      if (myCarts != null){
        if (this.carts != myCarts) {
          Cart oldcarts = this.carts;
          this.carts = myCarts;
          if (oldcarts != null)
            oldcarts.unsetCustomer();
        }
      }
    }	
  }
  
  
  
  public void basicSetOrders(Order myOrders) {
    if (this.orders != myOrders) {
      if (myOrders != null){
        if (this.orders != myOrders) {
          Order oldorders = this.orders;
          this.orders = myOrders;
          if (oldorders != null)
            oldorders.unsetCustomer();
        }
      }
    }	
  }
  
  
  
  public Address getAddress() {
    return this.address;	
  }
  
  
  
  public Cart getCarts() {
    return this.carts;	
  }
  
  
  
  public String getFirstName() {
    return this.firstName;	
  }
  
  
  
  public String getLastName() {
    return this.lastName;	
  }
  
  
  
  public Order getOrders() {
    return this.orders;	
  }
  
  
  
  public void setAddress(Address myAddress) {
    this.address = myAddress;	
  }
  
  
  
  public void setCarts(Cart myCarts) {
    this.basicSetCarts(myCarts);
    myCarts.basicSetCustomer(this);
      
  }
  
  
  
  public void setFirstName(String myFirstName) {
    this.firstName = myFirstName;	
  }
  
  
  
  public void setLastName(String myLastName) {
    this.lastName = myLastName;	
  }
  
  
  
  public void setOrders(Order myOrders) {
    this.basicSetOrders(myOrders);
    myOrders.basicSetCustomer(this);
      
  }
  
  
  
  public void unsetAddress() {
    this.address = new Address();	
  }
  
  
  
  public void unsetCarts() {
    if (this.carts == null)
      return;
    Cart oldcarts = this.carts;
    this.carts = null;
    oldcarts.unsetCustomer();	
  }
  
  
  
  public void unsetFirstName() {
    this.firstName = "";	
  }
  
  
  
  public void unsetLastName() {
    this.lastName = "";	
  }
  
  
  
  public void unsetOrders() {
    if (this.orders == null)
      return;
    Order oldorders = this.orders;
    this.orders = null;
    oldorders.unsetCustomer();	
  }
  
  //Start of user code Method bloc for Class Customer

  //End of user code

}