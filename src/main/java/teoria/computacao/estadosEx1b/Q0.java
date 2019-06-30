package teoria.computacao.estadosEx1b;

public class Q0 implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia) {

		if (elementoDaCadeia == null) {
			return new Rejeitado();
		}

		if (elementoDaCadeia.equals("a")) {
			return new Q2();

		} else if (elementoDaCadeia.equals("b")) {
			return new Q1();

		} else {
			return new Rejeitado();

		}
	}

	@Override
	public Boolean estadoFinal() {
		return true;
	}

}
