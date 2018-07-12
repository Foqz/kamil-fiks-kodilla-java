package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> oddNumbers = new ArrayList<>();
    public ArrayList exterminate(ArrayList<Integer> numbers){
        for (int n = 0; n < numbers.size(); n++){
            Integer a = numbers.get(n);
            if(a % 2 == 0){
                oddNumbers.add(a);
            }
        }
        return oddNumbers;
    }
}
