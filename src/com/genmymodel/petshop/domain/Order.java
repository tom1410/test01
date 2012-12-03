package com.genmymodel.petshop.domain;

import java.util.Set;
import java.util.List;
import com.genmymodel.petshop.domain.OrderStatus;



public class Order
{

	
	
	private Cart cart;
	
	
	private Customer customer;
	
	
	private String date;
	
	
	private Address deliveryAddress;
	
	
	private Long id;
	
	
	private Set<Item> items;
	
	
	private Address paymentAddress;
	
	
	private String reference;
	
	
	private OrderStatus status;
    

	
	public void addItems (Item newItems) 
	{
		// TODO : to implement
			
	}

	
	public Cart getCart () 
	{
		// TODO : to implement
		return ;
			
	}

	
	public Customer getCustomer () 
	{
		// TODO : to implement
		return ;
			
	}

	
	public String getDate () 
	{
		// TODO : to implement
		return ;
			
	}

	
	public Address getDeliveryAddress () 
	{
		// TODO : to implement
		return ;
			
	}

	
	public Long getId () 
	{
		// TODO : to implement
		return ;
			
	}

	
	public List<Item> getItems () 
	{
		// TODO : to implement
		return ;
			
	}

	
	public Address getPaymentAddress () 
	{
		// TODO : to implement
		return ;
			
	}

	
	public String getReference () 
	{
		// TODO : to implement
		return ;
			
	}

	
	public OrderStatus getStatus () 
	{
		// TODO : to implement
		return ;
			
	}

	
	public void removeItems (Item oldItems) 
	{
		// TODO : to implement
			
	}

	
	public void setCart (Cart myCart) 
	{
		// TODO : to implement
			
	}

	
	public void setCustomer (Customer myCustomer) 
	{
		// TODO : to implement
			
	}

	
	public void setDate (String myDate) 
	{
		// TODO : to implement
			
	}

	
	public void setDeliveryAddress (Address myDeliveryAddress) 
	{
		// TODO : to implement
			
	}

	
	public void setId (Long myId) 
	{
		// TODO : to implement
			
	}

	
	public void setPaymentAddress (Address myPaymentAddress) 
	{
		// TODO : to implement
			
	}

	
	public void setReference (String myReference) 
	{
		// TODO : to implement
			
	}

	
	public void setStatus (OrderStatus myStatus) 
	{
		// TODO : to implement
			
	}

	
	public void unsetCart () 
	{
		// TODO : to implement
			
	}

	
	public void unsetCustomer () 
	{
		// TODO : to implement
			
	}

	
	public void unsetDate () 
	{
		// TODO : to implement
			
	}

	
	public void unsetDeliveryAddress () 
	{
		// TODO : to implement
			
	}

	
	public void unsetId () 
	{
		// TODO : to implement
			
	}

	
	public void unsetPaymentAddress () 
	{
		// TODO : to implement
			
	}

	
	public void unsetReference () 
	{
		// TODO : to implement
			
	}

	
	public void unsetStatus () 
	{
		// TODO : to implement
			
	}


}
