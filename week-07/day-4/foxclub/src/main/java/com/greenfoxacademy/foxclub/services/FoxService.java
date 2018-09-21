package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.FoxList;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

    private Fox fox;
    private FoxList foxList;

    public FoxService(Fox fox, FoxList foxList){
        fox = new Fox();
        foxList = new FoxList();
    }

    public void createFox(String name) {
        fox = new Fox(name);
        foxList.addFoxToList(fox);
    }

}
