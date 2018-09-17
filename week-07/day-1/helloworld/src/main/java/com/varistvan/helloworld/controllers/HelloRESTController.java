package com.varistvan.helloworld.controllers;

import com.varistvan.helloworld.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    Greeting myGreeting = new Greeting(1, "Hello, world!");

    @RequestMapping("/greeting")
    public Greeting greeting() {
        return myGreeting;
    }
}
