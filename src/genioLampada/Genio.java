package genioLampada;

import java.util.Scanner;

public abstract class Genio {
	static Scanner sc = new Scanner(System.in);
	protected static int desejosConcedidos;
	protected static int maxDesejos;

	public abstract void concedeDesejo(int maxDesejos);

	// CONSTRUTOR
	public Genio() {

	}

	// metodos
	public static void AcresDesejos() { // Acrescimos dos desejos.
		desejosConcedidos++;
	}

	public static int pedirDesejos() {

		System.out.println("\nQuantos desejos pretende pedir?");

		int desejos = sc.nextInt();

		if (desejos <= 0) {

			System.out.println("O número de desejos deve ser superior a 0 ");
			pedirDesejos();

		}

		return desejos;
	}

	// setters e getters
	public int getDesejosConcedidos() {
		return desejosConcedidos;
	}

	public static int getMaxDesejos() {
		return maxDesejos;
	}

	public static void setMaxDesejos(int aMaxDesejos) {
		Genio.maxDesejos = aMaxDesejos;
	}

	public void setDesejosConcedidos(int aDesejosConcedidos) {
		Genio.desejosConcedidos = aDesejosConcedidos;
	}

}
