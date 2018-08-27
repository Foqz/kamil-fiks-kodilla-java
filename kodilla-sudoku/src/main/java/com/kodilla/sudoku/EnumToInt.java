package com.kodilla.sudoku;

public class EnumToInt {
    public static int intScannerOutput (UserOptions userOptions) {
        if (userOptions == UserOptions.NEGATIVEONE) {
            return  -1;
        } else if (userOptions == UserOptions.ONE) {
            return 1;
        }else if (userOptions == UserOptions.TWO) {
            return 2;
        }else if (userOptions == UserOptions.THREE) {
            return 3;
        }else if (userOptions == UserOptions.FOUR) {
            return 4;
        }else if (userOptions == UserOptions.FIVE) {
            return 5;
        }else if (userOptions == UserOptions.SIX) {
            return 6;
        }else if (userOptions == UserOptions.SEVEN) {
            return 7;
        }else if (userOptions == UserOptions.EIGHT) {
            return 8;
        }else {
            return 9;
        }
    }
}
