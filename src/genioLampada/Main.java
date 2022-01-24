package genioLampada;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

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

			System.out.println("\nQuantos desejos pretende pedir?");
			int desejos = sc.nextInt();
			int desejosDisponiveis = desejos;
			String desejoIndicado = "";

			if (esfregadelas % 2 == 0) {
				System.out.println("Olá, eu sou o gênio bem-humorado e lhe concederei todos os desejos que você me pedir");
				
				
				int aux = 0;
				while (aux < desejos) {
		
					System.out.println("\nDesejos disponíveis: " + desejosDisponiveis);
					System.out.println("\nIndique o seu desejo");
					desejoIndicado = sc.next();

					System.out.println("Desejo: " + desejoIndicado);
					System.out.println("\nDesejo Cumprido! :)");

					aux++;
					desejosDisponiveis--;

				}
				System.out.println("Esgotou os seus desejos :(");
			} else {
				System.out.println("Chama genio mau");
			}

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
