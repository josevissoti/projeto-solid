package project.services;

import project.domains.Task;
import project.repositories.TaskPrinterInterface;

import java.util.List;

public class TaskPrinter implements TaskPrinterInterface {
    @Override
    public void printTasks(List<Task> tasks) {
        for (Task task : tasks) {
            task.print();
        }
    }
}
