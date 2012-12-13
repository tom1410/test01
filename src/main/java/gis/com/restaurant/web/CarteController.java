package gis.com.restaurant.web;

import gis.com.restaurant.domain.Carte;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/cartes")
@Controller
@RooWebScaffold(path = "cartes", formBackingObject = Carte.class)
public class CarteController {
}
