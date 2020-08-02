package com.prettyye;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServicesController {

    @GetMapping("/rest")
    public String sayRest() {
        return "Great, let's take a REST with Spring Boot!";
    }
}
