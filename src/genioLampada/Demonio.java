package genioLampada;

import java.util.InputMismatchException;

public class Demonio extends Genio {

	static Demonio demonio = new Demonio(); // Criação do Objeto chamado demónio
	// Atributo
	private static boolean isSair; // Atributo criado com o fim de utilizar o método “menuSegurançaSair ()” não só
									// para o menu principal como também para o menu do demónio

	private static boolean isActive;// Atributo criado com o fim de verificar se o demónio esta a ser utilizado.

	public Demonio() {
	}

	// Métodos

	public void concedeDesejo(int maxDesejos) {
		super.concedeDesejo(maxDesejos);

	}

	// Método que mostra as opções que o Demónio oferece, continuar a conceder
	// desejos, recarregar a Lâmpada ou permite sair do jogo, usando um try catch
	// com o propósito do tratamento das exceções, produzidas no momento em que o
	// utilizador introduze inputs diferentes dos que são esperados.
	public static void invocaDemonio() {
		System.out.println("\nWell well well! Quem é que temos aqui?! Sou o Joker, queres tentar a tua sorte?? \n");
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
				System.exit(0); // Método que encerra a execução da máquina virtual Java.
				break;

			default:
				System.out.println("Só são permitidos números entre 1 a 3 , tente de novo.");
				invocaDemonio(); // Método recursivo que chama a si mesma para voltar ao início da função
			}

		} catch (InputMismatchException e) {
			Main.sc.nextLine(); // Para limpar o Scanner
			System.out.println("Só são permitidos números inteiros, tente de novo.");
			invocaDemonio(); // Método recursivo que chama a si mesma para voltar ao início da função
		}

	}

	// Lista de opções em que o utilizador pode escolher.
	public static void menuDemonio() {
		System.out.println("1 - Pedir desejos");
		System.out.println("2 - Recarregar a lampada");
		System.out.println("3 - Sair do jogo");

	}

	// Método para continuar a pedir desejos ao demónio.
	public static void continuarDesejoDemonio() {

		demonio.concedeDesejo(Genio.pedirDesejos());

		while (!Lampada.isRecarregar()) {
			// Enquanto a lâmpada não for recarregada continua a invocar ao demónio
			invocaDemonio();
		}
	}
	
	// Método que cria frases aleatórias como resposta do demónio aos desejos.
	public static void getRandomWord() {
		String[] randomWords = { "Não teste o monstro em mim!", "Uma piada por dia distancia a tristeza.",
				"Sou só eu ou isto está a ficar cada vez mais maluco aqui?",
				"Tudo o que eu tenho são só pensamentos negativos, aqui está o seu desejo.",
				"Eu acredito que tudo o que não te mata deixa-te mais estranho.",
				"E eu achava que minhas piadas eram ruins...",
				"Avise-me quando começar a levar as coisas mais a sério.",
				"Por que os humanos pensam que podem corrigir um problema com outro?",
				"Você ouve gritos horríveis de dor. Eu ouço doces melodias de liberdade.",
				"Você é apenas uma aberração para eles, como eu",
				"Como você sabe, a insanidade é como a gravidade ... basta um pequeno empurrão.",
				"Você já dançou com o diabo ao luar?",
				"A verdadeira piada é sua profunda convicção de que de alguma forma, em algum lugar, tudo isso faz sentido.",
				"Paramos de procurar monstros debaixo da nossa cama, quando percebemos que eles estavam dentro de nós." };
		int numAleatorio = (int) (Math.random() * randomWords.length) + 1;
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