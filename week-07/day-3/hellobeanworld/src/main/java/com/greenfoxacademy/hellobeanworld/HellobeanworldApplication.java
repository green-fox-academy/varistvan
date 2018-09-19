package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.models.MyColor;
import com.greenfoxacademy.hellobeanworld.models.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor color;

    public HellobeanworldApplication(Printer printer, MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("Hello!");
        color.printColor();
    }
}
