package genioLampada;

import java.util.InputMismatchException;

public class Demonio extends Genio {

	static Demonio demonio = new Demonio();

	// Atributo(s)
	private static boolean isSair; // verificaçao de segurança para poupar linhas de codigo

	// Construtor(es)

	public Demonio() {
	}

	// Método(s)

	// Fun��o das op��es que o Dem�no oferece, continuar a conceder desejos,
	// recarrega ou permite sair do jogo,usando excep��es para evitar inputs
	// diferentes dos que s�o pedidos.
	public static void invocaDemonio() {
		System.out.println("Ola, eu sou demónio e irei conceder todos os desejos que você me pedir.\n");

		menuDemonio();

		try {
			int opcao = Main.sc.nextInt();
			switch (opcao) {
			case 1:
				continuarDesejoDemonio();
				break;

			case 2:
				Lampada.lampadaRecarregada();
				break;

			case 3:
				isSair = true;
				MenuJogo.segurancaSair();
				System.exit(0);
				break;

			default:
				System.out.println("Só são permitidos números entre 1 a 3 , tente novo.");
				invocaDemonio();
			}

		} catch (InputMismatchException e) {
			Main.sc.nextLine();
			System.out.println("Só são permitidos números inteiros, tente novo.");
			invocaDemonio();
		}

	}

	// Op��es em que utilizador pode escolher.
	public static void menuDemonio() {
		System.out.println("1 - Pedir desejos");
		System.out.println("2 - Recarregar a lampada");
		System.out.println("3 - Sair do jogo");

	}

	// Fun��o de continuar a pedir desejos ao dem�nio.
	public static void continuarDesejoDemonio() {
		int aux = Genio.pedirDesejos();
		demonio.concedeDesejo(aux);
		while (!Lampada.isRecarregar()) {
			invocaDemonio();
		}

	}

	// Getters

	public static boolean isSair() {
		return isSair;
	}

}
