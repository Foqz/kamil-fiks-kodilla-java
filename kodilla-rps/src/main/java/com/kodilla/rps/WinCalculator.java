package com.kodilla.rps;

public class WinCalculator {
    private int userMove;
    private int compMove;

    public WinCalculator(int userMove, int compMove) {
        this.userMove = userMove;
        this.compMove = compMove;
    }
    // 4 - tie 5 -- user win 6 - comp win
    public int calculator (){
        int roundWinner = 99999;
        if (userMove == 1 && compMove == 1 ){
            roundWinner = 4;
        } else if (userMove == 2 && compMove == 2 ){
            roundWinner = 4;
        } else if (userMove == 3 && compMove == 3 ){
            roundWinner = 4;
        } else if (userMove == 1 && compMove == 2 ){
            roundWinner = 6;
        } else if (userMove == 1 && compMove == 3){
            roundWinner = 5;
        }else if (userMove == 2 && compMove == 1) {
            roundWinner = 5;
        }else if (userMove == 2 && compMove == 3) {
            roundWinner = 6;
        } else if (userMove == 3 && compMove == 1) {
            roundWinner = 6;
        }else if (userMove == 3 && compMove == 2) {
            roundWinner = 5;
        }
            return roundWinner;
    }
}
