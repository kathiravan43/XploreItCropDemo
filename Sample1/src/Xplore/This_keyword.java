package Xplore;

class Employee{
	  int empID;
	int salary;
	
	public Employee(int empId,int salary) {
		this.empID=empId;
		this.salary = salary;
	
	}
	public  void display() {
		System.out.println("Empid: "+ empID + " SALARY : "+ this.salary);
		
	}
}

public class This_keyword {

	public static void main(String[] args) {
		Employee employee = new Employee(89,41000);
		Employee employee1 = new Employee(79,31000);
		employee.display();
		employee1.display();

	}

}
