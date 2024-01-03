package com.example.democonfigclient;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Environment environment;

    public HelloController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/get-message")
    public String getWelcomeMessage() {
        return environment.getProperty("welcome.message");
    }

}
