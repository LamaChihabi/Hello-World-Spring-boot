package de.htwberlin.webtech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class helloworldcontroller {
    @GetMapping("/")
    public String index() {
        return "Hallo World!";
    }
}
