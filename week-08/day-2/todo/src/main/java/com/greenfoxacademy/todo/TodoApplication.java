package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.models.User;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import com.greenfoxacademy.todo.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setUsername("István");
//        user.setAge(33);
//        userRepository.save(user);
//        System.out.println(userRepository.findAll());
        Todo todo1 = new Todo();
        todo1.setTitle("Learn JavaSpring");
        Todo todo2 = new Todo();
        todo2.setTitle("Walk the milk");
        todo2.setDone(true);
        Todo todo3 = new Todo();
        todo3.setTitle("Buy Dog");
        todo3.setUrgent(true);
        Todo todo4 = new Todo();
        todo4.setTitle("Look at things");

        todoRepository.save(todo1);
        todoRepository.save(todo2);
        todoRepository.save(todo3);
        todoRepository.save(todo4);

        System.out.println(todoRepository.findAll());

    }
}
