package tOTO.web;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import toto.domain.MyOrder;

@RequestMapping("/myorders")
@Controller
@RooWebScaffold(path = "myorders", formBackingObject = MyOrder.class)
public class MyOrderController {
}
