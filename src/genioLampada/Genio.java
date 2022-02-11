package genioLampada;

public abstract class Genio {
	
	// Atributo(s)
	protected static int desejosConcedidos = 0;
	protected static int maxDesejos = 0;


	public abstract void concedeDesejo(int maxDesejos);

	 // Construtor(es)
	public Genio() {
	}

	 // M�todo(s)
	public static void AcresDesejos() { // Acrescimos dos desejos.
		desejosConcedidos++;
	}

	public static int pedirDesejos() {

		System.out.println("\nQuantos desejos pretende pedir?");

		int desejos = Main.sc.nextInt();
		Main.sc.nextLine();

		if (desejos <= 0) {

			System.out.println("O número de desejos deve ser superior a 0 ");
			pedirDesejos();

		}

		return desejos;
	}
}
