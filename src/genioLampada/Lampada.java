package genioLampada;

public class Lampada {

	private static int maxGenios;
	private static int esfregadelas;
	private static int vezesRecarregada;
	private static boolean isRecarregar = false;
	private static int numgeniosDisponiveis = 0;

	// construtor
	public Lampada(int aMaxGenios) {
		maxGenios = aMaxGenios;
		numgeniosDisponiveis = aMaxGenios;
	}

	// metodos

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

	public static int getVezesRecarregada() {
		return vezesRecarregada;
	}

	public void setMaxGenios(int aMaxGenios) {
		Lampada.maxGenios = aMaxGenios;
	}

	public static void setEsfregadelas(int aEsfregadelas) {
		Lampada.esfregadelas = aEsfregadelas;
	}

	public void setVezesRecarregada(int aVezesRecarregada) {
		Lampada.vezesRecarregada = aVezesRecarregada;
	}

	public static boolean isRecarregar() {
		return isRecarregar;
	}

	public static void setIsRecarregar(boolean aRecarregar) {
		isRecarregar = aRecarregar;
	}

}
