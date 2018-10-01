package com.greenfoxacademy.frontend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

    @GetMapping("/appenda/{appendable}")
    public Appendable appendA(@PathVariable String appendable) {
        return new Appendable(appendable);
    }

    static class Appendable{
        public String appended;

        public Appendable(String string) {
            this.appended = string + "a";
        }
    }

}
