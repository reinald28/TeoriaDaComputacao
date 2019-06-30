package teoria.computacao;

import java.util.Scanner;

import teoria.computacao.estadosEx1a.AutomatoEx1a;
import teoria.computacao.estadosEx1b.AutomatoEx1b;
import teoria.computacao.estadosEx3a.AutomatoEx3a;
import teoria.computacao.estadosEx3b.AutomatoEx3b;
import teoria.computacao.estadosEx4.TransdutorEx4;
import teoria.computacao.estadosExUtil.Utilitario;

public class MainPrincipal {

	public static void main(String[] args) {

		System.out.println("---------------------------");
		System.out.println("Escolha qual exercício deseja executar. (Digite exit para sair.)");
		System.out.println("Digite 1a, 1b, 3a, 3b ou 4.");
		System.out.println("--------------------------- \n");

		String escolha = "";

		while (!escolha.equals("exit")) {

			escolha = new Scanner(System.in).next();

			if (escolha.equals("1a")) {
				System.out.println("Cadeia: " + new AutomatoEx1a().validarCadeia(Utilitario.receberCadeia()));

			} else if (escolha.equals("1b")) {
				System.out.println("Cadeia: " + new AutomatoEx1b().validarCadeia(Utilitario.receberCadeia()));

			} else if (escolha.equals("3a")) {
				System.out.println("Cadeia: " + new AutomatoEx3a().validarCadeia(Utilitario.receberCadeia()));

			} else if (escolha.equals("3b")) {
				System.out.println("Cadeia: " + new AutomatoEx3b().validarCadeia(Utilitario.receberCadeia()));

			} else if (escolha.equals("4")) {
				new TransdutorEx4().EsperarReceberMoedaDoUsuario();

			} else if (escolha.equals("exit")) {

				System.out.println("Até breve!");
			}

			if (!escolha.equals("exit")) {
				System.out.println("---------------------------");
				System.out.println("Escolha qual exercício deseja executar. (Digite exit para sair.)");
				System.out.println("Digite 1a, 1b, 3a, 3b ou 4.");
				System.out.println("--------------------------- \n");
			}

		}

	}

}
