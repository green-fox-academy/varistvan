package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public String listTodo(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todoslist";
    }

//    @PostMapping("/")
//    public String todoPost() {
//        return "todoslist";
//    }

//
//    @PostMapping("/")
//    public String handleTodo(@RequestParam String todo, Model model) {
//        model.addAttribute("todo", todo);
//        return "todoslist";
//    }

}
