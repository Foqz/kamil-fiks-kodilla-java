package com.kodilla.sudoku;

public class SudokuSolver {
//    public SudokuElement EMPTY = new SudokuElement(-1);
//    SudokuBoard sudokuBoard;
//    public boolean isInRow(int row, SudokuElement number) {
//        for(int i = 1; i <10 ; i++)
//            if(sudokuBoard.getSudokuElement(row,i) == number) {
//                return true;
//            }
//        return false;
//    }
//
//    public boolean isInCol(int col, SudokuElement number) {
//        for (int j = 1; j <10 ; j ++)
//            if (sudokuBoard.getSudokuElement(j,col)== number) {
//                return true;
//            }
//        return false;
//    }
//
//    public boolean isInBox(int row, int col, SudokuElement number) {
//        int r = row - row % 3;
//        int c = col - col % 3;
//        for (int i = r; i < r + 3 ; i++)
//            for (int j = c ; j < c +3; j++) {
//                if(sudokuBoard.getSudokuElement(i,j) == number)
//                    return true;
//            }
//            return false;
//    }
//
//    public boolean isOk(int row, int col, SudokuElement number) {
//        return !isInRow(row,number) && !isInCol(col,number) && !isInBox(row,col,number);
//    }
//    public boolean solve() {
//        for (int row = 1; row<9; row ++) {
//            for (int col = 1; col <9; col ++){
//                if(sudokuBoard.getSudokuElement(row,col) == EMPTY) {
//                    for (int number = 1; number <=9; number++) {
//                        if(isOk(row,col,new SudokuElement(number))){
//                            sudokuBoard.setElementWithSolver(row,col,new SudokuElement(number));
//
//                            if(solve()) {
//                                return true;
//                            } else {
//                                sudokuBoard.setElementWithSolver(row,col,EMPTY);
//                            }
//                        }
//                    }
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

}
