package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    @RequestMapping("/show")
    public String showAccount (Model model) {
        BankAccount acc = new BankAccount("Simba", 2000, "lion");
        model.addAttribute("accountData", acc);
        return "showaccount";
    }

}
