package com.kodilla.sudoku;

public class GameMechanics{

    public SudokuBoard exampleFill(SudokuBoard sudokuBoard) {
        sudokuBoard.getSudokuElement(0,0).setValue(2);
        sudokuBoard.getSudokuElement(0,2).setValue(9);
        sudokuBoard.getSudokuElement(0,6).setValue(6);
        sudokuBoard.getSudokuElement(1,1).setValue(4);
        sudokuBoard.getSudokuElement(1,3).setValue(8);
        sudokuBoard.getSudokuElement(1,4).setValue(7);
        sudokuBoard.getSudokuElement(1,7).setValue(1);
        sudokuBoard.getSudokuElement(1,8).setValue(2);
        sudokuBoard.getSudokuElement(2,0).setValue(8);
        sudokuBoard.getSudokuElement(2,4).setValue(1);
        sudokuBoard.getSudokuElement(2,5).setValue(9);
        sudokuBoard.getSudokuElement(2,7).setValue(4);
        sudokuBoard.getSudokuElement(3,1).setValue(3);
        sudokuBoard.getSudokuElement(3,3).setValue(7);
        sudokuBoard.getSudokuElement(3,6).setValue(8);
        sudokuBoard.getSudokuElement(3,8).setValue(1);
        sudokuBoard.getSudokuElement(4,1).setValue(6);
        sudokuBoard.getSudokuElement(4,2).setValue(5);
        sudokuBoard.getSudokuElement(4,5).setValue(8);
        sudokuBoard.getSudokuElement(4,7).setValue(3);
        sudokuBoard.getSudokuElement(5,0).setValue(1);
        sudokuBoard.getSudokuElement(5,4).setValue(3);
        sudokuBoard.getSudokuElement(5,8).setValue(7);
        sudokuBoard.getSudokuElement(6,3).setValue(6);
        sudokuBoard.getSudokuElement(6,4).setValue(5);
        sudokuBoard.getSudokuElement(6,6).setValue(7);
        sudokuBoard.getSudokuElement(6,8).setValue(9);
        sudokuBoard.getSudokuElement(7,0).setValue(6);
        sudokuBoard.getSudokuElement(7,2).setValue(4);
        sudokuBoard.getSudokuElement(7,7).setValue(2);
        sudokuBoard.getSudokuElement(8,1).setValue(8);
        sudokuBoard.getSudokuElement(8,3).setValue(3);
        sudokuBoard.getSudokuElement(8,5).setValue(1);
        sudokuBoard.getSudokuElement(8,6).setValue(4);
        sudokuBoard.getSudokuElement(8,7).setValue(5);

        return sudokuBoard;
    }
}
