package com.greenfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NutritionController {

    @GetMapping("/nutritionStore")
    public String showForm() {
        return "nutritionStore";
    }

//    @PostMapping("/nutritionStore")
//    public String loginUser(String name) {
//        return "redirect:/?name="+name;
//    }

}
