package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.FoxList;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

    private FoxList foxList;

    public FoxService(FoxList foxList){
        this.foxList = foxList;
    }

    public void createFox(String name) {
        Fox fox = new Fox(name);
        foxList.addFoxToList(fox);
    }

    public void setNutrition(String foxName, String foodName, String drinkName) {
        for (Fox item : foxList.getFoxList()) {
            if(item.getName().equals(foxName)) {
                item.setFood(foodName);
                item.setDrink(drinkName);
            }
        }
    }
}
