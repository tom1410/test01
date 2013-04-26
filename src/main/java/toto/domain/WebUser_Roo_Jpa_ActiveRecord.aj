// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package toto.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import toto.domain.WebUser;

privileged aspect WebUser_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager WebUser.entityManager;
    
    public static final EntityManager WebUser.entityManager() {
        EntityManager em = new WebUser().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long WebUser.countWebUsers() {
        return entityManager().createQuery("SELECT COUNT(o) FROM WebUser o", Long.class).getSingleResult();
    }
    
    public static List<WebUser> WebUser.findAllWebUsers() {
        return entityManager().createQuery("SELECT o FROM WebUser o", WebUser.class).getResultList();
    }
    
    public static WebUser WebUser.findWebUser(Long id) {
        if (id == null) return null;
        return entityManager().find(WebUser.class, id);
    }
    
    public static List<WebUser> WebUser.findWebUserEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM WebUser o", WebUser.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void WebUser.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void WebUser.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            WebUser attached = WebUser.findWebUser(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void WebUser.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void WebUser.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public WebUser WebUser.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        WebUser merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
