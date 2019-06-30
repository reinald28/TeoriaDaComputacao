package teoria.computacao.estadosEx3a;

import java.util.ArrayList;

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

public class Q1 implements Estado {
	private ArrayList<String> pilha;

	public Q1(ArrayList<String> pilha) {
		this.pilha = pilha;
	}

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia, String topoPilha) {

		if (elementoDaCadeia.equals("b") && topoPilha.equals("A")) {
			return this;

		} else if (elementoDaCadeia.equals("c") && topoPilha.equals("Z")) {
			this.pilha.add("Z");
			return new Q2(this.pilha);

		} else {
			return new Rejeitado();
		}
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}
