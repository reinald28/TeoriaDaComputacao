package teoria.computacao.estadosEx3b;

import java.util.ArrayList;

public class Q1 implements Estado {
	private ArrayList<String> pilha;

	public Q1(ArrayList<String> pilha) {
		this.pilha = pilha;
	}

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia, String topoPilha) {

		if (elementoDaCadeia.equals("a") && topoPilha.equals("A")) {

			this.pilha.add("A");

			this.pilha.add("A");
			this.pilha.add("A");
			this.pilha.add("A");

			return this;

		} else if (elementoDaCadeia.equals("b") && topoPilha.equals("A")) {
			return new Q2(pilha);

		} else {
			return new Rejeitado();
		}
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}
