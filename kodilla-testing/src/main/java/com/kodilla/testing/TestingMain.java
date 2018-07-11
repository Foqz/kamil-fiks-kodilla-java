package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        //testing SimpleUser Class
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        // testing Calculator class
        Calculator calculator = new Calculator(300, 200);
        calculator.add();
        calculator.substract();
        int cTest = calculator.getC();
        int dTest = calculator.getD();

        if (cTest == 500) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
        if (dTest == 100) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
    }
}