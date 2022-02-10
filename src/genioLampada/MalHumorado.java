package genioLampada;

public class MalHumorado extends Genio {

	
	 // Construtor(es)
	public MalHumorado() {

	}
	
	 // Método(s)
	@Override
	public void concedeDesejo(int maxDesejos) {
		System.out.println("OlÃ¡, eu sou o gÃªnio mal-humorado e lhe concederei apenas o seu primeiro desejo.");
		System.out.println("\nIndique o seu desejo");
		String desejoIndicado = Main.sc.next();
		System.out.println("Desejo: " + desejoIndicado);
		System.out.println("\nDesejo Cumprido! :)");
		System.out.println("Esgotou os seus desejos :(");

	}
}
