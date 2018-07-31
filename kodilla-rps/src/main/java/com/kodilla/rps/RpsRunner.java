package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        gameApplication();
    }
    public static void gameApplication() {
        UserDialogs userDialogs = new UserDialogs();
        userDialogs.nameSetter();
        userDialogs.roundSetter();
        userDialogs.difficultySetter();
        UserDialogs.showPlayerParameters(userDialogs.getUsername(),userDialogs.getRoundCount(),userDialogs.getDifficulty());
        userDialogs.rulesExplainer();
        WinCalculator.gameMechanics(userDialogs.getRoundCount(),userDialogs.getDifficulty());
        UserDialogs.newGameFinal();
    }
}

