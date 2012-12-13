package gis.com.restaurant.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "CLIENT_SEQ")
public class Client {

    private String nom;

    private String prenom;

    private String telephone;

    private String address;
}
