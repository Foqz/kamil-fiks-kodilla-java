package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.numbers;
        System.out.println("Testing if program works without numbers");
        //Then
        Assert.assertEquals(new ArrayList<>(), result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        oddNumbersExterminator.numbersMaker();
        oddNumbersExterminator.exterminate(oddNumbersExterminator.numbers);
        ArrayList<Integer> result = oddNumbersExterminator.oddNumbers;
        ArrayList<Integer> testingList = new ArrayList<>();
        testingList.add(2);
        testingList.add(6);
        System.out.println("Testing list");
        //Then
        Assert.assertEquals(testingList,result);
    }
}
