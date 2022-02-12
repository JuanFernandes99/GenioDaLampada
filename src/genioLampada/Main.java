package genioLampada;

//Criado por: 
//Juan Fernandes
//Jessica Barros
//Sara Figueira
//Elsa Gomes

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int numAleatorio = (int) (Math.random() * 3) + 1; // Limita o número aleatório entre 1 e 3 , para escolher o
																// nº máximo de génios
	static Lampada lampada = new Lampada(numAleatorio); // Criação do Objeto chamado Lampada

	// Método principal - inicia a execução do aplicativo Java, e mostra as opções
	// principais do Jogo, usando um try catch
	// com o propósito do tratamento das exceções, produzidas no momento em que o
	// utilizador introduze inputs diferentes dos que são esperados

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao jogo da Lâmpada Mágica!");
		System.out.println("Criado por: \nJuan Fernandes\nJessica Barros\nSara Teixeira\nElsa Gomes");
		System.out.println("\nA lâmpada foi criada com " + Lampada.getMaxGenios() + " génios(s)");
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

				case 5:
					System.out.println("Vezes recarregada: " + Lampada.getVezesRecarregada());
					break;

				default:
					System.out.println("Só são permitidos números entre 1 a 5 , tente de novo.");
				}
			} catch (InputMismatchException e) {
				System.out.println(
						"Erro no input: Só são permitidos números inteiros entre -2147483648 até 2147483647, tente de novo.");
				sc.nextLine(); // Limpar consola
			}
		}
	}
}