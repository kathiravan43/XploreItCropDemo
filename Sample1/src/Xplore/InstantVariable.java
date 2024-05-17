package Xplore;

public class InstantVariable {

	int rollNum = 043;
	static String name = "Kathiravan";

	public static void main(String[] args) {
		InstantVariable instantVariable = new InstantVariable();
		name = "sanjai";
		System.out.println("Name of the Person: " + name);
		System.out.println("Roll Number: " + instantVariable.rollNum);

	}

}
