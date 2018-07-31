package com.kodilla.rps;
import java.util.Random;

public class Computer {
    public UserOptions getComputerMove(int difficulty,UserOptions playerMove){
        Random generator = new Random();
        UserOptions tempCompMove = null;
        if (difficulty == 1) {
            int comMove = generator.nextInt(3) + 1;
            if (comMove == 1) {
                tempCompMove = UserOptions.ROCK;
            } else if (comMove == 2) {
                tempCompMove = UserOptions.PAPER;
            } else {
                tempCompMove = UserOptions.SCISSORS;
            }
        } else if (difficulty == 2 ) {
            int comMove1 = generator.nextInt(100) +1;
            if (playerMove == UserOptions.PAPER) {
                if (comMove1 <= 25) {
                    tempCompMove = UserOptions.ROCK;
                } else if (comMove1 > 25 && comMove1 <= 50) {
                    tempCompMove = UserOptions.PAPER;
                } else {
                    tempCompMove = UserOptions.SCISSORS;
                }
            } else if (playerMove == UserOptions.ROCK) {
                if (comMove1 <= 25) {
                    tempCompMove = UserOptions.ROCK;
                } else if (comMove1 > 25 && comMove1 <= 50) {
                    tempCompMove = UserOptions.SCISSORS;
                } else {
                    tempCompMove = UserOptions.PAPER;
                }
            } else {
                if (comMove1 <= 25) {
                    tempCompMove = UserOptions.PAPER;
                } else if (comMove1 > 25 && comMove1 <= 50) {
                    tempCompMove = UserOptions.SCISSORS;
                } else {
                    tempCompMove = UserOptions.ROCK;
                }
            }
        } return tempCompMove;
    }
}
