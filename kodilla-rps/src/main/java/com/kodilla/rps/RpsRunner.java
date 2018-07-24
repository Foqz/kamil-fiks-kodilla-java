package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        int winsPlayer = 0;
        int winsComputer = 0;
        int roundCount = 1;
        boolean end =false;
        System.out.println("please enter name click Enter and set rounds number you want to play and accept with enter");
        Scanner name = new Scanner(System.in);
        Scanner rounds = new Scanner(System.in);
        String n = name.next();
        int r = rounds.nextInt();
        System.out.println("Username set to: " + n + " and rounds number set to: " + r);
        System.out.println("To play use keys:\n 1-STONE\n 2-PAPER\n 3-SCISSORS\n x-End the game\n n-new game");

        while (roundCount < r + 1) {

            Computer computer = new Computer();
            UserOptions userSelection = UserDialogs.getUserSelection();
            System.out.println("Please enter your move");
            Scanner userMove = new Scanner(System.in);
            int um = userMove.nextInt();
//            String ums = userMove.next();
            if (um == 0 || um > 3 ) {
                System.out.println("Wrong number");
            } else {
                System.out.println(n + " move was " + um);
                int computerMove = computer.computerPlay();
                System.out.println("Computer move was: " + computerMove);
                WinCalculator winCalculator = new WinCalculator(um, computerMove);
                int roundOutcome = winCalculator.calculator();
                if (roundOutcome == 4) {
                    System.out.println("Tie !");
                    System.out.println(n + " wins: " + winsPlayer + ", computer wins: " + winsComputer + ", round number: " + roundCount);
                } else if (roundOutcome == 5) {
                    System.out.println(n + " wins!");
                    winsPlayer++;
                    System.out.println(n + " wins: " + winsPlayer + ", computer wins: " + winsComputer + ", round number: " + roundCount);
                } else if (roundOutcome == 6) {
                    System.out.println("Computer wins !");
                    winsComputer++;
                    System.out.println(n + " wins: " + winsPlayer + ", computer wins: " + winsComputer + ", round number: " + roundCount);
                }
                roundCount++;
            }
        }
        if (winsPlayer > winsComputer) {
            System.out.println(n + " Won");
        } else if (winsComputer > winsPlayer) {
            System.out.println("Computer won");
        } else {
            System.out.println("There was a tie");
        }

//        while (!end) {
//            System.out.println("Please enter your move");
//            Scanner userMove = new Scanner(System.in);
//            String  um = userMove.next();
//            int umn = userMove.nextInt();
//            if (um == "x")
//            Computer computer = new Computer();
//            computer.computerPlay();
//        }
    }
}
