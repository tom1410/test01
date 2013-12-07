package test1.domain.mypackage;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "MYCLASS2_SEQ")
public class MyClass2 {

    @NotNull
    private MyClass attribute3;

    @NotNull
    private long attribute2;

    @NotNull
    private String Myattribute;

    @OneToOne
    private test1.domain.MyClass myClass;
}
