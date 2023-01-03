package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student(); // instantiation
		
		System.out.println("Enter the student's name and three grades: ");
		student.name = sc.nextLine();
		
		student.noteA = sc.nextDouble();
		student.noteB = sc.nextDouble();
		student.noteC = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		System.out.println(student.missingPoints());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
			
		sc.close();
		
	}

}
