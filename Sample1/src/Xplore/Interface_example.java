package Xplore;
interface Rbi{
		public  void getFD_Intrest_Rate() ;
		
}
class BOB implements Rbi{

	@Override
	public void getFD_Intrest_Rate() {
		System.out.println("7 % on Fd ");
		
	}
	
}

public class Interface_example {

	public static void main(String[] args) {
		//Rbi rbi = new Rbi();
		BOB bob = new BOB();
		bob.getFD_Intrest_Rate();
		
	}

}
