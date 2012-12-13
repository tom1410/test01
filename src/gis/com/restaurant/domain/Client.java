package gis.com.restaurant.domain;




public class Client
{

	
	
	private String address;
	
	
	private String nom;
	
	
	private String prenom;
	
	
	private String telephone;
    

	
	public String getAddress () 
	{
		return this.address;	
	}

	
	public String getNom () 
	{
		return this.nom;	
	}

	
	public String getPrenom () 
	{
		return this.prenom;	
	}

	
	public String getTelephone () 
	{
		return this.telephone;	
	}

	
	public void setAddress (String myAddress) 
	{
		this.address = myAddress;	
	}

	
	public void setNom (String myNom) 
	{
		this.nom = myNom;	
	}

	
	public void setPrenom (String myPrenom) 
	{
		this.prenom = myPrenom;	
	}

	
	public void setTelephone (String myTelephone) 
	{
		this.telephone = myTelephone;	
	}

	
	public void unsetAddress () 
	{
		this.address = null;	
	}

	
	public void unsetNom () 
	{
		this.nom = null;	
	}

	
	public void unsetPrenom () 
	{
		this.prenom = null;	
	}

	
	public void unsetTelephone () 
	{
		this.telephone = null;	
	}


}
