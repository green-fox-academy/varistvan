package com.greenfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/information")
    public String information() {
        return "information";
    }

    @RequestMapping("/login")
    public String loginForm() {
        return "login";
    }
}
