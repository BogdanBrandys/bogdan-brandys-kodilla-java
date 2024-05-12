package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private String name;
    private double x;
    private double y;
    private double z;

    public Triangle(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public String toString() {
        return "Triangle - " +
                "name='" + name + '\'' +
                ", field=" + getField();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(x, triangle.x) == 0 && Double.compare(y, triangle.y) == 0 && Double.compare(z, triangle.z) == 0 && Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z);
    }
}
