package com.genmymodel.petshop.domain;




public class Item
{

	
	
	private Double price;
	
	
	private String quantity;
    

	
	public Double getPrice () 
	{
		return this.price;	
	}

	
	public String getQuantity () 
	{
		return this.quantity;	
	}

	
	public void setPrice (Double myPrice) 
	{
		this.price = myPrice;	
	}

	
	public void setQuantity (String myQuantity) 
	{
		this.quantity = myQuantity;	
	}

	
	public void unsetPrice () 
	{
		this.price = null;	
	}

	
	public void unsetQuantity () 
	{
		this.quantity = null;	
	}


}
