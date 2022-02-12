package genioLampada;

public abstract class Genio {

	// Atributo(s)
	protected static int desejosConcedidos = 0;
	protected static int maxDesejos = 0;
	protected static int desejoDisponivel = 0;

	// Permite ao código ser executado repetitivamente com base na condição que os
	// desejos Concedidos (atributo) sejam menor comparativamente ao máximo de
	// desejos (atributo) e faz a contagem crescente dos desejos concedidos.

	
	// Construtor(es)
	public Genio() {
	}
	
	public void concedeDesejo(int aMaxDesejos) {
		while (desejosConcedidos < aMaxDesejos) {

			desejoDisponivel = aMaxDesejos - desejosConcedidos;
			System.out.println("\nDesejos disponiveis: " + desejoDisponivel);
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = Main.sc.nextLine();
			System.out.println("Desejo: " + desejoIndicado);
			System.out.println("\nDesejo Cumprido! :)");
			AcresDesejos();
			System.out.println("Desejos concedidos: " + desejosConcedidos);
		}

	}
	
	// Métodos

	// Soma os desejos concedidos anteriormente.
	public static void AcresDesejos() { 
		desejosConcedidos++;
	}

	// Pede o nº de desejos ao utilizador e guarda-os, condicionando-os nº num
	// intervalo e retorna  à quantidade de desejos..
	public static int pedirDesejos() {

		System.out.println("\nQuantos desejos pretende pedir?");

		int desejos = Main.sc.nextInt();
		Main.sc.nextLine();

		if (desejos <= 0 || desejos > 10) {

			System.out.println("O número de desejos deve ser superior a 0 e inferior a 10 ");
			pedirDesejos(); // Método recursivo que chama a si mesma para voltar ao início da função
		}

		return desejos;
	}
}
