
## DIO - ContaBanco

Este projeto faz parte do desafio de Java da DIO, do projeto [DesafioControleFluxo](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo).


## Estrutura do Projeto

Neste projeto, é solicitado:

- Nome do projeto: `ControleFluxo`
- Nome das classes:
  - `Contador`
  - `ParametrosInvalidosException`
- Input via terminal dos seguintes dados:

    | Atributo       | Tipo    | Exemplo |
    | -------------- | ------- | ------- |
    | Primeiro Número | Inteiro | 12      |
    | Segundo Número  | Inteiro | 30      |

- O sistema deve executar a seguinte lógica:
  - Se o segundo número for maior que o primeiro, o sistema deve imprimir uma sequência de números incrementais de 1 até a diferença entre os dois números.
  - Se o primeiro número for maior que o segundo, o sistema deve lançar uma exceção customizada chamada `ParametrosInvalidosException` com a mensagem: "The second parameter must be greater than the first".

```
├── src
│   ├── module-info.java
│   └── Contador
│       ├── Contador.java
│       └── ParametrosInvalidosException.java
│
└── .settings (Eclipse)
```