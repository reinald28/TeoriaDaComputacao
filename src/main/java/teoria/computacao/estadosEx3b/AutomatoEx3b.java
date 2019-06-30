package teoria.computacao.estadosEx3b;

import java.util.ArrayList;

import teoria.computacao.estadosExUtil.Utilitario;

/**
 * Autômato com Pilha.
 * 
 * Reconhecimento por pilha vazia.
 * 
 * Com a utilização do padrão de projeto State.
 * 
 * 3- b) L = {anb3n+1 / n >= 1}
 *
 * @author Reinaldo Cardoso
 * @email reinald28@gmail.com
 */

public class AutomatoEx3b {

	// Arraylist utilizado como pilha do tipo LIFO (Last In - First Out) ou
	// FILO (First In - Last Out).
	private ArrayList<String> pilha;
	private ArrayList<String> alfabeto;
	private Estado estado;

	public AutomatoEx3b() {

		this.alfabeto = new ArrayList<>();
		this.alfabeto.add("a");
		this.alfabeto.add("b");

		System.out.println("L = {anb3n+1 / n >= 1}");
	}

	public boolean validarCadeia(ArrayList<String> cadeia) {
		this.pilha = new ArrayList<>();
		this.pilha.add("Z");
		this.estado = new Q0(pilha);

		try {
			for (String elemento : cadeia) {

				Utilitario.CompararPertence(elemento, alfabeto);

				estado = estado.resultanteDaTransicaoPara(elemento, Utilitario.consumirTopo(pilha));
			}

			if (cadeia.isEmpty()) {
				estado = estado.resultanteDaTransicaoPara(null, Utilitario.consumirTopo(pilha));
			}

			if (Utilitario.consumirTopo(pilha).equals("Z")) {
				System.out.println("Reconhecimento por pilha vazia. A cadeia foi ACEITA");
				return true;
			} else {
				System.out.println("Reconhecimento por pilha vazia. A cadeia foi REJEITADA");
				return false;
			}

		} catch (Exception e) {
			estado = new Rejeitado();
			e.printStackTrace();
		}
		return false;
	}
}
