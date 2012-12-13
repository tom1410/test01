package gis.com.restaurant.web;

import gis.com.restaurant.domain.Reservation;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/reservations")
@Controller
@RooWebScaffold(path = "reservations", formBackingObject = Reservation.class)
public class ReservationController {
}
