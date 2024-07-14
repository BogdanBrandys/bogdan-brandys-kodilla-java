package com.kodilla.food2door;

public class Product2door {
    private final String name;
    private final int price;

    public Product2door(final String name, final int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product2door{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
