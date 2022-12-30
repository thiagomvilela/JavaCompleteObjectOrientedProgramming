import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		
		System.out.println("Digite o valor do m² do terreno: ");
		double metroQuadrado = sc.nextDouble();
				
		double area = largura * comprimento;
		
		double preco = area * metroQuadrado;
		
		System.out.printf("Área = %.2f%n", area);
		
		System.out.printf("Preço = R$ %.2f%n", preco);
		
		sc.close();
	}

}