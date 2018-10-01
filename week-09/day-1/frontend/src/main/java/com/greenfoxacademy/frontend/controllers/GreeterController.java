package com.greenfoxacademy.frontend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreeterController {

    @GetMapping("/greeter")
    @ResponseBody
    public Greeter doubling(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name==null && title==null) {
            return new Greeter();
        } else if (title==null) {
            return new Greeter(name);
        } else {
            return new Greeter(name, title);
        }
    }

    static class Greeter {
        public String welcome_message;
        public String error;

        public Greeter(String name, String title) {
            this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        }
        public Greeter(String name) {
            this.error = "Please provide a title!";
        }
        public Greeter() {
            this.error = "Please provide a name!";
        }
    }
}
