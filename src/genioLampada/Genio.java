package genioLampada;

public abstract class Genio {

	// Atributos
	protected static int desejosConcedidos = 0;
	protected static int maxDesejos = 0;
	protected static int desejoDisponivel = 0;

	// Construtor
	public Genio() {
	}
	// M�todos
	
	// Permite ao c�digo ser executado repetitivamente com base na condi��o que os
	// desejos Concedidos (atributo) sejam menor comparativamente ao m�ximo de
	// desejos (atributo) e faz a contagem crescente dos desejos concedidos.
	public void concedeDesejo(int aMaxDesejos) {
		int aux = 0;
		while (aux < aMaxDesejos) {
			desejoDisponivel = aMaxDesejos - aux;
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = Main.sc.nextLine();
			if (desejoIndicado.isEmpty()) { // Verifica se a String do desejoIndicado est� vazia.
				System.out.println("Desejo vazio, tente novamente");
			} else {
				if (Demonio.isActive()) { // Verifica se o Demonio est� ativo.
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

	// Pede o n� de desejos ao utilizador e guarda-os, condicionando-os num
	// intervalo e retorna � quantidade de desejos

	public static int pedirDesejos() {

		System.out.println("Quantos desejos pretende pedir?");

		int desejos = Main.sc.nextInt();
		Main.sc.nextLine();

		if (desejos <= 0 || desejos > 10) {
			System.out.println("O n�mero de desejos deve ser superior a 0 e inferior a 10 ");
			return pedirDesejos(); // M�todo recursivo que chama a si mesma para voltar ao in�cio da pr�pria
		}
		return desejos;
	}
}