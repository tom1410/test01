package gis.com.restaurant.web;

import gis.com.restaurant.domain.Serveur;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/serveurs")
@Controller
@RooWebScaffold(path = "serveurs", formBackingObject = Serveur.class)
public class ServeurController {
}
