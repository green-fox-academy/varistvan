package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class BankAccountListController {

    @RequestMapping("/accountlist")
    public String listAccounts(Model model) {
        ArrayList<BankAccount> accountList = new ArrayList<>();
        accountList.add(new BankAccount("Simba", 2000, "lion"));
        accountList.add(new BankAccount("Scar", 3000, "lion"));
        accountList.add(new BankAccount("Zazu", 1500, "hornbill"));
        accountList.add(new BankAccount("Mufasa", 4000, "lion"));
        accountList.add(new BankAccount("Timon", 2700, "meerkat"));
        accountList.add(new BankAccount("Shenzi", 3000, "hyena"));
        model.addAttribute("accounts", accountList);
        return "listaccounts";
    }
}
