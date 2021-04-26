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


## Encapsulamento
- A ocultação de informações é considerada parte do encapsulamento, mas se fizermos uma pesquisa na internet, podemos encontrar a seguinte definição para encapsulamento: Um mecanismo da linguagem de programação para restringir o acesso a alguns componentes dos objetos, escondendo os dados de uma classe e tornando-os disponíveis somente através de métodos.
Na verdade, o mecanismo para restringir o acesso a alguns dos componentes do objeto é a definição de ocultação de informações. O encapsulamento é um conceito da Programação Orientada a Objetos onde o estado de objetos (as variáveis da classe) e seus comportamentos (os métodos da classe) são agrupados em conjuntos segundo o seu grau de relação.

## modificadores de acesso
- São 4 os modificadores de acesso básicos da linguagem Java: **private**, **padrão**, **protected** e **public**. Eles servem para tornar componentes da sua aplicação mais ou menos acessíveis por outras partes do seu programa.

Todas as classes declaradas neste post fazem uso apenas do modificador public. As classes também podem fazer uso dos outros modificadores de acesso, mas neste primeiro momento veremos apenas como os seus membros funcionam com cada um deles.

###### public
- O modificador de acesso public é o menos restritivo de todos. Ele permite que qualquer outra parte da sua aplicação tenha acesso ao componente marcado como public.

###### protected
- Os membros das classes marcados com o modificador de acesso protected serão acessíveis por classes e interfaces dentro do mesmo pacote e por classes derivadas mesmo que estejam em pacotes diferentes.

###### padrão
- O modificador de acesso padrão, também conhecido como acessibilidade de pacote, é o modificador atribuído aos membros da classe que não foram marcados explicitamente com um outro modificador de acesso. Membros com acessibilidade de pacote só podem ser acessados por outras classes ou interfaces definidas dentro do mesmo pacote.

###### private
- O modificador de acesso private é o mais restritivo modificador de acesso. Todo membro de uma classe definido com o modificador private só é acessível para a própria classe. Não importa a localização dentro de pacotes ou se a classe foi herdada ou não, um membro private só é acessível dentro da mesma classe em que ele foi declarado.

## Conclusão modificadores de acesso
- Os modificadores de acesso auxiliam na organização dos componentes da sua aplicação ao tornar os membros das classes mais ou menos acessíveis por outras partes do seu programa.

Os modificadores de acesso em ordem do mais restritivo para o menos restritivo são:

1. private
2. padrão ou acessibilidade de pacote
3. protected
4. public

Exemplos: [modificadores de acesso](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/oo/encapsulamento).

## Polimorfismo
- Significa "muitas formas", é o termo definido em linguagens orientadas a objeto, como por exemplo Java, C# e C++, que permite ao desenvolvedor usar o mesmo elemento de formas diferentes. Polimorfismo denota uma situação na qual um objeto pode se comportar de maneiras diferentes ao receber uma mensagem. No Polimorfismo temos dois tipos:

- Polimorfismo Estático ou Sobrecarga
- Polimorfismo Dinâmico ou Sobreposição
O Polimorfismo Estático se dá quando temos a mesma operação implementada várias vezes na mesma classe. A escolha de qual operação será chamada depende da assinatura dos métodos sobrecarregados.

Exemplos: [Polimorfismo](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/oo/polimorfismo).

## Interface
- Um recurso muito utilizado em Java, bem como na maioria das linguagens orientadas a objeto, para “obrigar” a um determinado grupo de classes a ter métodos ou propriedades em comum para existir em um determinado contexto, contudo os métodos podem ser implementados em cada classe de uma maneira diferente. Pode-se dizer, a grosso modo, que uma interface é um contrato que quando assumido por uma classe deve ser implementado.

- Por fim, interface nada mais que uma espécie de contrato de regras que uma classes deve seguir em um determinado contexto. Como em Java não existe herança múltipla, a interface passa a ser uma alternativa.

Exemplos: [Interface 1](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/oo/heranca/desafio).

Exemplos: [Interface 2](https://github.com/Cassiolucianoo/estudos-java/tree/master/exercicios/src/oo/heranca/desafioInterface2021).














