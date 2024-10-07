package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTaskTestSuite {
    @Test
    public void taskUpdate() {
    // Given
        StudentTask mainTask = new MainTask();
        StudentTask additionalTask = new AdditionalTask();
        Mentor johnJohnson = new Mentor("John Johnson");
        Mentor steveStevenson = new Mentor("Steve Stevenson");
        mainTask.registerObserver(johnJohnson);
        additionalTask.registerObserver(steveStevenson);
        mainTask.registerObserver(steveStevenson);
    // When
        mainTask.addTask("Create Observer interface");
        mainTask.addTask("Create Observable interface");
        mainTask.addTask("Create StudentTask class");
        mainTask.addTask("Create Mentor class");
        additionalTask.addTask("Create MainTask class extending StudentTask class");
        additionalTask.addTask("Create AdditionalTask class extending StudentTask class");
    // Then
        assertEquals(4, johnJohnson.getUpdateCount());
        assertEquals(6, steveStevenson.getUpdateCount());
    }
}
