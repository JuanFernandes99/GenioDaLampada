package genioLampada;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

<<<<<<< Updated upstream
	public static void menu() {
		System.out.println("\nBem-vindo ao jogo da L�mpada M�gica!");
		System.out.println("Escolha uma das op��es dispon�veis:");
		System.out.println("1 - Esfregar a l�mpada");
		System.out.println("2 - Sair do Jogo");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
//Criar uma fun��o para colocar tudo

			System.out.println("Quantas vezes deseja esfregar a l�mpada?");
			int esfregadelas = sc.nextInt();
			Lampada.esfregar(esfregadelas);
			int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
			System.out.println("A l�mpada j� foi esfregada: " + esfregadelasAcumuladas + " vezes");
=======
	public static int pedirDesejos() {
		System.out.println("\nQuantos desejos pretende pedir?");
		int desejos = sc.nextInt();
		// int desejosDisponiveis = desejos;
		return desejos;
	}

	public static void esfregarLampada() {

		System.out.println("Quantas vezes deseja esfregar a lâmpada?");
		int esfregadelas = sc.nextInt();
		Lampada.esfregar(esfregadelas);
		int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
		System.out.println("Esfregou a lâmpada: " + esfregadelasAcumuladas + " vezes");
// ---
>>>>>>> Stashed changes

		int aux2 = pedirDesejos();

<<<<<<< Updated upstream
			if (esfregadelas % 2 == 0) {
				System.out.println("Ol�, eu sou o g�nio bem-humorado e lhe concederei todos os desejos que voc� me pedir");
				
				
				int aux = 0;
				while (aux < desejos) {
		
					System.out.println("\nDesejos dispon�veis: " + desejosDisponiveis);
					System.out.println("\nIndique o seu desejo");
					desejoIndicado = sc.next();

					System.out.println("Desejo: " + desejoIndicado);
					System.out.println("\nDesejo Cumprido! :)");
=======
		if (esfregadelas % 2 == 0) {

			System.out.println("Ol�, eu sou o g�nio bem-humorado e lhe concederei todos os desejos que voc� me pedir");

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
		System.out.println("\nBem-vindo ao jogo da Lampada M�gica!");
		System.out.println("Escolha uma das op��es dispon�veis:");
		System.out.println("1 - Esfregar a l�mpada");
		System.out.println("2 - Sair do Jogo");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
//Criar uma fun��o para colocar tudo
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
