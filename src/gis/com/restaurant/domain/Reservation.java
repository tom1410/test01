package gis.com.restaurant.domain;




public class Reservation
{

	
	
	private Client client;
	
	
	private java.util.Date dateResa;
	
	
	private TableService table;
    

	
	public Client getClient () 
	{
		return this.client;	
	}

	
	public java.util.Date getDateResa () 
	{
		return this.dateResa;	
	}

	
	public TableService getTable () 
	{
		return this.table;	
	}

	
	public void setClient (Client myClient) 
	{
		this.client = myClient;	
	}

	
	public void setDateResa (java.util.Date myDateResa) 
	{
		this.dateResa = myDateResa;	
	}

	
	public void setTable (TableService myTable) 
	{
		this.table = myTable;	
	}

	
	public void unsetClient () 
	{
		this.client = null;	
	}

	
	public void unsetDateResa () 
	{
		this.dateResa = null;	
	}

	
	public void unsetTable () 
	{
		this.table = null;	
	}


}
