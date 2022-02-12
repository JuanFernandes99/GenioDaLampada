package genioLampada;

import java.util.InputMismatchException;

public class MenuJogo {

	public static void instrucoes() {

		System.out.println(" Instruções\n" + "\n"
				+ "Este jogo realiza-se dentro de uma Lâmpada Mágica que contém um número indeterminado de génios. \nO objetivo é iniciar a lâmpada, chamar génios e pedir desejos que determinam se irá sair um génio bem ou mal-humorado.\nTenta a tua sorte e vê o que acontece no final!\n"
				+ "\n" + "Passos:\n" + "\n" + "1. O jogador tem de esfregar a lâmpada para iniciar o jogo;\n"
				+ "2. O jogador decide quantas vezes quer esfregar a lâmpada;\n"
				+ "3. O jogador pede quantos desejos quer realizados;\n" + "4. BOOOM!!! Sai o génio;\n"
				+ "\nA sequência será repetida, pelo jogador, desde a opção 2 à opção 4.\n" + "Atenção!!!\n"
				+ "\nO jogador decide quando acaba o jogo a qualquer momento, através da opção disponível 'sair do jogo';");
	}

	public static void jogar() {

		if (Lampada.getNumgeniosDisponiveis() > 0) {
			Lampada.esfregarLampada();
		} else {
			Demonio.invocaDemonio();
		}
	}

	public static void menu() {
		System.out.println("\nEscolha uma das opções disponíveis:");
		System.out.println("1 - Instruções do jogo");
		System.out.println("2 - Começar o jogo");
		System.out.println("3 - Sair do jogo");
		System.out.println("4 - Quantidade Esfregadelas");
	}

	public static void segurancaSair() {
		System.out.println("Tem certeza que deseja sair do jogo?\n");
		System.out.println("1 - Sim");
		System.out.println("2 - Voltar ao jogo");
		try {
			int opcao = Main.sc.nextInt();
			Main.sc.nextLine();
			switch (opcao) {

			case 1:
				System.out.println("Até uma próxima!");
				System.exit(0);
				break;
			case 2:
				System.out.println("Bem-vindos novamente!\n");
				if (Demonio.isSair()) { //  feito para reduzir o codigo
					Demonio.invocaDemonio();
				} else {
					Main.main(null);
				}

				break;

			default:
				System.out.println("Só são permitidos números entre 1 a 2, tente novo.");

			}
		} catch (InputMismatchException e) {
			System.out.println("Só são permitidos números inteiros, tente novo.");
			Main.sc.nextLine();
			segurancaSair();
		}
		System.exit(0);
	}
}