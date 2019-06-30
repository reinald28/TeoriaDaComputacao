# TeoriaDaComputacao

## Exercício - Disciplina Teoria da Computação.

### 1) Implemente em uma linguagem de programação à sua escolha AFDs que aceitem as seguintes cadeias:

- a) Todas as cadeias em (0,1)* que representam cada '1' seguido imediatamente de dois '0'.

- b) Todas as cadeias em (a,b)* de modo que o último símbolo seja 'b' e o número de símbolos 'a' seja par.

### 2) Implemente em uma linguagem de programação à sua escolha a Gramática:

		G=(V, T, P, S), onde:
		V={W, A, B}
		T={a,b}
		P={W-->AB
		A --> aaaA | aaA | aA| a
		B --> bB | [ ]

### 3) Implemente em uma linguagem de programação de sua preferência autômatos de pilha que reconheçam as linguagens:

- a) L = {anbncm / n >= 0, m >= 1}.

- b) L = {anb3n+1 / n >= 1}

### 4) Implemente em linguagem de programação à sua escolha um transdutor finito que, dada uma sequência de moedas de 25 e 50 centavos e de 1 real, forneça uma lata de refrigerante quando a sequência totalizar 1 real ou mais. Cada moeda inserida deverá corresponder a uma de duas saídas: 0, se uma lata não pode ser (ainda) liberada, ou 1, se uma lata deve ser liberada.

### 5) Implemente em linguagem de programação à sua escolha o algoritmo CYK. Seu programa deve receber como entrada uma gramática livre de contexto na Forma Normal de Chomsky e uma string de teste da gramática. Descreva como deverá ser o formato dessa gramática.

## Como compilar esse projeto.

 1 - Via terminal, navegar até a pasta do projeto
 
 2 - executar: mvn clean package install

## Como executar esse projeto.

 (OBS: Se já estiver localizado na pasta do projeto no passo 1. acima).
 
 1 - Via terminal executar: java -jar ./target/TeoriaDaComputacao.jar
 
