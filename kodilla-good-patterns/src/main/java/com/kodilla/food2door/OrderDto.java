package com.kodilla.food2door;

public class OrderDto {
    private Supplier supplier;
    private int orderId;
    private Product2door product2door;
    private boolean isOrdered;
    public OrderDto(Supplier supplier, int orderId, Product2door product2door, boolean isOrdered) {
        this.supplier = supplier;
        this.orderId = orderId;
        this.product2door = product2door;
        this.isOrdered = isOrdered;
    }

    public int getOrderId() {
        return orderId;
    }

    public Product2door getProduct() {
        return product2door;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
