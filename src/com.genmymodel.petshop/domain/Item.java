package com.genmymodel.petshop.domain;


public class Item
{
  
  
  protected double price;
  
  
  protected Product product;
  
  
  protected String quantity;

  //Start of user code Attribute bloc for Class Item

  //End of user code

  public Item(){
    //Start of user code standard constructor bloc for Class Item

    //End of user code
  }

  //Start of user code Other constructor bloc for Class Item

  //End of user code

  
  
  public double getPrice() {
    return this.price;	
  }
  
  
  
  public Product getProduct() {
    return this.product;	
  }
  
  
  
  public String getQuantity() {
    return this.quantity;	
  }
  
  
  
  public void setPrice(double myPrice) {
    this.price = myPrice;	
  }
  
  
  
  public void setProduct(Product myProduct) {
    this.product = myProduct;	
  }
  
  
  
  public void setQuantity(String myQuantity) {
    this.quantity = myQuantity;	
  }
  
  
  
  public void unsetPrice() {
    this.price = 0.0;	
  }
  
  
  
  public void unsetProduct() {
    this.product = new Product();	
  }
  
  
  
  public void unsetQuantity() {
    this.quantity = "";	
  }
  
  //Start of user code Method bloc for Class Item

  //End of user code

}