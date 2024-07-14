package com.kodilla.food2door;

public class OrderRequest {
    private int orderId;
    private Product2door product2door;
    private Supplier supplier;

    public OrderRequest(int orderId, Product2door product2door, Supplier supplier) {
        this.orderId = orderId;
        this.product2door = product2door;
        this.supplier = supplier;

    }

    public int getOrderId() {
        return orderId;
    }

    public Product2door getProduct() {
        return product2door;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
