package genioLampada;

public class Lampada {

	private int maxGenios; 
	private int auxiliarGenios; // ?
	private static int esfregadelas;
	private int demonios;
	private static int vezesRecarregada;
	private int numeroDesejosEsperado;
	private static boolean recarregar = false;
	private static int numgeniosDisponiveis = 0;
	
	// construtor
	public Lampada(int aMaxGenios) {
		this.maxGenios = aMaxGenios;
		this.numgeniosDisponiveis = aMaxGenios;
	}

	// metodos

	public static void lampadaRecarregada() {
		recarregar = true;
		esfregadelas = 0;
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

	public void setgeniosDisponiveis() {
		this.numgeniosDisponiveis--;
		System.out.println("numgeniosDisponiveis " + numgeniosDisponiveis);

	}
	public static int getGeniosDisponiveis() {
		return numgeniosDisponiveis;

	}
	public int getMaxGenios() {
		return maxGenios;
	}

	public int getAuxiliarGenios() {
		return auxiliarGenios;
	}

	public static int getEsfregadelas() {
		return esfregadelas;
	}

	public int getDemonios() {
		return demonios;
	}

	public int getVezesRecarregada() {
		return vezesRecarregada;
	}

	public int getNumeroDesejosEsperado() {
		return numeroDesejosEsperado;
	}

	public void setMaxGenios(int aMaxGenios) {
		this.maxGenios = aMaxGenios;
	}

	public void setAuxiliarGenios(int aAuxiliarGenios) {
		this.auxiliarGenios = aAuxiliarGenios;
	}

	public static void setEsfregadelas(int aEsfregadelas) {
		Lampada.esfregadelas = aEsfregadelas;
	}

	public void setDemonios(int aDemonios) {
		this.demonios = aDemonios;
	}

	public void setVezesRecarregada(int aVezesRecarregada) {
		this.vezesRecarregada = aVezesRecarregada;
	}

	public void setNumeroDesejosEsperado(int aNumeroDesejosEsperado) {
		this.numeroDesejosEsperado = aNumeroDesejosEsperado;
	}

}

