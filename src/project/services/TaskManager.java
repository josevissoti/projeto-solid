package project.services;


import project.domains.Task;

import java.util.ArrayList;
import java.util.List;

/*
    Single Responsibility Principle
    - Classe possui a unica responsabilidade prover métodos que gerenciam o controle de tarefas
    - Assim, a Classe tem apenas um motivo para mudar, somente quando modificações envolvendo o gerenciamente de objetos do tipo Task forem necessárias

    Open/Closed Principle
    - Classe de Serviço TaskManager com suas funcionalidades e características finalizadas
    - Classe aberta para extensão caso tenha necessidade de novas funcionalidades específicas, evitando problemas no uso por outras Classes
*/
public class TaskManager {

    private List<Task> tasks = new ArrayList<>();

    /*
        Single Responsibility Principle
        - Metodo responsavel unicamente por realizar a adição novas Tasks em agrupamentos de Tasks
    */
    public void addNewTask(Task task) {
        tasks.add(task);
    }

    /*
        Single Responsibility Principle
        - Metodo responsavel unicamente por retornar um agrupamento de objetos do tipo Task
    */
    public List<Task> getAllTasks() {
        return tasks;
    }

    /*
        Single Responsibility Principle
        - Metodo responsavel unicamente por retornar um agrupamento de objetos do tipo Task com a aplicação de um filtro de acordo com a prioridade definida nos objetos
    */
    public List<Task> filterTaskByPriority(String priority) {
        List<Task> filterList = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getPriority().equalsIgnoreCase(priority)) {
                filterList.add(task);
            }
        }
        return filterList;
    }
}
