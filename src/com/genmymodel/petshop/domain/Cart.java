package com.genmymodel.petshop.domain;




public class Cart
{

	
	
	private Boolean active;
	
	
	private java.util.Date creationDate;
	
	
	private Customer customer;
    

	
	public Boolean getActive () 
	{
		return this.active;	
	}

	
	public java.util.Date getCreationDate () 
	{
		return this.creationDate;	
	}

	
	public Customer getCustomer () 
	{
		return this.customer;	
	}

	
	public void setActive (Boolean myActive) 
	{
		this.active = myActive;	
	}

	
	public void setCreationDate (java.util.Date myCreationDate) 
	{
		this.creationDate = myCreationDate;	
	}

	
	public void setCustomer (Customer myCustomer) 
	{
		if (this.customer != myCustomer) {
			Customer oldcustomer = this.customer;
			this.customer = myCustomer;
			if (oldcustomer != null)
				oldcustomer.unsetCarts ();
			if (myCustomer != null)
				myCustomer.setCarts (this);
		}	
	}

	
	public void unsetCreationDate () 
	{
		this.creationDate = null;	
	}

	
	public void unsetCustomer () 
	{
		if (this.customer == null)
			return;
		Customer oldcustomer = this.customer;
		this.customer = null;
		oldcustomer.unsetCarts ();	
	}


}
