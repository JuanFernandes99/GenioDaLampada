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
		int aux = 0;
		while (aux < max) {

			System.out.println("\nDesejos dispon�veis: " + (max - aux));
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = sc.next();
			System.out.println("Desejo: " + desejoIndicado);
			System.out.println("\nDesejos Cumpridos! :)");

			aux++;

		}
		System.out.println("Esgotou os seus desejos :(");


	}

}
