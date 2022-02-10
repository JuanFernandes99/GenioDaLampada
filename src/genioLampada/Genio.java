package genioLampada;

import java.util.Scanner;

public abstract class Genio {
	static Scanner sc = new Scanner(System.in);
	protected static Integer desejosConcedidos;
	protected static Integer maxDesejos;

	public abstract void concedeDesejo(int maxDesejos);

	// CONSTRUTOR
	public Genio() {
		desejosConcedidos = 0;
		maxDesejos = 0;
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
	public Integer getDesejosConcedidos() {
		return desejosConcedidos;
	}

	public static Integer getMaxDesejos() {
		return maxDesejos;
	}

	public static void setMaxDesejos(Integer aMaxDesejos) {
		Genio.maxDesejos = aMaxDesejos;
	}

	public void setDesejosConcedidos(Integer aDesejosConcedidos) {
		Genio.desejosConcedidos = aDesejosConcedidos;
	}

}
