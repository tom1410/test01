package test1.domain;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import test1.domain.mypackage.MyClass2;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "MYCLASS_SEQ")
public class MyClass {

    @NotNull
    private Byte Myattribute;

    @OneToOne
    private MyClass2 myClass2;
}
