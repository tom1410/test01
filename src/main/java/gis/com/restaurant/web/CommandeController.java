package gis.com.restaurant.web;

import gis.com.restaurant.domain.Commande;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/commandes")
@Controller
@RooWebScaffold(path = "commandes", formBackingObject = Commande.class)
public class CommandeController {
}
