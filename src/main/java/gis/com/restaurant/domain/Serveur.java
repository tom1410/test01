package gis.com.restaurant.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "SERVEUR_SEQ")
public class Serveur {

    private String nom;

    private String prenom;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Commande> commandes = new HashSet<Commande>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<TableService> tables_ = new HashSet<TableService>();
}
