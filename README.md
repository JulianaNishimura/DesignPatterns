## 1. Factory Method
**Definição**: Define uma interface para criar um objeto, mas permite que as subclasses decidam qual classe instanciar.  
**Quando usar**: Quando a criação de um objeto depende de um processo ou contexto e você quer delegar a criação do objeto para uma classe especializada sem expor a lógica de criação.

## 2. Abstract Factory
**Definição**: Fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas.  
**Quando usar**: Quando você tem várias famílias de produtos e quer garantir que as classes da mesma família sejam usadas em conjunto, sem especificar suas classes concretas.

## 3. Builder
**Definição**: Separa a construção de um objeto complexo de sua representação, permitindo a criação de diferentes representações do mesmo tipo de objeto.  
**Quando usar**: Quando você precisa construir um objeto complexo passo a passo, e a construção pode variar dependendo do contexto (exemplo: construção de uma refeição, carro, etc.).

## 4. Prototype
**Definição**: Cria novos objetos copiando um objeto existente, em vez de criar um novo a partir do zero.  
**Quando usar**: Quando a criação de um objeto é cara ou complexa e você pode criar novos objetos copiando um protótipo existente.

## 5. Adapter
**Definição**: Converte a interface de uma classe em outra interface que os clientes esperam.  
**Quando usar**: Quando você precisa integrar classes que não são compatíveis, ou quando quer que uma classe se adapte a uma interface diferente sem modificar a classe original.

## 6. Bridge
**Definição**: Separa a abstração de sua implementação, permitindo que ambos possam ser alterados independentemente.  
**Quando usar**: Quando você quer variar as abstrações e suas implementações sem criar uma grande quantidade de classes combinando todas as possibilidades.

## 7. Composite
**Definição**: Compoe objetos em estruturas de árvore para representar hierarquias parte-todo.  
**Quando usar**: Quando você quer tratar objetos individuais e composições de objetos de maneira uniforme (exemplo: diretórios e arquivos em um sistema de arquivos).

## 8. Decorator
**Definição**: Anexa responsabilidades adicionais a um objeto dinamicamente, sem alterar sua estrutura.  
**Quando usar**: Quando você precisa adicionar funcionalidades a um objeto de forma flexível, sem modificar seu código (exemplo: adicionar comportamentos a um objeto de forma modular).

## 9. Facade
**Definição**: Fornece uma interface simplificada para um subsistema complexo, ocultando os detalhes internos.  
**Quando usar**: Quando você quer fornecer uma interface mais simples para um conjunto complexo de subsistemas, ou quando quer ocultar a complexidade interna de um sistema.

## 10. Flyweight
**Definição**: Usa compartilhamento para suportar grandes quantidades de objetos de forma eficiente em termos de memória.  
**Quando usar**: Quando você tem um grande número de objetos semelhantes, mas quer otimizar o uso de memória (exemplo: caracteres em um editor de texto).

## 11. Proxy
**Definição**: Fornece um objeto substituto que controla o acesso a outro objeto.  
**Quando usar**: Quando você precisa de um controle adicional sobre o acesso a um objeto, como carregamento preguiçoso, controle de acesso ou segurança.

## 12. Chain of Responsibility
**Definição**: Permite que múltiplos objetos manipulem uma solicitação sem saber qual objeto a manipulará efetivamente.  
**Quando usar**: Quando você tem uma série de manipuladores que podem processar uma solicitação, mas não sabe exatamente qual será o responsável.

## 13. Command
**Definição**: Encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações.  
**Quando usar**: Quando você precisa desacoplar o remetente de um pedido e o receptor da solicitação (exemplo: sistemas de undo/redo ou filas de comandos).

## 14. Iterator
**Definição**: Fornece uma maneira sequencial de acessar os elementos de um objeto agregado, sem expor sua representação interna.  
**Quando usar**: Quando você deseja acessar elementos de uma coleção de forma sequencial, sem expor sua implementação interna.

## 15. Mediator
**Definição**: Define um objeto que encapsula como um conjunto de objetos interage, promovendo o desacoplamento entre eles.  
**Quando usar**: Quando você tem múltiplos objetos que precisam interagir, mas quer evitar a dependência direta entre eles, centralizando a comunicação.

## 16. Memento
**Definição**: Captura e externaliza o estado interno de um objeto sem violar o encapsulamento, permitindo que o objeto seja restaurado a esse estado mais tarde.  
**Quando usar**: Quando você precisa salvar e restaurar o estado de um objeto (exemplo: operações de undo/redo).

## 17. Observer
**Definição**: Define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados.  
**Quando usar**: Quando você tem um modelo de dados e precisa que várias outras partes do sistema sejam notificadas quando ele mudar (exemplo: eventos, UI e notificação de mudanças de estado).

## 18. State
**Definição**: Permite que um objeto altere seu comportamento quando seu estado interno muda, parecendo que o objeto mudou de classe.  
**Quando usar**: Quando o comportamento de um objeto depende de seu estado interno e você quer evitar o uso de múltiplos `if` ou `switch` em seu código.

## 19. Strategy
**Definição**: Define uma família de algoritmos, encapsula cada um e os torna intercambiáveis.  
**Quando usar**: Quando você tem uma série de algoritmos (ou comportamentos) que podem ser aplicados de forma intercambiável, e deseja escolher qual usar em tempo de execução.

## 20. Template Method
**Definição**: Define o esqueleto de um algoritmo em um método, deixando alguns passos para que as subclasses implementem.  
**Quando usar**: Quando você tem um algoritmo geral que pode ser personalizado por subclasses para algumas etapas específicas, sem alterar o fluxo geral.

## 21. Visitor
**Definição**: Permite adicionar novas operações a objetos de uma estrutura sem modificar as classes dos objetos.  
**Quando usar**: Quando você precisa realizar operações sobre objetos de uma estrutura de objetos (como uma árvore de objetos) e quer evitar modificar as classes dos objetos.

## 22. Interpreter
**Definição**: O padrão Interpreter define uma gramática para uma linguagem e fornece um interpretador para avaliar sentenças nessa linguagem.
**Quando usar**: Quando você precisa interpretar sentenças em uma linguagem específica, como expressões matemáticas, consultas simples ou regras de negócio.
---

## Resumo

- Use **Factory**, **Abstract Factory**, **Builder** e **Prototype** quando precisar controlar a criação de objetos de maneira flexível.
- Use **Adapter**, **Bridge**, **Composite**, **Decorator**, **Facade**, **Flyweight** e **Proxy** para estruturar e otimizar a interação entre objetos ou suas representações.
- Use **Chain of Responsibility**, **Command**, **Iterator**, **Mediator**, **Memento**, **Observer**, **State**, **Strategy**, **Template Method** e **Visitor** para definir comportamentos e interações entre objetos em diferentes cenários de fluxo de controle ou eventos.
