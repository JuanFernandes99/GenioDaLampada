package genioLampada;

import java.util.InputMismatchException;
import java.util.Scanner;

// comentar codigo, scrum, verificaçao 
// verificar nomes de funçoes e atributos

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int numAleatorio = (int) (Math.random() * 3) + 1; // 1 to 2
	static Lampada lampada = new Lampada(numAleatorio);

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao jogo da Lâmpada Mágica!");
		while (true) {
			MenuJogo.menu();
			try {
				int opcao = sc.nextInt();
				sc.nextLine();
				switch (opcao) {

				case 1:
					MenuJogo.instrucoes();
					break;
				case 2:
					MenuJogo.jogar();
					break;

				case 3:
					MenuJogo.segurancaSair();
					break;

				case 4:
					System.out.println("Esfregadelas Acumuladas: " + Lampada.getEsfregadelasAcumuladas());
					break;

				default:
					System.out.println("Só são permitidos números entre 1 a 3 , tente de novo.");

				}
			} catch (InputMismatchException e) {
				System.out.println("Só são permitido números inteiros, tente de novo.");
				sc.nextLine();
			}
		}
	}
}