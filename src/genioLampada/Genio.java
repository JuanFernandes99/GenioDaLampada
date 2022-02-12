package genioLampada;

public abstract class Genio {

	// Atributo(s)
	protected static int desejosConcedidos = 0;
	protected static int maxDesejos = 0;
	protected static int desejoDisponivel = 0;

	// Construtor(es)
	public Genio() {
	}
	
	// Permite ao c�digo ser executado repetitivamente com base na condi��o que os
	// desejos Concedidos (atributo) sejam menor comparativamente ao m�ximo de
	// desejos (atributo) e faz a contagem crescente dos desejos concedidos.
	public void concedeDesejo(int aMaxDesejos) {
		int aux = 0;
		while (aux < aMaxDesejos) {
			desejoDisponivel = aMaxDesejos - aux;
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = Main.sc.nextLine().replaceAll(" ", " ");
			if (desejoIndicado.isEmpty()) {  // Verifica��o de que o desejo Indicado n�o esteja vazio
				System.out.println("Desejo vazio, tente novamente");
			}else {
				if (Demonio.isActive()) {
					System.out.println("Desejo: " + desejoIndicado  );
					System.out.print("MUAHAHAHAHAHAHAH ");
					Demonio.getRandomWord();
				} else {
					System.out.println("Desejo: " + desejoIndicado + " Desejos disponiveis: " + (desejoDisponivel - 1));

				}
				acresDesejos();
				aux++;
			}


		}
	}

	// M�todos

	// Soma os desejos concedidos anteriormente.
	public static void acresDesejos() {
		desejosConcedidos++;
	}

	// Pede o n� de desejos ao utilizador e guarda-os, condicionando-os n� num
	// intervalo e retorna � quantidade de desejos

	public static int pedirDesejos() {

		System.out.println("Quantos desejos pretende pedir?");

		int desejos = Main.sc.nextInt();
		Main.sc.nextLine();

		if (desejos <= 0 || desejos > 10) {
			System.out.println("O n�mero de desejos deve ser superior a 0 e inferior a 10 ");
			return pedirDesejos(); // M�todo recursivo que chama a si mesma para voltar ao in�cio da fun��o
		}
		return desejos;
	}
}