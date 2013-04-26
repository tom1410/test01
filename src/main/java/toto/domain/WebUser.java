package toto.domain;

import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "WEBUSER_SEQ")
public class WebUser {

    @Enumerated
    private UserState Mystate;

    private String Mypassword;

    private String login;

    @OneToOne
    private Customer customer;

    @OneToOne
    private ShoppinCart shoppincart;
}
