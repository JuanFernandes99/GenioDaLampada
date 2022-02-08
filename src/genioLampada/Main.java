package genioLampada;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int randomNum = (int) (Math.random() * 2) + 1; // 1 to 100
	static Lampada nlampada = new Lampada(randomNum);

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao jogo da Lampada MÃ¡gica!");
		while (true) {
			menu();
		}
	}

	public static void menu() {

		System.out.println("\nEscolha uma das opÃ§Ãµes disponÃ­veis:");
		System.out.println("1 - Esfregar a LÃ¢mpada");
		System.out.println("2 - Sair do Jogo");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			if (Lampada.getGeniosDisponiveis() > 0) {
				esfregarLampada();
			} else {
				DemonioReciclavel.menuDemonio();
			}
			/*
			 * caso nao seja, chamar o demonio, abrir menu que pergunta se Ã© para garantir
			 * desejo ou recarregar lampada. Se for p/ recarregar, chamar funcao que estÃ¡ na
			 * lampada atualizar o numero de genios disponiveis com o nÃºmero aleatorio dado
			 * na criaÃ§ao da lampada
			 */
			break;

		case 2:
			System.out.println("2 - Sair");
			System.exit(0);

			break;
		}

	}

	public static void esfregarLampada() {

		System.out.println("Quantas vezes deseja esfregar a lÃ¢mpada?");
		int esfregadelas = sc.nextInt();
		Lampada.esfregar(esfregadelas);
		int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
		System.out.println("Esfregou a lÃ¢mpada: " + esfregadelasAcumuladas + " vezes");

		int aux = Genio.pedirDesejos();

		if (esfregadelas % 2 == 0) {

			BemHumorado gBemHumorado = new BemHumorado();
			gBemHumorado.concedeDesejo(aux);

		} else {

			MalHumorado gmauHumorado = new MalHumorado();
			gmauHumorado.concedeDesejo(aux);
		}
		Lampada.setgeniosDisponiveis();
	}

}