package genioLampada;

public class Lampada {

	// Atributo(s)

	private static boolean isRecarregar = false;
	private static int maxGenios;
	private static int esfregadelas = 0;
	private static int vezesRecarregada = 0;
	private static int numGeniosDisponiveis = 0;
	private static int esfregadelasAcumuladas = 0;

	// Construtor
	public Lampada(int aMaxGenios) {
		System.out.println("A lâmpada foi criada com " + aMaxGenios + " génios(s)");
		maxGenios = aMaxGenios;
		numGeniosDisponiveis = aMaxGenios;
	}

	// Métodos

	// Subtrai o número de génios disponíveis e retorna esse valor.
	public static int DecresGenios() {
		numGeniosDisponiveis--;
		return numGeniosDisponiveis;
	}

	// Reverte os dados da lâmpada a como eram na 1º vez que foi usada, após ter
	// sido recarregada
	public static void lampadaRecarregada() {
		isRecarregar = true;
		numGeniosDisponiveis = maxGenios;
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

			} else { // Se não for cumprida a condição, invoca ao génio mal-humorado.

				GMalHumorado gMalHumorado = new GMalHumorado(); // Criação do Objeto chamado gMalHumorado
				gMalHumorado.concedeDesejo(Genio.pedirDesejos());
			}

		}
		DecresGenios();
		System.out.println("número de génios Disponiveis: " + numGeniosDisponiveis);
	}

	// Getters

	public static int getNumgeniosDisponiveis() {
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
}