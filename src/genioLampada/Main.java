package genioLampada;

import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static Random ran = new Random();
	static int maxGen = ran.nextInt(6) + 5;

	static Lampada nlampada = new Lampada(maxGen);

	public static void main(String[] args) {
		// System.out.print("Genios Disponiveis:" + _lampada.getGeniosDisponiveis());

		while (true) {
			menu();
		}
	}

	public static void menu() {

		System.out.println("\nBem-vindo ao jogo da Lampada Mágica!");
		System.out.println("Escolha uma das opções disponíveis:");
		System.out.println("1 - Esfregar a Lâmpada");
		System.out.println("2 - Sair do Jogo");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1: // max = 10, dispo = 10 -1
			// verificar que o numero de genios disponiveis é maior que 0
			esfregarLampada();
			/*
			 * caso nao seja, chamar o demonio, abrir menu que pergunta se é para garantir
			 * desejo ou recarregar lampada. Se for p/ recarregar, chamar funcao que está na
			 * lampada atualizar o numero de genios disponiveis com o número aleatorio dado
			 * na criaçao da lampada
			 */
			break;

		case 2:
			System.out.println("2 - Sair");
			System.exit(0);

			break;
		}

	}

	public static void esfregarLampada() {

		System.out.println("Quantas vezes deseja esfregar a lâmpada?");
		int esfregadelas = sc.nextInt();
		Lampada.esfregar(esfregadelas);
		int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
		System.out.println("Esfregou a lâmpada: " + esfregadelasAcumuladas + " vezes");

		int aux = pedirDesejos();

		if (esfregadelas % 2 == 0) {

			BemHumorado gBemHumorado = new BemHumorado();
			gBemHumorado.concedeDesejo(aux);

		} else {

			MalHumorado gmauHumorado = new MalHumorado();
			gmauHumorado.concedeDesejo(aux);
		}

	}

	public static int pedirDesejos() {
		System.out.println("\nQuantos desejos pretende pedir?");
		int desejos = sc.nextInt();
		return desejos;
	}

}