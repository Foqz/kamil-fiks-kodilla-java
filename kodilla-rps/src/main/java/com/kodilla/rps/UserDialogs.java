package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    private String username;
    private int roundCount;

    public static UserOptions getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter your move (R-ROCK,S-SCISSORS,P-PAPER,Q-QUIT,N-NEW_GAME)");
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
    public String nameSetter(){
        System.out.println("Welcome to Rock,Scissors,Paper Game !");
        System.out.println("Please enter your name");
        Scanner userNameScan = new Scanner(System.in);
        username = userNameScan.next();
        return username;
    }
    public int roundSetter(){
        System.out.println("Please enter how many rounds you want to play");
        Scanner roundCountScan = new Scanner(System.in);
        roundCount = roundCountScan.nextInt();
        return roundCount;
    }

    public String getUsername() {
        return username;
    }

    public int getRoundCount() {
        return roundCount;
    }
    public void rulesExplainer() {
        System.out.println("To play use keys:\n S-STONE\n P-PAPER\n S-SCISSORS\n Q-End the game\n N-new game");
    }
}
