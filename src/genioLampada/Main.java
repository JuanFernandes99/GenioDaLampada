package genioLampada;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

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

		int aux = pedirDesejos();

		if (esfregadelas % 2 == 0) {

			System.out.println("Ol�, eu sou o g�nio bem-humorado e lhe concederei todos os desejos que voc� me pedir");

			BemHumorado gbomBemHumorado = new BemHumorado();
			gbomBemHumorado.concedeDesejo(aux);

		} else {
			System.out.println("Chama genio mau");
			MalHumorado gmauHumorado = new MalHumorado();
			gmauHumorado.concedeDesejo(aux);
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