package teoria.computacao.estadosEx1b;

public class Rejeitado implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia) {
		System.out.println("Estado Rejeitado. Não há transações aceitáveis para o autômato. Cadeia Rejeitada");
		return new Rejeitado();
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}
