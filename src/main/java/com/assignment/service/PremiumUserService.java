package com.assignment.service;

import java.util.Optional;
import com.assignment.entity.User;

public interface PremiumUserService {
    Optional<User> register(String name, String email, String password);
}
