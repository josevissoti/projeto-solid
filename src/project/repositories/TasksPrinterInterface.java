package project.repositories;

import project.domains.Task;

import java.util.List;

/*
    Open/Closed Principle
    - Interface TasksPrinter com suas funcionalidades abstratas finalizadas
    - Por já estar sendo utilizada por outras Classes, pode exigir que elas implementm métodos desnecessários caso modificada
    - Portanto, a Interface é aberta para extensão caso tenha necessidade de novos métodos abstratos específicos

    Interface Segregation Principle
    - Interface com métodos relacionados a exibição de interfaces de texto para listas de tarefas
*/
public interface TasksPrinterInterface {
    //Metodo abstrato de imprimir as informações de uma lista de tarefas
    void printTasks(List<Task> tasks);
}
