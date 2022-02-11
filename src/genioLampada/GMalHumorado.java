package genioLampada;

public class GMalHumorado extends Genio {

	
	 // Construtor(es)
	public GMalHumorado() {

	}
	
	 // Método(s)
	@Override
	public void concedeDesejo(long maxDesejos) {
		System.out.println("Olá! Eu sou o génio mal-humorado e irei conceder apenas seu primeiro desejo.");
		System.out.println("\nIndique o seu desejo");
		String desejoIndicado = Main.sc.nextLine();
		System.out.println("Desejo: " + desejoIndicado);
		System.out.println("\nDesejo Cumprido! :)");
		System.out.println("Esgotou os seus desejos :(");

	}
}
