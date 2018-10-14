package com.varistvan.todo.services;

import com.varistvan.todo.models.Todo;
import com.varistvan.todo.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    @Override
    public void saveTodo(String title) {
        todoRepository.save(new Todo(title));
    }

    @Override
    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public Iterable<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo findById(long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        Todo newTodo = new Todo();
        if (todo.isPresent()) {
            newTodo.setId(todo.get().getId());
            newTodo.setName(todo.get().getName());
            newTodo.setCreatedAt(todo.get().getCreatedAt());
            newTodo.setDone(todo.get().isDone());
            newTodo.setUrgent(todo.get().isUrgent());
        }
        return newTodo;
    }

    public void setTodo(long id, String name, boolean urgent, boolean done) {
        Todo todo = findById(id);
        todo.setName(name);
        todo.setUrgent(urgent);
        todo.setDone(done);
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(long id) {
        todoRepository.deleteById(id);
    }
}
