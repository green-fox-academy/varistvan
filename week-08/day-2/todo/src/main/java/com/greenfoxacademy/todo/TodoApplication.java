package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.models.User;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import com.greenfoxacademy.todo.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.util.Streamable;

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
        todo3.setTitle("Buy a dog");
        todo3.setUrgent(true);
        Todo todo4 = new Todo();
        todo4.setTitle("Look at things");
        Todo todo5 = new Todo();
        todo5.setTitle("Call Mom");
        todo5.setUrgent(true);
        todo5.setDone(true);
        Todo todo6 = new Todo();
        todo6.setTitle("Clean the flat");
        todo6.setDone(true);
        Todo todo7 = new Todo();
        todo7.setTitle("Save the World");
        todo7.setUrgent(true);


        todoRepository.save(todo1);
        todoRepository.save(todo2);
        todoRepository.save(todo3);
        todoRepository.save(todo4);
        todoRepository.save(todo5);
        todoRepository.save(todo6);
        todoRepository.save(todo7);

        System.out.println(todoRepository.findAll());

//        Iterable<Todo> todos = todoRepository.findAll();
//        for (Todo todo : todos) {
//            System.out.println(todo.getTitle());
//        }
//        Streamable.of(todos).stream()
//                .filter(u -> !u.isDone())
//                .forEach(System.out::println);

    }
}
