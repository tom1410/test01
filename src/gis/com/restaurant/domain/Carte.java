package gis.com.restaurant.domain;

import java.util.Set;
import java.util.List;



public class Carte
{

	
	
	private Set<Boisson> boissons;
	
	
	private Set<Plat> plats;
	
	
	private Integer version;
    

	
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

	
	public List<Plat> getPlats () 
	{
		if(this.plats==null) {
			this.plats= new java.util.HashSet<Plat>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Plat>(this.plats));	
	}

	
	public Integer getVersion () 
	{
		return this.version;	
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

	
	public void setVersion (Integer myVersion) 
	{
		this.version = myVersion;	
	}

	
	public void unsetVersion () 
	{
		this.version = null;	
	}


}
