package gis.com.restaurant.domain;




public class TableService
{

	
	
	private Long id;
	
	
	private Integer numero;
	
	
	private Integer places;
    

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public Integer getNumero () 
	{
		return this.numero;	
	}

	
	public Integer getPlaces () 
	{
		return this.places;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setNumero (Integer myNumero) 
	{
		this.numero = myNumero;	
	}

	
	public void setPlaces (Integer myPlaces) 
	{
		this.places = myPlaces;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetNumero () 
	{
		this.numero = null;	
	}

	
	public void unsetPlaces () 
	{
		this.places = null;	
	}


}
