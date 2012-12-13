package gis.com.restaurant.domain;

import java.util.List;
import java.util.Set;



public class Commande
{

	
	
	private Set<Boisson> boissons;
	
	
	private java.util.Date dateCommande;
	
	
	private Set<Plat> plats;
    

	
	public void addBoissons (Boisson newBoissons) 
	{
		if(this.boissons==null) {
			this.boissons= new java.util.HashSet<Boisson>();
		}
			
		this.boissons.add (newBoissons);
			
	}

	
	public void addPlats (Plat newPlats) 
	{
		if(this.plats==null) {
			this.plats= new java.util.HashSet<Plat>();
		}
			
		this.plats.add (newPlats);
			
	}

	
	public List<Boisson> getBoissons () 
	{
		if(this.boissons==null) {
			this.boissons= new java.util.HashSet<Boisson>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Boisson>(this.boissons));	
	}

	
	public java.util.Date getDateCommande () 
	{
		return this.dateCommande;	
	}

	
	public List<Plat> getPlats () 
	{
		if(this.plats==null) {
			this.plats= new java.util.HashSet<Plat>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Plat>(this.plats));	
	}

	
	public void removeBoissons (Boisson oldBoissons) 
	{
		if(this.boissons==null) {
			return;
		}
		
		this.boissons.remove (oldBoissons);
			
	}

	
	public void removePlats (Plat oldPlats) 
	{
		if(this.plats==null) {
			return;
		}
		
		this.plats.remove (oldPlats);
			
	}

	
	public void setDateCommande (java.util.Date myDateCommande) 
	{
		this.dateCommande = myDateCommande;	
	}

	
	public void unsetDateCommande () 
	{
		this.dateCommande = null;	
	}


}
