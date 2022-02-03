package genioLampada;

public class DemonioReciclavel extends Genio {
	public DemonioReciclavel() {

	}

	public void concedeDesejo() {

	}

	public void menuDemonio() {
		System.out.println("1 - Pedir desejos?");
		System.out.println("2 - Recarregar a lâmpada");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			concedeDesejo();
			
			
			break;

		case 2:
			System.out.println("2 - Sair");
			System.exit(0);

			break;
		}

	}
}
