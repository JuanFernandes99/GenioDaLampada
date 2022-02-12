package genioLampada;

public class GBemHumorado extends Genio {

	// Atributo(s)


	// Construtor(es)
	public GBemHumorado() {
	}

	// Funcão concedeDesejo 
	// Concede desejos, permitindo ao c�digo ser executado repetitivamente baseado
	// na condi��o da auxiliar ser menor comparativamente ao m�ximo de desejos
	// (atributo) e faz a contagem dos desejos pedidos.
	public void concedeDesejo(int maxDesejos) {
		System.out.println("Ola�, eu sou o genio bem-humorado e vou conceder todos os desejos que voce me pedir.");
		super.concedeDesejo(maxDesejos);
	}


}

