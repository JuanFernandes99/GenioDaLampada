package genioLampada;

public class GBemHumorado extends Genio {

	// Atributo(s)


	// Construtor(es)
	public GBemHumorado() {
	}
	
	// M�todos

	// M�todo que herdou da classe G�nio
	public void concedeDesejo(int maxDesejos) {
		
		System.out.println("Ola!, eu sou o genio bem-humorado e lhe concederei todos os desejos que voce me pedir");
		super.concedeDesejo(maxDesejos);
		System.out.print("Esgotou os seus desejos :( , "); // arreglar
	}


}
