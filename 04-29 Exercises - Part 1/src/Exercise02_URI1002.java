/*
Exercício 02:
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos. 
Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercise02_URI1002 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();

        double area = pi * raio * raio;

        System.out.printf("A = %.4f", area);

        sc.close();
    }
}