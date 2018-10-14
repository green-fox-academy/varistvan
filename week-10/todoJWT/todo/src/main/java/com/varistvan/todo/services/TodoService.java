package com.varistvan.todo.services;

import com.varistvan.todo.models.Todo;

public interface TodoService {

    void saveTodo(String title);

    void save(Todo todo);

    void setTodo(long id, String name, boolean urgent, boolean done);

    void deleteTodo(long id);

    Iterable<Todo> findAll();

    Todo findById(long id);
}
