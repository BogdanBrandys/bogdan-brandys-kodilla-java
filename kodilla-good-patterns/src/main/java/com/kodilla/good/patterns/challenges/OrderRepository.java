package com.kodilla.good.patterns.challenges;

public class OrderRepository implements TransactionRepository {
    public void createTransaction(User user, Product product){
        System.out.println("Sending data to database");
    }
}
