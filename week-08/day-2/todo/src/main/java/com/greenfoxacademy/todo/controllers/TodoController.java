package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.data.util.Streamable;
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

//    @GetMapping("/todo")
//    public String listActive(@RequestParam ("isActive") Boolean isDone, Model model) {
//        model.addAttribute("todos", todoRepository.findAll());
//        model.addAttribute("done", isDone);
//        return "activetodoslist";
//    }

//    Iterable<Todo> todos = todoRepository.findAll();
//        for (Todo todo : todos) {
//            System.out.println(todo.getTitle());
//        }
//        Streamable.of(todos).stream()
//                .filter(u -> !u.isDone())
//                .forEach(System.out::println);

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
