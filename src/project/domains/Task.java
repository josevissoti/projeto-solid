package project.domains;

import project.repositories.MarkTaskInterface;
import project.repositories.PrintTaskInterface;

/*
    Single Responsibility Principle
    - Classe possui uma responsabilidade única de representar a Entidade Task e seus métodos base

    Open/Closed Principle
    - Classe Entidade Task possui ambas as funcionalidades e características finalizadas
    - Clase já utilizada por outras classes, como a TaskPrinter e Task Manager, podendo causar problemas de compatibilidade caso modificada
    - Classe aberta para extensão caso tenha necessidade de novas funcionalidades específicas em classes distintas, evitando problemas no uso por outras Classes
*/
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

    /*
        Single Responsibility Principle
        - Metodo com a responsabilidade unica de alterar o status dos objetos de Task

        Interface Segregation Principle
        - Implementação do metodo da interface MarkTaskInterface
        - Sem necessidade de implementar métodos desnecessários

        Liskov Substitution Principle
        - A Classe Task define um contrato com a MarkTaskInterface
        - O metodo implementado segue as regras do princípio de Liskov
        - Não possui pré ou poós condições adicionais
        - Não quebra o código ao ser realizado a substituição
    */
    @Override
    public void markTaskAsDone() {
        this.status = true;
    }

    /*
        Single Responsibility Principle
        - Metodo com a responsabilidade unica de imprimir para o usuário os objetos de Task

        Interface Segregation Principle
        - Implementação do metodo da interface PrintTaskInterface
        - Sem necessidade de implementar métodos desnecessários

        Liskov Substitution Principle
        - A Classe Task define um contrato com a PrintTaskInterface
        - O metodo implementado segue as regras do princípio de Liskov
        - Não possui pré ou poós condições adicionais
        - Não quebra o código ao ser realizado a substituição
    */
    @Override
    public void print() {
        System.out.println("[" + (status ? "X" : " ") + "] " + description + " (Prioridade: " + priority + ")");
    }

}
