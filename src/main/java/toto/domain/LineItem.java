package toto.domain;

import javax.persistence.ManyToOne;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "LINEITEM_SEQ")
public class LineItem {

    private double price;

    private int quantity;

    @ManyToOne
    private ShoppinCart sc;

    @ManyToOne
    private Product product;
}
