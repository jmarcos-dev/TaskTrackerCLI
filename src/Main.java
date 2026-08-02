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

        manager.removerTarefa(1);

        cli.mostrarTarefas();

        manager.listarTarefaPorId(2);
    }
}