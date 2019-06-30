package teoria.computacao.estadosEx1a;

public class Q0 implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String valorDaCadeia) {

		if (valorDaCadeia == null) {
			return this;
		}

		if (valorDaCadeia.equals("0")) {
			return this;

		} else if (valorDaCadeia.equals("1")) {
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
