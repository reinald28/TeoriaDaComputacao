package teoria.computacao.estadosEx3a;

import java.util.ArrayList;

public class Q2 implements Estado {
	private ArrayList<String> pilha;

	public Q2(ArrayList<String> pilha) {
		this.pilha = pilha;
	}

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia, String topoPilha) {

		if (elementoDaCadeia.equals("c") && topoPilha.equals("Z")) {
			this.pilha.add("Z");
			return this;

		} else {
			return new Rejeitado();
		}
	}

	@Override
	public Boolean estadoFinal() {
		return true;
	}
}