package teoria.computacao.estadosEx3a;

public interface Estado {

	public Boolean estadoFinal();

	public Estado resultanteDaTransicaoPara(String elementoDaCadeia, String topoPilha);
}
