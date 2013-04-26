package toto.domain;

import javax.persistence.OneToOne;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "CUSTOMER_SEQ")
public class Customer {

    private String email;

    private String address;

    private String phone;

    @OneToOne
    private Account acc;

    @OneToOne
    private WebUser webuser;
}
