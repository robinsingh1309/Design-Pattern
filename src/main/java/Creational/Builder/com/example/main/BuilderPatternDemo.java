package Creational.Builder.com.example.main;

import Creational.Builder.com.example.user.User;


public class BuilderPatternDemo {

    public static void main(String[] args) {
        
        User user = new User.UserBuilder() //
                .setName("Robin") //
                .setAge(24) //
                .setEmail("robin@example.com")
                .build();
        
        System.out.println(user);

    }

}
