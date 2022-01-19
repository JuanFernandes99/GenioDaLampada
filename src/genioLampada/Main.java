package genioLampada;

import java.util.Scanner;



public class Main {
	static Scanner sc = new Scanner(System.in);

	
	public static void menu() {
		System.out.println("\nBem-vindo a Lampada M�gica!");
		System.out.println("Escolha a op�ao que prentende:");
		System.out.println("1 - Esfregar");
		System.out.println("2 -Sair");

	    int opcao = sc.nextInt();
	    switch (opcao) {
	      case 1:

	    	System.out.println("Quantas vezes quer esfregar a lampada?");
	    	int esfregadelas = sc.nextInt();
	        Lampada.esfregar(esfregadelas);
	        int esfregadelasAcumuladas = Lampada.quantidadeEsfregadelas();
			System.out.println("Lampada esfregada: " + esfregadelasAcumuladas + " vezes");
			
			System.out.println("Quantos desejos pretende pedir?");
			int desejos = sc.nextInt();

			if (esfregadelas % 2 == 0)
			{
				System.out.println("sai o genio bom, desejos disponiveis: " + desejos );
				int i = 0;
				
				
				while(i < desejos) {
					String desejoIndicado = sc.nextLine();
					System.out.println(desejoIndicado);
					System.out.println("Indique o desejo");
					i++;
					
				}
				
				
			} else
			{
				System.out.println("Chama genio mau");
			}
		
	       
	    	  break;
	      case 2:
	        System.out.println("2 - Sair");
	        System.exit(0);
	        break;
	    }
		
	}
	public static void main(String[] args) {
		Lampada lampada1  = new Lampada(5);

		while(true) {
			menu();
		}
	}

}
