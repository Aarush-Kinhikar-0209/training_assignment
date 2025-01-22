package com.assignment;

import java.util.Optional;
import java.util.Scanner;

import com.assignment.service.AdminService;
import com.assignment.service.PremiumUserService;
import com.assignment.service.UserService;
import com.assignment.service.impl.AdminServiceImpl;
import com.assignment.service.impl.PremiumUserServiceImpl;
import com.assignment.service.impl.UserServiceImpl;
import com.assignment.entity.User;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        UserService regularUserService = new UserServiceImpl();
        AdminService adminService = new AdminServiceImpl();
        PremiumUserService premiumUserService = new PremiumUserServiceImpl();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Register Regular User");
            System.out.println("2. Register Premium User");
            System.out.println("3. Register Admin User");
            System.out.println("4. Login");
            System.out.println("5. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Register Regular User
                    System.out.print("Enter Name: ");
                    String regularName = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String regularEmail = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String regularPassword = scanner.nextLine();
                    
                    Optional<User> regularUser = regularUserService.register(regularName, regularEmail, regularPassword);
                    if (regularUser.isPresent()) {
                        System.out.println("Regular user registered successfully: " + regularUser.get().getName());
                    } else {
                        System.out.println("User already exists.");
                    }
                    break;

                case 2: // Register Premium User
                    System.out.print("Enter Name: ");
                    String premiumName = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String premiumEmail = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String premiumPassword = scanner.nextLine();
                    
                    Optional<User> premiumUser = premiumUserService.register(premiumName, premiumEmail, premiumPassword);
                    if (premiumUser.isPresent()) {
                        System.out.println("Premium user registered successfully: " + premiumUser.get().getName());
                    } else {
                        System.out.println("User already exists.");
                    }
                    break;

                case 3: // Register Admin User
                    System.out.print("Enter Name: ");
                    String adminName = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String adminEmail = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String adminPassword = scanner.nextLine();
                    
                    Optional<User> adminUser = adminService.register(adminName, adminEmail, adminPassword);
                    if (adminUser.isPresent()) {
                        System.out.println("Admin user registered successfully: " + adminUser.get().getName());
                    } else {
                        System.out.println("User already exists.");
                    }
                    break;

                case 4: // Login
                    System.out.print("Enter Email: ");
                    String loginEmail = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String loginPassword = scanner.nextLine();
                    
                    Optional<User> loggedInUser = regularUserService.login(loginEmail, loginPassword);
                    if (loggedInUser.isPresent()) {
                        System.out.println("Login successful! Welcome, " + loggedInUser.get().getName());
                    } else {
                        System.out.println("Login failed: Invalid email or password.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
