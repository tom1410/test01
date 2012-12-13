package gis.com.restaurant.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "CARTE_SEQ")
public class Carte {

    private int version_;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Plat> plats = new HashSet<Plat>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Boisson> boissons = new HashSet<Boisson>();
}
