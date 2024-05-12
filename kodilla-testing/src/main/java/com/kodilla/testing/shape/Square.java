package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String name;
    private int length;

    public Square(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Square - " +
                "name='" + name + '\'' +
                ", field=" + getField();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return length == square.length && Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length);
    }
}
