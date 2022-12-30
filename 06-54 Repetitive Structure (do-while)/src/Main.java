/*
Problema Exemplo:
Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. 
Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char resposta;
		
		do {
			System.out.print("Digite a Temperatura em Celsius: ");
			double tempCelsius = sc.nextDouble();
			
			double tempFahrenheit = ((9.0 * tempCelsius)/5) + 32.0;
		
			System.out.printf("Equivalente em Fahrenheit: %.1f %n", tempFahrenheit);
		
			System.out.print("Deseja repetir (s/n)? ");
			resposta = sc.next().charAt(0);
			
		} while (resposta != 'n');
		
		sc.close();
	}
}