package Xplore;



import java.util.Arrays;
import java.util.List;

public class LowerBound {

	public static void main(String[] args) {
	List<Integer> l1 = Arrays.asList(1,2,3,4,5);
	System.out.println("Integer list : ");
	display(l1);
	
	List<Number >l2 =Arrays.asList(10.48,8,70.89,4,78.4897);
	System.out.println("Number list : ");
	display(l2);
	
	
	todisplay(l1);
	todisplay(l2);
	
	}
	
	
	public static void display(List< ? super Integer> list) {
		System.out.println(list);
		
	}
	
	//-------------------unbounded---------------//
	
	public static void todisplay(List<?> list) {
		System.out.println("From unbounded lsit: "+list);
		
		
	}

}
