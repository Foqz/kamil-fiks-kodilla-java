package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing if program works without numbers");
        //Then
        Assert.assertEquals(new ArrayList<>(), result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(30);
        oddNumbersExterminator.exterminate(numbers);
        ArrayList<Integer> result = oddNumbersExterminator.oddNumbers;
        ArrayList<Integer> testingList = new ArrayList<>();
        testingList.add(6);
        testingList.add(30);
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(testingList,result);
    }
}
