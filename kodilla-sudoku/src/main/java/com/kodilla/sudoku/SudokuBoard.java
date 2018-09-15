package com.kodilla.sudoku;

import java.util.ArrayList;

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
        while (isNewelement) {
            UserDialogs userDialogs = new UserDialogs();
            rows.get(userDialogs.getRow() - 1).setSudokuElement(userDialogs.getCol() - 1, userDialogs.getElement());
            UserOptions userOptions =userDialogs.elementChoice();
            if (userOptions == UserOptions.NEW_ELEMENT) {
                setSudokuElement();
            } else {
                isNewelement = false;
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
