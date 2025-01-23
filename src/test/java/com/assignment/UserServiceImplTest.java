package com.assignment;

import com.assignment.constants.UserType;
import com.assignment.entity.User;
import com.assignment.service.impl.AdminServiceImpl;
import com.assignment.service.impl.PremiumUserServiceImpl;
import com.assignment.service.impl.UserServiceImpl;
import org.junit.jupiter.api.*;

import java.util.Optional;

public class UserServiceImplTest {
    User testUser1;
    Optional<User> temp = Optional.empty();
    UserServiceImpl regularUserTestService = new UserServiceImpl();
    AdminServiceImpl adminUserTestService = new AdminServiceImpl();
    PremiumUserServiceImpl premiumUserTestService = new PremiumUserServiceImpl();

    @BeforeEach
    public void intiate(){
        temp = Optional.empty();
        testUser1 = null;
    }

    @Test
    @DisplayName("Create a Premium User Test")
    public void createPremiumUserTest(){
        temp = premiumUserTestService.register("New User","newuser1@gmail.com","newuser@123");
        boolean objectCreatedFlag = temp.isPresent();
        Assertions.assertTrue(objectCreatedFlag,"Premium User Object not created properly");
        if(objectCreatedFlag){
            testUser1 = temp.get();
            Assertions.assertEquals(testUser1.getEmail(),"newuser1@gmail.com","Error in assigning email");
            Assertions.assertEquals(testUser1.getName(),"New User","error in assigning name");
            Assertions.assertEquals(testUser1.getPassword(),"newuser@123","error in assigning password");
            Assertions.assertEquals(testUser1.getUserType(),UserType.PREMIUM,"error in assigning User Type");
        }
    }
    @Test
    @DisplayName("Create a Regular User Test")
    public void createRegularUserTest(){
        temp = regularUserTestService.register("New User","newuser2@gmail.com","newuser@123");
        boolean objectCreatedFlag = temp.isPresent();
        Assertions.assertTrue(objectCreatedFlag,"Regular User Object not created properly");
        if(objectCreatedFlag){
            testUser1 = temp.get();
            Assertions.assertEquals(testUser1.getEmail(),"newuser2@gmail.com","Error in assigning email");
            Assertions.assertEquals(testUser1.getName(),"New User","error in assigning name");
            Assertions.assertEquals(testUser1.getPassword(),"newuser@123","error in assigning password");
            Assertions.assertEquals(testUser1.getUserType(),UserType.REGULAR,"error in assigning User Type");
        }
    }

    @Test
    @DisplayName("Create an Admin User Test")
    public void createAdminUserTest(){
        temp = adminUserTestService.register("New User","newuser3@gmail.com","newuser@123");
        boolean objectCreatedFlag = temp.isPresent();
        Assertions.assertTrue(objectCreatedFlag,"Admin User Object not created properly");
        if(objectCreatedFlag){
            testUser1 = temp.get();
            Assertions.assertEquals(testUser1.getEmail(),"newuser3@gmail.com","Error in assigning email");
            Assertions.assertEquals(testUser1.getName(),"New User","error in assigning name");
            Assertions.assertEquals(testUser1.getPassword(),"newuser@123","error in assigning password");
            Assertions.assertEquals(testUser1.getUserType(),UserType.ADMIN,"error in assigning User Type");
        }
    }

    @AfterEach
    public void cleanUp(){
        testUser1 = null;
        temp = Optional.empty();
    }
}
