package genioLampada;

public class Lampada {

	private static int maxGenios;
	private static int esfregadelas;
	private int demonios;
	private static int vezesRecarregada;
	private int numeroDesejosEsperado;
	private static boolean isRecarregar = false;
	private static int numgeniosDisponiveis = 0;

	// construtor
	public Lampada(int aMaxGenios) {
		maxGenios = aMaxGenios;
		numgeniosDisponiveis = aMaxGenios;
	}

	// metodos

	public static void lampadaRecarregada() {
		setIsRecarregar(true); // pq?
		esfregadelas = 0;
		numgeniosDisponiveis = maxGenios;
		vezesRecarregada++;

	}

	public static void esfregar(int novasEsfregadelas) {
		esfregadelas = esfregadelas + novasEsfregadelas;

	}

	public static int quantidadeEsfregadelas() {

		return esfregadelas;

	}

	public void selecionarGenio() {

	}

	// getters e setters

	public static void setgeniosDisponiveis() {
		Lampada.numgeniosDisponiveis--;
		System.out.println("numgeniosDisponiveis: " + numgeniosDisponiveis);

	}

	public static int getGeniosDisponiveis() {
		return numgeniosDisponiveis;

	}

	public int getMaxGenios() {
		return maxGenios;
	}

	public static int getEsfregadelas() {
		return esfregadelas;
	}

	public int getDemonios() {
		return demonios;
	}

	public static int getVezesRecarregada() {
		return vezesRecarregada;
	}

	public int getNumeroDesejosEsperado() {
		return numeroDesejosEsperado;
	}

	public void setMaxGenios(int aMaxGenios) {
		Lampada.maxGenios = aMaxGenios;
	}

	public static void setEsfregadelas(int aEsfregadelas) {
		Lampada.esfregadelas = aEsfregadelas;
	}

	public void setDemonios(int aDemonios) {
		this.demonios = aDemonios;
	}

	public void setVezesRecarregada(int aVezesRecarregada) {
		Lampada.vezesRecarregada = aVezesRecarregada;
	}

	public void setNumeroDesejosEsperado(int aNumeroDesejosEsperado) {
		this.numeroDesejosEsperado = aNumeroDesejosEsperado;
	}

	public static boolean isRecarregar() { // get
		// return isRecarregar();
		return isRecarregar;
	}

	public static void setIsRecarregar(boolean aRecarregar) {
		// Lampada.recarregar = recarregar;
		isRecarregar = aRecarregar;
	}

}
