package teoria.computacao.estadosEx1a;

public class Rejeitado implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String valorDaCadeia) {
		System.out.println("Estado Rejeitado. Não há transações aceitáveis para o autômato. Cadeia Rejeitada");
		return new Rejeitado();
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}
