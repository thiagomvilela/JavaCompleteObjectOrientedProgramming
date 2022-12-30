/*
Exercício Resolvido 01:
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal,
bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor
da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais, conforme exemplo.

Entrada:
10.0
30.0
200.00

Saída:
AREA = 300.00          área = largura x comprimento
PRECO = 60000.00    preco = área x preço do metro quadrado
*/

import java.util.Locale;
import java.util.Scanner;

public class Solved_Exercise01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double valorMetroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * valorMetroQuadrado;

        System.out.printf("ÁREA = %.2f\n", area);
        System.out.printf("PREÇO = %.2f", preco);

        sc.close();
    }
}