package model;

import java.util.*;

public class TaskManager {
    private int taskNextId;
    private List<Task> taskList;

    public TaskManager() {
        taskNextId = 1;
        taskList = new ArrayList<>();
    }

    public Task adicionarTarefa(String taskName, String taskDescription) {
        Task tarefa = new Task(taskName, taskNextId, taskDescription);
        taskList.add(tarefa);
        taskNextId++;
        return tarefa;
    }

    public void removerTarefa(int taskNextId) {
        taskList.removeIf(t -> t.getTaskId() == taskNextId);

    }

    public List<Task> listarTarefa() {
        return new ArrayList<>(taskList);
    }


    public Task listarTarefaPorId(int taskNextId) {
        for (Task t : taskList) {
            if (t.getTaskId() == taskNextId) {
                return t;
            }

        }
        return null;
    }
}


