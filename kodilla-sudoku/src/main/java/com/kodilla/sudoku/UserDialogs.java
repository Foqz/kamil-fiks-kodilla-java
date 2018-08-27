package com.kodilla.sudoku;

import sun.nio.cs.US_ASCII;


import java.util.Scanner;

public class UserDialogs {
    public void welcomePrinter() {
        System.out.println("Welcome to SudokuSolver by Kamil Fiks!");
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

                default:
                    System.out.println("Wrong data,try again");
            }
        }
    }
//    public static UserOptions getUserSelection() {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        while (true) {
//            switch (s) {
//                case "-1": return UserOptions.NEGATIVEONE;
//                case "1": return UserOptions.ONE;
//                case "2": return UserOptions.TWO;
//                case "3": return UserOptions.THREE;
//                case "4": return UserOptions.FOUR;
//                case "5": return UserOptions.FIVE;
//                case "6": return UserOptions.SIX;
//                case "7": return UserOptions.SEVEN;
//                case "8": return UserOptions.EIGHT;
//                case "9": return UserOptions.NINE;
//
//                default:
//                    System.out.println("Wrong data,try again");
//            }
//        }
//    }
}
