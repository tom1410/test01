// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package gis.com.restaurant.domain;

import gis.com.restaurant.domain.Boisson;
import gis.com.restaurant.domain.Carte;
import gis.com.restaurant.domain.Plat;
import java.util.Set;

privileged aspect Carte_Roo_JavaBean {
    
    public int Carte.getVersion_() {
        return this.version_;
    }
    
    public void Carte.setVersion_(int version_) {
        this.version_ = version_;
    }
    
    public Set<Plat> Carte.getPlats() {
        return this.plats;
    }
    
    public void Carte.setPlats(Set<Plat> plats) {
        this.plats = plats;
    }
    
    public Set<Boisson> Carte.getBoissons() {
        return this.boissons;
    }
    
    public void Carte.setBoissons(Set<Boisson> boissons) {
        this.boissons = boissons;
    }
    
}
