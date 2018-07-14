package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
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
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Square(1.0,2.0));
        //Then
        Assert.assertEquals(1,shapeCollector.getCollectionSize());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(1.0,2.0));
        //Then
        boolean result = shapeCollector.removeFigure(new Square(1.0,2.0));
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getCollectionSize());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(1.0,2.0));
        //When
        Shape retrievedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(new Square(1.0,2.0),retrievedFigure);
    }
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(1.0,2.0));
        //When
        String figureName = shapeCollector.showFigures();
        //Then
        Assert.assertEquals("square 2.0",figureName);
    }
}
