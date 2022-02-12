package genioLampada;

public class GMalHumorado extends Genio {

	// Construtor(es)
	public GMalHumorado() {
	}

	// Método(s)
	//Concede desejos com maximo de desejos (atributo), guarda o desejo pedido.
	@Override
	public void concedeDesejo(int maxDesejos) {
		System.out.println("Olá! Eu sou o génio mal-humorado e irei conceder apenas seu primeiro desejo.");
		System.out.println("\nIndique o seu desejo");
		String desejoIndicado = Main.sc.nextLine();
		System.out.println("Desejo: (" + desejoIndicado + "), Realizado! :)");
		System.out.println("Esgotou os seus desejos :(");
	}
}
