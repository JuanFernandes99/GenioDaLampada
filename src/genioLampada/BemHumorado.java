package genioLampada;

import java.util.Scanner;

public class BemHumorado extends Genio {
	static Scanner sc = new Scanner(System.in);

	protected int desejoDisponivel;
	protected int auxiliarGenio;

	public BemHumorado() {

	}

	public int desejoDisponivel() {
		return getMax() - getDesejosConcedidos();
	}

	public void concedeDesejo(int max) {
		System.out.println("Olá, eu sou o gênio bem-humorado e lhe concederei todos os desejos que você me pedir");
		int aux = 0; // desejos con
		while (aux < max) {

			System.out.println("\nDesejos disponiveis: " + (max - aux));
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = sc.next();
			System.out.println("Desejo: " + desejoIndicado);
			System.out.println("\nDesejo Cumprido! :)");

			aux++;
			Genio.AcresDesejos();
			System.out.println("Desejos concedidos: " + desejosConcedidos);
		}
		System.out.println("Esgotou os seus desejos :(");

	}

}
