package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NutritionController {

    FoxService service;

    public NutritionController(FoxService service) {
        this.service = service;
    }

    @GetMapping("/nutritionStore")
    public String showNutritions(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String submitNutritions(String name, String food, String drink) {
        service.setNutrition(name, food, drink);
        return "redirect:/?name="+name;
    }

}
