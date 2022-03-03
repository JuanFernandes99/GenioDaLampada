package genioLampada;

public class GMalHumorado extends Genio {

	// Construtor
	public GMalHumorado() {
	}

	// Método

	// Concede apenas o primeiro desejo que lhe for colocado,independentemente da
	// quantidade de desejos (maxDesejos) que o utilizador pretende pedir.
	@Override
	public void concedeDesejo(int maxDesejos) {
		System.out.println(
				"Arggggg Quem se atreveu a me chamar? Sou o Scar e estou de mau humor!!! Tens direito a UM desejo");
		System.out.println("\nIndique o seu desejo");
		String desejoIndicado = Main.sc.nextLine();
		System.out.println("Desejo: (" + desejoIndicado + "), Realizado! :)");
		System.out.print("Esgotou os seus desejos :( , ");
	}
	public void concedeDesejoo(int maxDesejos) {
		System.out.println(
				"Arggggg Quem se atreveu a me chamar? Sou o Scar e estou de mau humor!!! Tens direito a UM desejo");
		System.out.println("\nIndique o seu desejo");
		String desejoIndicado = Main.sc.nextLine();
		System.out.println("Desejo: (" + desejoIndicado + "), Realizado! :)");
		System.out.print("Esgotou os seus desejos :( , ");
	}
}