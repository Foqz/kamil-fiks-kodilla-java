package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        System.out.println(sudokuBoard);
        sudokuBoard.setSudokuElement();
        System.out.println(sudokuBoard);
    }
//        boolean gameFinished = false;
//        while(!gameFinished) {
//            SudokuGame theGame = new SudokuGame();
//            gameFinished = theGame.resolveSudoku();
//        }
//    }

}
