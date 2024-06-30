package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
    String taskName;
    String whatToBuy;
    double quantity;
    Boolean isExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public void executeTask(){
        System.out.println("Processing - " + taskName + ", " + whatToBuy + ", " + quantity);
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
