// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package gis.com.restaurant.domain;

import gis.com.restaurant.domain.Commande;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Commande_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Commande.entityManager;
    
    public static final EntityManager Commande.entityManager() {
        EntityManager em = new Commande().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Commande.countCommandes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Commande o", Long.class).getSingleResult();
    }
    
    public static List<Commande> Commande.findAllCommandes() {
        return entityManager().createQuery("SELECT o FROM Commande o", Commande.class).getResultList();
    }
    
    public static Commande Commande.findCommande(Long id) {
        if (id == null) return null;
        return entityManager().find(Commande.class, id);
    }
    
    public static List<Commande> Commande.findCommandeEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Commande o", Commande.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Commande.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Commande.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Commande attached = Commande.findCommande(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Commande.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Commande.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Commande Commande.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Commande merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
