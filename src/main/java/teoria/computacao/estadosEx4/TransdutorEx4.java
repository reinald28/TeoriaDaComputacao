package teoria.computacao.estadosEx4;

import java.util.ArrayList;
import java.util.Scanner;

import teoria.computacao.estadosExUtil.Utilitario;

/**
 * Transdutor finito.
 * 
 * Com a utilização do padrão de projeto State.
 * 
 * Implemente em linguagem de programação à sua escolha um transdutor finito
 * que, dada uma sequência de moedas de 25 e 50 centavos e de 1 real, forneça
 * uma lata de refrigerante quando a sequência totalizar 1 real ou mais. Cada
 * moeda inserida deverá corresponder a uma de duas saídas: 0, se uma lata não
 * pode ser (ainda) liberada, ou 1, se uma lata deve ser liberada. Um exemplo de
 * entrada e saída correspondente:
 * 
 * Entrada: 50 25 50 100 25 50 25 ...
 * 
 * Saída: 0 0 1 1 0 1 0 ...
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
				"Máquina de refrigerantes, as moedas aceitas são 25, 50 e 100(para 1 real). O refrigerante custa: 100 (1 Real)");
	}

	public void EsperarReceberMoedaDoUsuario() {

		String moeda = "0";

		System.out.printf("Insira uma moeda: (Ou digite 'exit' para desligar a máquina.) \n");

		while (!moeda.equals("exit")) {

			moeda = new Scanner(System.in).next();

			if (!moeda.equals("exit")) {

				TransdutorReceber(moeda);

				System.out.println("Automato saída: " + estado.saidaDaTransicao());
				System.out.printf("Insira uma moeda: (Ou digite 'exit' para desligar a máquina.) \n");

			} else if (moeda.equals("exit")) {
				System.out.println("Obrigado. Volte sempre! (Máquina desligada.)");
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
