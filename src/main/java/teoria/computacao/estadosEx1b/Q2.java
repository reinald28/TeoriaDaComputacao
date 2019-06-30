package teoria.computacao.estadosEx1b;

public class Q2 implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia) {

		if (elementoDaCadeia.equals("a")) {
			return new Q3();

		} else if (elementoDaCadeia.equals("b")) {
			return this;

		}
		return new Rejeitado();
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}