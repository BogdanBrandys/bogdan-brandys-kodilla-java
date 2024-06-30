package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String task) {
        return switch (task) {
            case DRIVING -> new DrivingTask("Pizza Delivery", "City Center", "Bicycle");
            case PAINTING -> new PaintingTask("Landscape", "Pastel", "Cottage in the countryside");
            case SHOPPING -> new ShoppingTask("Grocery Shopping", "Eggs, Milk, Bread", 1);
            default -> null;
        };
    }
}
