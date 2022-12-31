package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado 'a' do Triângulo X: ");
		double xA = sc.nextDouble();
		
		System.out.println("Digite a medida do lado 'b' do Triângulo X: ");
		double xB = sc.nextDouble();
		
		System.out.println("Digite a medida do lado 'c' do Triângulo X: ");
		double xC = sc.nextDouble();
		
		System.out.println("Digite a medida do lado 'a' do Triângulo Y: ");
		double yA = sc.nextDouble();
		
		System.out.println("Digite a medida do lado 'b' do Triângulo Y: ");
		double yB = sc.nextDouble();
		
		System.out.println("Digite a medida do lado 'c' do Triângulo Y: ");
		double yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("A área do Triângulo X é: %.4f%n", areaX);
		System.out.printf("A área do Triângulo Y é: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("O Triângulo que possui a maior área é: X");
		}
		else {
			System.out.println("O Triângulo que possui a maior área é: Y");
		}
		
		sc.close();
	}

}
