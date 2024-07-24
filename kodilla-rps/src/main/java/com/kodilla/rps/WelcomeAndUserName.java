package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WelcomeAndUserName {
    public User welcomeUser(){
        System.out.println("Welcome in Rock, Paper, Scissors");
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name;
        do{
            try {
                name = sc.nextLine();
                if (name.length() > 1 && name.length() < 9) {
                    break;
                } else {
                    System.out.println("Please enter a valid name (min initials, max 8 characters): ");
                    continue;
                }
            } catch(Exception e){
                System.out.println("You have entered an invalid input. Try again.");
            }
        } while(true);
        System.out.println("Go,go,go " + name);
        return new User(name);
    }
}
