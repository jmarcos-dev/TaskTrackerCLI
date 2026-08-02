import model.Status;
import model.TaskManager;
import model.Task;
import cli.TaskCli;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        TaskCli cli = new TaskCli(manager);
        cli.menu();
    }

}