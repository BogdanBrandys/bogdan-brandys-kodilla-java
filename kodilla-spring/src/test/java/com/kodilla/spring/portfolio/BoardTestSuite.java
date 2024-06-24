package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
    class BoardTestSuite {

    @Test
        void testTaskAdd() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
            Board board = (Board) context.getBean("Board");
            TaskList bean1 = (TaskList) context.getBean("toDoList");
            List<String> tasks = List.of("task1", "task2", "task3");
            bean1.setTasks(tasks);
            board.setToDoList(bean1);
            //When & Then
            System.out.println(board.getToDoList().getTasks());
        }
}
