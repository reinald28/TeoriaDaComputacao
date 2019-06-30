package teoria.computacao.estadosEx4;

public class Rejeitado implements Estado {

	private Integer saida = 0;

	@Override
	public Estado resultanteDaTransicaoPara(String moeda) {
		System.out.println(
				"Estado Rejeitado. N�o h� transa��es aceit�veis. Uma moeda inv�lida foi inserida. M�quina em manuten��o. (Reinicie o sistema).");
		return new Rejeitado();
	}

	@Override
	public Integer saidaDaTransicao() {
		return saida;
	}
}
