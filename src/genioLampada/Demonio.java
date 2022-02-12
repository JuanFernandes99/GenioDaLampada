package genioLampada;

import java.util.InputMismatchException;

public class Demonio extends Genio {

	static Demonio demonio = new Demonio(); // Cria��o do Objeto chamado dem�nio
	// Atributo
	private static boolean isSair; // atributo criado com o fim de utilizar o m�todo �menuSeguran�aSair ()� n�o s�
									// para o menu principal como tamb�m para o menu do dem�nio

	// Construtor

	public Demonio() {
	}


	// M�todos

	// M�todo que mostra as op��es que o Dem�nio oferece, continuar a conceder
	// desejos, recarregar a L�mpada ou permite sair do jogo, usando um try catch
	// com o prop�sito do tratamento das exce��es, produzidas no momento em que o
	// utilizador introduze inputs diferentes dos que s�o esperados.

	public static void invocaDemonio() {
		System.out.println("Ol�, eu sou dem�nio e irei conceder todos os desejos que voc� me pedir.\n");

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
				System.exit(0); // M�todo que encerra a execu��o da m�quina virtual Java.
				break;

			default:
				System.out.println("S� s�o permitidos n�meros entre 1 a 3 , tente de novo.");
				invocaDemonio(); // M�todo recursivo que chama a si mesma para voltar ao in�cio da fun��o
			}

		} catch (InputMismatchException e) {
			Main.sc.nextLine(); // Para limpar o Scanner
			System.out.println("S� s�o permitidos n�meros inteiros, tente de novo.");
			invocaDemonio(); // M�todo recursivo que chama a si mesma para voltar ao in�cio da fun��o
		}

	}

	// Lista de op��es em que o utilizador pode escolher.
	public static void menuDemonio() {
		System.out.println("1 - Pedir desejos");
		System.out.println("2 - Recarregar a lampada");
		System.out.println("3 - Sair do jogo");

	}

	// M�todo para continuar a pedir desejos ao dem�nio.
	public static void continuarDesejoDemonio() {
		
		demonio.concedeDesejo(Genio.pedirDesejos());
		while (!Lampada.isRecarregar()) {
	// Enquanto a l�mpada n�o for recarregada continua a invocar ao dem�nio
			invocaDemonio();
		}
	}

	// Getter

	public static boolean isSair() {
		return isSair;
	}

}