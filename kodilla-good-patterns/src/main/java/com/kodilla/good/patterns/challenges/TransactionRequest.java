package com.kodilla.good.patterns.challenges;

public class TransactionRequest {
    private User User;
    private Product Product;

    public TransactionRequest(User user, Product product) {
        User = user;
        Product = product;
    }

    public User getUser() {
        return User;
    }

    public Product getProduct() {
        return Product;
    }
}
