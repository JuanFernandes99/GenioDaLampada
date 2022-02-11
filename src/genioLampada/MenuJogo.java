package genioLampada;

import java.util.InputMismatchException;

public class MenuJogo {

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

		if (Lampada.getNumgeniosDisponiveis() > 0) {
			Lampada.esfregarLampada();
		} else {
			Demonio.invocaDemonio();
		}
	}

	public static void menu() {
		System.out.println("\nEscolha uma das opções disponíveis:");
		System.out.println("1 - Instruções do Jogo");
		System.out.println("2 - Esfregar a Lâmpada");
		System.out.println("3 - Sair do Jogo");
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
				System.out.println("Até logo!");
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
				System.out.println("Só é permitido números entre 1-2 , try again");

			}
		} catch (InputMismatchException e) {
			System.out.println("Só é permitido números inteiros,  try again");
			Main.sc.nextLine();
			segurancaSair();
		}
		System.exit(0);
	}
}