package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public void gameRps(){
        WelcomeAndUserName welcome = new WelcomeAndUserName();
        User user = welcome.welcomeUser();
        NumberOfRounds rounds = new NumberOfRounds();
        int numberOfRounds = rounds.getNumberOfRounds();
        GameTutorial gameTut = new GameTutorial();
        gameTut.showTutorial();
        int round = numberOfRounds;
        User computer = new User("Computer");
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int counter = 1;
        do{
                System.out.println(user.getName() + " choose your gesture:");
                        do {
                            try {
                                input = scanner.nextInt();
                                if ((input == 1) || (input == 2) || (input == 3)) {
                                    break;
                                } else {
                                    System.out.println("Please enter correct value");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Please enter valid value");
                                scanner.next();
                            }
                        } while ((input != 1) && (input != 2) && (input != 3));
                System.out.println(user.getName() + " gesture: " + Gesture.fromInt(input));
                Gesture ComputerMove = Gesture.fromInt(computer.makeMove());
                System.out.println(computer.getName() + " gesture: " + ComputerMove);
                System.out.println();
                CheckResult.checkResult(user,computer,Gesture.fromInt(input), ComputerMove);
                ShowResult.showResult(user,computer,counter);
                round--;
                counter++;
        } while (round > 0);
        ShowResult.showWinner(user,computer);
    }
}
