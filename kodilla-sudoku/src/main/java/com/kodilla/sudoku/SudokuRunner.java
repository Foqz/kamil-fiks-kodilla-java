package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        UserDialogs userDialogs = new UserDialogs();
        userDialogs.welcomePrinter();
//        sudokuBoard.setSudokuElement(); <- temporary disabled
        sudokuBoard.exampleFill();
        System.out.println(sudokuBoard);
    }
//        boolean gameFinished = false;
//        while(!gameFinished) {
//            SudokuGame theGame = new SudokuGame();
//            gameFinished = theGame.resolveSudoku();
//        }
//    }

}
