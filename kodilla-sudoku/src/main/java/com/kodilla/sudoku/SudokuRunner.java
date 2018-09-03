package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        UserDialogs userDialogs = new UserDialogs();
        GameMechanics gameMechanics = new GameMechanics();
        userDialogs.welcomePrinter();
//        sudokuBoard.setSudokuElement(); <- temporary disabled
        System.out.println(sudokuBoard);
        gameMechanics.exampleFill(sudokuBoard);
        System.out.println(sudokuBoard);
        sudokuBoard.solve();

        System.out.println(sudokuBoard);
    }

}
