package teoria.computacao.estadosEx3b;

import java.util.ArrayList;

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

		if (elementoDaCadeia.equals("a") && topoPilha.equals("Z")) {

			this.pilha.add("Z");

			this.pilha.add("A");

			this.pilha.add("A");
			this.pilha.add("A");
			this.pilha.add("A");

			return new Q1(this.pilha);

		} else {
			return new Rejeitado();
		}
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}

}
