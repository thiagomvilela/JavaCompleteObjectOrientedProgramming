/*
Exercício 02:
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA 
(nesta situação sem escrever mensagem alguma).
*/

import java.util.Scanner;

public class Exercise02_URI1115 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da coordenada x: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o valor da coordenada y: ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("O ponto está no Q1");
			}
			
			else if (x < 0 && y > 0) {
				System.out.println("O ponto está no Q2");
			}
			
			else if (x < 0 && y < 0) {
				System.out.println("O ponto está no Q3");
			}
			
			else {
				System.out.println("O ponto está no Q4");
			}
			
			System.out.println("Digite o valor da coordenada x: ");
			x = sc.nextInt();
			
			System.out.println("Digite o valor da coordenada y: ");
			y = sc.nextInt();
		}
		
		System.out.println("Você digitou uma coordenada nula e o programa será encerrado.");
		sc.close();
	}
}