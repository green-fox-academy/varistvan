package com.greenfoxacademy.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    private UserRepository userRepository;

    public TodoApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("István");
        user.setAge(33);
        User user2 = new User();
        user2.setUsername("Krisztián");
        user2.setAge(27);

        userRepository.save(user);
        userRepository.save(user2);

        System.out.println(userRepository.findAll());
    }
}
