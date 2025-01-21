package com.assignment.service;

import java.util.Map;
import java.util.Optional;

import com.assignment.data.Data;
import com.assignment.entity.User;

public interface UserService {
    
    public default Optional<User> login(String email, String password){
        Map<String,User> users = Data.data;
        Optional<User> user = Optional.ofNullable(users.get(email));
        if(user.isPresent() && user.get().getPassword().equals(password)){
            return user;
        }
        return Optional.empty();
    }

    public Optional<User> register(String name, String email, String password);

}


