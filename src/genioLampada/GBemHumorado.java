package genioLampada;

public class GBemHumorado extends Genio {

	// Atributo(s)


	// Construtor(es)
	public GBemHumorado() {
	}

	// FuncÃ£o concedeDesejo 
	// Concede desejos, permitindo ao código ser executado repetitivamente baseado
	// na condição da auxiliar ser menor comparativamente ao máximo de desejos
	// (atributo) e faz a contagem dos desejos pedidos.
	public void concedeDesejo(int maxDesejos) {
		System.out.println("Ola¡, eu sou o genio bem-humorado e lhe concederei todos os desejos que voce me pedir");
		super.concedeDesejo(maxDesejos);
	}


}

