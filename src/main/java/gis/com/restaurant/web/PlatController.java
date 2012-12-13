package gis.com.restaurant.web;

import gis.com.restaurant.domain.Plat;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/plats")
@Controller
@RooWebScaffold(path = "plats", formBackingObject = Plat.class)
public class PlatController {
}
