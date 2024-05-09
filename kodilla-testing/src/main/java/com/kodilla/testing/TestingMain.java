package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        // tu umieść kolejny test ->
        Calculator calculator = new Calculator();

        //test - adding
        int resultOfAdding = calculator.add(6,3);
        if (resultOfAdding == 9) {
            System.out.println("test OK");
        }
        else{
            System.out.println("Error!");
        }

        //test - subtracting
        int resultOfSubtracting = calculator.subtract(6,3);
        if (resultOfSubtracting == 3) {
            System.out.println("test OK");
            }
        else {
            System.out.println("Error!");
            }

    }
}