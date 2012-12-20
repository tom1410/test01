package com.genmymodel.petshop.domain;

import java.util.Set;
import java.util.List;



public class Order
{

	
	
	private String date;
	
	
	private Set<Item> items;
	
	
	private String reference;
	
	
	private String status;
    

	
	public void addItems (Item newItems) 
	{
		if(this.items==null) {
			this.items= new java.util.HashSet<Item>();
		}
			
		this.items.add (newItems);
			
	}

	
	public String getDate () 
	{
		return this.date;	
	}

	
	public List<Item> getItems () 
	{
		if(this.items==null) {
			this.items= new java.util.HashSet<Item>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Item>(this.items));	
	}

	
	public String getReference () 
	{
		return this.reference;	
	}

	
	public String getStatus () 
	{
		return this.status;	
	}

	
	public void removeItems (Item oldItems) 
	{
		if(this.items==null) {
			return;
		}
		
		this.items.remove (oldItems);
			
	}

	
	public void setDate (String myDate) 
	{
		this.date = myDate;	
	}

	
	public void setReference (String myReference) 
	{
		this.reference = myReference;	
	}

	
	public void setStatus (String myStatus) 
	{
		this.status = myStatus;	
	}

	
	public void unsetDate () 
	{
		this.date = null;	
	}

	
	public void unsetReference () 
	{
		this.reference = null;	
	}

	
	public void unsetStatus () 
	{
		this.status = null;	
	}


}
