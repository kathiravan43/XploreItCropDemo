package Xplore;

public class StringBuilder_Class {

	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder("Hai Hello Wellcome");
		System.out.println(sb1.isEmpty());
		//contains--------------------------------
		
		System.out.println(sb1.lastIndexOf("come"));
		
		// char at
		 System.out.println(sb1.charAt(8));
		 // join ------------------------
		 String a = "Welcome to explore";
				 String.join("-", sb1); 
		 System.out.println(a);
		StringBuffer stringBuffer = new StringBuffer("Hello world");
		System.out.println(stringBuffer);
		
		String []splits = a.split(" ");
		for(String w : splits)
		{
			System.out.println(w);
		}
		

	}

}
