package com.kodilla.rps;

import java.util.Random;

public class Computer {
    public UserOptions getComputerMove(){
        Random generator = new Random();
        int comMove = generator.nextInt(3)+1;
        if (comMove == 1) {
            return UserOptions.ROCK;
        } else if (comMove ==2) {
            return UserOptions.PAPER;
        } else {
            return UserOptions.SCISSORS;
        }
    }
}
