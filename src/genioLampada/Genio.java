package genioLampada;

public abstract class Genio {

	// Atributos
	protected static int desejosConcedidos = 0;
	protected static int maxDesejos = 0;
	protected static int desejoDisponivel = 0;

	// Construtor
	public Genio() {
	}
	// Métodos
	
	// Permite ao código ser executado repetitivamente com base na condição que os
	// desejos Concedidos (atributo) sejam menor comparativamente ao máximo de
	// desejos (atributo) e faz a contagem crescente dos desejos concedidos.
	public void concedeDesejo(int aMaxDesejos) {
		int aux = 0;
		while (aux < aMaxDesejos) {
			desejoDisponivel = aMaxDesejos - aux;
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = Main.sc.nextLine();
			if (desejoIndicado.isEmpty()) { // Verifica se a String do desejoIndicado está vazia.
				System.out.println("Desejo vazio, tente novamente");
			} else {
				if (Demonio.isActive()) { // Verifica se o Demonio está ativo.
					System.out.println("Desejo: " + desejoIndicado);
					System.out.print("MUAHAHAHAHAHAHAH ");
					Demonio.getRandomWord();
				} else {
					System.out
							.println("Desejo: " + desejoIndicado + " ,Desejos disponiveis: " + (desejoDisponivel - 1));

				}
				acresDesejos();
				aux++;
			}

		}
	}

	// Soma os desejos concedidos anteriormente.
	public static void acresDesejos() {
		desejosConcedidos++;
	}

	// Pede o nº de desejos ao utilizador e guarda-os, condicionando-os num
	// intervalo e retorna à quantidade de desejos

	public static int pedirDesejos() {

		System.out.println("Quantos desejos pretende pedir?");

		int desejos = Main.sc.nextInt();
		Main.sc.nextLine();

		if (desejos <= 0 || desejos > 10) {
			System.out.println("O número de desejos deve ser superior a 0 e inferior a 10 ");
			return pedirDesejos(); // Método recursivo que chama a si mesma para voltar ao início da própria
		}
		return desejos;
	}
}