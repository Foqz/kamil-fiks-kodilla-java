package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    private Integer value;
    private List<Integer> possibles = new ArrayList<>();

    public SudokuElement(Integer value) {
        this.value = value;
        if (value == -1) {
            for(Integer n = 1 ; n <=9; n++) {
                possibles.add(n);
            }
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        possibles.clear();
        for(Integer n = 1 ; n <=9; n++) {
            possibles.add(n);
        }
    }
    public List<Integer> getPossibles() {
        return possibles;
    }

    @Override
    public String toString() {
        if (value == -1) {
            return "   ";
        } else {
            return " "+ value + " ";
        }
    }
}
