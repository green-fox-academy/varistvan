package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLceptionController {

    @RequestMapping("/htmlception")
    public String showHTMLCeption (Model model) {
        String st = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("myText", st);
        return "htmlception";
    }
}
