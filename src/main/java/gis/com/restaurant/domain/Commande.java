package gis.com.restaurant.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "COMMANDE_SEQ")
public class Commande {

    private Date dateCommande;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Plat> plats = new HashSet<Plat>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Boisson> boissons = new HashSet<Boisson>();
}
