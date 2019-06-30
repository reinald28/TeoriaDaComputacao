package teoria.computacao.estadosEx1a;

public class Q2 implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia) {

		if (elementoDaCadeia.equals("0")) {
			return new Q0();

		} else {
			return new Rejeitado();
		}
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}