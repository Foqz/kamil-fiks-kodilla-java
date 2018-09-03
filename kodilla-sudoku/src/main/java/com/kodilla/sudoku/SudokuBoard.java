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
    private static final Integer EMPTY = -1;
    private boolean isInRow(int row, Integer number) {
        for(int i = 0; i <9 ; i++)
            if(getSudokuElement(row,i).getValue()==number) {
                return true;
            }
        return false;
    }

    private boolean isInCol(int col, Integer number) {
        for (int j = 0; j <9 ; j ++)
            if (getSudokuElement(j,col).getValue()==number) {
                return true;
            }
        return false;
    }
    private boolean isInBox(int row, int col, Integer number) {
        int r = row - row % 3 ;
        int c = col - col % 3 ;
        for (int i = r; i < r + 3 ; i++)
            for (int j = c ; j < c +3; j++) {
                if(getSudokuElement(i,j).getValue() == number)
                    return true;
            }
        return false;
    }

    private boolean isOk(int row, int col, Integer number) {
        return !isInRow(row,number) && !isInCol(col,number) && !isInBox(row,col,number);
    }
    boolean solve() {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (getSudokuElement(row, col).getValue() == EMPTY) {
                        for (Integer num = 1; num <= 9; num++) {
                            if (!isOk(row, col, num)) {
                                getSudokuElement(row, col).getPossibles().remove(num);
                            }
                        }

                    }
                }
            }
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (getSudokuElement(row, col).getValue() == EMPTY) {
                        if (getSudokuElement(row, col).getPossibles().size() == 1) {
                            getSudokuElement(row, col).setValue(getSudokuElement(row, col).getPossibles().get(0));
                            changed = true;
                        }

                    }
                }
            }
        }
        return true;
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
