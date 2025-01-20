package com.assignment;
import java.util.List;
import java.util.Optional;

abstract class User{
    private String id;

    private String name;
    
    private String email;
    
    private String password;
    
    private boolean isPremiumUser;
    
    private OrderHistory orderHistory;
    
    private ShoppingCart shoppingCart;
    
    private List<PremiumSubscription> subscriptions;

    public abstract void createUser(String name, String email, String password);

    public abstract void changeSubscription(User user, PremiumSubscription subscription);

    public Optional<User> findUserById(String Id){
        return Optional.empty();
    }

    public Optional<User> findUserByEmail(String email){
        return Optional.empty();
    }

    public void login(String email, String password){
        
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

    public boolean isPremiumUser() {
        return isPremiumUser;
    }

    public void setPremiumUser(boolean isPremiumUser) {
        this.isPremiumUser = isPremiumUser;
    }

    public OrderHistory getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(OrderHistory orderHistory) {
        this.orderHistory = orderHistory;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<PremiumSubscription> getSubscription() {
        return subscriptions;
    }

    public void setSubscription(List<PremiumSubscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

}