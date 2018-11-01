package com.kodilla.kodillapatterns2.decorator.pizzaportal;

import com.kodilla.kodillapatterns2.decorator.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaPortalTestSuite {
    @Test
    public void testBasicPizzaGetCost(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(15),theCost);
    }
    @Test
    public void testBasicPizzaGetDescription(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Basic pizza(cake + tomato souce)",description);
    }
    @Test
    public void testPizzaWithAllAdditionsGetCost(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ChickenDecorator(thePizza);
        thePizza = new DoubleCheeseDecorator(thePizza);
        thePizza = new AdditionalSouceDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(27),theCost);
    }
    @Test
    public void testPizzaWithAllAdditionsGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ChickenDecorator(thePizza);
        thePizza = new DoubleCheeseDecorator(thePizza);
        thePizza = new AdditionalSouceDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Basic pizza(cake + tomato souce) + chicken with double cheese + additional souce",description);
    }
}
