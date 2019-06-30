package teoria.computacao.estadosEx4;

import teoria.computacao.estadosExUtil.Utilitario;

public class Q1 implements Estado {

	private Integer saida = 0;

	public Q1(Integer saida2) {
		this.saida = saida2;
	}

	@Override
	public Estado resultanteDaTransicaoPara(String valorDaCadeia) {

		if (valorDaCadeia.equals("100")) {
			this.saida = 1;
			Utilitario.printSaidaESaldoDoTransdutor(this.saida, "25");
			return this;

		} else if (valorDaCadeia.equals("25")) {
			Utilitario.printSaidaESaldoDoTransdutor(0, "50");
			return new Q2(0);

		} else if (valorDaCadeia.equals("50")) {
			Utilitario.printSaidaESaldoDoTransdutor(0, "75");
			return new Q3(0);

		} else {
			return new Rejeitado();
		}
	}

	@Override
	public Integer saidaDaTransicao() {
		return saida;
	}
}