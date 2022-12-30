/*
Exercício 02: 
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

import java.util.Scanner;

public class Exercise02_URI1072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite a quantidade de valores inteiros que serão lidos: ");
		int n = sc.nextInt();
		
		System.out.printf("A quantidade valores lidos é de: %d %n%n", n);
		
		int in = 0;
		int out = 0;
				
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um valor inteiro: ");
			int valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}
