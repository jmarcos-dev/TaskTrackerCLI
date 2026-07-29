import model.TaskManager;
import model.Task;
import cli.TaskCli;              // ← faltando

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.adicionarTarefa("Estudar Java", "Revisar coleções");
        manager.adicionarTarefa("Estudar C++", "Revisar POO");

        TaskCli cli = new TaskCli(manager);   // ← injeta o manager
        cli.mostrarTarefas();                 // ← a CLI apresenta
    }
}