package teoria.computacao.estadosEx4;

import teoria.computacao.estadosExUtil.Utilitario;

public class Q0 implements Estado {

	private Integer saida;

	public Q0(Integer saida) {
		this.saida = saida;
	}

	@Override
	public Estado resultanteDaTransicaoPara(String moeda) {

		if (moeda.equals("100")) {
			this.saida = 1;
			Utilitario.printSaidaESaldoDoTransdutor(this.saida, "0");
			return this;

		} else if (moeda.equals("25")) {
			Utilitario.printSaidaESaldoDoTransdutor(0, moeda);
			return new Q1(0);

		} else if (moeda.equals("50")) {
			Utilitario.printSaidaESaldoDoTransdutor(0, moeda);
			return new Q2(0);

		} else {
			return new Rejeitado();
		}
	}

	@Override
	public Integer saidaDaTransicao() {
		return saida;
	}
}
