package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> oddNumbers = new ArrayList<>();
    ArrayList<Integer> numbers = new ArrayList<>();
    public void numbersMaker() {
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(15);
    }
    public ArrayList exterminate(ArrayList<Integer> numbers){

        for (int n = 0; n < 4; n++){
            Integer a = numbers.get(n);
            if(a % 2 == 0){
                oddNumbers.add(a);
            }
        }
        return oddNumbers;
    }
}
