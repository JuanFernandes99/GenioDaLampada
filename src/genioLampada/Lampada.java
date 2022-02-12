package genioLampada;

public class Lampada {
	// Atributo(s)

	private static boolean isRecarregar = false;
	private static int maxGenios;
	private static int esfregadelas = 0;
	private static int vezesRecarregada = 0;
	private static int numgeniosDisponiveis = 0;
	private static int esfregadelasAcumuladas = 0;

	// Construtor(es)
	public Lampada(int aMaxGenios) {
		System.out.println("A lâmpada foi criada com " + aMaxGenios + " génio(s)");
		maxGenios = aMaxGenios;
		numgeniosDisponiveis = aMaxGenios;
	}

	// M�todo(s) // comentar funcoes

	public static int DecresGenios() { // Acrescimos dos desejos.
		numgeniosDisponiveis--;
		return numgeniosDisponiveis;
	}

	public static void lampadaRecarregada() {
		isRecarregar = true;
		esfregadelas = 0;
		numgeniosDisponiveis = maxGenios;
		vezesRecarregada++;
		System.out.println("Vezes recarregada: " + vezesRecarregada);
	}

	public static void esfregarLampada() {

		System.out.println("Quantas vezes deseja esfregar a lâmpada?");
		esfregadelas = Main.sc.nextInt();
		Main.sc.nextLine();
		esfregadelasAcumuladas += esfregadelas;
		if (esfregadelas <= 0) {
			System.out.println("\nO número deve ser superior a zero.");
			esfregarLampada();

		} else {

			if (esfregadelas % 2 == 0) {
				GBemHumorado gBemHumorado = new GBemHumorado();
				gBemHumorado.concedeDesejo(Genio.pedirDesejos());

			} else {

				GMalHumorado gMalHumorado = new GMalHumorado();
				gMalHumorado.concedeDesejo(Genio.pedirDesejos());
			}

		}
		DecresGenios();
		System.out.println("numgeniosDisponiveis: " + numgeniosDisponiveis);
	}

	// Getters

	public static int getNumgeniosDisponiveis() {
		return numgeniosDisponiveis;
	}

	public static int getEsfregadelasAcumuladas() {
		return esfregadelasAcumuladas;
	}

	public static boolean isRecarregar() {
		return isRecarregar;
	}
}