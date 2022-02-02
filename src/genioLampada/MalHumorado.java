package genioLampada;

import java.util.Scanner;

public class MalHumorado extends Genio {
	static Scanner sc = new Scanner(System.in);

	public MalHumorado() {

	}

	public void concedeDesejo(int max) {
		System.out.println("Olá, eu sou o gênio mal-humorado e lhe concederei apenas o seu primeiro desejo.");
		System.out.println("\nIndique o seu desejo");
		String desejoIndicado = sc.next();
		System.out.println("Desejo: " + desejoIndicado);
		System.out.println("\nDesejos Cumpridos! :)");
		System.out.println("Esgotou os seus desejos :(");

	}

	public void concedeDesejo() {

	}
}
