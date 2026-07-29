package model;

import java.time.LocalDateTime;

public class Task {

    private String taskName;
    private String taskDescription;
    private int taskId;
    private Status taskStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Task(String taskName, int taskId, String taskDescription) {
        setTaskName(taskName);
        this.taskId = taskId;
        setTaskDescription(taskDescription);
        this.taskStatus = Status.TODO;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskName(String taskName) {
        this.taskName = (taskName == null) ? "" : taskName.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = (taskDescription == null) ? "" : taskDescription.trim();
        this.updatedAt = LocalDateTime.now();
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
        this.updatedAt = LocalDateTime.now();
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    //anotação, avisa o compilador que está reescrevendo um médoto que já existe na classe mãe.
    @Override
    public String toString() {
        return "[" + taskId + "] " + taskName + "( " + taskStatus + " ) - " + taskDescription + "\n" + "Created at: " + createdAt + "\n" + "Updated at: " + updatedAt;
    }
}
