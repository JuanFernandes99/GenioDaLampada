package genioLampada;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println("\nBem-vindo ao jogo da Lampada M�gica!");
		System.out.println("Escolha uma das op��es dispon�veis:");
		System.out.println("1 - Esfregar a l�mpada");
		System.out.println("2 - Sair do Jogo");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
//Criar uma fun��o para colocar tudo

			System.out.println("Quantas vezes deseja esfregar a lâmpada?");
			int esfregadelas = sc.nextInt();
			Lampada.esfregar(esfregadelas);
			int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
			System.out.println("Esfregou a lâmpada: " + esfregadelasAcumuladas + " vezes");

			System.out.println("\nQuantos desejos pretende pedir?");
			int desejos = sc.nextInt();
			int desejosDisponiveis = desejos;
			String desejoIndicado = "";

			if (esfregadelas % 2 == 0) {
				System.out.println(
						"Ol�, eu sou o g�nio bem-humorado e lhe concederei todos os desejos que voc� me pedir");

				int aux = 0;
				while (aux < desejos) {

					System.out.println("\nDesejos dispon�veis: " + desejosDisponiveis);
					System.out.println("\nIndique o seu desejo");
					desejoIndicado = sc.next();

					System.out.println("Desejo: " + desejoIndicado);
					System.out.println("\nDesejos Cumpridos! :)");

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
