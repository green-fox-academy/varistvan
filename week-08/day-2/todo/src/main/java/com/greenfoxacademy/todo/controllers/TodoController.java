package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

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

    @GetMapping("/activetodoslist")
    public String listActive(Model model) {
        Iterable<Todo> todos = todoRepository.findAll();
        for (Todo todo : todos) {
            System.out.println(todo.getTitle());
        }
        Iterable<Todo> activetodos = Streamable.of(todos).stream()
                .filter(t -> !t.isDone())
                .collect(Collectors.toList());
        model.addAttribute("activetodos", activetodos);
        return "activetodoslist";
    }

    @GetMapping("/add")
    public String todoForm() {
        return "add";
    }

    @PostMapping("/add")
    public String todoSubmit(String newTodo) {
        Todo todo = new Todo();
        todo.setTitle(newTodo);
        todoRepository.save(todo);
        return "redirect:/";
    }

}
