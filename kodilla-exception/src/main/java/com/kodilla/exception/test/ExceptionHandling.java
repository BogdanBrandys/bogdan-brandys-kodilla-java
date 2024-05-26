package com.kodilla.exception.test;


public class ExceptionHandling extends SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws Exception {
        try {
            if (x >= 2.0 || x < 1 || y == 1.5) {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new RuntimeException("Check your data! Please enter myst be equal to 1 and y not equal to 1.5");
        } finally {
            System.out.println("End of ExceptionHandling");
        }
        return "Done!";
    }
}
