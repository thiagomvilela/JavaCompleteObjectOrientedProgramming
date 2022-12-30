/* 
Exercício 03:
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
*/

import java.util.Scanner;

public class Exercise03_URI1044 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
       
       	System.out.println("Digite um valor inteiro para A: ");
        int A = sc.nextInt();
        
        System.out.println("Digite um valor inteiro para B: ");
        int B = sc.nextInt();
				
        // Se o resto da divisão de A por B é igual a 0 OU se o resto da divisão de B por A é igual a 0.
        if (A % B == 0 || B % A == 0 ) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }
		
		sc.close();

	}

}
