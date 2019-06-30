package teoria.computacao.estadosEx4;

import java.util.ArrayList;
import java.util.Scanner;

import teoria.computacao.estadosExUtil.Utilitario;

/**
 * Transdutor finito.
 * 
 * Com a utiliza��o do padr�o de projeto State.
 * 
 * Implemente em linguagem de programa��o � sua escolha um transdutor finito
 * que, dada uma sequ�ncia de moedas de 25 e 50 centavos e de 1 real, forne�a
 * uma lata de refrigerante quando a sequ�ncia totalizar 1 real ou mais. Cada
 * moeda inserida dever� corresponder a uma de duas sa�das: 0, se uma lata n�o
 * pode ser (ainda) liberada, ou 1, se uma lata deve ser liberada. Um exemplo de
 * entrada e sa�da correspondente:
 * 
 * Entrada: 50 25 50 100 25 50 25 ...
 * 
 * Sa�da: 0 0 1 1 0 1 0 ...
 * 
 * @author Reinaldo Cardoso
 * @email reinald28@gmail.com
 */

public class TransdutorEx4 {

	private ArrayList<String> alfabeto;
	private Estado estado;

	public TransdutorEx4() {

		this.estado = new Q0(0);

		this.alfabeto = new ArrayList<>();
		this.alfabeto.add("25");
		this.alfabeto.add("50");
		this.alfabeto.add("100");

		System.out.println(
				"M�quina de refrigerantes, as moedas aceitas s�o 25, 50 e 100(para 1 real). O refrigerante custa: 100 (1 Real)");
	}

	public void EsperarReceberMoedaDoUsuario() {

		String moeda = "0";

		System.out.printf("Insira uma moeda: (Ou digite 'exit' para desligar a m�quina.) \n");

		while (!moeda.equals("exit")) {

			moeda = new Scanner(System.in).next();

			if (!moeda.equals("exit")) {

				TransdutorReceber(moeda);

				System.out.println("Automato sa�da: " + estado.saidaDaTransicao());
				System.out.printf("Insira uma moeda: (Ou digite 'exit' para desligar a m�quina.) \n");

			} else if (moeda.equals("exit")) {
				System.out.println("Obrigado. Volte sempre! (M�quina desligada.)");
			}
		}
	}

	private Integer TransdutorReceber(String moeda) {

		try {
			Utilitario.CompararPertence(moeda, alfabeto);

			estado = estado.resultanteDaTransicaoPara(moeda);

		} catch (Exception e) {
			estado = new Rejeitado();
			e.printStackTrace();
		}
		return estado.saidaDaTransicao();
	}

	public Integer getSaidaDaTransicao() {
		return estado.saidaDaTransicao();
	}
}
