/*
Exercício 05:
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

import java.util.Scanner;

public class Exercise05_URI1038 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do item: ");
		int codigo = sc.nextInt();
		
		int quantidade = 0;
						
		double total = 0;
		
		if (codigo < 1 || codigo > 5) {
			System.out.println("Você digitou o código do item inválido");
		}
	
		else {
			System.out.println("Digite a quantidade do item: ");
			quantidade = sc.nextInt();
		}
			
		if (codigo == 1) {
			total = quantidade * 4.00;
			System.out.printf("O Valor da Conta a pagar é de: R$ %.2f \n", total);
		}
		
		else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("O Valor da Conta a pagar é de: R$ %.2f \n", total);
		}
		
		else if (codigo == 3) {
			total = quantidade * 5.00;
			System.out.printf("O Valor da Conta a pagar é de: R$ %.2f \n", total);
		}
		
		else if (codigo == 4) {
			total = quantidade * 2.00;
			System.out.printf("O Valor da Conta a pagar é de: R$ %.2f \n", total);
		}
		
		else if (codigo == 5) {
			total = quantidade * 1.50;
			System.out.printf("O Valor da Conta a pagar é de: R$ %.2f \n", total);
		}
								
		sc.close();
	}

}
