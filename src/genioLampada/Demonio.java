package genioLampada;

import java.util.InputMismatchException;

public class Demonio extends Genio {

	static Demonio demonio = new Demonio(); // Criação do Objeto chamado demónio
	// Atributo
	private static boolean isSair; // atributo criado com o fim de utilizar o método “menuSegurançaSair ()” não só
									// para o menu principal como também para o menu do demónio

	// Construtor

	public Demonio() {
	}


	// Métodos


	public void concedeDesejo(int maxDesejos) {
		super.concedeDesejo(maxDesejos);
		getRandomWord();
		
	}
	// Método que mostra as opções que o Demónio oferece, continuar a conceder
	// desejos, recarregar a Lâmpada ou permite sair do jogo, usando um try catch
	// com o propósito do tratamento das exceções, produzidas no momento em que o
	// utilizador introduze inputs diferentes dos que são esperados.
	public static void invocaDemonio() {
		System.out.println("Well well well! Quem é que temos aqui?! Sou o Joker, queres tentar a tua sorte?? ");
		getRandomWord();
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
				System.exit(0); // Método que encerra a execução da máquina virtual Java.
				break;

			default:
				System.out.println("Só são permitidos números entre 1 a 3 , tente de novo.");
				invocaDemonio(); // Método recursivo que chama a si mesma para voltar ao início da função
			}

		} catch (InputMismatchException e) {
			Main.sc.nextLine(); // Para limpar o Scanner
			System.out.println("Só são permitidos números inteiros, tente de novo.");
			invocaDemonio(); // Método recursivo que chama a si mesma para voltar ao início da função
		}

	}

	// Lista de opções em que o utilizador pode escolher.
	public static void menuDemonio() {
		System.out.println("1 - Pedir desejos");
		System.out.println("2 - Recarregar a lampada");
		System.out.println("3 - Sair do jogo");

	}

	// Método para continuar a pedir desejos ao demónio.
	public static void continuarDesejoDemonio() {
		
		demonio.concedeDesejo(Genio.pedirDesejos());
		
		while (!Lampada.isRecarregar()) {
	// Enquanto a lâmpada não for recarregada continua a invocar ao demónio
			invocaDemonio();
		}
	}
	public static void getRandomWord() {
		int numAleatorio = (int) (Math.random() * 3) + 1;
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[numAleatorio]);
	}

	// Getter

	public static boolean isSair() {
		return isSair;
	}
	

}