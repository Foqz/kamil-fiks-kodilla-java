package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {
        sudokuApplication();
    }

    public static void sudokuApplication() {
        SudokuBoard sudokuBoard = new SudokuBoard();
        UserDialogs userDialogs = new UserDialogs();
        GameMechanics gameMechanics = new GameMechanics();

        UserOptions choice = userDialogs.welcomePrinter();
        userDialogs.choicesOperator(choice,gameMechanics,sudokuBoard);
        userDialogs.solver(sudokuBoard,userDialogs,gameMechanics);
    }
}
