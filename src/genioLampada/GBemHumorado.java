package genioLampada;

public class GBemHumorado extends Genio {
	
	// Construtor
	public GBemHumorado() {
	}

	// Método que herdou da classe Génio
	public void concedeDesejo(int maxDesejos) {
		System.out.println("----BOOOOOOM, prazer eu sou o Aladin e vou concretizar os teus desejos----");
		super.concedeDesejo(maxDesejos);
		System.out.println("Desejos concedidos: " + desejosConcedidos + ", HUHU!!! Todos os desejos foram realizados ");
	}

}
