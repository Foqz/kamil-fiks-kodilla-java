package com.kodilla.rps;

public class WinCalculator {
    public static RoundResult compareMoves(UserOptions playerMove, UserOptions computerMove) {
        if (playerMove == computerMove) {
            return RoundResult.TIE;
        } else if (playerMove == UserOptions.ROCK && computerMove == UserOptions.PAPER) {
            return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserOptions.ROCK && computerMove == UserOptions.SCISSORS) {
            return RoundResult.PLAYERWIN;
        } else if (playerMove == UserOptions.SCISSORS && computerMove == UserOptions.ROCK) {
            return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserOptions.SCISSORS && computerMove == UserOptions.PAPER) {
            return RoundResult.PLAYERWIN;
        } else if (playerMove == UserOptions.PAPER && computerMove == UserOptions.SCISSORS) {
            return RoundResult.COMPUTERWIN;
        } else {
            return RoundResult.PLAYERWIN;
        }
    }
    public static void gameMechanics(int rounds,int difficulty) {
        int playerWins = 0;
        int computerWins = 0;
        int roundCount = 0;
        while (roundCount < rounds) {
            Computer computer = new Computer();
            UserOptions playerMove = UserDialogs.getUserSelection();
            UserOptions computerMove = computer.getComputerMove(difficulty,playerMove);
            if (playerMove == UserOptions.QUIT) {
                UserDialogs.quit();
            } else if(playerMove == UserOptions.NEW_GAME) {
                UserDialogs.newGame();
            } else {
                RoundResult roundResult = compareMoves(playerMove, computerMove);
                roundCount++;
                if (roundResult == RoundResult.TIE) {
                    UserDialogs.showMoves(playerMove,computerMove,roundResult);
                } else if (roundResult == RoundResult.PLAYERWIN) {
                    UserDialogs.showMoves(playerMove,computerMove,roundResult);
                    playerWins++;
                } else {
                    UserDialogs.showMoves(playerMove,computerMove,roundResult);
                    computerWins++;
                }
                UserDialogs.showStatistics(playerWins,computerWins,roundCount);
            }
        }
        UserDialogs.showFinalStatistics(playerWins,computerWins);
    }
}
