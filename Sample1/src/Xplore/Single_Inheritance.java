package Xplore;

class LivingThings{
	int age = 100;
	public void energy() {
		System.out.println("If we eat we will get energy");
		
	}
	
}
class Humans extends LivingThings
{
	
	public void action() {
		System.out.println("We are human beings");
		
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		Humans humans = new Humans();
		humans.energy();
		humans.action();
	}

}
