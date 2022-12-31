/*
Problema exemplo:
Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
 */

import java.util.Scanner;

public class Example_Problem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = sc.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int terceiroNumero = sc.nextInt();
		
		/*
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O maior número é: " + primeiroNumero);
			}
		
		else if (segundoNumero > terceiroNumero) {
			System.out.println("O maior número é: " + segundoNumero);
			} 
		
		else {
			System.out.println("O maior número é: " + terceiroNumero);
		*/
		
		int maiorNumero = max(primeiroNumero, segundoNumero, terceiroNumero);
		
		mostrarResultado(maiorNumero);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && y > z) {
			aux = x;
			}
		else if (y > z) {
			aux = y;
			} 
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void mostrarResultado (int valor) {
		System.out.println("O maior número digitado é: " + valor);
	}
	
	

}
