package com.assignment.service.impl;

import java.util.Map;
import java.util.Optional;

import com.assignment.constants.UserType;
import com.assignment.data.Data;
import com.assignment.entity.User;
import com.assignment.service.PremiumUserService;
import com.assignment.service.UserService;

public class PremiumUserServiceImpl implements UserService, PremiumUserService {

    @Override
    public Optional<User> register(String name, String email, String password) {
        Map<String, User> users = Data.data;
        Optional<User> user = Optional.ofNullable(users.get(email));
        if (!user.isPresent()) {
            User newUser = new User(Long.toString(Data.userId++), name, email, password, UserType.PREMIUM);
            users.put(email, newUser); // Add the user to the map
            return Optional.of(newUser);
        }
        return Optional.empty();
    }
}
