package com.genmymodel.petshop.domain;




public class Customer
{

	
	
	private Cart carts;
	
	
	private String firstName;
	
	
	private String lastName;
    

	
	public Cart getCarts () 
	{
		return this.carts;	
	}

	
	public String getFirstName () 
	{
		return this.firstName;	
	}

	
	public String getLastName () 
	{
		return this.lastName;	
	}

	
	public void setCarts (Cart myCarts) 
	{
		if (this.carts != myCarts) {
			Cart oldcarts = this.carts;
			this.carts = myCarts;
			if (oldcarts != null)
				oldcarts.unsetCustomer ();
			if (myCarts != null)
				myCarts.setCustomer (this);
		}	
	}

	
	public void setFirstName (String myFirstName) 
	{
		this.firstName = myFirstName;	
	}

	
	public void setLastName (String myLastName) 
	{
		this.lastName = myLastName;	
	}

	
	public void unsetCarts () 
	{
		if (this.carts == null)
			return;
		Cart oldcarts = this.carts;
		this.carts = null;
		oldcarts.unsetCustomer ();	
	}

	
	public void unsetFirstName () 
	{
		this.firstName = null;	
	}

	
	public void unsetLastName () 
	{
		this.lastName = null;	
	}


}
