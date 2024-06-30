package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{
    String taskName;
    String color;
    String whatToPaint;
    Boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public void executeTask(){
        System.out.println("Processing - " + taskName + ", " + color + ", " + whatToPaint);
        isExecuted = true;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public Boolean isTaskExecuted() {
        return isExecuted;
    }
}
