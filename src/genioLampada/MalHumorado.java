package genioLampada;

import java.util.Scanner;

public class MalHumorado extends Genio {
	static Scanner sc = new Scanner(System.in);

	public MalHumorado() {

	}

	public void concedeDesejo(int max) {
		System.out.println("OlÃ¡, eu sou o gÃªnio mal-humorado e lhe concederei apenas o seu primeiro desejo.");
		System.out.println("\nIndique o seu desejo");
		String desejoIndicado = sc.next();
		System.out.println("Desejo: " + desejoIndicado);
		System.out.println("\nDesejo Cumprido! :)");
		System.out.println("Esgotou os seus desejos :(");

	}

	public void concedeDesejo() {

	}
}
