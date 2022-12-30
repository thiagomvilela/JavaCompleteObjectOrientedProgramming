import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Para ler uma palavra (texto sem espaços)
    	/*
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        sc.close();
        */

        // Para ler um número inteiro
    	/*
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        System.out.println("Você digitou: " + x);

        sc.close();
        */

        // Para ler um número com ponto flutuante
        /*
        Scanner sc = new Scanner(System.in);

        double x;   // Pega a localidade do sistema
        x = sc.nextDouble();
        System.out.println("Você digitou: " + x);  // Pega a localidade independente
        System.out.printf("Você digitou: %.2f\n", x);

        sc.close();
        */

        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;   // Pega a localidade do sistema
        x = sc.nextDouble();
        System.out.printf("Você digitou: %.2f\n", x);

        sc.close();
        */

        // Para ler um caractere
        /*

        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);
        */


        // Para ler vários dados na mesma linha

        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
		

    }
}