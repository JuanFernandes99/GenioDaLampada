package genioLampada;

public class Lampada {
	// Atributo(s)
	private static int maxGenios;
	private static boolean isRecarregar;
	private static Integer esfregadelas;					// por int
	private static Integer vezesRecarregada;
	private static Integer numgeniosDisponiveis;
	private static Integer esfregadelasAcumuladas;

	// Construtor(es)
	public Lampada(int aMaxGenios) {
		
		 System.out.println("A lampada foi criada com " + aMaxGenios + " génios"); 
		
		maxGenios = aMaxGenios;
		numgeniosDisponiveis = aMaxGenios;
		isRecarregar = false;							// inicializar quando a variavel foi criada (linhas 5 a 10)
		esfregadelas = 0;
		vezesRecarregada = 0;
		esfregadelasAcumuladas = 0;
	}

	// Mï¿½todo(s)										// comentar funcoes
	public static void lampadaRecarregada() {
		setIsRecarregar(true);							//isRecarregar = true;
		esfregadelas = 0;
		numgeniosDisponiveis = maxGenios;
		vezesRecarregada++;
		System.out.println("Vezes recarregada: " + vezesRecarregada);			// se tiver uma opcao no menu para ver quantas vezes foi recarregada, dá uma funcionalidade extra
	}

	public static void esfregarLampada() {
		System.out.println("Quantas vezes deseja esfregar a lï¿½mpada?");
		esfregadelas = Main.sc.nextInt();
		Main.sc.nextLine();
		if (esfregadelas <= 0) {
			System.out.println("\nO nï¿½mero deve ser superior a zero.");
			esfregarLampada();

		} else if (esfregadelas != 0) {

			if (esfregadelas % 2 == 0) {
				GBemHumorado gBemHumorado = new GBemHumorado();
				gBemHumorado.concedeDesejo(Genio.pedirDesejos());

			} else {

				GMalHumorado gMalHumorado = new GMalHumorado();
				gMalHumorado.concedeDesejo(Genio.pedirDesejos());
			}

		}

		System.out.println("Esfregou a lï¿½mpada: " + getEsfregadelasAcumuladas() + " vezes");
		setNumgeniosDisponiveis();
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
		esfregadelasAcumuladas = esfregadelasAcumuladas + esfregadelas;
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