package com.kodilla.rps;

import org.junit.*;

public class WinCalculatorTestSuite {
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
    public void testWinCalculatorCompareMoves(){
        //Given
        //When
        RoundResult result = WinCalculator.compareMoves(UserOptions.PAPER,UserOptions.ROCK);
        System.out.println("Testing if methon CompareMoves works");
        //Then
        Assert.assertEquals(RoundResult.PLAYERWIN,result);
    }
}
