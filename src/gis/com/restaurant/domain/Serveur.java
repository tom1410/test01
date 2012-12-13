package gis.com.restaurant.domain;

import java.util.List;
import java.util.Set;



public class Serveur
{

	
	
	private Set<Commande> commandes;
	
	
	private Long id;
	
	
	private String nom;
	
	
	private String prenom;
	
	
	private Set<TableService> tables;
    

	
	public void addCommandes (Commande newCommandes) 
	{
		if(this.commandes==null) {
			this.commandes= new java.util.HashSet<Commande>();
		}
			
		this.commandes.add (newCommandes);
			
	}

	
	public void addTables (TableService newTables) 
	{
		if(this.tables==null) {
			this.tables= new java.util.HashSet<TableService>();
		}
			
		this.tables.add (newTables);
			
	}

	
	public List<Commande> getCommandes () 
	{
		if(this.commandes==null) {
			this.commandes= new java.util.HashSet<Commande>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Commande>(this.commandes));	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public String getNom () 
	{
		return this.nom;	
	}

	
	public String getPrenom () 
	{
		return this.prenom;	
	}

	
	public List<TableService> getTables () 
	{
		if(this.tables==null) {
			this.tables= new java.util.HashSet<TableService>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<TableService>(this.tables));	
	}

	
	public void removeCommandes (Commande oldCommandes) 
	{
		if(this.commandes==null) {
			return;
		}
		
		this.commandes.remove (oldCommandes);
			
	}

	
	public void removeTables (TableService oldTables) 
	{
		if(this.tables==null) {
			return;
		}
		
		this.tables.remove (oldTables);
			
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setNom (String myNom) 
	{
		this.nom = myNom;	
	}

	
	public void setPrenom (String myPrenom) 
	{
		this.prenom = myPrenom;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetNom () 
	{
		this.nom = null;	
	}

	
	public void unsetPrenom () 
	{
		this.prenom = null;	
	}


}
