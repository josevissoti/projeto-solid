package project.repositories;

/*
    Open/Closed Principle
    - Interface MarkTask com as funcionalidades abstratas finalizadas
    - Por já estar sendo utilizada por outras Classes, pode exigir que elas implementm métodos desnecessários caso modificada
    - Portanto,a Interface é aberta para extensão caso tenha necessidade de novos métodos abstratos específicos

    Interface Segregation Principle
    - Interface com métodos relacionados a manipulação do status das tarefas
*/
public interface MarkTaskInterface {
    //Metodo abstrato para marcar uma tarefa como concluida
    void markTaskAsDone();
}
