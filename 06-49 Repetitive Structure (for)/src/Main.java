import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de repetições: ");
		int repeticoes = sc.nextInt();
		
		System.out.printf("A quantidade de repetições será: %d %n%n", repeticoes);
		
		int soma = 0;
		
		for (int i=0; i<repeticoes; i++) {
			System.out.println("Digite um valor inteiro: ");
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.printf("A soma dos valores digitados é: %d %n", soma);
		
		sc.close();	
	
	}

}
