import model.Status;
import model.TaskManager;
import model.Task;
import cli.TaskCli;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.adicionarTarefa("Estudar Java", "Revisar coleções");
        manager.adicionarTarefa("Estudar C++", "Revisar POO");

        TaskCli cli = new TaskCli(manager);

        cli.mostrarTarefas();


        manager.buscarTarefaPorId(2);

        manager.alterarStatusTarefa(1, Status.IN_PROGRESS);

        manager.listarPorStatus(Status.IN_PROGRESS);

        cli.mostrarTarefas();
    }

}