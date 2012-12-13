package gis.com.restaurant.domain;

import java.util.Date;
import javax.persistence.ManyToOne;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "RESERVATION_SEQ")
public class Reservation {

    private Date dateResa;

    @ManyToOne
    private TableService table_;

    @ManyToOne
    private Client client;
}
