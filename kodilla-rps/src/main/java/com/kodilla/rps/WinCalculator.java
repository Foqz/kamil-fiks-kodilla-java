package com.kodilla.rps;
import java.util.Scanner;

public class WinCalculator {
    public  static int compareMoves(UserOptions playerMove, UserOptions computerMove) {
        if (playerMove == computerMove) {
            return 0;
        } else if (playerMove == UserOptions.ROCK && computerMove == UserOptions.PAPER) {
            return 2;
        } else if (playerMove == UserOptions.ROCK && computerMove == UserOptions.SCISSORS) {
            return 1;
        } else if (playerMove == UserOptions.SCISSORS && computerMove == UserOptions.ROCK) {
            return 2;
        } else if (playerMove == UserOptions.SCISSORS && computerMove == UserOptions.PAPER) {
            return 1;
        } else if (playerMove == UserOptions.PAPER && computerMove == UserOptions.SCISSORS) {
            return 2;
        } else {
            return 1;
        }
    }
    public static void gameMechanics(int rounds) {
        int winsPlayer = 0;
        int winsComputer = 0;
        int roundCount = 1;
        while (roundCount < rounds + 1) {
            Computer computer = new Computer();
            UserOptions playerMove = UserDialogs.getUserSelection();
            UserOptions computerMove = computer.getComputerMove();

            if (playerMove == UserOptions.QUIT) {
                while (true) {
                    System.out.println("Do you really want to quit? Y/N ?");
                    Scanner scanner = new Scanner(System.in);
                    String s = scanner.nextLine().toUpperCase();
                    switch (s) {
                        case "Y":
                            System.exit(0);
                        case "N":
                            gameMechanics(rounds);
                        default:
                            System.out.println("Enter correct Chars!");
                    }
                }
            } else if(playerMove == UserOptions.NEW_GAME) {
                while(true) {
                    System.out.println("Do you really want to start a new game  Y/N ? " );
                    Scanner scanner = new Scanner(System.in);
                    String s = scanner.nextLine().toUpperCase();
                    switch (s) {
                        case "Y":
                            RpsRunner.gameApplication();
                        case "N":
                            gameMechanics(rounds);
                        default:
                            System.out.println("Enter correct Chars!");
                    }
                }
            } else {
                int roundResult = compareMoves(playerMove, computerMove);
                if (roundResult == 0) {
                    System.out.println("Player chose " + playerMove + " and computer chose " + computerMove);
                    System.out.println("There was a tie");
                    roundCount++;
                    System.out.println("Player wins: " + winsPlayer + ", computer wins: " + winsComputer + ", round number: " + roundCount);
                } else if (roundResult == 1) {
                    System.out.println("Player chose " + playerMove + " and computer chose " + computerMove);
                    System.out.println("Player wins !");
                    winsPlayer++;
                    roundCount++;
                    System.out.println("Player wins: " + winsPlayer + ", computer wins: " + winsComputer + ", round number: " + roundCount);
                } else {
                    System.out.println("Player chose " + playerMove + " and computer chose " + computerMove);
                    System.out.println("Computer Wins");
                    winsComputer++;
                    roundCount++;
                    System.out.println("Player wins: " + winsPlayer + ", computer wins: " + winsComputer + ", round number: " + roundCount);
                }
            }
        }
        if (winsPlayer > winsComputer) {
            System.out.println("Player have won !");
        } else if (winsComputer > winsPlayer) {
            System.out.println("Computer has won !");
        } else  {
            System.out.println("There was a Tie !");
        }
    }
}
