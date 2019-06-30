package teoria.computacao.estadosEx4;

import teoria.computacao.estadosExUtil.Utilitario;

public class Q3 implements Estado {

	private Integer saida = 0;

	public Q3(Integer saida2) {
		this.saida = saida2;
	}

	@Override
	public Estado resultanteDaTransicaoPara(String valorDaCadeia) {

		if (valorDaCadeia.equals("100")) {
			this.saida = 1;
			Utilitario.printSaidaESaldoDoTransdutor(this.saida, "75");
			return this;

		} else if (valorDaCadeia.equals("25")) {
			Utilitario.printSaidaESaldoDoTransdutor(1, "0");
			return new Q0(1);

		} else if (valorDaCadeia.equals("50")) {
			Utilitario.printSaidaESaldoDoTransdutor(1, "25");
			return new Q1(1);

		} else {
			return new Rejeitado();
		}
	}

	@Override
	public Integer saidaDaTransicao() {
		return saida;
	}
}
