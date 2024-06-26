package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector{
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
        return shapes.get(n);
    }
    public List<Shape> showFigures() {
        List<Shape> list = new ArrayList<Shape>();
        for (Shape shape : shapes) {
            list.add(shape);
        }
        return list;
    }
}
