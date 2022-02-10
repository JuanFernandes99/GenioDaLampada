package genioLampada;

public class Lampada {
	// Atributo(s)
	private static int maxGenios;
	private static Integer esfregadelas;
	private static Integer vezesRecarregada;
	private static boolean isRecarregar;
	private static Integer numgeniosDisponiveis;

	 // Construtor(es)
	public Lampada(int aMaxGenios) {
		maxGenios = aMaxGenios;
		numgeniosDisponiveis = aMaxGenios;
		isRecarregar = false;
		esfregadelas = 0;
		vezesRecarregada = 0;
	}

	 // Método(s)
	public static void lampadaRecarregada() {
		setIsRecarregar(true);
		esfregadelas = 0;
		numgeniosDisponiveis = maxGenios;
		vezesRecarregada++;
		System.out.println("Vezes recarregada: " + Lampada.getVezesRecarregada());

	}

	public static void esfregar(int novasEsfregadelas) {
		esfregadelas = esfregadelas + novasEsfregadelas;

	}

	public static int quantidadeEsfregadelas() {

		return esfregadelas;

	}

	public static void esfregarLampada() {

		System.out.println("Quantas vezes deseja esfregar a lâmpada?");
		int esfregadelas = Main.sc.nextInt(); // verificar isto

		Lampada.esfregar(esfregadelas);

		if (esfregadelas <= 0) {

			System.out.println("\nO número deve ser superior a zero.");
			esfregarLampada();

		}

		else if (esfregadelas != 0) {

			int aux = Genio.pedirDesejos();

			if (esfregadelas % 2 == 0) {
				BemHumorado gBemHumorado = new BemHumorado();
				gBemHumorado.concedeDesejo(aux);

			} else {

				MalHumorado gmauHumorado = new MalHumorado();
				gmauHumorado.concedeDesejo(aux);
			}
			int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
			System.out.println("Esfregou a lâmpada: " + esfregadelasAcumuladas + " vezes");
			Lampada.setNumgeniosDisponiveis();

		}
	}

	// Getters e Setters

	public static Integer getNumgeniosDisponiveis() {
		return numgeniosDisponiveis;

	}

	public int getMaxGenios() {
		return maxGenios;
	}

	public static Integer getEsfregadelas() {
		return esfregadelas;
	}

	public static Integer getVezesRecarregada() {
		return vezesRecarregada;
	}

	public void setMaxGenios(int aMaxGenios) {
		Lampada.maxGenios = aMaxGenios;
	}

	public static void setNumgeniosDisponiveis() {
		Lampada.numgeniosDisponiveis--;
		System.out.println("numgeniosDisponiveis: " + numgeniosDisponiveis);

	}

	public static void setEsfregadelas(Integer aEsfregadelas) {
		Lampada.esfregadelas = aEsfregadelas;
	}

	public void setVezesRecarregada(Integer aVezesRecarregada) {
		Lampada.vezesRecarregada = aVezesRecarregada;
	}

	public static boolean isRecarregar() {
		return isRecarregar;
	}

	public static void setIsRecarregar(boolean aRecarregar) {
		isRecarregar = aRecarregar;
	}

}
