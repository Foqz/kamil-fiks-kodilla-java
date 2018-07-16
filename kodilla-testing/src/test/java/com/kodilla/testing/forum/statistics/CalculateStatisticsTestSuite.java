package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateStatisticsWithMock1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        ArrayList<String> resultList = new ArrayList<>();
        resultList.add("Adam");
        resultList.add("Stefan");
        resultList.add("Jarek");
        when(statisticsMock.usersNames()).thenReturn(resultList);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int testAverageUserPost = calculateStatistics.getAverageUserPost();
        int testAverageUserComment = calculateStatistics.getAverageUserComment();
        int testAverageCommentPost = calculateStatistics.getAverageCommentPost();
        //Then
        Assert.assertEquals(0,testAverageUserPost);
        Assert.assertEquals(3,testAverageUserComment);
        Assert.assertEquals(0,testAverageCommentPost);
    }
    @Test
    public void testCalculateStatisticsWithMock2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);
        ArrayList<String> resultList = new ArrayList<>();
        resultList.add("Adam");
        resultList.add("Stefan");
        resultList.add("Jarek");
        when(statisticsMock.usersNames()).thenReturn(resultList);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int testAverageUserPost = calculateStatistics.getAverageUserPost();
        int testAverageUserComment = calculateStatistics.getAverageUserComment();
        int testAverageCommentPost = calculateStatistics.getAverageCommentPost();
        //Then
        Assert.assertEquals(333,testAverageUserPost);
        Assert.assertEquals(3,testAverageUserComment);
        Assert.assertEquals(0,testAverageCommentPost);
    }
    @Test
    public void testCalculateStatisticsWithMock3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ArrayList<String> resultList = new ArrayList<>();
        resultList.add("Adam");
        resultList.add("Stefan");
        resultList.add("Jarek");
        when(statisticsMock.usersNames()).thenReturn(resultList);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int testAverageUserPost = calculateStatistics.getAverageUserPost();
        int testAverageUserComment = calculateStatistics.getAverageUserComment();
        int testAverageCommentPost = calculateStatistics.getAverageCommentPost();
        //Then
        Assert.assertEquals(3,testAverageUserPost);
        Assert.assertEquals(0,testAverageUserComment);
        Assert.assertEquals(0,testAverageCommentPost);
    }
    @Test
    public void testCalculateStatisticsWithMock4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(6);
        ArrayList<String> resultList = new ArrayList<>();
        resultList.add("Adam");
        resultList.add("Stefan");
        resultList.add("Jarek");
        when(statisticsMock.usersNames()).thenReturn(resultList);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int testAverageUserPost = calculateStatistics.getAverageUserPost();
        int testAverageUserComment = calculateStatistics.getAverageUserComment();
        int testAverageCommentPost = calculateStatistics.getAverageCommentPost();
        //Then
        Assert.assertEquals(6,testAverageUserPost);
        Assert.assertEquals(2,testAverageUserComment);
        Assert.assertEquals(0,testAverageCommentPost);
    }
    @Test
    public void testCalculateStatisticsWithMock5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(9);
        when(statisticsMock.commentsCount()).thenReturn(20);
        ArrayList<String> resultList = new ArrayList<>();
        resultList.add("Adam");
        resultList.add("Stefan");
        resultList.add("Jarek");
        when(statisticsMock.usersNames()).thenReturn(resultList);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int testAverageUserPost = calculateStatistics.getAverageUserPost();
        int testAverageUserComment = calculateStatistics.getAverageUserComment();
        int testAverageCommentPost = calculateStatistics.getAverageCommentPost();
        //Then
        Assert.assertEquals(3,testAverageUserPost);
        Assert.assertEquals(6,testAverageUserComment);
        Assert.assertEquals(2,testAverageCommentPost);
    }
    @Test
    public void testCalculateStatisticsWithMock6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(30);
        ArrayList<String> resultList = null;
        when(statisticsMock.usersNames()).thenReturn(resultList);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int testAverageUserPost = calculateStatistics.getAverageUserPost();
        int testAverageUserComment = calculateStatistics.getAverageUserComment();
        int testAverageCommentPost = calculateStatistics.getAverageCommentPost();
        //Then
        Assert.assertEquals(0,testAverageUserPost);
        Assert.assertEquals(0,testAverageUserComment);
        Assert.assertEquals(0,testAverageCommentPost);
    }
    @Test
    public void testCalculateStatisticsWithMock7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(3000);
        ArrayList<String> resultList = new ArrayList<>();
        int n = 0;
        while (n < 100) {
            resultList.add("User");
            n ++;
        }
        when(statisticsMock.usersNames()).thenReturn(resultList);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int testAverageUserPost = calculateStatistics.getAverageUserPost();
        int testAverageUserComment = calculateStatistics.getAverageUserComment();
        int testAverageCommentPost = calculateStatistics.getAverageCommentPost();
        //Then
        Assert.assertEquals(10,testAverageUserPost);
        Assert.assertEquals(30,testAverageUserComment);
        Assert.assertEquals(3,testAverageCommentPost);
    }
}
