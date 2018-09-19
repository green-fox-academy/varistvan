package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.models.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailValidatorController {

    private UtilityService checker;

    public EmailValidatorController(UtilityService checker) {
        this.checker = checker;
    }

    @RequestMapping("/useful/email")
    public String emailValidator(@RequestParam(value = "email") String address, Model model) {
        model.addAttribute("isValid", checker.isEmailValid(address));
        model.addAttribute("address", address);
        return "email";
    }
}
