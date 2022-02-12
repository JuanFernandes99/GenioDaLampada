package genioLampada;

public class GBemHumorado extends Genio {

	// Atributo(s)

	// Construtor(es)
	public GBemHumorado() {
	}

	// Métodos

	// Método que herdou da classe Génio
	public void concedeDesejo(int maxDesejos) {
		System.out.println("----BOOOOOOM, prazer eu sou o Aladin e vou concretizar os teus desejos----");
		super.concedeDesejo(maxDesejos);
		System.out.println("Cumprido! :) , Desejos concedidos: " + desejosConcedidos + ", Desejos disponiveis: "
				+ (desejoDisponivel - 1));
		System.out.print("Esgotou os seus desejos :( , "); // arreglar
	}

}
