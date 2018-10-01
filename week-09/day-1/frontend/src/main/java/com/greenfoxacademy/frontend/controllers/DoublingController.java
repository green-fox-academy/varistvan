package com.greenfoxacademy.frontend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

    @GetMapping("/doubling")
    @ResponseBody
    public Doubler doubling(@RequestParam(required = false) Integer input) {
        if (input==null) {
            return new Doubler();
        } else {
            return new Doubler(input);
        }
    }

    static class Doubler {
        public int received;
        public int result;
        public String error;

        public Doubler(int received) {
            this.received = received;
            this.result = 2 * received;
        }

        public Doubler() {
            this.error= "Please provide an input!";
        }
    }

}
