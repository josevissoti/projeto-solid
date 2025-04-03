package project.services;

import project.domains.Task;
import project.repositories.TasksPrinterInterface;

import java.util.List;

/*
    Single Responsibility Principle
    - Classe possui a unica responsabilidade de manipular métodos relacionados a impressão de Tasks
    - Assim, a Classe tem apenas um motivo para mudar, somente quando modificações envolvendo a exibição de objetos do tipo Task forem necessárias

    Open/Closed Principle
    - Classe de Serviço TaskPrinter com suas funcionalidades e caracteristicas finalizadas
    - Classe aberta para extensão caso tenha necessidade de novas funcionalidades específicas, evitando problemas no uso por outras Classes
*/

public class TaskPrinter implements TasksPrinterInterface {
    /*
        Single Responsibility Principle
        - Metodo possui responsabilidade única em imprimir apenas Listas de Tasks

        Interface Segregation Principle
        - Implementação do metodo da interface TasksPrinterInterface
        - Sem necessidade de implementar métodos desnecessários

        Liskov Substitution Principle
        - A Classe TaskPrinter define um contrato com a TasksPrinterInterface
        - O metodo implementado segue as regras do princípio de Liskov
        - Os parâmetros utilizados no métodos são identicos a sua SuperClasse
        - Não possui pré ou poós condições adicionais
        - Não quebra o código ao ser realizado a substituição
    */
    @Override
    public void printTasks(List<Task> tasks) {
        for (Task task : tasks) {
            task.print();
        }
    }
}
