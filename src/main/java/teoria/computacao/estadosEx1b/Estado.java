package teoria.computacao.estadosEx1b;

public interface Estado {

	public Boolean estadoFinal();

	public Estado resultanteDaTransicaoPara(String elementoDaCadeia);
}
