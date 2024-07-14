package com.kodilla.food2door;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        int orderNumber = 1;
        Product2door product2door1 = new Product2door("Umbrella", 5);
        Supplier supplier = new ExtraFoodShop();
        return new OrderRequest(orderNumber, product2door1, supplier);
    }
}
