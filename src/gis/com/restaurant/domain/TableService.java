package gis.com.restaurant.domain;




public class TableService
{

	
	
	private Integer numero;
	
	
	private Integer places;
    

	
	public Integer getNumero () 
	{
		return this.numero;	
	}

	
	public Integer getPlaces () 
	{
		return this.places;	
	}

	
	public void setNumero (Integer myNumero) 
	{
		this.numero = myNumero;	
	}

	
	public void setPlaces (Integer myPlaces) 
	{
		this.places = myPlaces;	
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
