package genioLampada;

import java.util.Scanner;

public abstract class Genio {
	static Scanner sc = new Scanner(System.in);
	protected int desejosConcedidos;

	protected static int max;

	// CONSTRUTOR
	public Genio() {

	}

	public abstract void concedeDesejo(int max);

	public void AcresDesejos() { // Acrescimos dos desejos.
		desejosConcedidos++;
	}
	
	public static int pedirDesejos() {
		System.out.println("\nQuantos desejos pretende pedir?");
		int desejos = sc.nextInt();
		return desejos;
	}

	// SETTERS E GETTERS
	public int getMax() {
		return max;
	}

	public void setMax(int aMax) {
		max = aMax;
	}

	public int getDesejosConcedidos() {
		return desejosConcedidos;
	}

	public void setDesejosConcedidos(int desejosConcedidos) {
		this.desejosConcedidos = desejosConcedidos;
	}

}
