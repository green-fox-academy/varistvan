package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private Fox fox;

    @GetMapping("/")
    public String index(@RequestParam String name, Model model) {
        if (name == null) {
            return "redirect:/login";
        } else {
            fox = new Fox(name);
            model.addAttribute("fox", fox);
            return "index";
        }
    }

}
