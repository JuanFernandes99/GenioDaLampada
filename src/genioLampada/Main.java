package genioLampada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int randomNum = (int) (Math.random() * 3) + 1; // 1 to 2
	static Lampada nlampada = new Lampada(randomNum);

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao jogo da Lampada Mágica!");
		while (true) {
			inicioJogo();
		}
	}

	public static void inicioJogo() {
		menu();
		try {
			int opcao = sc.nextInt();
			switch (opcao) {

			case 1:
				instrucoes();
				break;
			case 2:
				jogar();
				break;

			case 3:
				System.exit(0);
				break;

			default:
				System.out.println("Só é permitido números entre 1-3 , try again");
			}
		} catch (InputMismatchException e) {
			System.out.println("Só é permitido números inteiros,  try again");
			Genio.sc.nextLine();
			sc.nextLine();
			inicioJogo();

		}
	}

	public static void esfregarLampada() {

		System.out.println("Quantas vezes deseja esfregar a lâmpada?");
		int esfregadelas = sc.nextInt();
		Lampada.esfregar(esfregadelas);

		if (esfregadelas <= 0) {

			System.out.println("\nO número deve ser superior a zero.");
			esfregarLampada();

		}

		else if (esfregadelas != 0) {

			int aux = Genio.pedirDesejos();

			if (esfregadelas % 2 == 0) {
				BemHumorado gBemHumorado = new BemHumorado();
				gBemHumorado.concedeDesejo(aux);

			} else {

				MalHumorado gmauHumorado = new MalHumorado();
				gmauHumorado.concedeDesejo(aux);
			}
			int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
			System.out.println("Esfregou a lâmpada: " + esfregadelasAcumuladas + " vezes");
			Lampada.setgeniosDisponiveis();

		}
	}

	public static void instrucoes() {

		System.out.println(" Instruções\n" + "\n"
				+ "Este jogo realiza-se dentro de uma Lâmpada Mágica que contêm génios indeterminados. \nO objetivo é iniciar a lâmpada, chamar génios e pedir desejos, que determinam se irá sair um génio bem-humorado ou mal-humorado.\nTenta a tua sorte e vê o que acontece no final!\n"
				+ "\n" + "Passos:\n" + "\n" + "1. O jogador tem de iniciar a lâmpada;\n"
				+ "2. O jogador decide quantas vezes quer esfregar a lâmpada;\n"
				+ "3. O jogador pede quantos desejos quer ver realizados;\n" + "4. BOOOM!!! Sai o génio;\n"
				+ "\nA sequência será repetida pelo jogador do ponto 2 até ao ponto 4.\n" + "Atenção!!!\n"
				+ "\nO jogador decide quando acabar o jogo a qualquer momento através da opção disponível “sair do jogo”;");
	}

	public static void jogar() {

		if (Lampada.getGeniosDisponiveis() > 0) {
			esfregarLampada();
		} else {
			DemonioReciclavel.invocaDemonio(); // tratar o error
		}
	}

	public static void menu() {

		System.out.println("\nEscolha uma das opções disponíveis:");
		System.out.println("1 - Instruções do Jogo");
		System.out.println("2 - Esfregar a Lâmpada");
		System.out.println("3 - Sair do Jogo");

	}
}