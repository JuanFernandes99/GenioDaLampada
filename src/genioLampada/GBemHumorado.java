package genioLampada;

public class GBemHumorado extends Genio {

	// Atributo(s)


	// Construtor(es)
	public GBemHumorado() {
	}
	
	// Métodos

	// Método que herdou da classe Génio
	public void concedeDesejo(int maxDesejos) {
		
		System.out.println("Ola!, eu sou o genio bem-humorado e lhe concederei todos os desejos que voce me pedir");
		super.concedeDesejo(maxDesejos);
		System.out.print("Esgotou os seus desejos :( , "); // arreglar
	}


}
