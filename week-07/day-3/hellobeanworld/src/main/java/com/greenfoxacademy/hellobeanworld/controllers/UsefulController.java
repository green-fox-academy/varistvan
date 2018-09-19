package com.greenfoxacademy.hellobeanworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsefulController {
    @RequestMapping("/useful")
    public String colored(Model model) {
        return "main";
    }

}
