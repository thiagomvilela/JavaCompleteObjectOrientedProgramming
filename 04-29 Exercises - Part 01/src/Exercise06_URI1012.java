/*
Exercício 06:
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercise06_URI1012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        double areaTriangulo = A * C / 2.0;
        double areaCirculo = pi * C * C;
        double areaTrapezio = (A + B) / 2.0 * C;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.4f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.4f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.4f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.4f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.4f\n", areaRetangulo);

        sc.close();
    }
}