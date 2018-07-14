package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private double length1;
    private double length2;

    public Square(double bok1, double bok2) {
        this.length1 = bok1;
        this.length2 = bok2;
    }
    @Override
    public Double getField() {
        Double field = length1 * length2;
        return field;
    }
    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.length1, length1) == 0 &&
                Double.compare(square.length2, length2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length1, length2);
    }
}
