package com.greenfoxacademy.frontend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Result doUntil(@PathVariable(required = false) String action, @RequestBody(required = false) Until number) {
        Result result = new Result();
        if (number == null) {
            result.error = "Please provide a number!";
            return result;
        } else if (action.equals("factor")) {
            result.result = result.factor(number.until);
        } else if (action.equals("sum")) {
            result.result = result.sum(number.until);
        }
        return result;
    }

    static class Until {
        public Integer until;
    }

    static class Result {
        public long result;
        public String error;

        public Result() {
        }

        public long factor(int number) {
            int factor = 1;
            for (int i = 1; i <= number; i++) {
                factor *= i;
            }
            return factor;
        }

        public int sum(int number) {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
