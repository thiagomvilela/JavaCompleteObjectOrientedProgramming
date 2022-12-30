/*
Exercício 05:
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.
*/

import java.util.Scanner;

public class Exercise05_URI1153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor N: ");
		int n = sc.nextInt();
		
		int fat = 1;
		
		for (int i = 1; i <= n; i++) {
			fat *= i;
		}
		
		System.out.printf("O fatorial de N é: %d %n", fat);
		
		sc.close();
	}
}