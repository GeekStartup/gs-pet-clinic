package geekstartup.springframework.gspetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ashishnayak on 15-Jun-2020||10:37 PM
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String Index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String opusHandler() {
        return "notimplemented";
    }
}
