package genioLampada;

import java.util.InputMismatchException;

public class MenuJogo {

	public static void instrucoes() {

		System.out.println(" Instru��es\n" + "\n"
				+ "Este jogo realiza-se dentro de uma L�mpada M�gica que cont�m g�nios indeterminados. \nO objetivo � iniciar a l�mpada, chamar g�nios e pedir desejos, que determinam se ir� sair um g�nio bem-humorado ou mal-humorado.\nTenta a tua sorte e v� o que acontece no final!\n"
				+ "\n" + "Passos:\n" + "\n" + "1. O jogador tem de iniciar a l�mpada;\n"
				+ "2. O jogador decide quantas vezes quer esfregar a l�mpada;\n"
				+ "3. O jogador pede quantos desejos quer ver realizados;\n" + "4. BOOOM!!! Sai o g�nio;\n"
				+ "\nA sequ�ncia ser� repetida pelo jogador do ponto 2 at� ao ponto 4.\n" + "Aten��o!!!\n"
				+ "\nO jogador decide quando acabar o jogo a qualquer momento atrav�s da op��o dispon�vel �sair do jogo�;");
	}

	public static void jogar() {

		if (Lampada.getNumgeniosDisponiveis() > 0) {
			Lampada.esfregarLampada();
		} else {
			Demonio.invocaDemonio();
		}
	}

	public static void menu() {
		System.out.println("\nEscolha uma das op��es dispon�veis:");
		System.out.println("1 - Instru��es do Jogo");
		System.out.println("2 - Esfregar a L�mpada");
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
				System.out.println("At� logo!");
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
				System.out.println("S� � permitido n�meros entre 1-2 , try again");

			}
		} catch (InputMismatchException e) {
			System.out.println("S� � permitido n�meros inteiros,  try again");
			Main.sc.nextLine();
			segurancaSair();
		}
		System.exit(0);
	}
}