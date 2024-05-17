package Xplore;

import java.util.ArrayList;

public class WildCarUpperBound {

	public static double sum(ArrayList< ? extends Number> list) {
		double sum1 = 0;
		for(Number num : list) {
			sum1+= num.doubleValue();
		
		}
		return sum1;
		
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		ArrayList<Double> l2 = new ArrayList<>();
		l2.add(30.24);
		l2.add(48.78);
		System.out.println("Displaying the interger : "  +sum(l1));
System.out.println("Displying the double : "+sum(l2));
	}

}
