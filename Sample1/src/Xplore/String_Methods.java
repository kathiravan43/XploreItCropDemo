package Xplore;

public class String_Methods {

	public static void main(String[] args) {
		String s1 = "Apple";
		String s2 = "apple";
		String s3 = new String("Apple");
		String s4 = "Banana";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s4==s1);
		System.out.println(s1==s3);
		//---------------------------------------------------//
		String a1 = "Hello";
		String a2 = "hello welcom";
		String a3 = "Hello";
		System.out.println(a1.compareTo(a3));
		System.out.println(a2.compareTo(a3));
		System.out.println(a1.compareTo(a2));
		// String concat //
		String a = "hello";
		String b = a + "Welocme";
		
		System.out.println("After concat : "+b );
		System.out.println(a.concat(b) );
		
		// SUB STRING------------------------------//
		String str = " Hai hello Welcome ";
		System.out.println(str.trim());
		//str.trim();
		System.out.println(str.substring(4));
		System.out.println(str.substring(5, 9));
		System.out.println(str.trim().toUpperCase());
		System.out.println(str.startsWith(" Ha"));
		// char at----------------------------------//
		
		String ch = "Kathiravan from Tiruppur";
		System.out.println(ch.charAt(4));
	
		//string lenght ---------------------------//
		
		System.out.println(ch.length());
		// value of ----------------------------------//
		int a11 = 45 ;
		String d =  String.valueOf(a11);
		System.out.println(45+d);
 // repalce with --------------------------------//
		 
		 System.out.println(ch.replace("Tiruppur", "coimbatore"));
	}

}
