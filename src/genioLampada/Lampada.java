package genioLampada;

public class Lampada {

	private static int maxGenios;
	private static Integer esfregadelas;
	private static Integer vezesRecarregada;
	private static boolean isRecarregar;
	private static Integer numgeniosDisponiveis;

	// construtor
	public Lampada(int aMaxGenios) {
		maxGenios = aMaxGenios;
		numgeniosDisponiveis = aMaxGenios;
		isRecarregar = false;
		esfregadelas = 0;
		vezesRecarregada = 0;
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

	public static void setNumgeniosDisponiveis() {
		Lampada.numgeniosDisponiveis--;
		System.out.println("numgeniosDisponiveis: " + numgeniosDisponiveis);

	}

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
