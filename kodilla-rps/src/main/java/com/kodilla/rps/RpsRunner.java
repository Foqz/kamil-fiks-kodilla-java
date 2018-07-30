package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        gameApplication();
    }
    public static void gameApplication() {
        UserDialogs userDialogs = new UserDialogs();
        userDialogs.nameSetter();
        userDialogs.roundSetter();
        System.out.println("Player Name was set to " + userDialogs.getUsername() + " and rounds number was set to " + userDialogs.getRoundCount());
        userDialogs.rulesExplainer();
        WinCalculator winCalculator = new WinCalculator();
        winCalculator.gameMechanics(userDialogs.getRoundCount());
    }
}

