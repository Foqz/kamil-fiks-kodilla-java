package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        int sum = IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .sum();
        double average = sum/numbers.length;
        return average;
    }
}
