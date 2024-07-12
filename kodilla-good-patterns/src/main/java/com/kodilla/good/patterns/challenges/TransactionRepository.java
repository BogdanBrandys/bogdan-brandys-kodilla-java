package com.kodilla.good.patterns.challenges;

public interface TransactionRepository {
    void createTransaction(User user, Product product);
}
