package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Scanner;

public class SudokuBoard {
    private ArrayList<SudokuRow> rows = new ArrayList<>();
    public SudokuBoard(){
        for (int r = 0; r < 9 ; r++) {
            rows.add(new SudokuRow());
        }
    }
    public SudokuElement getSudokuElement(int row, int col) {
        return rows.get(row).getSudokuElement(col);
    }

    public void setSudokuElement() {
        EnumToInt enumToInt = null;
        System.out.println("Please enter row");
        UserOptions setRow = UserDialogs.getUserSelection();
        int row = enumToInt.intScannerOutput(setRow);
        System.out.println("Please enter col");
        UserOptions setCol = UserDialogs.getUserSelection();
        int col = enumToInt.intScannerOutput(setCol);
        System.out.println("Please enter Sudoku Element");
        UserOptions setSudokuElement = UserDialogs.getUserSelection();
        SudokuElement sudokuElement = new SudokuElement(enumToInt.intScannerOutput(setSudokuElement));
        rows.get(row).setSudokuElement(col,sudokuElement);
    }

    @Override
    public String toString() {
        String s = "-------------------------------------\n";
        for(int n = 0; n<9; n++) {
            for (int i = 0; i<9; i++) {
                if(i == 0) {
                    s += "|" + getSudokuElement(n, i) + "|";
                } else {
                    s += getSudokuElement(n,i) + "|";
                }
            }
            s += "\n-------------------------------------\n";
        }
        return s;
    }
//    public SudokuBoard deepCopy() throws CloneNotSupportedException {
//        SudokuBoard clonedBoard = (SudokuBoard)super.clone();
//        clonedBoard.rows = new ArrayList<>();
//        for (SudokuRow theRows : rows) {
//            SudokuRow clonedRow = new SudokuRow();
//        }
//        return clonedBoard;
//    }
}
