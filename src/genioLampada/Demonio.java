package genioLampada;

import java.util.InputMismatchException;

public class Demonio extends Genio {

	static Demonio demonio = new Demonio();

	// Atributo(s)
	private static boolean isSair; // verificaÃ§ao de seguranÃ§a para poupar linhas de codigo

	// Construtor(es)

	public Demonio() {
	}

	// MÃ©todo(s)

	// Função das opções que o Demíno oferece, continuar a conceder desejos,
	// recarrega ou permite sair do jogo,usando excepções para evitar inputs
	// diferentes dos que são pedidos.
	public static void invocaDemonio() {
		System.out.println("Ola, eu sou demÃ³nio e irei conceder todos os desejos que vocÃª me pedir.\n");

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
				System.out.println("SÃ³ sÃ£o permitidos nÃºmeros entre 1 a 3 , tente novo.");
				invocaDemonio();
			}

		} catch (InputMismatchException e) {
			Main.sc.nextLine();
			System.out.println("SÃ³ sÃ£o permitidos nÃºmeros inteiros, tente novo.");
			invocaDemonio();
		}

	}

	// Opções em que utilizador pode escolher.
	public static void menuDemonio() {
		System.out.println("1 - Pedir desejos");
		System.out.println("2 - Recarregar a lampada");
		System.out.println("3 - Sair do jogo");

	}

	// Função de continuar a pedir desejos ao demónio.
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
