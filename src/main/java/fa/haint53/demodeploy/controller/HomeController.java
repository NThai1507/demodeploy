package fa.haint53.demodeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping(value = {"home"})
    public String getHomepage(){
        return "this is homepage";
    }
}
