package toto.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "PRODUCT_SEQ")
public class Product {

    private String description;

    private String Myname;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<LineItem> item = new HashSet<LineItem>();
}
