package teoria.computacao.estadosEx3b;

public interface Estado {

	public Boolean estadoFinal();

	public Estado resultanteDaTransicaoPara(String elementoDaCadeia, String topoPilha);
}
