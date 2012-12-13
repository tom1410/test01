// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package gis.com.restaurant.domain;

import gis.com.restaurant.domain.Client;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

privileged aspect Client_Roo_Jpa_Entity {
    
    declare @type: Client: @Entity;
    
    @Id
    @SequenceGenerator(name = "clientGen", sequenceName = "CLIENT_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "clientGen")
    @Column(name = "id")
    private Long Client.id;
    
    @Version
    @Column(name = "version")
    private Integer Client.version;
    
    public Long Client.getId() {
        return this.id;
    }
    
    public void Client.setId(Long id) {
        this.id = id;
    }
    
    public Integer Client.getVersion() {
        return this.version;
    }
    
    public void Client.setVersion(Integer version) {
        this.version = version;
    }
    
}
