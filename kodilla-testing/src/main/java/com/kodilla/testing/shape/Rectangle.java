package com.kodilla.testing.shape;

import java.util.Objects;

public class Rectangle implements Shape {
    private Double length;
    private Double height;

    public Rectangle(Double length, Double height) {
        this.length = length;
        this.height = height;
    }
    @Override
    public String getShapeName() {
        return "rectangle";
    }
    @Override
    public Double getField() {
        Double field = 0.5 * length * height;
        return field;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(length, rectangle.length) &&
                Objects.equals(height, rectangle.height);
    }
    @Override
    public int hashCode() {

        return Objects.hash(length, height);
    }
}
