package com.kodilla.good.patterns.challenges;

public class TransactionRequestRetriever {
        public TransactionRequest retrieve() {
            User user = new User("John", "Wekl");
            Product product = new Product("Iron", 120);
            return new TransactionRequest(user, product);
        }
    }
