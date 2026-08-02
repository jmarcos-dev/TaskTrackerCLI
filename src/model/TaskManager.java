package model;

import java.util.*;
import java.util.stream.Collectors;

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


    public Task buscarTarefaPorId(int taskNextId) {
        for (Task t : taskList) {
            if (t.getTaskId() == taskNextId) {
                return t;
            }

        }
        return null;
    }

    public boolean alterarStatusTarefa(int id, Status novoStatus) {
        Task t = buscarTarefaPorId(id);
        if (t != null) {
            t.setTaskStatus(novoStatus);
            return true;
        }
        return false;
    }

    public boolean alterarTarefa(int id, String newDescription) {
        Task t = buscarTarefaPorId(id);
        if (t != null) {
            t.setTaskDescription(newDescription);
            return true;
        }
        return false;
    }

    public List<Task> listarPorStatus(Status status) {
        return taskList.stream().filter(t -> t.getTaskStatus() == status).collect((Collectors.toList()));
    }

}


