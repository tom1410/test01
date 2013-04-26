package toto.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "ACCOUNT_SEQ")
public class Account {

    private boolean isClosed;

    private String billingAddress;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date Myopen;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date closed;

    @OneToOne
    private ShoppinCart cart;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<MyOrder> Myorder = new HashSet<MyOrder>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Payment> payment = new HashSet<Payment>();

    @OneToOne
    private Customer customer;
}
