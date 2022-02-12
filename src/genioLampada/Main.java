package genioLampada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int numAleatorio = (int) (Math.random() * 3) + 1; // Limita o número aleatório entre 1 e 2 , para escolher o
																// nº máximo de génios
	static Lampada lampada = new Lampada(numAleatorio); // Criação do Objeto chamado Lampada

	// Método principal - inicia a execução do aplicativo Java, e mostra as opções
	// principais do Jogo, usando um try catch
	// com o propósito do tratamento das exceções, produzidas no momento em que o
	// utilizador introduze inputs diferentes dos que são esperados
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
					
				case 5 :
					System.out.println("Vezes recarregadas: " + Lampada.getVezesRecarregada());
					break;
					

				default:
					System.out.println("Só são permitidos números entre 1 a 3 , tente de novo.");

				}
			} catch (InputMismatchException e) {
				System.out.println("Só são permitido números inteiros, tente de novo.");
				sc.nextLine(); // Limpar consola
			}
		}
	}
}