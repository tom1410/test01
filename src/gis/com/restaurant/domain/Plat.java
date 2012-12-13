package gis.com.restaurant.domain;




public class Plat
{

	
	
	private Long id;
	
	
	private String nbEtoiles;
    

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public String getNbEtoiles () 
	{
		return this.nbEtoiles;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setNbEtoiles (String myNbEtoiles) 
	{
		this.nbEtoiles = myNbEtoiles;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetNbEtoiles () 
	{
		this.nbEtoiles = null;	
	}


}
