package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {
        sudokuApplication();
    }

    public static void sudokuApplication() {
        SudokuBoard sudokuBoard = new SudokuBoard();
        UserDialogs userDialogs = new UserDialogs();
        GameMechanics gameMechanics = new GameMechanics();

        UserOptions choiceStart = userDialogs.welcomeChoice();
        gameMechanics.choicesOperator(choiceStart,gameMechanics,sudokuBoard);
        UserOptions choiceSolve = userDialogs.solveChoice();
        gameMechanics.solver(choiceSolve,sudokuBoard,userDialogs);
        UserOptions choiceEnd = userDialogs.endChoice();
        gameMechanics.choicesOperator(choiceEnd,gameMechanics,sudokuBoard);
    }
}
