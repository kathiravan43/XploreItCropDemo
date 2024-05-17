package Xplore;

class Aspire{
	private int salary;
	private String Role;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
				
		Aspire aspire = new Aspire();
		aspire.setRole("Dev");
		aspire.setSalary(20000);
		System.out.println("Role Name: "+aspire.getRole());
		System.out.println("Salary : "+aspire.getSalary());
	}

}
