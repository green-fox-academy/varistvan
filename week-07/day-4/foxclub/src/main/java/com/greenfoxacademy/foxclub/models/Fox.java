package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Component;

@Component
public class Fox {

    private String name;
    private String food;
    private String drink;

    public Fox() {
        this.name = "Mr. Fox";
        this.food = "salad";
        this.drink = "water";
    }

    public Fox(String name) {
        this.name = name;
        this.food = "salad";
        this.drink = "water";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
