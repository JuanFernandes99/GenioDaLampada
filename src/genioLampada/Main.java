package genioLampada;

import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static Random ran = new Random();
	static int maxGen = ran.nextInt(6) + 1;

	static Lampada nlampada = new Lampada(2);

	public static void main(String[] args) {
		// System.out.print("Genios Disponiveis:" + Lampada.getGeniosDisponiveis());

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
		case 1: // max = 10, dispo = 10 -1  // max = maxGen , dispo = funçao get
			// verificar que o numero de genios disponiveis é maior que 0
			if (Lampada.getGeniosDisponiveis() > 0 ) {
				esfregarLampada();
			}
			else {
				menuDemonio();
			}
		
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
		Lampada.setgeniosDisponiveis();
	}

	public static int pedirDesejos() {
		System.out.println("\nQuantos desejos pretende pedir?");
		int desejos = sc.nextInt();
		return desejos;
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
			int aux = pedirDesejos();
			demonio.concedeDesejo(aux);
			
			
			break;

		case 2:
			System.out.println("2 - Recarregar a lâmpada");
	

			break;
		case 3:
			System.out.println("2 - Recarregar a lâmpada");
	

			break;
		}

	}
}