package teoria.computacao.estadosEx1b;

import java.util.ArrayList;

import teoria.computacao.estadosExUtil.Utilitario;

/**
 * Autômato Finito Ddeterministico - AFD.
 * 
 * Com a utilização do padrão de projeto State.
 * 
 * 1- b) Todas as cadeias em (a,b)* de modo que o último símbolo seja “b” e o
 * número de símbolos “a” seja par.
 *
 * @author Reinaldo Cardoso
 * @email reinald28@gmail.com
 */

public class AutomatoEx1b {

	private ArrayList<String> alfabeto;
	private Estado estado;

	public AutomatoEx1b() {

		this.alfabeto = new ArrayList<>();
		this.alfabeto.add("a");
		this.alfabeto.add("b");

		System.out.println(
				"Todas as cadeias em (a,b) de modo que o último símbolo seja “b” e o número de símbolos “a” seja par.");
	}

	public boolean validarCadeia(ArrayList<String> cadeia) {

		this.estado = new Q0();

		try {
			for (String valor : cadeia) {

				Utilitario.CompararPertence(valor, alfabeto);

				estado = estado.resultanteDaTransicaoPara(valor);
			}
			
			if(cadeia.isEmpty()){
				estado = estado.resultanteDaTransicaoPara(null);
			}

		} catch (Exception e) {
			estado = new Rejeitado();
			e.printStackTrace();
		}

		if (estado.estadoFinal()) {
			System.out.println("O autômato parou em um estado final - A cadeia foi ACEITA.");
			return true;
		}

		System.out.println("O autômato parou em um estado NÃO final - A cadeia foi REJEITADA.");
		return false;
	}
}
