# Fundamentos da Linguagem Java

- Comentários
- Variáveis e Constantes
- Desafio Variáveis e Constantes
- Inferência de Tipos
- Tipos Primitivos
- Notação Ponto
- Tipo String
- Objeto vs Primitivo
- Wrappers
- Conversão de Tipos Primitivos
- Conversão Número -> String
- Conversão String -> Número
- Operadores
- Operadores Aritméticos
- Operadores Lógicos 
- Operadores Lógicos 
- Desafio Operadores Lógicos
- Operadores Relacionais
- Operadores Atribuição
- Operadores Unários
- Operador Ternário
- Igualdade com Strings

Exemplos: [Fundamentos](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/fundamentos).
Exemplos: [ Operadores ](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/operadores).

# Estruturas de Controle

- Estruturas de controle de decisão são instruções em linguagem Java que permitem que blocos específicos de código sejam escolhidos para serem executados, redirecionando determinadas partes do fluxo do programa.

- Usar estruturas de controle de decisão (if e switch) que permitem a seleção de partes
específicas do código para execução

- Usar estruturas de controle de repetição (while, do-while e for) que permitem a
repetição da execução de partes específicas do código

- Usar declarações de interrupção (break, continue e return) que permitem o redirecionamento do fluxo do programa

Exemplos: [ Estruturas de Controle ](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/estruturasDeControle).

# Estudos-java

## Array
- Os arrays ou matrizes, como são conhecidos pelo Java, fazem parte do pacote java. util na coleção da API do Java. São objetos de recipientes que contém um número fixo de valores de um único tipo. ... Cada item em um array é chamado de elemento, e cada elemento é acessado pelo número, o índice.

- Introdução
- Acessando elementos de array
- Alterando elementos de array
- Obtendo tamanho de array

Exemplos: [Array](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/array).


## Collection
- Uma coleção é uma estrutura de dados que permite armazenar vários objetos. Em Java , a coleção também é um objeto.

###### Collection 
- está no topo da hierarquia. Não existe implementação direta dessa interface, mas ela define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;

###### Set 
- interface que define uma coleção que não permite elementos duplicados. A interface SortedSet, que estende Set, possibilita a classificação natural dos elementos, tal como a ordem alfabética;

###### List 
- define uma coleção ordenada, podendo conter elementos duplicados. Em geral, o usuário tem controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices. Prefira esta interface quando precisar de acesso aleatório, através do índice do elemento;

###### Queue 
- um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, definida pela implementação de Comparable ou Comparator, determina essa prioridade. Com a interface fila pode-se criar filas e pilhas;

###### Map 
- mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. SortedMap é uma interface que estende Map, e permite classificação ascendente das chaves. Uma aplicação dessa interface é a classe Properties, que é usada para persistir propriedades/configurações de um sistema, por exemplo.

Exemplos: [Collection](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/colecoes).

# Estudos-java OO

## Composição
- É instanciar, ou usar, uma classe/objeto em outra(o). É como se elas se comunicassem, trocassem informações. Ou seja, serve para reutilizar dados, sem ter que criar mais código pra isso.
Simplesmente passamos a informação - na forma de Objeto - para outro Objeto, e este se encarrega de obter os dados e como trabalhar em cima dele.

- Costuma-se dizer que composição é o ato de delegar trabalho para outro objeto.
Isso deixa seu código mais elegante, menor e mais seguro.

- Relacionamento um pra um.
- Relacionamento um pra muitos.
- Relacionamento muitos pra muitos.

Exemplos: [Composição](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/oo/composicao).

## Herança
- A herança é um princípio da POO que permite a criação de novas classes a partir de outras previamente criadas. Essas novas classes são chamadas de subclasses, ou classes derivadas; e as classes já existentes, que deram origem às subclasses, são chamadas de superclasses, ou classes base. Deste modo é possível criar uma hierarquia dessas classes, tornando, assim, classes mais amplas e classes mais específicas. Uma subclasse herda métodos e atributos de sua superclasse; apesar disso, pode escrevê-los novamente para uma forma mais específica de representar o comportamento do método herdado.

- Exemplo da sobrescrita de método.
- Testando a chamada super.

Exemplos: [Herança](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/oo/heranca).



