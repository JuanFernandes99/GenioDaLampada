package genioLampada;

import java.util.Scanner;

public class DemonioReciclavel extends Genio {
	static Scanner sc = new Scanner(System.in);
	 protected int desejoDisponivelDemonio; // ver
	
	public DemonioReciclavel() {

	}

	public void concedeDesejo(int maxDesejos) {

		int aux = 0;
		while (aux < maxDesejos) {
			desejoDisponivelDemonio = maxDesejos - aux;
			System.out.println("\nDesejos disponiveis: " + (desejoDisponivelDemonio));
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = sc.next();
			System.out.println("Desejo: " + desejoIndicado);
			System.out.println("\nDesejo Cumprido! :)");
			aux++;
			Genio.AcresDesejos();
			System.out.println("Desejos concedidos: " + desejosConcedidos);
		}
	}

	public static void menuDemonio() {
		System.out.println("OlÃ¡, eu sou demonio e lhe concederei todos os desejos que vocÃª me pedir\n");
		DemonioReciclavel demonio = new DemonioReciclavel();

		System.out.println("1 - Pedir desejos");
		System.out.println("2 - Recarregar a lÃ¢mpada");
		System.out.println("3- Sair");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			int aux = Genio.pedirDesejos();
			demonio.concedeDesejo(aux);
			while (Lampada.isRecarregar() == false) {
				menuDemonio();
			}
			break;

		case 2:
			Lampada.lampadaRecarregada();
			System.out.println("Vezes recarregada: " + Lampada.getVezesRecarregada());
			break;

		case 3:
			System.out.println("sair do Jogo");
			System.exit(0);
			break;
			
		default: 
			System.out.println("Só é permitido números entre 1-3 , try again");
		}
	}

	public int getDesejoDisponivelDemonio() {
		return desejoDisponivelDemonio;
	}

	public void setDesejoDisponivelDemonio(int aDesejoDisponivelDemonio) {
		this.desejoDisponivelDemonio = aDesejoDisponivelDemonio;
	}



}
