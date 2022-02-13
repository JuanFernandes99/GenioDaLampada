package genioLampada;

import java.util.InputMismatchException;

public class Demonio extends Genio {

	static Demonio demonio = new Demonio(); // Cria��o do Objeto chamado dem�nio
	// Atributos
	private static boolean isSair; // atributo criado com o fim de utilizar o m�todo �menuSeguran�aSair ()� n�o s�
									// para o menu principal como tamb�m para o menu do dem�nio
	private static boolean isActive; // atributo criado com o fim de verificar se o dem�nio est� a ser utilizado.

	// Construtor

	public Demonio() {
	}

	// M�todos

	public void concedeDesejo(int maxDesejos) {
		super.concedeDesejo(maxDesejos);

	}

	// M�todo que mostra as op��es que o Dem�nio oferece, continuar a conceder
	// desejos, recarregar a L�mpada ou permite sair do jogo, usando um try catch
	// com o prop�sito do tratamento das exce��es, produzidas no momento em que o
	// utilizador introduze inputs diferentes dos que s�o esperados.
	public static void invocaDemonio() {
		System.out.println("\nWell well well! Quem � que temos aqui?! Sou o Joker, queres tentar a tua sorte?? \n");
		menuDemonio();

		try {
			int opcao = Main.sc.nextInt();
			switch (opcao) {
			case 1:
				isActive = true;
				continuarDesejoDemonio();
				break;

			case 2:
				Lampada.lampadaRecarregada();
				isActive = false;
				break;

			case 3:
				isSair = true;
				MenuJogo.segurancaSair();
				System.exit(0); // M�todo que encerra a execu��o da m�quina virtual Java.
				break;

			default:
				System.out.println("S� s�o permitidos n�meros entre 1 e 3 , tente de novo.");
				invocaDemonio(); // M�todo recursivo que chama a si mesma para voltar ao in�cio da pr�pria
			}

		} catch (InputMismatchException e) {
			Main.sc.nextLine(); // Para limpar o Scanner
			System.out.println(
					"Erro fatal (448): Digite um n�mero inteiro de 1 at� 2147483647. Os caracteres tamb�m n�o s�o permitidos. Tente novamente :)");
			invocaDemonio(); // M�todo recursivo que chama a si mesma para voltar ao in�cio da pr�pria
		}

	}

	// Lista de op��es em que o utilizador pode escolher.
	public static void menuDemonio() {
		System.out.println("1 - Pedir desejos");
		System.out.println("2 - Recarregar a lampada");
		System.out.println("3 - Sair do jogo");

	}

	// M�todo para continuar a pedir desejos ao dem�nio.
	public static void continuarDesejoDemonio() {

		demonio.concedeDesejo(Genio.pedirDesejos());

		while (!Lampada.isRecarregar()) {
			// Enquanto a l�mpada n�o for recarregada continua a invocar ao dem�nio
			invocaDemonio();
		}
	}

	public static void getRandomWord() {
		String[] randomWords = { "N�o teste o monstro em mim!", "Uma piada por dia distancia a tristeza.",
				"Sou s� eu ou isto est� a ficar cada vez mais maluco aqui?",
				"Tudo o que eu tenho s�o s� pensamentos negativos, aqui est� o seu desejo.",
				"Eu acredito que tudo o que n�o te mata deixa-te mais estranho.",
				"E eu achava que minhas piadas eram ruins...",
				"Avise-me quando come�ar a levar as coisas mais a s�rio.",
				"Por que os humanos pensam que podem corrigir um problema com outro?",
				"Voc� ouve gritos horr�veis de dor. Eu ou�o doces melodias de liberdade.",
				"Voc� � apenas uma aberra��o para eles, como eu",
				"Como voc� sabe, a insanidade � como a gravidade ... basta um pequeno empurr�o.",
				"Voc� j� dan�ou com o diabo ao luar?",
				"A verdadeira piada � sua profunda convic��o de que de alguma forma, em algum lugar, tudo isso faz sentido.",
				"Paramos de procurar monstros debaixo da nossa cama, quando percebemos que eles estavam dentro de n�s." };
		int numAleatorio = (int) (Math.random() * (randomWords.length - 1)) + 1;
		System.out.println(randomWords[numAleatorio]);

	}

	// Getter

	public static boolean isSair() {
		return isSair;
	}

	public static boolean isActive() {
		return isActive;
	}

	public static void setActive(boolean aIsActive) {
		isActive = aIsActive;
	}

}