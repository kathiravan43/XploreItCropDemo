package Xplore;

class Months{
	int no_OF_of_Months = 12; 
	
	public void weekends() {
		System.out.println("Saturday & Sunday");
		
	}
}
class Weeks extends Months{
	String day = "Sunday";
	
	public void Holidays() {
		System.out.println(" 2 days holiday in a week" +" That Two Days are");
		super.weekends();
	}
	public void display() {
		
		System.out.println("Week start Day is : "+ day);
		System.out.println("No of months : "+super.no_OF_of_Months);
	}
}
public class Super_Keyword {

	public static void main(String[] args) {
		Weeks weeks = new Weeks();
		//weeks.display();
		weeks.Holidays();
	}

}
