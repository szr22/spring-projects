package com.prettyye;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(Model model) {
        System.out.println("saying hello world Spring Boot...");
        model.addAttribute( "message", "Greetings from Zhen" );
        return "hello";
    }
}
