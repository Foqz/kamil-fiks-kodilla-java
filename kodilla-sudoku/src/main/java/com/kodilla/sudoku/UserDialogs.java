package com.kodilla.sudoku;

import java.util.Scanner;

public class UserDialogs {
    public UserOptions welcomePrinter() {
        System.out.println("Welcome to SudokuSolver by Kamil Fiks!");
        System.out.println("Would you like to fill your Sudoku Board with: \n" +
                "-  example Board    (Press E)\n" +
                "-  your own numbers (Press O)");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "E": return UserOptions.EXAMPLE;
                case "O": return UserOptions.OWN_BOARD;
                default:
                    System.out.println("Wrong data, try again");
            }
        }
    }

    public void endPrinter() {
        System.out.println("To start the new Sudoku press \"Y\" \nTo quit the application \"Q\"");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    SudokuRunner.sudokuApplication();
                case "Q":
                    System.exit(0);
                default:
                    System.out.println("Wrong data");
            }
        }
    }

    public void solver(SudokuBoard sudokuBoard, UserDialogs userDialogs, GameMechanics gameMechanics) {
        System.out.println("Press \"S\" to solve the sudoku or \"Q\" to quit aplication");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "S":
                        gameMechanics.solve(sudokuBoard);
                        userDialogs.endPrinter();
                case "Q":
                    System.exit(0);
                default:
                    System.out.println("Wrong data");
            }
        }
    }

    public static int getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            switch (s) {
                case "-1": return -1;
                case "1": return 1;
                case "2": return 2;
                case "3": return 3;
                case "4": return 4;
                case "5": return 5;
                case "6": return 6;
                case "7": return 7;
                case "8": return 8;
                case "9": return 9;
                default:
                    System.out.println("Wrong data,try again");
            }
        }
    }

    public void choicesOperator(UserOptions userOptions, GameMechanics gameMechanics, SudokuBoard sudokuBoard) {
        if (userOptions == userOptions.EXAMPLE) {
            gameMechanics.exampleFill(sudokuBoard);
            System.out.println(sudokuBoard);

        } else {
            sudokuBoard.setSudokuElement();
            System.out.println("Your current board looks like this");
            System.out.println(sudokuBoard);
        }
    }
}
