package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;
    int c;
    int d;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void add(){
        c = a + b;
    }
    public void substract(){
        d = a - b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }
}
