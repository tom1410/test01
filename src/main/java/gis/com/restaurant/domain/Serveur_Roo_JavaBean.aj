// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package gis.com.restaurant.domain;

import gis.com.restaurant.domain.Commande;
import gis.com.restaurant.domain.Serveur;
import gis.com.restaurant.domain.TableService;
import java.util.Set;

privileged aspect Serveur_Roo_JavaBean {
    
    public String Serveur.getNom() {
        return this.nom;
    }
    
    public void Serveur.setNom(String nom) {
        this.nom = nom;
    }
    
    public String Serveur.getPrenom() {
        return this.prenom;
    }
    
    public void Serveur.setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public Set<Commande> Serveur.getCommandes() {
        return this.commandes;
    }
    
    public void Serveur.setCommandes(Set<Commande> commandes) {
        this.commandes = commandes;
    }
    
    public Set<TableService> Serveur.getTables_() {
        return this.tables_;
    }
    
    public void Serveur.setTables_(Set<TableService> tables_) {
        this.tables_ = tables_;
    }
    
}
