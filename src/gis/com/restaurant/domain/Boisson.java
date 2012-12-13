package gis.com.restaurant.domain;




public class Boisson
{

	
	
	private String designation;
	
	
	private Double prix;
    

	
	public String getDesignation () 
	{
		return this.designation;	
	}

	
	public Double getPrix () 
	{
		return this.prix;	
	}

	
	public void setDesignation (String myDesignation) 
	{
		this.designation = myDesignation;	
	}

	
	public void setPrix (Double myPrix) 
	{
		this.prix = myPrix;	
	}

	
	public void unsetDesignation () 
	{
		this.designation = null;	
	}

	
	public void unsetPrix () 
	{
		this.prix = null;	
	}


}
