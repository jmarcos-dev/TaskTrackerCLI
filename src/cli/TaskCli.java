package cli;

import model.Status;
import model.Task;
import model.TaskManager;

import java.util.Scanner;


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

    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (true) {
            System.out.println("|------------------------------|");
            System.out.println("|          Welcome to           |");
            System.out.println("|       Task Tracker CLI       |");
            System.out.println("|------------------------------|");
            System.out.println("|                              |");
            System.out.println("|------------------------------|");
            System.out.println("| Manual:                      |");
            System.out.println("| 1 - Para criar tarefa        |");
            System.out.println("| 2 - Para remover uma tarefa  |");
            System.out.println("| 3 - Lista tarefas            |");
            System.out.println("| 4 - Buscar tarefa por id     |");
            System.out.println("| 5 - Alterar status da tarefa |");
            System.out.println("| 6 - Alterar tarefa           |");
            System.out.println("| 7 - Listar por Status        |");
            System.out.println("| 8 - Encerra o programa       |");
            System.out.println("|------------------------------|");
            System.out.println();
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1: {
                    System.out.println("Para criar tarefa você precisa definir:");
                    System.out.println("1 - Nome e 2 - Descrição");
                    String taskName = sc.nextLine();
                    String taskDescription = sc.nextLine();
                    manager.adicionarTarefa(taskName, taskDescription);
                    break;
                }
                case 2: {
                    System.out.println("Para remover tarefa você precisa: ");
                    System.out.println("1 - Id da tarefa");
                    int taskId = sc.nextInt();
                    manager.removerTarefa(taskId);
                    break;
                }
                case 3:
                    mostrarTarefas();
                    break;
                case 4: {
                    int taskId = sc.nextInt();
                    manager.buscarTarefaPorId(taskId);
                    break;
                }
                case 5: {
                    int taskId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o status (TODO, IN_PROGRESS, DONE):");
                    String textoStatus = sc.nextLine();
                    Status status = Status.valueOf(textoStatus.toUpperCase());
                    manager.alterarStatusTarefa(taskId, status);
                    break;
                }
                case 6: {
                    int taskId = sc.nextInt();
                    String taskDescription = sc.nextLine();
                    manager.alterarTarefa(taskId, taskDescription);
                    break;

                }
                case 7:
                    manager.listarTarefa();
                    break;
                case 8:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }

    }

}
