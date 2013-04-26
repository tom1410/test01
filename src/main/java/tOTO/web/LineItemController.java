package tOTO.web;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import toto.domain.LineItem;

@RequestMapping("/lineitems")
@Controller
@RooWebScaffold(path = "lineitems", formBackingObject = LineItem.class)
public class LineItemController {
}
