package teoria.computacao.estadosEx1a;

public interface Estado {

	public Boolean estadoFinal();

	public Estado resultanteDaTransicaoPara(String elementoDaCadeia);
}
