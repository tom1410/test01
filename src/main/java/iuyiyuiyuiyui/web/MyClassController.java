package iuyiyuiyuiyui.web;

import iuyiyuiyuiyui.domain.MyClass;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/myclasses")
@Controller
@RooWebScaffold(path = "myclasses", formBackingObject = MyClass.class)
public class MyClassController {
}
