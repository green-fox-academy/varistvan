package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class FoxList {

    private ArrayList<Fox> foxList;

    public FoxList() {
        this.foxList = new ArrayList<>();
    }

    public void addFoxToList(Fox fox) {
        foxList.add(fox);
    }

    public ArrayList<Fox> getFoxList() {
        return foxList;
    }
}
