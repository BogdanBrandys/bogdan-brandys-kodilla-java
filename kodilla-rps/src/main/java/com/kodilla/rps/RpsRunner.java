package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        Game game = new Game();
        while (true) {
            game.gameRps();
            String exitDecision = EndGameOrRestart.getExitOrRestart();
            if (exitDecision.equals("x") || exitDecision.equals("X")) {
                if (CloseGame.doYouWantToCloseTheGame()) {
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                }
            } else if (exitDecision.equals("n") || exitDecision.equals("N")) {
                System.out.println("I'm restarting...");
            }
        }
    }
}
