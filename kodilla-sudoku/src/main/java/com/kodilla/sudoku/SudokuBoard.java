package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Scanner;

public class SudokuBoard {
    private ArrayList<SudokuRow> rows = new ArrayList<>();
    SudokuBoard(){
        for (int r = 1; r < 10 ; r++) {
            rows.add(new SudokuRow());
        }
    }
    SudokuElement getSudokuElement(int row, int col) {
        return rows.get(row).getSudokuElement(col);
    }

    private void setSudokuElement() {
        boolean isNewelement = true;
        while (isNewelement) {
            EnumToInt enumToInt = null;
            System.out.println("Please enter row");
            UserOptions setRow = UserDialogs.getUserSelection();
            int row = enumToInt.scanToInt(setRow);
            System.out.println("Please enter col");
            UserOptions setCol = UserDialogs.getUserSelection();
            int col = enumToInt.scanToInt(setCol);
            System.out.println("Please enter Sudoku Element");
            UserOptions setSudokuElement = UserDialogs.getUserSelection();
            SudokuElement sudokuElement = new SudokuElement(enumToInt.scanToInt(setSudokuElement));
            rows.get(row - 1).setSudokuElement(col - 1, sudokuElement);
            System.out.println("Do you want to type another Element? Y/N");
            Scanner scanner =  new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    setSudokuElement();
                case "N":
                    isNewelement = false;
                    break;
                default:
                    System.out.println("Wrong data");
            }
        }
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
}
