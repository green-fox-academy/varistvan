package com.varistvan.todo.repositories;

import com.varistvan.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
