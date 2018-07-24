package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {

    public static UserOptions getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter your move (R-ROCK,S-S.....");
            String s = scanner.nextLine().toUpperCase();
            switch (s){
                case "R":return UserOptions.ROCK;
                case "S":return UserOptions.SCISSORS;
                case "P":return UserOptions.PAPER;
                case "Q":return UserOptions.QUIT;
                case "N":return UserOptions.NEW_GAME;

                default:
                    System.out.println("Wrong data, try again");
            }
        }
    }
}
