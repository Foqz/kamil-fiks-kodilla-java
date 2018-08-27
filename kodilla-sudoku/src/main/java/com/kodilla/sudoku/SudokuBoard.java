package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Scanner;

public class SudokuBoard {
    private static ArrayList<SudokuRow> rows = new ArrayList<>();
    public SudokuBoard(){
        for (int r = 1; r < 10 ; r++) {
            rows.add(new SudokuRow());
        }
    }
    public SudokuElement getSudokuElement(int row, int col) {
        return rows.get(row).getSudokuElement(col);
    }

    public static void setSudokuElement() {
        boolean isNewelement = true;
        while (isNewelement ) {
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
    public static void exampleFill() {
        rows.get(0).setSudokuElement(0,new SudokuElement(2));
        rows.get(0).setSudokuElement(2,new SudokuElement(9));
        rows.get(0).setSudokuElement(6,new SudokuElement(6));
        rows.get(1).setSudokuElement(1,new SudokuElement(4));
        rows.get(1).setSudokuElement(3,new SudokuElement(8));
        rows.get(1).setSudokuElement(4,new SudokuElement(7));
        rows.get(1).setSudokuElement(7,new SudokuElement(1));
        rows.get(1).setSudokuElement(8,new SudokuElement(2));
        rows.get(2).setSudokuElement(0,new SudokuElement(8));
        rows.get(2).setSudokuElement(4,new SudokuElement(1));
        rows.get(2).setSudokuElement(5,new SudokuElement(9));
        rows.get(2).setSudokuElement(7,new SudokuElement(4));
        rows.get(3).setSudokuElement(1,new SudokuElement(3));
        rows.get(3).setSudokuElement(3,new SudokuElement(7));
        rows.get(3).setSudokuElement(6,new SudokuElement(8));
        rows.get(3).setSudokuElement(8,new SudokuElement(1));
        rows.get(4).setSudokuElement(1,new SudokuElement(6));
        rows.get(4).setSudokuElement(2,new SudokuElement(5));
        rows.get(4).setSudokuElement(5,new SudokuElement(8));
        rows.get(4).setSudokuElement(7,new SudokuElement(3));
        rows.get(5).setSudokuElement(0,new SudokuElement(1));
        rows.get(5).setSudokuElement(4,new SudokuElement(3));
        rows.get(5).setSudokuElement(8,new SudokuElement(7));
        rows.get(6).setSudokuElement(3,new SudokuElement(6));
        rows.get(6).setSudokuElement(4,new SudokuElement(5));
        rows.get(6).setSudokuElement(6,new SudokuElement(7));
        rows.get(6).setSudokuElement(8,new SudokuElement(9));
        rows.get(7).setSudokuElement(0,new SudokuElement(6));
        rows.get(7).setSudokuElement(2,new SudokuElement(4));
        rows.get(7).setSudokuElement(7,new SudokuElement(2));
        rows.get(8).setSudokuElement(1,new SudokuElement(8));
        rows.get(8).setSudokuElement(3,new SudokuElement(3));
        rows.get(8).setSudokuElement(5,new SudokuElement(1));
        rows.get(8).setSudokuElement(6,new SudokuElement(4));
        rows.get(8).setSudokuElement(7,new SudokuElement(5));
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
