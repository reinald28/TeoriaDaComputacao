package teoria.computacao.estadosEx1b;

public class Q1 implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia) {

		if (elementoDaCadeia.equals("a")) {
			return new Q2();

		} else if (elementoDaCadeia.equals("b")) {
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
