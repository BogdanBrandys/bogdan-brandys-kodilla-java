package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    public void testCreatingTasks() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals(driving.getTaskName(), "Pizza Delivery");
        assertEquals(painting.getTaskName(), "Landscape");
        assertEquals(shopping.getTaskName(), "Grocery Shopping");
    }
    @Test
    public void testExecutingTasks() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        //testing executing task
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //not executing task
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        System.out.println("Driving task executed: " + driving.isTaskExecuted());
        System.out.println("Painting task executed: " + painting.isTaskExecuted());
    }

}
