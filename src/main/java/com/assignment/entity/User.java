package com.assignment.entity;
import java.util.List;
import com.assignment.constants.UserType;

public class User{
    private String id;
    private String name;
    private String email;
    private String password;
    private UserType userType;
    private List<Order> orders;
    private List<Book> shoppingCart;

    public User(String id, String name, String email, String password, UserType userType){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Book> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Book> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }



}