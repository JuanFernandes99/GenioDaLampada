package genioLampada;

public class Lampada {
	// Atributo(s)
	private static  int maxGenios;
	private static  boolean isRecarregar;
	private static  Integer esfregadelas;
	private static  Integer vezesRecarregada;
	private static  Integer numgeniosDisponiveis;
	private static  Integer esfregadelasAcumuladas;

	// Construtor(es)
	public Lampada(int aMaxGenios) {
		maxGenios = aMaxGenios;
		numgeniosDisponiveis = aMaxGenios;
		isRecarregar = false;
		esfregadelas = 0;
		vezesRecarregada = 0;
		esfregadelasAcumuladas = 0;
	}

	// Método(s)
	public static void lampadaRecarregada() {
		setIsRecarregar(true);
		esfregadelas = 0;
		numgeniosDisponiveis = maxGenios;
		vezesRecarregada++;
		System.out.println("Vezes recarregada: " + vezesRecarregada);
	}

	public static void esfregar(int aNovasEsfregadelas) {
		esfregadelas = esfregadelas + aNovasEsfregadelas;

	}

	public static void esfregarLampada() {

		System.out.println("Quantas vezes deseja esfregar a lâmpada?");
		esfregadelas = Main.sc.nextInt();

		esfregar(esfregadelas);

		if (esfregadelas <= 0) {
			System.out.println("\nO número deve ser superior a zero.");
			esfregarLampada();

		} else if (esfregadelas != 0) {

			if (esfregadelas % 2 == 0) {
				GBemHumorado gBemHumorado = new GBemHumorado();
				gBemHumorado.concedeDesejo(Genio.pedirDesejos());

			} else {

				GMalHumorado gMalHumorado = new GMalHumorado();
				gMalHumorado.concedeDesejo(Genio.pedirDesejos());
			}
			esfregadelasAcumuladas = esfregadelas;
			System.out.println("Esfregou a lâmpada: " + esfregadelasAcumuladas + " vezes");
			setNumgeniosDisponiveis();
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

	public static Integer getEsfregadelasAcumuladas() {
		return esfregadelasAcumuladas;
	}

	public void setMaxGenios(int aMaxGenios) {
		maxGenios = aMaxGenios;
	}

	public static void setNumgeniosDisponiveis() {
		numgeniosDisponiveis--;
		System.out.println("numgeniosDisponiveis: " + numgeniosDisponiveis);

	}

	public static void setEsfregadelas(Integer aEsfregadelas) {
		esfregadelas = aEsfregadelas;
	}

	public void setVezesRecarregada(Integer aVezesRecarregada) {
		vezesRecarregada = aVezesRecarregada;
	}

	public static boolean isRecarregar() {
		return isRecarregar;
	}

	public static void setIsRecarregar(boolean aRecarregar) {
		isRecarregar = aRecarregar;
	}

	public static void setEsfregadelasAcumuladas(Integer aEsfregadelasAcumuladas) {
		esfregadelasAcumuladas = aEsfregadelasAcumuladas;
	}
}