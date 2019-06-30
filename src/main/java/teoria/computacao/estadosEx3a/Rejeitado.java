package teoria.computacao.estadosEx3a;

public class Rejeitado implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia, String topoPilha) {

		System.out.println("Estado Rejeitado. Não há transações aceitáveis para o autômato. Cadeia Rejeitada");
		return new Rejeitado();
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}
