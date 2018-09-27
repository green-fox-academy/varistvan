package com.greenfox.finder.controllers;

import com.greenfox.finder.services.UserService;
import com.greenfox.finder.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    private UserService service;

    public AppController (UserService service) {
        this.service = service;
    }

    @GetMapping("/app")
    public String index(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("users", service.getUsers());
        return "main";
    }

    @PostMapping("/app")
    public String create(User user) {
        service.save(user);
        return "redirect:/app";
    }
}