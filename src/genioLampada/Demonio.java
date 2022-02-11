package genioLampada;

import java.util.InputMismatchException;

public class Demonio extends Genio {

	private static boolean isSair; //verificaçao de segurança para poupar linhas de codigo
	static Demonio demonio = new Demonio();

	// Atributo(s)
	protected long desejoDisponivelDemonio;

	// Construtor(es)
	public Demonio() {
		desejoDisponivelDemonio = 0;
	}

	// Método(s)

	@Override
	public void concedeDesejo(long maxDesejos) {

		int aux = 0;
		while (aux < maxDesejos) {
			desejoDisponivelDemonio = maxDesejos - aux;
			System.out.println("\nDesejos disponíveis: " + (desejoDisponivelDemonio));
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = Main.sc.nextLine();
			System.out.println("Desejo: " + desejoIndicado);
			System.out.println("\nDesejo Cumprido! :)");
			aux++;
			Genio.AcresDesejos();
			System.out.println("Desejos concedidos: " + desejosConcedidos);
		}
	}

	public static void invocaDemonio() {
		System.out.println("Ola, eu sou demónio e irei conceder todos os desejos que você me pedir.\n");

		menuDemonio();

		try {
			int opcao = Main.sc.nextInt();
			switch (opcao) {
			case 1:
				continuarDesejoDemonio();
				break;

			case 2:
				Lampada.lampadaRecarregada();
				break;

			case 3:
				isSair = true;
				MenuJogo.segurancaSair();
				System.exit(0);
				break;

			default:
				System.out.println("Só são permitidos números entre 1 a 3 , tente novo.");
				invocaDemonio();
			}

		} catch (InputMismatchException e) {
			Main.sc.nextLine();
			System.out.println("Só são permitidos números inteiros, tente novo.");
			invocaDemonio();
		}

	}

	public static void menuDemonio() {
		System.out.println("1 - Pedir desejos");
		System.out.println("2 - Recarregar a lampada");
		System.out.println("3 - Sair do jogo");

	}

	public static void continuarDesejoDemonio() {
		int aux = Genio.pedirDesejos();
		demonio.concedeDesejo(aux);
		while (!Lampada.isRecarregar()) {
			invocaDemonio();
		}

	}

	// Getters e Setters
	
	public long getDesejoDisponivelDemonio() {											// retirar
		return desejoDisponivelDemonio;	
	}

	public static boolean isSair() {
		return isSair;
	}

	public static void setIsSair(boolean aIsSair) {											// verificar se � possivel retirar
		Demonio.isSair = aIsSair;
	}

	public void setDesejoDisponivelDemonio(Integer aDesejoDisponivelDemonio) {				// retirar
		desejoDisponivelDemonio = aDesejoDisponivelDemonio;
	}

}
