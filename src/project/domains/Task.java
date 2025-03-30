package project.domains;

import project.repositories.MarkTaskInterface;
import project.repositories.PrintTaskInterface;

public class Task implements MarkTaskInterface, PrintTaskInterface {
    private String description;
    private String priority;
    private boolean status;

    public Task(String description, String priority) {
        this.description = description;
        this.priority = priority;
        this.status = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public void markTaskAsDone() {
        this.status = true;
    }

    @Override
    public boolean isDone() {
        return this.status;
    }

    @Override
    public void print() {
        System.out.println("[" + (status ? "X" : " ") + "] " + description + " (Prioridade: " + priority + ")");
    }

}
