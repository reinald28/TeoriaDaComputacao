package teoria.computacao.estadosEx3b;

import java.util.ArrayList;

public class Q2 implements Estado {
	@SuppressWarnings("unused")
	private ArrayList<String> pilha;

	public Q2(ArrayList<String> pilha) {
		this.pilha = pilha;
	}

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia, String topoPilha) {

		if (elementoDaCadeia.equals("b") && topoPilha.equals("A")) {
			return this;

		} else {
			return new Rejeitado();
		}
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}