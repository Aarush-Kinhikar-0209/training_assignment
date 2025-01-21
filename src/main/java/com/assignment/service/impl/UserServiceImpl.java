package com.assignment.service.impl;

import java.util.Map;
import java.util.Optional;

import com.assignment.constants.UserType;
import com.assignment.data.Data;
import com.assignment.entity.User;
import com.assignment.service.UserService;

public class UserServiceImpl implements UserService{

    @Override
    public Optional<User> register(String name, String email, String password) {
        Map<String,User> users = Data.data;
        Optional<User> user = Optional.ofNullable(users.get(email));
        if(!user.isPresent()){
            return Optional.of(new User(Long.toString(Data.userId++),name,email,password,UserType.REGULAR));
        }
        return Optional.empty();
    }

}