package genioLampada;

import java.util.InputMismatchException;

public class Demonio extends Genio {

	private static boolean isSair; //verificaçao de segurança para poupar linhas de codigo
	static Demonio demonio = new Demonio();

	// Atributo(s)
	protected Integer desejoDisponivelDemonio;

	// Construtor(es)
	public Demonio() {
		desejoDisponivelDemonio = 0;
	}

	// Método(s)

	@Override
	public void concedeDesejo(int maxDesejos) {

		int aux = 0;
		while (aux < maxDesejos) {
			desejoDisponivelDemonio = maxDesejos - aux;
			System.out.println("\nDesejos disponiveis: " + (desejoDisponivelDemonio));
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
		System.out.println("Ola, eu sou demonio e lhe concederei todos os desejos que voce me pedir\n");

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
				System.out.println("Só é permitido números entre 1-3 , try again");
				invocaDemonio();
			}

		} catch (InputMismatchException e) {
			Main.sc.nextLine();
			System.out.println("Só é permitido números inteiros,  try again");
			invocaDemonio();
		}

	}

	public static void menuDemonio() {
		System.out.println("1 - Pedir desejos");
		System.out.println("2 - Recarregar a lampada");
		System.out.println("3- Sair do jogo");

	}

	public static void continuarDesejoDemonio() {
		int aux = Genio.pedirDesejos();
		demonio.concedeDesejo(aux);
		while (Lampada.isRecarregar() == false) {
			invocaDemonio();
		}

	}

	// Getters e Setters
	
	public Integer getDesejoDisponivelDemonio() {
		return desejoDisponivelDemonio;
	}

	public static boolean isSair() {
		return isSair;
	}

	public static void setIsSair(boolean aIsSair) {
		Demonio.isSair = aIsSair;
	}

	public void setDesejoDisponivelDemonio(Integer aDesejoDisponivelDemonio) {
		desejoDisponivelDemonio = aDesejoDisponivelDemonio;
	}

}
