package genioLampada;

public class BemHumorado extends Genio {

	// atributos
	protected int desejoDisponivelBemHumorado; // perguntar isto

	// construtor
	public BemHumorado() {

	}

// métodos
	public void concedeDesejo(int maxDesejos) {
		System.out.println("Ola¡, eu sou o genio bem-humorado e lhe concederei todos os desejos que voce me pedir");
		int aux = 0;
		while (aux < maxDesejos) {
			desejoDisponivelBemHumorado = maxDesejos - aux;
			System.out.println("\nDesejos disponiveis: " + (desejoDisponivelBemHumorado));
			System.out.println("\nIndique o seu desejo");
			String desejoIndicado = sc.next();
			System.out.println("Desejo: " + desejoIndicado);
			System.out.println("\nDesejo Cumprido! :)");
			aux++;
			Genio.AcresDesejos();
			System.out.println("Desejos concedidos: " + desejosConcedidos);
		}
		System.out.println("Esgotou os seus desejos :(");
	}

	// getters e setters
	public int getDesejoDisponivelBemHumorado() {
		return desejoDisponivelBemHumorado;
	}

	public void setDesejoDisponivelBemHumorado(int aDesejoDisponivelBemHumorado) {
		desejoDisponivelBemHumorado = aDesejoDisponivelBemHumorado;
	}

}
