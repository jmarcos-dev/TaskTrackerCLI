import model.TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        System.out.println("TaskTracker CLI iniciado!");
        manager.adicionarTarefa("Estudar Java", "Revisar coleções");
    }
}