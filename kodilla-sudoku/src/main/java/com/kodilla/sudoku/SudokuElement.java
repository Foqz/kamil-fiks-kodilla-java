package com.kodilla.sudoku;

public class SudokuElement {
    public static int EMPTY = -1;
    int value;

    public SudokuElement(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == -1) {
            return "   ";
        }else {
            return " "+ value + " ";
        }
    }

}
