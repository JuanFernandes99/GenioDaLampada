package genioLampada;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			menu();
		}
	}

	public static void menu() {
<<<<<<< HEAD
		System.out.println("\nBem-vindo ao jogo da Lampada Mágica!");
		System.out.println("Escolha uma das opções disponíveis:");
		System.out.println("1 - Esfregar a Lâmpada");
=======
		System.out.println("\nBem-vindo ao jogo da l�mpada m�gica!");
		System.out.println("Escolha uma das Op��es dispon�veis:");
		System.out.println("1 - Esfregar a L�mpada");
>>>>>>> a92c79485d30d02e090e2409a293345068a07cf4
		System.out.println("2 - Sair do Jogo");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			esfregarLampada();
			break;
		case 2:
			System.out.println("2 - Sair");
			System.exit(0);
			break;
		}

	}

	public static void esfregarLampada() {

		System.out.println("Quantas vezes deseja esfregar a l�mpada?");
		int esfregadelas = sc.nextInt();
		Lampada.esfregar(esfregadelas);
		int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
		System.out.println("Esfregou a l�mpada: " + esfregadelasAcumuladas + " vezes");

		int aux = pedirDesejos();

		if (esfregadelas % 2 == 0) {

			System.out.println("Ol�!, eu sou o g�nio bem-humorado e lhe concederei todos os desejos que voc� me pedir ");

			BemHumorado gbomBemHumorado = new BemHumorado();
			gbomBemHumorado.concedeDesejo(aux);

		} else {
			System.out.println("Chama genio mau");
			MalHumorado gmauHumorado = new MalHumorado();
			gmauHumorado.concedeDesejo(aux);
		}

	}

	public static int pedirDesejos() {
		System.out.println("\nQuantos desejos pretende pedir?");
		int desejos = sc.nextInt();
		return desejos;
	}

