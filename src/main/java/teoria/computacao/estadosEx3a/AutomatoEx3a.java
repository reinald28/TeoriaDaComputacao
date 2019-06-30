package teoria.computacao.estadosEx3a;

import java.util.ArrayList;

import teoria.computacao.estadosExUtil.Utilitario;

/**
 * Autômato com Pilha.
 * 
 * Reconhecimento por estado final.
 * 
 * Com a utilização do padrão de projeto State.
 * 
 * 3- a) L = {anbncm / n >= 0, m >= 1}.
 *
 * @author Reinaldo Cardoso
 * @email reinald28@gmail.com
 */

public class AutomatoEx3a {

	// Arraylist utilizado como pilha do tipo LIFO (Last In - First Out) ou
	// FILO (First In - Last Out).
	private ArrayList<String> pilha;
	private ArrayList<String> alfabeto;
	private Estado estado;

	public AutomatoEx3a() {

		this.alfabeto = new ArrayList<>();
		this.alfabeto.add("a");
		this.alfabeto.add("b");
		this.alfabeto.add("c");

		System.out.println("L = {anbncm / n >= 0, m >= 1}.");
	}

	public boolean validarCadeia(ArrayList<String> cadeia) {
		this.pilha = new ArrayList<>();
		this.pilha.add("Z");
		this.estado = new Q0(pilha);

		try {
			for (String valor : cadeia) {

				Utilitario.CompararPertence(valor, alfabeto);

				estado = estado.resultanteDaTransicaoPara(valor, Utilitario.consumirTopo(pilha));
			}

			if (cadeia.isEmpty()) {
				estado = estado.resultanteDaTransicaoPara(null, Utilitario.consumirTopo(pilha));
			}

		} catch (Exception e) {
			estado = new Rejeitado();
			e.printStackTrace();
		}

		if (estado.estadoFinal()) {
			System.out.println("O autômato parou em um estado final e a cadeia foi ACEITA.");
			return true;
		}
		System.out.println("O autômato parou em um estado NÃO final e a cadeia foi REJEITADA.");
		return false;
	}
}
