# User Registration System

This project implements a **User Registration System** with a modular structure for handling users, shopping carts, and administrative functionalities. The system supports different user types and provides various services such as user authentication and shopping cart management.

## Features

### User Management
- **Registration & Login:** Allows users to register and log in with email and password.
- **User Types:** Supports three user types: Admin, Regular, and Premium.

### Shopping Cart
- Add books to the shopping cart.
- Remove books from the shopping cart.
- View items in the shopping cart.

### Admin Features
- Provides administrative functionalities through the `AdminService` implementation.

## Class Structure

### Main Components
1. **User**
   - Stores user details (e.g., name, email, password, user type).
   - Manages orders and shopping cart.

2. **Book**
   - Represents a book with `id`, `title`, and `author` attributes.

3. **Order**
   - Contains order details associated with users.

4. **Services**
   - `UserService`: Handles user registration and login.
   - `AdminService`: Extends `UserService` with admin-specific functionalities.
   - `PremiumUserService`: Extends `UserService` with premium user-specific features.
   - `ShoppingCartService`: Manages shopping cart functionalities like adding, removing, and viewing books.

### Enumerations
- **UserType**: Defines user roles (ADMIN, REGULAR, PREMIUM).

### Implementations
- `AdminServiceImpl`: Implements `AdminService` for admin-specific actions.
- `PremiumUserServiceImpl`: Implements `PremiumUserService` for premium user actions.
- `ShoppingCartServiceImpl`: Implements `ShoppingCartService` for shopping cart operations.

## Prerequisites
- **Java 8 or higher**
- Build Tool: Maven/Gradle

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/user-registration-system.git
2. Navigate to the project directory:
   ```bash
   cd user-registration-system
3. Build and run the project:
   ```bash
   mvn clean install
   java -jar target/your-project-name.jar

##UML Diagram
![cd_final](https://github.com/user-attachments/assets/fd8ecbc9-848c-46e0-b3fa-e0351272dc1a)
##Activity Diagram
![Diagram](https://github.com/user-attachments/assets/b0d4e51a-5ccd-4b3f-935f-5ae41dd8eda0)
