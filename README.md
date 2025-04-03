# Projeto Task Manager
- José Pedro Vissoti
- Enzo Barbosa Dourado de Almeida

### Single Responsibility Principle
<p>Principio que define que uma classe deve ter apenas um único motivo para mudar, ou seja, deve possuir apenas uma única responsabilidade individual e, por consequência, apenas um único motivo para mudar.</p>

<p>Esse conceito é aplicado durante o projeto na implementação das Classes Task, TaskManager e TaskPrinter, pois elas são divididas de acordo com a unção única que devem desenvolver. A Classe que representa a Entidade Task fornece a base de criação de objetos dessa Entidade e os métodos base para a sua manipulação, além do método de imprimir um respectivo objeto com seus atributos demonstrados e o método de alterar o status de conclusão de cada tarefa cadastrada.</p>

<p>Ademais, a classe TaskPrinter é responsável por exibir a impressão das Tasks para o usuário via console, sendo responsável por métodos que executam essa tarefa, nesse caso, contendo apenas o método <i>printTasks()</i>, que possui a responsabilidade única de imprimir um agrupamento de Tasks. A Classe TaskManager, por sua vez, é responsável unicamente por métodos que envolvem o controle e gerenciamento da Classe Task, possuindo em seu interior os métodos <i>addNewTask()</i>, responsável por adicionar novas Tasks em um agrupamento, <i>getAllTasks()</i>, responsável por retornar um agrupamento de Tasks para o local onde o método foi chamado previamente, e <i>filterTaskByPriority()</i>, também responsável por retornar um agrupamento de Tasks para o local onde o método foi chamado previamente, porém retornando esse resultado com um filtro em quais tarefas podem ser exibidas para o usuário, sendo que todos esses métodos possuem funcionalidades únicas e apenas um motivo para mudar.</p>

### Open/Closed Principle
<p>O princípio do Open/Closed define que as classes devem estar abertas para extensão, porém fechadas para modificação. Essa prática é utilizada para evitar problemas de conflito em classes finalizadas que interagem com outras classes, possibilitando a extensão de suas funcionalidades para uma outra classe quando necessários modificações específicas.</p>

<p>Esse conceito é aplicado no projeto nas Classes Task, TaskManager e TaskPrinter, além das Interfaces MarkTaskInterface, PrintTaskInterface e TasksPrinterInterface. Esse conceuto é aplicado pois essas Classes e Interfaces estão devidamente finalizadas no estado atual do projeto, além de se encontrarem abertas para possíveis extensões por outras classes, evitando assim erros de conflito em modificações futuras.</p>

### Liskov Substitution Principle

<p>Esse princípio define regras que devem ser seguidas no uso de superclasses e subclasses, com o intuito de evitar uma possível quebra de código em seu uso, principalmente se tratando da compatibilidade entre elas durante a substituição. Essa substituição não deve alterar os comportamentos esperados, tornando possível utilizar um objeto da subclasse no lugar da superclasse sem a necessidade de verificar seu tipo ou modificar o código existente, evitando assim possíveis erros inesperados.</p>

<p>Tal conceito tem seu uso na Classe Task, que implementa os métodos <i>markTaskAsDone()</i> e <i>print</i> das Interfaces MarkTaskInterface e PrintTaskInterface, respectivamente, obedecendo as regras previamente propostas pelo Princípio de Liskov sem a possibilidade de quebrar o código na substituição desses métodos.</p>

<p>Semelhantemente, a Classe TaskPrinter exerce o mesmo princípio na implementação do método <i>printTasks()</i>, da Interface TasksPrinterInterface, obedecendo as mesmas regras e permitindo a substituição de métodos sem que erros inesperados ocorram.</p>

### Interface Segregation Principle

<p>O princípio descrito cita que Classes que implementam Interfaces não devem ser obrigadas a implementar métodos desnecessários que não serão utilizados. Assim, é recomendado dividir as funcionalidades descritas em cada Interface, de acordo com o contexto no qual elas se encontram, para atender as Classes que podem implementa-las posteriormente de forma condizente e sem funcionalidades desnecessárias.</p>

<p>Isso ocorre na implementação da Inteface MarkTaskInterface, que possui apenas o método <i>markTaskAsDone()</i>, utilizado pela Classe Task sem envolver o uso de funcionalidades desnecessárias.</p>

<p>Esse princípio também é aplicado na Interface PrintTaskInterface, possuindo o método <i>print()</i>, funcionalidade implementada na Entidade Task.
O mesmo ocorre na Interface TasksPrinterInterface, apenas com o método <i>printTasks()</i>, implementado pela ClasseTaskPrinter, novamente sem a necessidade de possuir funcionalidades sem uso.</p>

### Dependence Inversion Principle


