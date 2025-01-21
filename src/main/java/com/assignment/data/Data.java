package com.assignment.data;

import java.util.Map;

import com.assignment.constants.UserType;
import com.assignment.entity.User;

import java.util.HashMap;

public class Data {
    public static long userId = 5;
    public static Map<String,User> data = new HashMap<String,User>(){
        {
            put("user1@gmail.com",new User("1","user1","user1@gmail.com","user1",UserType.PREMIUM));
            put("user2@gmail.com",new User("2","user2","user2@gmail.com","user2",UserType.REGULAR));
            put("user3@gmail.com",new User("3","user3","user3@gmail.com","user3",UserType.REGULAR));
            put("user4@gmail.com",new User("4","user4","user4@gmail.com","user4",UserType.PREMIUM));
            put("user5@gmail.com",new User("5","user5","user5@gmail.com","user5",UserType.REGULAR));
        }
    };
}
