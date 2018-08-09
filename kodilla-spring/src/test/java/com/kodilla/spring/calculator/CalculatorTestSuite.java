package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(4.0,4.0);
        double sub = calculator.sub(10.0,5.0);
        double mul = calculator .mul(4.0,4.0);
        double div = calculator.div(25.0,5.0);
        //Then
        Assert.assertEquals(8.0,sum,0.0);
        Assert.assertEquals(5.0,sub,0.0);
        Assert.assertEquals(16.0,mul,0.0);
        Assert.assertEquals(5.0,div,0.0);
    }
}
