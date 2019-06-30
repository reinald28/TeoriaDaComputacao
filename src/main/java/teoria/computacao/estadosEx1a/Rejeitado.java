package teoria.computacao.estadosEx1a;

public class Rejeitado implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String valorDaCadeia) {
		System.out.println("Estado Rejeitado. N�o h� transa��es aceit�veis para o aut�mato. Cadeia Rejeitada");
		return new Rejeitado();
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}
