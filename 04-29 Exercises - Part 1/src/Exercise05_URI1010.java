/*
Exercício 05: 
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercise05_URI1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        double valorUnitPeca1 = sc.nextDouble();

        int codPeca2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double valorUnitPeca2 = sc.nextDouble();

        double valorPagar = (numPeca1 * valorUnitPeca1) + (numPeca2 * valorUnitPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);

        sc.close();
    }
}