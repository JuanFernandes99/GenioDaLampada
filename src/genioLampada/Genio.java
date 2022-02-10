package genioLampada;

public abstract class Genio {

	// Atributo(s)
	protected static Integer desejosConcedidos;
	protected static Integer maxDesejos;

	public abstract void concedeDesejo(int maxDesejos);

	// Construtor(es)
	public Genio() {
		desejosConcedidos = 0;
		maxDesejos = 0;
	}

	// Método(s)
	public static void AcresDesejos() { // Acrescimos dos desejos.
		desejosConcedidos++;
	}

	public static int pedirDesejos() {

		System.out.println("\nQuantos desejos pretende pedir?");

		int desejos = Main.sc.nextInt();

		if (desejos <= 0) {

			System.out.println("O número de desejos deve ser superior a 0 ");
			pedirDesejos();

		}

		return desejos;
	}

	// Getters e Setters
	public Integer getDesejosConcedidos() {
		return desejosConcedidos;
	}

	public static Integer getMaxDesejos() {
		return maxDesejos;
	}

	public static void setMaxDesejos(Integer aMaxDesejos) {
		maxDesejos = aMaxDesejos;
	}

	public void setDesejosConcedidos(Integer aDesejosConcedidos) {
		desejosConcedidos = aDesejosConcedidos;
	}

}
