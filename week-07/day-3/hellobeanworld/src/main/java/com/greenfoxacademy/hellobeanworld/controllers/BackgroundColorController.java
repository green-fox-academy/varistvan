package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.models.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackgroundColorController {

    private UtilityService service;

    BackgroundColorController(UtilityService service) {
        this.service = service;
    }

    @RequestMapping("/useful/colored")
    public String defineBackground(Model model) {
        model.addAttribute("randomColor", service.randomColor());
        return "coloredbackground";
    }
}
