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

<<<<<<< Updated upstream
	@Override
	public void concedeDesejo() {

		
=======
	public void concedeDesejo(int max) {
		// TODO Auto-generated method stub
		// return
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

>>>>>>> Stashed changes
	}

}
