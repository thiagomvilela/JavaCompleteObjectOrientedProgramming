import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	/*
    	int x = 5;
    	
    	System.out.println("Bom dia");
    	
    	if (x < 0) {
    		System.out.println("Boa tarde");
    	}
    	
    	System.out.println("Boa noite");
    	*/
    	
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Que horas são?");
        hora = sc.nextInt();

        // Estrutura Condicional Simples
        /*
        if (hora < 12) {
            System.out.println("Bom dia");
        }
        else {
            System.out.println("Boa tarde");
        } 
		*/

        // Estrutura Condicional Simples Encadeada (Opção 1)
        /*
        if (hora < 12) {
            System.out.println("Bom dia");
        }
        else {
            if (hora < 18) {
                System.out.println("Boa tarde");
            }
            else {
                System.out.println("Boa noite");
            }
        } 
		*/

        // Estrutura Condicional Simples Encadeada (Opção 2)
        if (hora < 12) {
            System.out.println("Bom dia");
        }
        else if (hora < 18) {
            System.out.println("Boa tarde");
        }
        else if (hora <= 24){
            System.out.println("Boa noite");
        }
        else {
            System.out.println("Você inseriu uma hora inválida.");
        }
        
        sc.close();
        
    }
}



