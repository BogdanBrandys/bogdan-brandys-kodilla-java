package com.kodilla.spring.portfolio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BoardConfig {

    @Bean (name = "Board")
    public Board getBoardToDo() {
        return new Board();
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }
    @Bean(name = "InProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }
    @Bean(name = "DoneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
