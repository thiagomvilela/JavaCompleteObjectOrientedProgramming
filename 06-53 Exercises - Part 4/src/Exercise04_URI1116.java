/*
Exercício 04:
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. 
Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

import java.util.Scanner;

public class Exercise04_URI1116 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Digite o numerador: ");
			int numerador = sc.nextInt();
			
			System.out.println("Digite o denominador: ");
			int denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("divisão impossível");			
			}
			else {
				double resultado = (double) numerador / denominador;
				System.out.printf("O resultado da divisão é: %.1f %n", resultado);
			}
			
		}
		
		sc.close();

	}

}
