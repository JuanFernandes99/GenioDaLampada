package genioLampada;

public class Lampada {

	// Atributos
	private static boolean isRecarregar = false;
	private static int maxGenios;
	private static int esfregadelas = 0;
	private static int vezesRecarregada = 0;
	private static int numGeniosDisponiveis = 0;
	private static int esfregadelasAcumuladas = 0;

	// Construtor
	public Lampada(int aMaxGenios) {
		maxGenios = aMaxGenios;
		numGeniosDisponiveis = aMaxGenios;
	}

	// M�todos

	// Subtrai o n�mero de g�nios dispon�veis e retorna esse valor.
	public static int decresGenios() {
		numGeniosDisponiveis--;
		return numGeniosDisponiveis;
	}

	// Reverte os dados da l�mpada a como eram na 1� vez que foi usada, ap�s ter
	// sido recarregada
	public static void lampadaRecarregada() {
		isRecarregar = true;
		numGeniosDisponiveis = maxGenios;
		vezesRecarregada++;
		esfregadelasAcumuladas = 0;
		Genio.desejosConcedidos = 0;
	}

	// Indica o tipo de g�nio que sair� da l�mpada (entre o bem e o mal-humorado) e
	// indica quantos ainda est�o dispon�veis
	public static void esfregarLampada() {
		System.out.println("Quantas vezes deseja esfregar a l�mpada?");
		esfregadelas = Main.sc.nextInt();
		Main.sc.nextLine(); // Limpa a consola
		esfregadelasAcumuladas += esfregadelas;
		if (esfregadelas <= 0) {
			System.out.println("\nO n�mero deve ser superior a zero.");
			esfregarLampada(); // M�todo recursivo que chama a si mesma para voltar ao in�cio da mesma

		} else {

			if (esfregadelas % 2 == 0) { // Se o n�mero de esfregadelas for par invoca ao g�nio bem-humorado.
				GBemHumorado gBemHumorado = new GBemHumorado(); // Cria��o do Objeto chamado gBemHumorado
				gBemHumorado.concedeDesejo(Genio.pedirDesejos());

			} else { // Se n�o for cumprida a condi��o, invoca ao g�nio mal-humorado.

				GMalHumorado gMalHumorado = new GMalHumorado(); // Cria��o do Objeto chamado gMalHumorado
				gMalHumorado.concedeDesejo(Genio.pedirDesejos());
			}

		}
		decresGenios();
		System.out.println("n�mero de g�nios Disponiveis: " + numGeniosDisponiveis);
	}

	// Getters

	public static int getNumGeniosDisponiveis() {
		return numGeniosDisponiveis;
	}

	public static int getEsfregadelasAcumuladas() {
		return esfregadelasAcumuladas;
	}

	public static boolean isRecarregar() {
		return isRecarregar;
	}

	public static int getVezesRecarregada() {
		return vezesRecarregada;
	}

	public static int getMaxGenios() {
		return maxGenios;
	}
}