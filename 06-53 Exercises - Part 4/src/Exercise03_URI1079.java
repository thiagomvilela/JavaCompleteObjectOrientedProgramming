/*
Exercício 03:
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
*/

import java.util.Scanner;

public class Exercise03_URI1079 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de casos de teste: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n ; i++) {
			
			System.out.println("Digite o valor do caso 1: ");
			Double caso1 = sc.nextDouble();
			
			System.out.println("Digite o valor do caso 2: ");
			Double caso2 = sc.nextDouble();
			
			System.out.println("Digite o valor do caso 3: ");
			Double caso3 = sc.nextDouble();
			
			Double media = (caso1 * 2.0 + caso2 * 3.0 + caso3 * 5.0) / 10.0;
			
			System.out.printf("O valor da média ponderada é de: %.1f %n%n3", media);
		}
	
		sc.close();
	}
}
