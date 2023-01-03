import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
			
		System.out.println("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
			
		double result = CurrencyConverter.dollarToReal(dollarPrice, dollarBought);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
			
		sc.close();

	}

}
