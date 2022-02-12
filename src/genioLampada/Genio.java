package genioLampada;

public abstract class Genio {

	// Atributo(s)
	protected static int desejosConcedidos = 0;
	protected static int maxDesejos = 0;
	protected static int desejoDisponivel = 0;

	// Concede desejos, permitindo ao código ser executado repetitivamente baseado
	// na condição da auxiliar ser menor comparativamente ao máximo de desejos
	// (atributo) e faz a contagem dos desejos pedidos.

	public void concedeDesejo(int aMaxDesejos) {
		int contadorDesejos = 0;
		while (contadorDesejos < aMaxDesejos) {
			desejoDisponivel = aMaxDesejos - contadorDesejos;
			System.out.println("\nDesejos disponiveis: " + (desejoDisponivel));
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = Main.sc.nextLine();
			System.out.println("Desejo: " + desejoIndicado);
			System.out.println("\nDesejo Cumprido! :)");
			contadorDesejos++;
			Genio.AcresDesejos();
			System.out.println("Desejos concedidos: " + desejosConcedidos);
		}

		System.out.println("Esgotou os seus desejos :(");
	}

	// Construtor(es)
	public Genio() {
	}

	// Mï¿½todo(s)

	// Soma os desejos concedidos anteriormente.
	public static void AcresDesejos() { // Acrescimos dos desejos.
		desejosConcedidos++;
	}

	// Pede o nº de desejos ao utilizador e guarda-os, condicionando-os nº num
	// intervalo.
	public static int pedirDesejos() {

		System.out.println("\nQuantos desejos pretende pedir?");

		int desejos = Main.sc.nextInt();
		Main.sc.nextLine();

		if (desejos <= 0 || desejos > 10) {

			System.out.println("O nÃºmero de desejos deve ser superior a 0 e inferior a 10 ");
			pedirDesejos();

		}

		return desejos;
	}
}
