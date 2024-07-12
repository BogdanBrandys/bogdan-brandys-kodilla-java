package com.kodilla.good.patterns.challenges;

public class TransactionRequest {
    private User User;
    private Product Product;

    public TransactionRequest(User user, Product product) {
        User = user;
        Product = product;
    }

    public com.kodilla.good.patterns.challenges.User getUser() {
        return User;
    }

    public com.kodilla.good.patterns.challenges.Product getProduct() {
        return Product;
    }
}
