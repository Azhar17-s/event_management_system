package com.components;

import org.example.dao.UserRegisterDao;
import org.example.model.User;

import java.sql.SQLException;
import java.util.Scanner;

public class ExecutableClass {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String email;
        String username;
        String password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO EFFYBOOK!!!");
        System.out.println("Choose \n 1. Register \n 2. Login");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter email:");
                email=scanner.next();

                System.out.println("Enter username:");
                username=scanner.next();

                System.out.println("Enter password:");
                password=scanner.next();

                User user = new User(email,username,password);

                boolean result =UserRegisterDao.registerUser(user);

                if (result){
                    System.out.println("User Registered successfully !!!");
                }

                else {
                    System.out.println("Something went wrong !! Try Again !!");
                }



        }



    }
}