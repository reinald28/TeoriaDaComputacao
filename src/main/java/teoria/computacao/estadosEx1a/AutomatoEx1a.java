package teoria.computacao.estadosEx1a;

import java.util.ArrayList;

import teoria.computacao.estadosExUtil.Utilitario;

/**
 * Autômato Finito Ddeterministico - AFD
 * 
 * Com a utilização do padrão de projeto State
 * 
 * 1- a) Todas as cadeias em (0,1)* que representam cada '1' seguido
 * imediatamente de dois '0'.
 *
 * @author Reinaldo Cardoso
 * @email reinald28@gmail.com
 */

public class AutomatoEx1a {

	private ArrayList<String> alfabeto;
	private Estado estado;

	public AutomatoEx1a() {

		this.alfabeto = new ArrayList<>();
		this.alfabeto.add("0");
		this.alfabeto.add("1");

		System.out.println("Todas as cadeias em (0,1)* que representam cada '1' seguido imediatamente de dois '0'.");
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
