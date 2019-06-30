# TeoriaDaComputacao

## Exerc�cio - Disciplina Teoria da Computa��o.

### 1) Implemente em uma linguagem de programa��o � sua escolha AFDs que aceitem as seguintes cadeias:

- a) Todas as cadeias em (0,1)* que representam cada '1' seguido imediatamente de dois '0'.

- b) Todas as cadeias em (a,b)* de modo que o �ltimo s�mbolo seja 'b' e o n�mero de s�mbolos 'a' seja par.

### 2) Implemente em uma linguagem de programa��o � sua escolha a Gram�tica:

		G=(V, T, P, S), onde:
		V={W, A, B}
		T={a,b}
		P={W-->AB
		A --> aaaA | aaA | aA| a
		B --> bB | [ ]

### 3) Implemente em uma linguagem de programa��o de sua prefer�ncia aut�matos de pilha que reconhe�am as linguagens:

- a) L = {anbncm / n >= 0, m >= 1}.

- b) L = {anb3n+1 / n >= 1}

### 4) Implemente em linguagem de programa��o � sua escolha um transdutor finito que, dada uma sequ�ncia de moedas de 25 e 50 centavos e de 1 real, forne�a uma lata de refrigerante quando a sequ�ncia totalizar 1 real ou mais. Cada moeda inserida dever� corresponder a uma de duas sa�das: 0, se uma lata n�o pode ser (ainda) liberada, ou 1, se uma lata deve ser liberada.

### 5) Implemente em linguagem de programa��o � sua escolha o algoritmo CYK. Seu programa deve receber como entrada uma gram�tica livre de contexto na Forma Normal de Chomsky e uma string de teste da gram�tica. Descreva como dever� ser o formato dessa gram�tica.

## Como compilar esse projeto.

 1 - Via terminal, navegar at� a pasta do projeto
 
 2 - executar: mvn clean package install

## Como executar esse projeto.

 (OBS: Se j� estiver localizado na pasta do projeto no passo 1. acima).
 
 1 - Via terminal executar: java -jar ./target/TeoriaDaComputacao.jar
 
