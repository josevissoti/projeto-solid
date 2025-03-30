package project.repositories;

import project.domains.Task;

import java.util.List;

public interface TaskPrinterInterface {
    void printTasks(List<Task> tasks);
}
