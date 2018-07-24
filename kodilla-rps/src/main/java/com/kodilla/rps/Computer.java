package com.kodilla.rps;

import java.util.Random;

public class Computer {
    public int computerPlay(){
        Random generator = new Random();
        int comMove = generator.nextInt(3)+1;
        return comMove;
    }
}
