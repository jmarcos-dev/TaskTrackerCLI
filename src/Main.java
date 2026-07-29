import model.TaskManager;
import model.Task;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Task t = manager.adicionarTarefa("Estudar Java", "Revisar coleções");
        Task t2 = manager.adicionarTarefa("Estudar C++", "Revisar POO");

        System.out.println(t);
    }
}