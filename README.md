# dio-design-patterns

Este projeto contém implementações de alguns padrões de projeto em Java.

## Padrões de Projeto Implementados

### Facade

O padrão de projeto Facade é utilizado para fornecer uma interface simplificada para um sistema complexo, composto por várias classes e subsistemas. Ele permite que os clientes interajam com o sistema de forma mais simples, encapsulando a complexidade interna.

#### Exemplo de Uso:

```java
// Exemplo de uso do Facade
Facade facade = new Facade();
facade.migrarCliente("Adriano", "999999999");
```

### Singleton

O padrão de projeto Singleton é utilizado para garantir que uma classe tenha apenas uma instância e forneça um ponto global de acesso a essa instância.

#### Implementações Disponíveis:

- Singleton "Eager"
- Singleton "Lazy"
- Singleton "Lazy Holder"

#### Exemplo de Uso:

```java
// Exemplo de uso dos Singletons
SingletonLazy lazy = SingletonLazy.getInstance();
SingletonEager eager = SingletonEager.getInstance();
SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstance();
```

### Strategy

O padrão de projeto Strategy é utilizado para definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Isso permite que o algoritmo seja selecionado dinamicamente durante a execução do programa.

#### Exemplo de Uso:

```java
// Exemplo de uso do Strategy
Comportamento normal = new ComportamentoNormal();
Comportamento defensivo = new ComportamentoDefensivo();
Comportamento agressivo = new ComportamentoAgressivo();

Robo robo = new Robo();
robo.setComportamento(normal);
robo.mover();
robo.setComportamento(defensivo);
robo.mover();
robo.setComportamento(agressivo);
robo.mover();
```
