package teoria.computacao.estadosEx1b;

import java.util.ArrayList;

import teoria.computacao.estadosExUtil.Utilitario;

/**
 * Aut�mato Finito Ddeterministico - AFD.
 * 
 * Com a utiliza��o do padr�o de projeto State.
 * 
 * 1- b) Todas as cadeias em (a,b)* de modo que o �ltimo s�mbolo seja �b� e o
 * n�mero de s�mbolos �a� seja par.
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
				"Todas as cadeias em (a,b) de modo que o �ltimo s�mbolo seja �b� e o n�mero de s�mbolos �a� seja par.");
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
			System.out.println("O aut�mato parou em um estado final - A cadeia foi ACEITA.");
			return true;
		}

		System.out.println("O aut�mato parou em um estado N�O final - A cadeia foi REJEITADA.");
		return false;
	}
}
