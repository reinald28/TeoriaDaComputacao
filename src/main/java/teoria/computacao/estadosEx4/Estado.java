package teoria.computacao.estadosEx4;

public interface Estado {

	public Estado resultanteDaTransicaoPara(String moeda);
	
	public Integer saidaDaTransicao();
}
