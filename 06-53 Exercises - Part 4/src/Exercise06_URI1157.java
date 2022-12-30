/*
Exercício 06:
Ler um número inteiro N e calcular todos os seus divisores.
*/

import java.util.Scanner;

public class Exercise06_URI1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor N: ");
		int n = sc.nextInt();
			
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		
		}
				
		sc.close();

	}

}