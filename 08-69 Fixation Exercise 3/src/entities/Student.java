package entities;

public class Student {
	
	// Attributes
	
	public String name;
	public double noteA;
	public double noteB;
	public double noteC;
	
	// Functions
	
	public double finalGrade() {
		return noteA + noteB + noteC;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
}
