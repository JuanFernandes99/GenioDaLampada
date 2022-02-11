package genioLampada;

public class GBemHumorado extends Genio {

	// Atributo(s)

	private int desejoDisponivelBemHumorado = 0;

	// Construtor(es)
	public GBemHumorado() {
	}

	// Funcão concedeDesejo 

	@Override
	public void concedeDesejo(int maxDesejos) { // Fun�ao que se 
		System.out.println("Olá, eu sou o genio bem-humorado e irei conceder todos os desejos que voce me pedir");
		int contadorDesejos = 0; 
		while (contadorDesejos < maxDesejos) {
			desejoDisponivelBemHumorado = maxDesejos - contadorDesejos;
			System.out.println("\nDesejos disponiveis: " + (desejoDisponivelBemHumorado));
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = Main.sc.nextLine();
			System.out.println("Desejo: (" + desejoIndicado + "), Realizado! :)");
			contadorDesejos++;
			Genio.AcresDesejos();
			System.out.println("Desejos concedidos: " + desejosConcedidos);
		}
		System.out.println("Esgotou os seus desejos :(");
	}
}

