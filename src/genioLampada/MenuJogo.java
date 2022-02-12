package genioLampada;

import java.util.InputMismatchException;

public class MenuJogo {

	// M�todo instrucoes() - apresenta ao utilizador as instru��es sobre como
	// funciona o jogo
	public static void instrucoes() {

		System.out.println(" Instru��es\n" + "\n"
				+ "Este jogo realiza-se dentro de uma L�mpada M�gica que cont�m um n�mero indeterminados de g�nios. \nO objetivo � iniciar a l�mpada, chamar g�nios e pedir desejos que determinam se ir� sair um g�nio bem ou mal-humorado.\nTenta a tua sorte e v� o que acontece no final!\n"
				+ "\n" + "Passos:\n" + "\n" + "1. O jogador tem de esfregar a l�mpada para iniciar o jogo;\n"
				+ "2. O jogador decide quantas vezes quer esfregar a l�mpada;\n"
				+ "3. O jogador pede quantos desejos quer realizados;\n" + "4. BOOOM!!! Sai o g�nio;\n"
				+ "\nA sequ�ncia ser� repetida, pelo jogador, desde a op��o 2 � op��o 4.\n" + "Aten��o!!!\n");
		
	}
	// Indica o tipo de g�nio que sair� da l�mpada (g�nio (que ser� bem ou
	// mal-humorado) ou dem�nio)

	public static void jogar() {

		// Se ainda tem g�nios dispon�veis, podemos continuar a esfregar a l�mpada
		if (Lampada.getNumgeniosDisponiveis() > 0) {
			Lampada.esfregarLampada();
		} else { // Se n�o temos g�nios dispon�veis invoca o dem�nio
			Demonio.invocaDemonio();
		}
	}

	// Apresenta ao utilizador um menu principal com as op��es de jogo poss�veis,
	// enquanto houverem g�nios dispon�veis
	
	public static void menu() {
		System.out.println("\nEscolha uma das op��es dispon�veis:");
		System.out.println("1 - Instru��es do jogo");
		System.out.println("2 - Come�ar o jogo");
		System.out.println("3 - Sair do jogo");
		System.out.println("4 - Quantidade de Esfregadelas");
		System.out.println("5 - Quantidade de Recarregamentos");
	}

	// Apresenta ao utilizador um menu de seguran�a, ap�s ter
	// carregado na op��o do menu principal de "Sair do jogo", usando um try catch
	// com o prop�sito do tratamento das exce��es, produzidas no momento em que o
	// utilizador introduze inputs diferentes dos que s�o esperados
	
	public static void segurancaSair() {
		System.out.println("Tem certeza que deseja sair do jogo?\n");
		System.out.println("1 - Sim");
		System.out.println("2 - Voltar ao jogo");
		try {
			int opcao = Main.sc.nextInt();
			Main.sc.nextLine();
			switch (opcao) {

			case 1:
				System.out.println("At� uma pr�xima!");
				System.exit(0);
				break;
			case 2:
				System.out.println("Bem-vindos novamente!\n");
				if (Demonio.isSair()) {
					Demonio.invocaDemonio();
				} else {
					Main.main(null);
				}

				break;

			default:
				System.out.println("S� s�o permitidos n�meros entre 1 a 2, tente de novo.");

			}
		} catch (InputMismatchException e) {
			System.out.println("S� s�o permitidos n�meros inteiros, tente novo.");
			Main.sc.nextLine(); // Limpar consola
			segurancaSair(); // M�todo recursivo que chama a si mesma para voltar ao in�cio da fun��o
		}
		System.exit(0);
	}
}