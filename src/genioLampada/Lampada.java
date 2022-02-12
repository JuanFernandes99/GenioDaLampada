package genioLampada;

public class Lampada {

	// Atributo(s)

	private static boolean isRecarregar = false;
	private static int maxGenios;
	private static int esfregadelas = 0;
	private static int vezesRecarregada = 0;
	private static int numgeniosDisponiveis = 0;
	private static int esfregadelasAcumuladas = 0;

	// Construtor
	public Lampada(int aMaxGenios) {
		System.out.println("A lÃ¢mpada foi criada com " + aMaxGenios + " gÃ©nio(s)");
		maxGenios = aMaxGenios;
		numgeniosDisponiveis = aMaxGenios;
	}

	// Métodos

	// Subtrai o número de génios disponíveis e retorna esse valor.
	public static int DecresGenios() { // Acrescimos dos desejos.
		numgeniosDisponiveis--;
		return numgeniosDisponiveis;
	}

	// Reverte os dados da lâmpada a como eram na 1º vez que foi usada, após ter
	// sido recarregada
	public static void lampadaRecarregada() {
		isRecarregar = true;
		esfregadelas = 0;
		numgeniosDisponiveis = maxGenios;
		vezesRecarregada++;
	}
	
	// Indica o tipo de génio que sairá da lâmpada (entre o bem e o mal-humorado) e
	// indica quantos ainda estão disponíveis
	public static void esfregarLampada() {
		System.out.println("Quantas vezes deseja esfregar a lâmpada?");
		esfregadelas = Main.sc.nextInt();
		Main.sc.nextLine(); // Limpa a consola
		esfregadelasAcumuladas += esfregadelas;
		if (esfregadelas <= 0) {
			System.out.println("\nO número deve ser superior a zero.");
			esfregarLampada(); // Método recursivo que chama a si mesma para voltar ao início da função

		} else {

			if (esfregadelas % 2 == 0) { // Se o número de esfregadelas for par invoca ao génio bem-humorado.
				GBemHumorado gBemHumorado = new GBemHumorado(); // Criação do Objeto chamado gBemHumorado
				gBemHumorado.concedeDesejo(Genio.pedirDesejos());

			} else {  // Se não for cumprida a condição, invoca ao génio mal-humorado.

				GMalHumorado gMalHumorado = new GMalHumorado(); // Criação do Objeto chamado gMalHumorado
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