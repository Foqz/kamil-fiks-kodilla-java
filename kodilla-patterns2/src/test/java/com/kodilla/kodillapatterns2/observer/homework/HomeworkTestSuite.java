package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate(){
        //Given
        UserTaskQueue studentKamil = new StudentKamil();
        UserTaskQueue studentGosia = new StudentGosia();
        Mentor andrzej = new Mentor("Andrzej");
        Mentor pawel = new Mentor("Pawel");
        studentKamil.registerObserver(andrzej);
        studentGosia.registerObserver(pawel);
        studentGosia.registerObserver(andrzej);
        //When
        studentKamil.addTaskToQueue("Task1");
        studentKamil.addTaskToQueue("Task2");
        studentGosia.addTaskToQueue("Task3");
        //Then
        assertEquals(3,andrzej.getUpdateCount());
        assertEquals(1,pawel.getUpdateCount());
    }
}
