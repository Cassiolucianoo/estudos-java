# Estudos-java

##Array
- Os arrays ou matrizes, como são conhecidos pelo Java, fazem parte do pacote java. util na coleção da API do Java. São objetos de recipientes que contém um número fixo de valores de um único tipo. ... Cada item em um array é chamado de elemento, e cada elemento é acessado pelo número, o índice.

- Introdução
- Acessando elementos de array
- Alterando elementos de array
- Obtendo tamanho de array

Exemplos: [Array](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/array).


##Collection
- Uma coleção é uma estrutura de dados que permite armazenar vários objetos. Em Java , a coleção também é um objeto.

######Collection 
– está no topo da hierarquia. Não existe implementação direta dessa interface, mas ela define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;

######Set 
– interface que define uma coleção que não permite elementos duplicados. A interface SortedSet, que estende Set, possibilita a classificação natural dos elementos, tal como a ordem alfabética;

######List 
– define uma coleção ordenada, podendo conter elementos duplicados. Em geral, o usuário tem controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices. Prefira esta interface quando precisar de acesso aleatório, através do índice do elemento;

######Queue 
– um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, definida pela implementação de Comparable ou Comparator, determina essa prioridade. Com a interface fila pode-se criar filas e pilhas;

######Map 
– mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. SortedMap é uma interface que estende Map, e permite classificação ascendente das chaves. Uma aplicação dessa interface é a classe Properties, que é usada para persistir propriedades/configurações de um sistema, por exemplo.

Exemplos: [Collection](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/colecoes).


# Estudos-java OO

##Composição
-É instanciar, ou usar, uma classe/objeto em outra(o). É como se elas se comunicassem, trocassem informações. Ou seja, serve para reutilizar dados, sem ter que criar mais código pra isso.
Simplesmente passamos a informação - na forma de Objeto - para outro Objeto, e este se encarrega de obter os dados e como trabalhar em cima dele.

-Costuma-se dizer que composição é o ato de delegar trabalho para outro objeto.
Isso deixa seu código mais elegante, menor e mais seguro.

-Relacionamento um pra um.
-Relacionamento um pra muitos.
-Relacionamento muitos pra muitos.

Exemplos: [Composição](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/oo/composicao).

