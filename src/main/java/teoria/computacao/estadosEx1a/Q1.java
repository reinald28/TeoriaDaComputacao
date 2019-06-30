package teoria.computacao.estadosEx1a;

public class Q1 implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia) {

		if (elementoDaCadeia.equals("0")) {
			return new Q2();
		} else {
			return new Rejeitado();
		}
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}
