package Task_Pakage;

interface Shapes{
	int rectange(int a,int b);
	
	double circle(double a);

	int trainagle(int a, int b);


}
class Answer implements Shapes {

	@Override
	public int rectange(int a, int b) {
		
		return a*b;
	}

	@Override
	public double circle(double a) {
		double area = 3.14*(a*a);
		return area;
	}



	@Override
	public int trainagle(int a, int b) {
		
		return a*b;
	}
	
	
}

public class Task_Shapes {

	public static void main(String[] args) {
		Answer answer = new  Answer();
		System.out.println(answer.circle(4.5));
		System.out.println(answer.rectange(4, 8));
		System.out.println(answer.trainagle(8, 5));
				
			

	}

}
