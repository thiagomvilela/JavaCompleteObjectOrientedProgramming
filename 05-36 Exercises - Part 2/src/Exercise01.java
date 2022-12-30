/*
Exercício 01: 
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro");
       
        numero = sc.nextInt();
				
        if (numero < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");
        }
		
		sc.close();
		
	}

}