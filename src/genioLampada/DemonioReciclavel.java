package genioLampada;

import java.util.Scanner;

public class DemonioReciclavel extends Genio {
	static Scanner sc = new Scanner(System.in);
	private static boolean isO = true; // mlehorar

	// melhorar
	public DemonioReciclavel() {

	}

	public void concedeDesejo(int max) {

		int aux = 0; // desejos con
		while (aux < max) {

			System.out.println("\nDesejos disponiveis: " + (max - aux));
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = sc.next();
			System.out.println("Desejo: " + desejoIndicado);
			System.out.println("\nDesejo Cumprido! :)");

			aux++;
			Genio.AcresDesejos();
			System.out.println("Desejos concedidos: " + desejosConcedidos);
		}
	}

	public static void menuDemonio() {
		System.out.println("Olá, eu sou demonio e lhe concederei todos os desejos que você me pedir");
		DemonioReciclavel demonio = new DemonioReciclavel();

		System.out.println("1 - Pedir desejos?");
		System.out.println("2 - Recarregar a lâmpada");
		System.out.println("3- Sair");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			int aux = Genio.pedirDesejos(); // ver
			demonio.concedeDesejo(aux);
			while (isO) { // mlehorar
				menuDemonio();
			}
			break;

		case 2:
			isO = false; // melhorar
			Lampada.lampadaRecarregada();
			System.out.println("Vezes recarregada: " + Lampada.getVezesRecarregada());
			break;

		case 3:
			System.out.println("sair do Jogo");
			System.exit(0);
			break;
		}
	}
}
