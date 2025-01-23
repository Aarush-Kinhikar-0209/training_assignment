package com.assignment.service.impl;

import java.util.Map;
import java.util.Optional;

import com.assignment.constants.UserType;
import com.assignment.data.Data;
import com.assignment.entity.User;
import com.assignment.service.AdminService;
// import com.assignment.service.UserService;

public class AdminServiceImpl implements AdminService {

    @Override
    public Optional<User> register(String name, String email, String password) {
        Map<String,User> users = Data.data;
        Optional<User> user = Optional.ofNullable(users.get(email));
        if(!user.isPresent()){
            User newUser = new User(Long.toString(Data.userId++), name, email, password, UserType.ADMIN);
            users.put(email, newUser); // Add the user to the map
            return Optional.of(newUser);
        }
        return Optional.empty();
    }

}
