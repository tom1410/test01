package tOTO.web;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import toto.domain.ShoppinCart;

@RequestMapping("/shoppincarts")
@Controller
@RooWebScaffold(path = "shoppincarts", formBackingObject = ShoppinCart.class)
public class ShoppinCartController {
}
