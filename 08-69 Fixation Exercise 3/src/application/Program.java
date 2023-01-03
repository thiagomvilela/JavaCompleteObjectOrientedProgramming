package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the student's name and three grades: ");
		student.name = sc.nextLine();
		
		student.noteA = sc.nextDouble();
		student.noteB = sc.nextDouble();
		student.noteC = sc.nextDouble();
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
