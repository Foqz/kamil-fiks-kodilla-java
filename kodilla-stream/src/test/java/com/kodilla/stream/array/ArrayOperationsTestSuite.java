package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[20];
        for(int n = 0;n <20;n++){
            numbers[n] = n + 5;
        }
        //When
        double testAverage = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(14.00,testAverage,0);
    }
}
