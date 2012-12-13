package gis.com.restaurant.domain;




public class Boisson
{

	
	
	private String designation;
	
	
	private Long id;
	
	
	private Double prix;
    

	
	public String getDesignation () 
	{
		return this.designation;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public Double getPrix () 
	{
		return this.prix;	
	}

	
	public void setDesignation (String myDesignation) 
	{
		this.designation = myDesignation;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setPrix (Double myPrix) 
	{
		this.prix = myPrix;	
	}

	
	public void unsetDesignation () 
	{
		this.designation = null;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetPrix () 
	{
		this.prix = null;	
	}


}
