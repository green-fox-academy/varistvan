package com.greenfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrickController {

    @GetMapping("/trickCenter")
    public String showForm() {
        return "trickCenter";
    }

//    @PostMapping("/login")
//    public String loginUser(String name) {
//        return "redirect:/?name="+name;
//    }

}
