package genioLampada;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

<<<<<<< Updated upstream
	public static void menu() {
		System.out.println("\nBem-vindo ao jogo da Lâmpada Mágica!");
		System.out.println("Escolha uma das opções disponíveis:");
		System.out.println("1 - Esfregar a lâmpada");
		System.out.println("2 - Sair do Jogo");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
//Criar uma função para colocar tudo

			System.out.println("Quantas vezes deseja esfregar a lâmpada?");
			int esfregadelas = sc.nextInt();
			Lampada.esfregar(esfregadelas);
			int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
			System.out.println("A lâmpada já foi esfregada: " + esfregadelasAcumuladas + " vezes");
=======
	public static int pedirDesejos() {
		System.out.println("\nQuantos desejos pretende pedir?");
		int desejos = sc.nextInt();
		// int desejosDisponiveis = desejos;
		return desejos;
	}

	public static void esfregarLampada() {

		System.out.println("Quantas vezes deseja esfregar a lÃ¢mpada?");
		int esfregadelas = sc.nextInt();
		Lampada.esfregar(esfregadelas);
		int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
		System.out.println("Esfregou a lÃ¢mpada: " + esfregadelasAcumuladas + " vezes");
// ---
>>>>>>> Stashed changes

		int aux2 = pedirDesejos();

<<<<<<< Updated upstream
			if (esfregadelas % 2 == 0) {
				System.out.println("Olá, eu sou o gênio bem-humorado e lhe concederei todos os desejos que você me pedir");
				
				
				int aux = 0;
				while (aux < desejos) {
		
					System.out.println("\nDesejos disponíveis: " + desejosDisponiveis);
					System.out.println("\nIndique o seu desejo");
					desejoIndicado = sc.next();

					System.out.println("Desejo: " + desejoIndicado);
					System.out.println("\nDesejo Cumprido! :)");
=======
		if (esfregadelas % 2 == 0) {

			System.out.println("Olï¿½, eu sou o gï¿½nio bem-humorado e lhe concederei todos os desejos que vocï¿½ me pedir");

			int aux = 0;

			BemHumorado gbomBemHumorado = new BemHumorado();
			gbomBemHumorado.concedeDesejo(aux2);
>>>>>>> Stashed changes

		} else {
			System.out.println("Chama genio mau");
			MalHumorado gmauHumorado = new MalHumorado();
			gmauHumorado.concedeDesejo(aux2);

		}

	}

	public static void menu() {
		System.out.println("\nBem-vindo ao jogo da Lampada Mï¿½gica!");
		System.out.println("Escolha uma das opï¿½ï¿½es disponï¿½veis:");
		System.out.println("1 - Esfregar a lï¿½mpada");
		System.out.println("2 - Sair do Jogo");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
//Criar uma funï¿½ï¿½o para colocar tudo
			esfregarLampada();
			break;
		case 2:
			System.out.println("2 - Sair");
			System.exit(0);
			break;
		}

	}

	public static void main(String[] args) {
		// Lampada lampada1 = new Lampada(5);

		while (true) {
			menu();
		}
	}

}
