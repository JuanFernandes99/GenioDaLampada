package genioLampada;

public class GMalHumorado extends Genio {

	// Construtor(es)
	public GMalHumorado() {
	}

	// M�todo

	// Concede apenas o primeiro desejo que lhe for colocado,independentemente da
	// quantidade de desejos (maxDesejos) que o utilizador pretende pedir.
	@Override
	public void concedeDesejo(int maxDesejos) {
		System.out.println("Ol�! Eu sou o g�nio mal-humorado e irei conceder apenas seu primeiro desejo.");
		System.out.println("\nIndique o seu desejo");
		String desejoIndicado = Main.sc.nextLine();
		System.out.println("Desejo: (" + desejoIndicado + "), Realizado! :)");
		System.out.print("Esgotou os seus desejos :( , ");
	}
}