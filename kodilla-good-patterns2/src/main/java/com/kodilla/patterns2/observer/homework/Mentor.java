package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.StudentTask;
import com.kodilla.patterns2.observer.homework.Observer;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudentTask studentTask) {
        System.out.println(username + ": New task in topic " + studentTask.getName() + "\n" +
                " (total: " + studentTask.getTasks().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}