package com.kodilla.sudoku;

import sun.nio.cs.US_ASCII;


import java.util.Scanner;

public class UserDialogs {
    public UserOptions welcomePrinter() {
        System.out.println("Welcome to SudokuSolver by Kamil Fiks!");
        System.out.println(" Would you like to fill your Sudoku Board with: \n" +
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
        System.out.println("You sudoku has been solved !\n Would you like to start new one \"Y\" or quit the application \"Q\"");
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

    public void solver(UserOptions userOptions, SudokuBoard sudokuBoard, UserDialogs userDialogs, GameMechanics gameMechanics){
        if (userOptions == UserOptions.EXAMPLE){
            System.out.println("Press \"S\" to solve the sudoku or \"Q\" to quit aplication");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String s = scanner.nextLine().toUpperCase();
                switch (s) {
                    case "S":
                        gameMechanics.solve(sudokuBoard);
                        System.out.println(sudokuBoard);
                        userDialogs.endPrinter();
                    case "Q":
                        System.exit(0);
                    default:
                        System.out.println("Wrong data");
                }
            }
        } else {
            System.out.println("Something");
        }
    }


    public static UserOptions getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            switch (s) {
                case "-1": return UserOptions.NEGATIVEONE;
                case "1": return UserOptions.ONE;
                case "2": return UserOptions.TWO;
                case "3": return UserOptions.THREE;
                case "4": return UserOptions.FOUR;
                case "5": return UserOptions.FIVE;
                case "6": return UserOptions.SIX;
                case "7": return UserOptions.SEVEN;
                case "8": return UserOptions.EIGHT;
                case "9": return UserOptions.NINE;
                case "N": return UserOptions.NEW_BOARD;
                case "Q": return UserOptions.QUIT;

                default:
                    System.out.println("Wrong data,try again");
            }
        }
    }
    public static void quit(){
        System.out.println("Do you really want to end application? Y/N ?");
        boolean isQuit = true;
        while (isQuit) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    System.exit(0);
                case "N":
                    System.out.println("Ok, lets move on!");
                    isQuit = false;
                    break;
                default:
                    System.out.println("Wrong data");
            }
        }
    }
    public static void newBoard() {
        boolean isNewGame = true;
        System.out.println("Do you really want to start board Y/N ? " );
        while(isNewGame) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    SudokuRunner.sudokuApplication();
                case "N":
                    System.out.println("Lets get going !");
                    isNewGame = false;
                    break;
                default:
                    System.out.println("Wrong data");
            }
        }
    }
    public void choicesPrinter(UserOptions userOptions, GameMechanics gameMechanics, SudokuBoard sudokuBoard) {
        if (userOptions == userOptions.EXAMPLE) {
            gameMechanics.exampleFill(sudokuBoard);
            System.out.println(sudokuBoard);
        } else {
            System.out.println(sudokuBoard);
        }
    }
}
