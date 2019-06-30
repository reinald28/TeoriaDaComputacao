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

public class Q0 implements Estado {

	private ArrayList<String> pilha;

	public Q0(ArrayList<String> pilha) {
		this.pilha = pilha;
	}

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia, String topoPilha) {

		if (elementoDaCadeia == null) {
			return new Rejeitado();
		}

		if (elementoDaCadeia.equals("a") && topoPilha.equals("A")) {
			this.pilha.add("A");
			this.pilha.add("A");
			return this;

		} else if (elementoDaCadeia.equals("a") && topoPilha.equals("Z")) {
			this.pilha.add("Z");
			this.pilha.add("A");
			return this;

		} else if (elementoDaCadeia.equals("b") && topoPilha.equals("A")) {
			return new Q1(this.pilha);

		} else if (elementoDaCadeia.equals("c") && topoPilha.equals("Z")) {
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
