package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Fox {

    private String name;
    private String food;
    private String drink;
    private ArrayList<String> tricks;

    public Fox() {
        this.name = "Mr. Fox";
        this.food = "salad";
        this.drink = "water";
        this.tricks = new ArrayList<>();
    }

    public Fox(String name) {
        this.name = name;
        this.food = "salad";
        this.drink = "water";
        this.tricks = new ArrayList<>();
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

    public void addTrick(String trick) {
        this.tricks.add(trick);
    }

    public ArrayList<String> getTricks() {
        return tricks;
    }
}
