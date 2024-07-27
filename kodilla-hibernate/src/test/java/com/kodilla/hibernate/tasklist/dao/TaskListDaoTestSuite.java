package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private String description = "List for my Kodilla course task";

    @Test
    void testTaskDaoSave() {
        //Given
        TaskList taskList = new TaskList("List1", description);

        //When
        taskListDao.save(taskList);

        //Then
        List<TaskList> readTask = taskListDao.findByListName("List1");
        assertEquals(1, readTask.size());

        //CleanUp
        taskListDao.delete(taskList);
    }

}
