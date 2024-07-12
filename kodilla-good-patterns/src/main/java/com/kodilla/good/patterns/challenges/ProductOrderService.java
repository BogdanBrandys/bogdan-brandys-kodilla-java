package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        TransactionRequestRetriever transactionRequestRetriever = new TransactionRequestRetriever();
        TransactionRequest transactionRequest = transactionRequestRetriever.retrieve();
        TransactionProcessor transactionProcessor = new TransactionProcessor(
                new MailService(), new OrderService(), new
                OrderRepository());
        TransactionDto dto = transactionProcessor.process(transactionRequest);

        System.out.println();
        System.out.println("This is your order:");
        System.out.println(dto.getUser());
        System.out.println(dto.getProduct());
        System.out.println("Transaction completed: " + dto.isBuy());
    }
}
