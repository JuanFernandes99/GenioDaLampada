package genioLampada;

import java.util.InputMismatchException;
import java.util.Scanner;

// comentar codigo, scrum, verificaçao 
// verificar nomes de funçoes e atributos
// perguntar se é preciso inicializar todas as variaveis
// meters os getters e setters, construtores, etc

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int randomNum = (int) (Math.random() * 3) + 1; // 1 to 2
	static Lampada nlampada = new Lampada(randomNum);

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao jogo da Lampada Mágica!");
		while (true) {
			Jogo.menu();
			try {
				int opcao = sc.nextInt();
				switch (opcao) {

				case 1:
					Jogo.instrucoes();
					break;
				case 2:
					Jogo.jogar();
					break;

				case 3:
					System.exit(0);
					break;

				default:
					System.out.println("Só é permitido números entre 1-3 , try again");

				}
			} catch (InputMismatchException e) {
				System.out.println("Só é permitido números inteiros,  try again");
				sc.nextLine();
			}
		}
	}
}