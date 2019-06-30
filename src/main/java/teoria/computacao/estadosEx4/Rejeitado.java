package teoria.computacao.estadosEx4;

public class Rejeitado implements Estado {

	private Integer saida = 0;

	@Override
	public Estado resultanteDaTransicaoPara(String moeda) {
		System.out.println(
				"Estado Rejeitado. Não há transações aceitáveis. Uma moeda inválida foi inserida. Máquina em manutenção. (Reinicie o sistema).");
		return new Rejeitado();
	}

	@Override
	public Integer saidaDaTransicao() {
		return saida;
	}
}
