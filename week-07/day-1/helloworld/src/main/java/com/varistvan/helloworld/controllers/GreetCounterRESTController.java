package com.varistvan.helloworld.controllers;

import com.varistvan.helloworld.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetCounterRESTController {

    @RequestMapping("/greeeting")
    public Greeting helloUser(@RequestParam(value = "name") String name) {
        Greeting myGreeting = new Greeting(1, "Hello " + name);
        return myGreeting;
    }

}
