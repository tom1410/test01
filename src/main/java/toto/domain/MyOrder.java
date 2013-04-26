package toto.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "MYORDER_SEQ")
public class MyOrder {

    @Enumerated
    private OrderStatus status;

    private int Mynumber;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date ordered;

    private boolean shipped;

    private double total;

    private String shipTo;

    @ManyToOne
    private Account account;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<LineItem> items = new HashSet<LineItem>();
}
