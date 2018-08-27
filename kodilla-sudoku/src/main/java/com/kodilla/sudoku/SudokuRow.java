package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuRow {
    ArrayList<SudokuElement> columns = new ArrayList<>();
    public SudokuRow() {
        for(int c = 0; c < 9; c++) {
            columns.add(new SudokuElement(-1));
        }
    }
    public void setSudokuElement(int col, SudokuElement sudokuElement) {
        columns.add(col,sudokuElement);
        columns.remove(col + 1);
    }
    public SudokuElement getSudokuElement(int col){
        return columns.get(col);
    }
}
