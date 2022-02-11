package genioLampada;

public class GBemHumorado extends Genio {

	// Atributo(s)

	private long desejoDisponivelBemHumorado;

	// Construtor(es)
	public GBemHumorado() {
		desejoDisponivelBemHumorado = 0;
	}

	// Método(s)

	@Override
	public void concedeDesejo(long maxDesejos) {
		System.out.println("Olá, eu sou o genio bem-humorado e irei conceder todos os desejos que voce me pedir");
		int aux = 0;
		while (aux < maxDesejos) {
			desejoDisponivelBemHumorado = maxDesejos - aux;
			System.out.println("\nDesejos disponiveis: " + (desejoDisponivelBemHumorado));
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = Main.sc.nextLine();
			System.out.println("Desejo: " + desejoIndicado);
			System.out.println("\nDesejo Cumprido! :)");
			aux++;
			Genio.AcresDesejos();
			System.out.println("Desejos concedidos: " + desejosConcedidos);
		}
		System.out.println("Esgotou os seus desejos :(");
	}

	// Getters e Setters
	public long getDesejoDisponivelBemHumorado() {				// retirar
		return desejoDisponivelBemHumorado;
	}

	public void setDesejoDisponivelBemHumorado(Integer aDesejoDisponivelBemHumorado) {			// retirar
		desejoDisponivelBemHumorado = aDesejoDisponivelBemHumorado;
	}

}
