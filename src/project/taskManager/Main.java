package project.taskManager;

import project.domains.Task;
import project.repositories.TasksPrinterInterface;
import project.services.TaskManager;
import project.services.TaskPrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        TasksPrinterInterface taskPrinterInterface = new TaskPrinter();

        do {
            System.out.println("\n----- MENU DE TAREFAS -----");
            System.out.println("Escolha a tarefa que deseja realizar:" +
                    "\n1. Criar nova tarefa" +
                    "\n2. Listar tarefas" +
                    "\n3. Concluir tarefa" +
                    "\n4. Filtrar tarefa por prioridade" +
                    "\n0. Sair");
            int taskOption = scanner.nextInt();
            scanner.nextLine();

            if (taskOption == 1) {
                System.out.println("\n----- CRIANDO TAREFA -----");
                System.out.println("Descrição da Tarefa: ");
                String taskDescription = scanner.nextLine();
                System.out.println("Prioridade da tarefa: ");
                String taskPriority = scanner.nextLine();
                taskManager.addNewTask(new Task(taskDescription, taskPriority));
            } else if (taskOption == 2) {
                System.out.println("----- LISTA DE TAREFAS -----");
                taskPrinterInterface.printTasks(taskManager.getAllTasks());
            } else if (taskOption == 3) {
                System.out.println("----- CONCLUIR TAREFAS -----");
                taskPrinterInterface.printTasks(taskManager.getAllTasks());
                System.out.print("Digite o número da tarefa concluída: ");
                int index = scanner.nextInt();
                if (index >= 0 && index < taskManager.getAllTasks().size()) {
                    taskManager.getAllTasks().get(index).markTaskAsDone();
                } else {
                    System.out.println("Número inválido");
                }
            } else if (taskOption == 4) {
                System.out.println("----- FILTRO DE TAREFAS -----");
                System.out.print("Digite a prioridade filtrada: ");
                String taskFilter = scanner.nextLine();
                taskPrinterInterface.printTasks(taskManager.filterTaskByPriority(taskFilter));
            } else if (taskOption == 0) {
                System.out.println("Encerrando serviço");
                return;
            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (true);

    }
}
