package genioLampada;

import java.util.Scanner;



public class Main {
	 static Scanner sc = new Scanner(System.in);
	 static Scanner sd = new Scanner(System.in);

	
	public static void menu() {
		System.out.println("\nBem-vindo a Lampada Mágica!");
		System.out.println("Escolha a opçao que prentende:");
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
			String desejoIndicado = "";
			
			if (esfregadelas % 2 == 0)
			{
				System.out.println("sai o genio bom, desejos disponiveis: " + desejos );
				int i = 1;
				
				
				while(i <= desejos) {
					sc.skip("\\R?");
					
					System.out.println("Indique o desejo");
					desejoIndicado = sc.next();
				
					System.out.print(desejoIndicado);
					
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
		//Lampada lampada1  = new Lampada(5);

		while(true) {
			menu();
		}
	}

}
