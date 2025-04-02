package project.repositories;

/*
    Open/Closed Principle
    - Interface PrintTask com as funcionalidades abstratas finalizadas
    - Por já estar sendo utilizada por outras Classes, pode exigir que elas implementm métodos desnecessários caso modificada
    - Portanto, a Interface é aberta para extensão caso tenha necessidade de novos métodos abstratos específicos

    Interface Segregation Principle
    - Interface com métodos relacionados a exibição de interfaces de texto para cada tarefa
*/
public interface PrintTaskInterface{
    //Metodo abstrato de imprimir as informações da tarefa
    void print();
}
