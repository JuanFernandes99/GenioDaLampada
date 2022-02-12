package genioLampada;

public abstract class Genio {

	// Atributo(s)
	protected static int desejosConcedidos = 0;
	protected static int maxDesejos = 0;
	protected static int desejoDisponivel = 0;

<<<<<<< HEAD
<<<<<<< HEAD
	// Permite ao código ser executado repetitivamente com base na condição que os
	// desejos Concedidos (atributo) sejam menor comparativamente ao máximo de
	// desejos (atributo) e faz a contagem crescente dos desejos concedidos.
=======
	// Concede desejos, permitindo ao cï¿½digo ser executado repetitivamente baseado
	// na condiï¿½ï¿½o da auxiliar ser menor comparativamente ao mï¿½ximo de desejos
	// (atributo) e faz a contagem dos desejos pedidos.
>>>>>>> 470cb1096748254cbe6dc9f7153cafd361707119
=======
	// Concede desejos, permitindo ao código ser executado repetitivamente baseado
	// na condição da auxiliar ser menor comparativamente ao máximo de desejos
	// (atributo) e faz a contagem dos desejos pedidos.
>>>>>>> parent of 59e9d65 (Atualizado!)

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

<<<<<<< HEAD
	// Pede o nº de desejos ao utilizador e guarda-os, condicionando-os nº num
<<<<<<< HEAD
	// intervalo e retorna  à quantidade de desejos..
=======
	// Pede o nï¿½ de desejos ao utilizador e guarda-os, condicionando-os nï¿½ num
	// intervalo.
>>>>>>> 470cb1096748254cbe6dc9f7153cafd361707119
=======
	// intervalo.
>>>>>>> parent of 59e9d65 (Atualizado!)
	public static int pedirDesejos() {

		System.out.println("\nQuantos desejos pretende pedir?");

		int desejos = Main.sc.nextInt();
		Main.sc.nextLine();

		if (desejos <= 0 || desejos > 10) {

<<<<<<< HEAD
<<<<<<< HEAD
			System.out.println("O número de desejos deve ser superior a 0 e inferior a 10 ");
			pedirDesejos(); // Método recursivo que chama a si mesma para voltar ao início da função
=======
			System.out.println("O nÃºmero de desejos deve ser superior a 0 e inferior a 10, inclusive. ");
			pedirDesejos();

>>>>>>> 470cb1096748254cbe6dc9f7153cafd361707119
=======
			System.out.println("O nÃºmero de desejos deve ser superior a 0 e inferior a 10 ");
			pedirDesejos();

>>>>>>> parent of 59e9d65 (Atualizado!)
		}

		return desejos;
	}
}
