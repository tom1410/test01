package tOTO.web;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import toto.domain.WebUser;

@RequestMapping("/webusers")
@Controller
@RooWebScaffold(path = "webusers", formBackingObject = WebUser.class)
public class WebUserController {
}
