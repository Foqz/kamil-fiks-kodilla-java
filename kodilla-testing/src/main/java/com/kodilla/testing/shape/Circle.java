package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private Double radious;

    public Circle(Double radious) {
        this.radious = radious;
    }
    @Override
    public String getShapeName() {
        return "circle";
    }
    @Override
    public Double getField() {
        Double field = 3.14 * radious * radious;
        return field;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radious, circle.radious);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radious);
    }
}
