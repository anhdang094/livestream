package vn.bongda.livestream.application.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class TicketController extends AbstractController {

  @RequestMapping(value = "/homepage", method = RequestMethod.GET)
  public String home(Model model) {
    return "index.html";
  }
}
