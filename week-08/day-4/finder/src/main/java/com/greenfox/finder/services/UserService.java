package com.greenfox.finder.services;

import com.greenfox.finder.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public void save(User user) {
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

}
