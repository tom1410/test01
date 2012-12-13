package gis.com.restaurant.web;

import gis.com.restaurant.domain.TableService;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tableservices")
@Controller
@RooWebScaffold(path = "tableservices", formBackingObject = TableService.class)
public class TableServiceController {
}
