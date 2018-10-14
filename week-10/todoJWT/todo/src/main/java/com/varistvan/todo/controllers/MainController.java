package com.varistvan.todo.controllers;

import com.varistvan.todo.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private TodoService todoService;

    public MainController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String index(@RequestParam(required = false) String error, Model model) {
        model.addAttribute("todos", todoService.findAll());
        model.addAttribute("error", error);
        return "index";
    }

    @PostMapping("/add")
    public String addTodo(String newtodo) {
        if (newtodo == null || newtodo.isEmpty()) {
            return "redirect:/?error=Input field should not be empty";
        }
        todoService.saveTodo(newtodo);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editTodo(@PathVariable long id, Model model) {
        model.addAttribute("todo", todoService.findById(id));
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String editedTodo(@PathVariable long id, String name, boolean urgent, boolean done) {
        todoService.setTodo(id, name, urgent, done);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String deleteTodo(@PathVariable long id) {
        todoService.deleteTodo(id);
        return "redirect:/";
    }

}
