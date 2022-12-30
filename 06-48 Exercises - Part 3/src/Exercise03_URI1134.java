/*
Exercício 03: 
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.
*/

import java.util.Scanner;

public class Exercise03_URI1134 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.printf("Digite o tipo do combustível abastecido: %n" + "1 - Álcool %n" + "2 - Gasolina %n"
				+ "3 - Diesel %n" + "4 - Fim %n");

		int tipo = sc.nextInt();

		while (tipo != 4) {

			if (tipo == 1) {
				alcool += +1;
			} else if (tipo == 2) {
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;
			}

			System.out.printf("Digite o tipo do combustível abastecido: %n" + "1 - Álcool %n" + "2 - Gasolina %n"
					+ "3 - Diesel %n" + "4 - Fim %n");

			tipo = sc.nextInt();

		}

		System.out.printf("Muito Obrigado %n"
				+ "Álcool: %d %n" 
				+ "Gasolina: %d %n" 
				+ "Diesel: %d %n", alcool, gasolina, diesel);
			
		sc.close();
	}

}