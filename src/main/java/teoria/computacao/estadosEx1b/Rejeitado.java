package teoria.computacao.estadosEx1b;

public class Rejeitado implements Estado {

	@Override
	public Estado resultanteDaTransicaoPara(String elementoDaCadeia) {
		System.out.println("Estado Rejeitado. N�o h� transa��es aceit�veis para o aut�mato. Cadeia Rejeitada");
		return new Rejeitado();
	}

	@Override
	public Boolean estadoFinal() {
		return false;
	}
}
