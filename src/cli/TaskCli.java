package cli;

import model.Task;
import model.TaskManager;
import java.util.*;

public class TaskCli {
    private TaskManager manager;

    public TaskCli(TaskManager manager) {
        this.manager = manager;
    }

    public void mostrarTarefas() {
        List<Task> tarefas = manager.listarTarefa();
        for (Task f : tarefas) {
            System.out.println(f);
        }
    }
}
