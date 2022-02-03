package genioLampada;

import java.util.Scanner;

public class DemonioReciclavel extends Genio {
	static Scanner sc = new Scanner(System.in);
	
	public DemonioReciclavel() {

	}

	public void concedeDesejo(int max) {
		System.out.println("Yes");
	}
	public static void menuDemonio() {
		System.out.println("Olá, eu sou demonio e lhe concederei todos os desejos que você me pedir");
		DemonioReciclavel demonio = new DemonioReciclavel();
		
		System.out.println("1 - Pedir desejos?");
		System.out.println("2 - Recarregar a lâmpada");
		System.out.println("3- Sair");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			int aux = Main.pedirDesejos(); // ver
			demonio.concedeDesejo(aux);
			
			
			break;

		case 2:
			System.out.println("2 - Recarregar a lâmpada");
	

			break;
		case 3:
			System.out.println("2 - Recarregar a lâmpada");
	

			break;
		}

	}


}
