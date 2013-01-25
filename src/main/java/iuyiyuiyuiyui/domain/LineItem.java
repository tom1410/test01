package iuyiyuiyuiyui.domain;

import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "LINEITEM_SEQ")
public class LineItem {

    @NotNull
    private Real price;

    @NotNull
    private ShoppingCart quantity;
}
