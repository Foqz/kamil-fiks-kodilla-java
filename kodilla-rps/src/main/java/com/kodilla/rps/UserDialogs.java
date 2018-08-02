package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    private int difficulty;
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
    public static void quit(){
        System.out.println("Do you really want to quit? Y/N ?");
        boolean isQuit = true;
        while (isQuit) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    System.exit(0);
                case "N":
                    System.out.println("Lets get going!");
                    isQuit = false;
                    break;
                default:
                    System.out.println("Wrong data");
            }
        }
    }
    public static void newGame() {
        boolean isNewGame = true;
        System.out.println("Do you really want to start a new game  Y/N ? " );
        while(isNewGame) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    RpsRunner.gameApplication();
                case "N":
                    System.out.println("Lets get going !");
                    isNewGame = false;
                    break;
                default:
                    System.out.println("Wrong data");
            }
        }
    }
    public static void newGameFinal() {
        boolean isNewGame = true;
        System.out.println("Do you want to start a new game  Y/N ? " );
        while(isNewGame) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    RpsRunner.gameApplication();
                case "N":
                    System.out.println("See you later ! :)");
                    isNewGame = false;
                    break;
                default:
                    System.out.println("Wrong data");
            }
        }
    }
    public static void showMoves(UserOptions playerMove, UserOptions compMove, RoundResult roundResult){
        System.out.println("Player move: "+ playerMove + ", computer move: " + compMove + "\nRound Result = " + roundResult);
    }
    public static void showStatistics(int playerWins, int computerWins, int roundCount) {
        System.out.println("Player wins: " + playerWins + " Computer wins: " + computerWins + " Round number: " +roundCount);
    }
    public static void showFinalStatistics(int PlayerWins, int ComputerWins) {
        if (PlayerWins> ComputerWins) {
            System.out.println("Player have won !");
        } else if (ComputerWins > PlayerWins) {
            System.out.println("Computer has won !");
        } else  {
            System.out.println("There was a Tie !");
        }
    }
    public static void showPlayerParameters(String playerName, int rounds, int difficultyLevel){
        System.out.println("Player Name was set to " + playerName + ". Rounds number was set to " + rounds + ". Difficulty level: " + difficultyLevel);
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
        System.out.println("To play use keys:\n R-ROCK\n P-PAPER\n S-SCISSORS\n Q-End the game\n N-new game");
    }
    public int difficultySetter(){
        System.out.println("Please select difficulty level \n1-Normal \n2-Hardcore(Computer Cheats!)");
        Scanner difficultyScan = new Scanner(System.in);
        difficulty = difficultyScan.nextInt();
        return difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
