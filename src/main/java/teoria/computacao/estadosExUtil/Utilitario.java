package teoria.computacao.estadosExUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilitario {

	public static ArrayList<String> receberCadeia() {

		ArrayList<String> cadeia = new ArrayList<>();

		System.out.printf(
				"Informe uma cadeia completa sem espaços: (Digite 'exit' para sair e deixar a cadeia vazia) \n");

		@SuppressWarnings("resource")
		String valor = new Scanner(System.in).next();

		if (!valor.equals("exit")) {
			for (int i = 0; i < valor.length(); i++) {
				cadeia.add(valor.substring(i, i + 1));
			}
		}

		return cadeia;
	}

	public static boolean CompararPertence(String valor, ArrayList<String> alfabeto) throws Exception {

		if (alfabeto.contains(valor)) {
			return true;
		} else {
			throw new Exception("O valor de (" + valor + ") não é válido.");
		}
	}

	public static String consumirTopo(ArrayList<String> pilha) {

		if (pilha.isEmpty()) {
			return "vazia";
		}

		String topo = pilha.get(pilha.size() - 1);
		pilha.remove(pilha.size() - 1);

		return topo;
	}

	public static void printSaidaESaldoDoTransdutor(Integer saida, String saldo) {

		if (saida.equals(1)) {
			System.out.println("Saída: 1 - Receba sua lata de refrigerante. Saldo=" + saldo);
		} else {
			System.out.println("Saída: 0 - O valor total ainda não foi atingido. Saldo=" + saldo
					+ ". Continue inserindo mais moedas.");
		}
	}
}
