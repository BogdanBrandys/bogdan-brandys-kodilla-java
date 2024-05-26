package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero. Error: " + e);
        } finally {
            System.out.println("End of the method");
        }
        return 0;
    }

    public int powerOfNumber(int number, int power) throws ArithmeticException {
        try {
            if (power == 0) {
                throw new ArithmeticException();
            }
            else if (power == 1) {
                throw new ArithmeticException();
            }
            else if (number == 0) {
                throw new ArithmeticException();
            }
            else{
                for (int i = 1; i < power; i++) {
                    number *= number;
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Check your numbers!. Exception: " + e);
        } finally{
            System.out.println("End of the method");
        }
        return number;
    }
    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 2);
        int result2 = firstChallenge.powerOfNumber(3, 2);
        System.out.println("Result of first challange is: " + result);
        System.out.println("Result of powerOfNumber is: " + result2);
    }
}