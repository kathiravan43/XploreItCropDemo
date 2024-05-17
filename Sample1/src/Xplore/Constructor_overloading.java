package Xplore;

public class Constructor_overloading {
 int age;
 int marks;
 String name;
 String roll_num;
 
	 Constructor_overloading(int m, String r) {
		marks = m;
	 roll_num = r;
		
	}
 Constructor_overloading(int a, int m, String n,String r) {
	 
	 age=a;
	 marks = m;
	 name = n;
	 roll_num = r;
	 
	}
 void display() {
	 System.out.println(marks+"  "+roll_num);
 }
 void display1() {
	 System.out.println(age+ " "+marks+" "+name+" "+ roll_num );
 }

	public static void main(String[] args) {
		Constructor_overloading constructor_overloading1 = new Constructor_overloading(440, "19043");
		Constructor_overloading constructor_overloading2 = new Constructor_overloading(22,346, "Kathiravan", "19Ec043");
		constructor_overloading1.display();
		constructor_overloading2.display1();

	}

}
