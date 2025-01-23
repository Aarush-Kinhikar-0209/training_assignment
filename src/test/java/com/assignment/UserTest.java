package com.assignment;

import com.assignment.constants.UserType;
import com.assignment.entity.User;
import org.junit.jupiter.api.*;

public class UserTest {
    private static User testUser1,testUser2,testUser3;

    @BeforeEach
    public void createTestUsers(){
        testUser1 = new User("6","Test-User-1","testuser1@gmail.com","test-user-1", UserType.REGULAR);
        testUser2 = new User("7","Test-User-2","testuser2@gmail.com","test-user-2", UserType.PREMIUM);
        testUser3 = new User("8","Test-User-3","testuser3@gmail.com","test-user-3", UserType.ADMIN);
    }

    @Test
    @DisplayName("Get ID Test")
    public void getIdTest(){
        Assertions.assertEquals(testUser1.getId(),"6","User ID not assigned properly (Test-User-1)");
        Assertions.assertEquals(testUser2.getId(),"7","User ID not assigned properly (Test-User-2)");
        Assertions.assertEquals(testUser3.getId(),"8","User ID not assigned properly (Test-User-3)");
    }

    @Test
    @DisplayName("Get Name Test")
    public void getNameTest(){
        Assertions.assertEquals(testUser1.getName(),"Test-User-1","Name not assigned properly (Test-User-1)");
        Assertions.assertEquals(testUser2.getName(),"Test-User-2","Name not assigned properly (Test-User-2)");
        Assertions.assertEquals(testUser3.getName(),"Test-User-3","Name not assigned properly (Test-User-3)");
    }

    @Test
    @DisplayName("Get Email Test")
    public void getEmailTest(){
        Assertions.assertEquals(testUser1.getEmail(),"testuser1@gmail.com","Email not assigned properly (Test-User-1)");
        Assertions.assertEquals(testUser2.getEmail(),"testuser2@gmail.com","Email not assigned properly (Test-User-2)");
        Assertions.assertEquals(testUser3.getEmail(),"testuser3@gmail.com","Email not assigned properly (Test-User-3)");
    }

    @Test
    @DisplayName("Get Password Test")
    public void getPasswordTest(){
        Assertions.assertEquals(testUser1.getPassword(),"test-user-1","Password not assigned properly (Test-User-1)");
        Assertions.assertEquals(testUser2.getPassword(),"test-user-2","Password not assigned properly (Test-User-2)");
        Assertions.assertEquals(testUser3.getPassword(),"test-user-3","Password not assigned properly (Test-User-3)");
    }

    @Test
    @DisplayName("Get User Type Test")
    public void getUserTypeTest(){
        Assertions.assertEquals(testUser1.getUserType(),UserType.REGULAR,"User Type not assigned properly (Test-User-1)");
        Assertions.assertEquals(testUser2.getUserType(),UserType.PREMIUM,"User Type not assigned properly (Test-User-2)");
        Assertions.assertEquals(testUser3.getUserType(),UserType.ADMIN,"User Type not assigned properly (Test-User-3)");
    }

    @Test
    @DisplayName("Set User ID Test")
    public void setUserIdTest(){
        testUser2.setId("55");
        Assertions.assertEquals(testUser2.getId(),"55");
    }

    @Test
    @DisplayName("Set Name Test")
    public void setNameTest(){
        testUser2.setName("name1");
        Assertions.assertEquals(testUser2.getName(),"name1");
    }

    @Test
    @DisplayName("Set Passwor Test")
    public void setPasswordTest(){
        testUser2.setPassword("pass1");
        Assertions.assertEquals(testUser2.getPassword(),"pass1");
    }

    @Test
    @DisplayName("Set User Type Test")
    public void setUserTypeTest(){
        testUser2.setUserType(UserType.ADMIN);
        Assertions.assertEquals(testUser2.getUserType(),UserType.ADMIN);
    }

    @Test
    @DisplayName("Set Email Test")
    public void setEmailTest(){
        testUser2.setEmail("abc@xyz.com");
        Assertions.assertEquals(testUser2.getEmail(),"abc@xyz.com");
    }


    @AfterAll
    public static void cleanUp(){
        testUser1=null;
        testUser2=null;
        testUser3=null;
    }
}
