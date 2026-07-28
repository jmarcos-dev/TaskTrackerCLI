package model;

public class Task {

    private String taskName;
    private String taskDescription;
    private int taskId;
    private Status taskStatus;

    Task(String taskName, int taskId, String taskDescription) {
        setTaskName(taskName);
        this.taskId = taskId;
        setTaskDescription(taskDescription);
        this.taskStatus = Status.TODO;
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
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

}
