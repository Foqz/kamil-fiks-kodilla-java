package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Scanner;

public class SudokuBoard {

    private ArrayList<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard(){
        for (int r = 1; r < 10 ; r++) {
            rows.add(new SudokuRow());
        }
    }

    public SudokuElement getSudokuElement(int row, int col) {
        return rows.get(row).getSudokuElement(col);
    }

    public void setSudokuElement() {
        boolean isNewelement = true;
        while (true) {
            System.out.println("Please enter row");
            int row = UserDialogs.getUserSelection();
            System.out.println("Please enter col");
            int col = UserDialogs.getUserSelection();
            System.out.println("Please enter Sudoku Element");
            SudokuElement sudokuElement = new SudokuElement(UserDialogs.getUserSelection());
            rows.get(row - 1).setSudokuElement(col - 1, sudokuElement);
            System.out.println("Do you want to type another Element? Y/N");
            Scanner scanner =  new Scanner(System.in);
            while (isNewelement) {
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
            break;
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
