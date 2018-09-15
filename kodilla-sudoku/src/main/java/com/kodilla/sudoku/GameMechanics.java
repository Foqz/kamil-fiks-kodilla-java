package com.kodilla.sudoku;

public class GameMechanics{

    private static final Integer EMPTY = -1;

    private boolean isInRow(int row, Integer number,SudokuBoard sudokuBoard) {
        for(int i = 0; i <9 ; i++)
            if(sudokuBoard.getSudokuElement(row,i).getValue()==number) {
                return true;
            }
        return false;
    }
    private boolean isInCol(int col, Integer number,SudokuBoard sudokuBoard) {
        for (int j = 0; j <9 ; j ++)
            if (sudokuBoard.getSudokuElement(j,col).getValue()==number) {
                return true;
            }
        return false;
    }
    private boolean isInBox(int row, int col, Integer number,SudokuBoard sudokuBoard) {
        int r = row - row % 3 ;
        int c = col - col % 3 ;
        for (int i = r; i < r + 3 ; i++)
            for (int j = c ; j < c +3; j++) {
                if(sudokuBoard.getSudokuElement(i,j).getValue() == number)
                    return true;
            }
        return false;
    }

    private boolean isOk(int row, int col, Integer number,SudokuBoard sudokuBoard) {
        return !isInRow(row,number,sudokuBoard) && !isInCol(col,number,sudokuBoard) && !isInBox(row,col,number,sudokuBoard);
    }

    boolean solve(SudokuBoard sudokuBoard) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (sudokuBoard.getSudokuElement(row, col).getValue() == EMPTY) {
                        for (Integer num = 1; num <= 9; num++) {
                            if (!isOk(row, col, num,sudokuBoard)) {
                                sudokuBoard.getSudokuElement(row, col).getPossibles().remove(num);
                            }
                        }
                    }
                }
            }
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (sudokuBoard.getSudokuElement(row, col).getValue() == EMPTY) {
                        if (sudokuBoard.getSudokuElement(row, col).getPossibles().size() == 1) {
                            sudokuBoard.getSudokuElement(row, col).setValue(sudokuBoard.getSudokuElement(row, col).getPossibles().get(0));
                            changed = true;
                        }
                    }
                }
            }
        }
        boolean isSolved = false;
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (sudokuBoard.getSudokuElement(row, col).getValue() == EMPTY) {
                    isSolved =false;
                } else {
                    isSolved = true;
                }
            }
        }
        if (isSolved) {
            System.out.println("Sudoku has been solved");
            System.out.println(sudokuBoard);
            return true;
        } else {
            System.out.println("Sudoku unsolvable, please try to fill it again");
            return false;
        }
    }
    public void choicesOperator(UserOptions userOptions, GameMechanics gameMechanics, SudokuBoard sudokuBoard) {
        if (userOptions == UserOptions.EXAMPLE) {
            gameMechanics.exampleFill(sudokuBoard);
            System.out.println(sudokuBoard);
        } else if (userOptions == UserOptions.OWN_BOARD) {
            sudokuBoard.setSudokuElement();
            System.out.println("Your current board looks like this");
            System.out.println(sudokuBoard);
        }
    }


    public void solver(UserOptions userOptions,SudokuBoard sudokuBoard, UserDialogs userDialogs) {
            if (userOptions == UserOptions.SOLVE) {
                solve(sudokuBoard);
                userDialogs.endChoice();
            }
        }

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
