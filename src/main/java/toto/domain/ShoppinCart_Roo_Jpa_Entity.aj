// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package toto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;
import toto.domain.ShoppinCart;

privileged aspect ShoppinCart_Roo_Jpa_Entity {
    
    declare @type: ShoppinCart: @Entity;
    
    @Id
    @SequenceGenerator(name = "shoppinCartGen", sequenceName = "SHOPPINCART_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "shoppinCartGen")
    @Column(name = "id")
    private Long ShoppinCart.id;
    
    @Version
    @Column(name = "version")
    private Integer ShoppinCart.version;
    
    public Long ShoppinCart.getId() {
        return this.id;
    }
    
    public void ShoppinCart.setId(Long id) {
        this.id = id;
    }
    
    public Integer ShoppinCart.getVersion() {
        return this.version;
    }
    
    public void ShoppinCart.setVersion(Integer version) {
        this.version = version;
    }
    
}
